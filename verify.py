import os
import sys
import json
import yaml
from pathlib import Path
from openapi_spec_validator import validate_spec
import jsonref
from pprint import pprint as pp
from datetime import date
import aiofiles
import asyncio
import shutil

def json_serial(obj):
    """
    JSON serializer for objects not serializable by default json code.
    """
    if isinstance(obj, date):
        return obj.isoformat()
    raise TypeError(f"Type {type(obj)} not serializable")


async def verify_openapi_spec(file_path):
    """
    Verifies if the given file is a valid OpenAPI specification using openapi_spec_validator.
    Args:
        file_path (str): Path to the OpenAPI spec file (YAML or JSON).
    Returns:
        bool: True if the file is a valid OpenAPI spec, False otherwise.
    """
    try:
        async with aiofiles.open(file_path, 'r') as f:
            content = await f.read()
            if file_path.endswith('.json'):
                spec = jsonref.loads(content)
            else:
                spec = yaml.safe_load(content)
                spec = jsonref.loads(json.dumps(spec, default=json_serial))

        # Validate the OpenAPI specification
        validate_spec(spec)
        print(f"Valid OpenAPI specification: {file_path}")
        return True
    except Exception as e:
        print(f"Error validating {file_path}: {e}")
        return False


async def check_for_duplicate(file_path, checked_specs):
    """
    Check if the given file is a duplicate of any previously checked files, considering JSON and YAML equivalence.
    Args:
        file_path (Path): Path to the file to be checked.
        checked_specs (list): List of loaded specs from previously checked files.
    Returns:
        bool: True if the file is a duplicate, False otherwise.
    """
    try:
        async with aiofiles.open(file_path, 'r') as f:
            content = await f.read()
            if file_path.suffix in ['.json']:
                current_spec = jsonref.loads(content)
            else:
                current_spec = yaml.safe_load(content)
                current_spec = jsonref.loads(json.dumps(current_spec, default=json_serial))

        for spec, path in checked_specs:
            if spec == current_spec:
                print(f"Duplicate file found: {file_path} is a duplicate of {path}")
                return True
    except Exception as e:
        print(f"Error checking for duplicates in {file_path}: {e}")
    return False


async def convert_json_to_yaml(json_file_path, yaml_file_path):
    """
    Converts a JSON file to a YAML file.
    Args:
        json_file_path (str): Path to the JSON file.
        yaml_file_path (str): Path to save the converted YAML file.
    """
    try:
        async with aiofiles.open(json_file_path, 'r') as json_file:
            data = json.loads(await json_file.read())
        async with aiofiles.open(yaml_file_path, 'w') as yaml_file:
            await yaml_file.write(yaml.safe_dump(data, default_flow_style=False))
        print(f"Converted {json_file_path} to {yaml_file_path}")
    except Exception as e:
        print(f"Error converting {json_file_path} to YAML: {e}")


async def convert_yaml_to_json(yaml_file_path, json_file_path):
    """
    Converts a YAML file to a JSON file.
    Args:
        yaml_file_path (str): Path to the YAML file.
        json_file_path (str): Path to save the converted JSON file.
    """
    try:
        async with aiofiles.open(yaml_file_path, 'r') as yaml_file:
            data = yaml.safe_load(await yaml_file.read())
        async with aiofiles.open(json_file_path, 'w') as json_file:
            await json_file.write(json.dumps(data, indent=2, default=json_serial))
        print(f"Converted {yaml_file_path} to {json_file_path}")
    except Exception as e:
        print(f"Error converting {yaml_file_path} to JSON: {e}")


def openapi_to_functions(openapi_spec):
    functions = []

    for path, methods in openapi_spec.get("paths", {}).items():
        if not isinstance(methods, dict):
            print(f"Skipping path {path} as it is not a dictionary.")
            continue

        for method, spec_with_ref in methods.items():
            # 1. Resolve JSON references.
            spec = jsonref.replace_refs(spec_with_ref)

            # 2. Extract a name for the functions.
            function_name = spec.get("operationId")

            # 3. Extract a description and parameters.
            desc = spec.get("description") or spec.get("summary", "")

            schema = {"type": "object", "properties": {}}

            req_body = (
                spec.get("requestBody", {})
                .get("content", {})
                .get("application/json", {})
                .get("schema")
            )
            if req_body:
                schema["properties"]["requestBody"] = req_body

            params = spec.get("parameters", [])
            if params:
                param_properties = {
                    param["name"]: param.get("schema", {})
                    for param in params
                    if "name" in param
                }
                schema["properties"]["parameters"] = {
                    "type": "object",
                    "properties": param_properties,
                }

            functions.append(
                {"type": "function", "function": {"name": function_name, "description": desc, "parameters": schema}}
            )

    return functions


async def main():
    # Set the base directory where all the API directories are stored
    api_base_dir = '.'

    # Find all YAML, YML, and JSON files in the directory
    api_specs = Path(api_base_dir).rglob("*.yaml")
    api_specs = list(api_specs) + list(Path(api_base_dir).rglob("*.yml"))
    api_specs = list(api_specs) + list(Path(api_base_dir).rglob("*.json"))

    # Track checked specs to detect duplicates
    checked_specs = []

    # Loop through each file and verify the specification
    for api_spec in api_specs:
        file_path = Path(api_spec)

        # Check for duplicate files
        if await check_for_duplicate(file_path, checked_specs):
            continue
        else:
            # Load the current spec and add to checked_specs
            try:
                async with aiofiles.open(file_path, 'r') as f:
                    content = await f.read()
                    if file_path.suffix in ['.json']:
                        current_spec = jsonref.loads(content)
                    else:
                        current_spec = yaml.safe_load(content)
                        current_spec = jsonref.loads(json.dumps(current_spec, default=json_serial))
                checked_specs.append((current_spec, file_path))
            except Exception as e:
                print(f"Error loading {file_path}: {e}")
                continue

        # Verify the OpenAPI specification
        if not await verify_openapi_spec(str(file_path)):
            # Rename unverified files to include "unverified_" prefix
            new_name = file_path.parent / f"unverified_{file_path.name}"
            shutil.move(str(file_path), str(new_name))
            print(f"Renamed {file_path} to {new_name}")

        # Convert JSON files to YAML if needed
        if file_path.suffix == '.json':
            yaml_file_path = file_path.with_suffix('.yaml')
            await convert_json_to_yaml(str(file_path), str(yaml_file_path))

        # Convert YAML files to JSON if needed
        if file_path.suffix in ['.yaml', '.yml']:
            json_file_path = file_path.with_suffix('.json')
            await convert_yaml_to_json(str(file_path), str(json_file_path))

        # Process OpenAPI spec to extract functions if it is a JSON file and verified
        if file_path.suffix == '.json' and await verify_openapi_spec(str(file_path)):
            functions = openapi_to_functions(current_spec)
            for function in functions:
                pp(function)
                print()


if __name__ == "__main__":
    # Example usage to load and display an OpenAPI spec
    asyncio.run(main())
