#!/bin/bash

# Loop through each directory
for dir in */; do
  # Check if the directory contains a colon
  if [[ "$dir" == *:* ]]; then
    # Remove the trailing slash from the directory name
    clean_dir="${dir%/}"
    
    # Split the directory name at the colon
    main_dir="${clean_dir%%:*}"
    sub_dir="${clean_dir##*:}"
    
    # Create the main directory if it doesn't exist
    if [ ! -d "$main_dir" ]; then
      mkdir "$main_dir"
    fi
    
    # Move the directory contents to the subdirectory inside the main directory
    mv "$clean_dir" "$main_dir/$sub_dir"
  fi
done
