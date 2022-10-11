import os
import sys
import json
import yaml
from pathlib import Path
from openapi_spec_validator import validate_spec


def verify_openapi_spec(file_path):
    """
    Verifies if the given file is a valid OpenAPI specification using openapi_spec_validator.
    Args:
        file_path (str): Path to the OpenAPI spec file (YAML or JSON).
    Returns:
        bool: True if the file is a valid OpenAPI spec, False otherwise.
    """
    try:
        with open(file_path, 'r') as f:
            if file_path.endswith('.json'):
                spec = json.load(f)
            else:
                spec = yaml.safe_load(f)

        # Validate the OpenAPI specification
        validate_spec(spec)
        print(f"Valid OpenAPI specification: {file_path}")
        return True
    except Exception as e:
        print(f"Error validating {file_path}: {e}")
        return False


def main():
    # Set the base directory where all the API directories are stored
    api_base_dir = '.'

    # Find all YAML, YML, and JSON files in the directory
    api_specs = Path(api_base_dir).rglob("*.yaml")
    api_specs = list(api_specs) + list(Path(api_base_dir).rglob("*.yml"))
    api_specs = list(api_specs) + list(Path(api_base_dir).rglob("*.json"))

    # Loop through each file and verify the specification
    for api_spec in api_specs:
        verify_openapi_spec(str(api_spec))


if __name__ == "__main__":
    main()
