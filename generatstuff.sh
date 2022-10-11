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

# List of languages and frameworks to generate clients for
LANGUAGES=("java" "android" "python" "python-pydantic-v1" "python-fastapi" "python-flask" "python-aiohttp"  "java-vertx-web" "go" "kotlin" "typescript" "javascript" "csharp" "cpp-qt-client" "zapier" "c")

# Navigate to your Git repository
cd "$GIT_REPO_DIR"

# Loop through each directory in the API base directory (including nested directories)
find "$API_BASE_DIR" -type f -name "openapi.yaml" | while read -r api_spec; do
    # Extract the API name from the directory path (using the parent directory)
    api_name=$(basename "$(dirname "$api_spec")")
    
    # For each language, generate the client and create a new branch
    for lang in "${LANGUAGES[@]}"; do
        # Define the branch name
        branch_name="${api_name}-${lang}-client"
        
        # Check out a new branch for the programming language
        git checkout -b "$branch_name"
        
        # Define the output directory for the generated client code
        api_output_dir="$OUTPUT_DIR/$api_name/${lang}-client"
        
        # Check if the client directory already exists; if it does, skip this language
        if [ -d "$api_output_dir" ]; then
            echo "Skipping $api_name for $lang because ${lang}-client already exists."
            continue
        fi
        
        # Create the output directory for the client, ensuring it exists
        mkdir -p "$api_output_dir"
        
        # Create an output directory for the documentation, ensuring it exists
        api_docs_dir="$DOCS_OUTPUT_DIR/$api_name/docs"
        mkdir -p "$api_docs_dir"
        
        # Run OpenAPI Generator CLI to generate the client library
        echo "Generating $lang client for $api_name..."
        openapi-generator generate -i "$api_spec" -g "$lang" -o "$api_output_dir" --skip-validate-spec
        
        # Run OpenAPI Generator CLI to generate the HTML documentation
        echo "Generating documentation for $api_name..."
        openapi-generator generate -i "$api_spec" -g html -o "$api_docs_dir" --skip-validate-spec
        
        echo "Generated $lang client and documentation for $api_name"
        echo "$lang client at: $api_output_dir"
        echo "Documentation at: $api_docs_dir"
        
        # Commit the changes to Git with a backdated timestamp
        cd "$GIT_REPO_DIR"
        
        git add .
        
        # Use the backdated commit date, incrementing it by a day each time
        GIT_COMMITTER_DATE="$COMMIT_DATE 12:00:00" GIT_AUTHOR_DATE="$COMMIT_DATE 12:00:00" git commit -m "Generated $lang client and docs for $api_name"
        
        # Increment the commit date by one day for the next commit
        COMMIT_DATE=$(date -I -d "$COMMIT_DATE + 1 day")
        
        echo "Committed changes for $api_name ($lang) with date: $COMMIT_DATE"
        
        # Push the branch to the remote repository
        git push origin "$branch_name"
        
        # After pushing, delete the old code
        echo "Deleting old code for $api_name ($lang)..."
        rm -rf "$api_output_dir"
        rm -rf "$api_docs_dir"
        
        echo "Deleted old code for $api_name ($lang)"
        
        # Checkout back to the main branch to start on the next language or API
        git checkout main
    done
done

# Push all changes to the remote repository
git push origin main
