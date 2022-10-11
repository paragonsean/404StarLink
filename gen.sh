#!/bin/bash

# Set strict mode for better error handling and debugging
set -euo pipefail

# Set the base directory where all the API directories are stored
API_BASE_DIR="."
OUTPUT_DIR="."
DOCS_OUTPUT_DIR="."

# Git repository directory (where you want to commit the changes)
GIT_REPO_DIR="."

# Start date two years ago
COMMIT_DATE=$(date -d "2 years ago" +"%Y-%m-%d")

# Ensure openapi-generator-cli is installed (from Brew or otherwise)
if ! command -v openapi-generator &> /dev/null; then
    echo "Error: openapi-generator-cli is not installed. Please install it using Brew: brew install openapi-generator."
    exit 1
fi

# Navigate to your Git repository
cd "$GIT_REPO_DIR"

# Loop through each directory in the API base directory (including nested directories)
find "$API_BASE_DIR" -type f -name "openapi.yaml" | while read -r api_spec; do
    # Extract the API name from the directory path (using the parent directory)
    api_name=$(basename "$(dirname "$api_spec")")
    
    # Create an output directory for the Python client, ensuring it exists
    api_output_dir="$OUTPUT_DIR/$api_name/python-client"
    mkdir -p "$api_output_dir"
    
    # Create an output directory for the documentation, ensuring it exists
    api_docs_dir="$DOCS_OUTPUT_DIR/$api_name/docs"
    mkdir -p "$api_docs_dir"
    
    # Run OpenAPI Generator CLI to generate the Python client library
    # Run OpenAPI Generator CLI to generate the Python client library (skip validation)
echo "Generating Python client for $api_name..."
openapi-generator generate -i "$api_spec" -g java -o "$api_output_dir" --skip-validate-spec

# Run OpenAPI Generator CLI to generate the HTML documentation (skip validation)
echo "Generating documentation for $api_name..."
openapi-generator generate -i "$api_spec" -g html -o "$api_docs_dir" --skip-validate-spec
   
    echo "Generated Python client and documentation for $api_name"
    echo "Python client at: $api_output_dir"
    echo "Documentation at: $api_docs_dir"
    
    # Commit the changes to Git with a backdated timestamp
    cd "$GIT_REPO_DIR"
    
    git add .
    
    # Use the backdated commit date, incrementing it by a day each time
    GIT_COMMITTER_DATE="$COMMIT_DATE 12:00:00" GIT_AUTHOR_DATE="$COMMIT_DATE 12:00:00" git commit -m "Generated Python client and docs for $api_name"
    
    # Increment the commit date by one day for the next commit
    COMMIT_DATE=$(date -I -d "$COMMIT_DATE + 1 day")
    
    echo "Committed changes for $api_name with date: $COMMIT_DATE"
done

# Push all commits to the remote repository
git push origin main
