#!/bin/bash

# Set the base directory where all the API directories are stored
API_BASE_DIR="."
OUTPUT_DIR="."
DOCS_OUTPUT_DIR="."

# Loop through each directory in the API base directory (including nested directories)
find "$API_BASE_DIR" -type f -name "openapi.yaml" | while read api_spec; do
    # Extract the API name from the directory path (using the parent directory)
    api_name=$(basename $(dirname "$api_spec"))
    
    # Create an output directory for the Python client
    api_output_dir="$OUTPUT_DIR/$api_name/python-client"
    
    # Create an output directory for the documentation
    api_docs_dir="$DOCS_OUTPUT_DIR/$api_name/odocs"
    
    # Run OpenAPI Generator CLI to generate the Python client library
    openapi-generator-cli generate -i "$api_spec" -g python -o "$api_output_dir"

    # Run OpenAPI Generator CLI to generate the HTML documentation
    openapi-generator-cli generate -i "$api_spec" -g html -o "$api_docs_dir"

    echo "Generated Python client and documentation for $api_name"
    echo "Python client at: $api_output_dir"
    echo "Documentation at: $api_docs_dir"
done
