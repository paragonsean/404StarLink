import json
import os
import aiohttp
import asyncio
import yaml
from tqdm.asyncio import tqdm
from bravado.client import SwaggerClient
from bravado.requests_client import RequestsClient
from bravado.swagger_model import Loader
import re

def get_x_origin_yaml_urls(json_data):
    """
    Extract all x-origin YAML URLs from the JSON data along with their corresponding keys.
    """
    yaml_urls = []
    for key, value in json_data.items():
        for version_key, version_value in value.get('versions', {}).items():
            # Check the 'x-origin' field for the openapi format
            x_origins = version_value.get('info', {}).get('x-origin', [])
            for origin in x_origins:
                if origin.get('format') == 'openapi' and 'url' in origin:
                    yaml_url = origin['url']
                    yaml_urls.append((key, yaml_url))  # Collect the key with the x-origin URL
    return yaml_urls

def is_valid_url(url):
    """
    Check if the URL is valid (ignore blob, file, and other invalid URLs).
    """
    if re.match(r'^(http|https)://', url):
        return True
    return False

async def fetch_json_data(url):
    """
    Fetch JSON data from a URL and return the parsed JSON.
    """
    async with aiohttp.ClientSession() as session:
        try:
            async with session.get(url) as response:
                response.raise_for_status()
                return await response.json()
        except aiohttp.ClientError as e:
            print(f"Error fetching JSON data from {url}: {e}")
            return None

async def download_yaml_file(session, key, url, base_output_dir, failed_files):
    """
    Download a YAML file from a URL and save it in the specified output directory
    based on the key of the JSON data. Handle errors and append failed files.
    """
    try:
        async with session.get(url) as response:
            response.raise_for_status()
            file_name = url.split('/')[-1]

            # Create a directory for each key from the JSON file
            key_dir = os.path.join(base_output_dir, key)
            os.makedirs(key_dir, exist_ok=True)

            file_path = os.path.join(key_dir, file_name)
            file_content = await response.text()

            # Save the file in the key-based directory
            with open(file_path, 'w') as file:
                file.write(file_content)

            return file_path
    except aiohttp.ClientError as e:
        print(f"Error downloading file from {url}: {e}")
        failed_files.append((key, url))
    except IOError as e:
        print(f"Error saving file {file_name}: {e}")
        failed_files.append((key, url))
    return None

async def main():
    # Fetch JSON data from the URL
    url = "https://api.apis.guru/v2/list.json"
    data = await fetch_json_data(url)
    if not data:
        return  # Exit if data couldn't be fetched

    # Extract x-origin YAML URLs from the fetched data
    x_origin_yaml_urls = get_x_origin_yaml_urls(data)

    # Base directory to store the downloaded YAML files
    base_output_dir = './downloaded_yaml_files'
    os.makedirs(base_output_dir, exist_ok=True)

    # Download YAML files concurrently with a progress bar
    downloaded_files = []
    failed_files = []
    
    async with aiohttp.ClientSession() as session:
        tasks = [
            download_yaml_file(session, key, yaml_url, base_output_dir, failed_files)
            for key, yaml_url in x_origin_yaml_urls
            if is_valid_url(yaml_url)  # Only download from valid URLs
        ]
        for result in tqdm.as_completed(tasks, desc="Downloading YAML files", unit="file"):
            file_path = await result
            if file_path:
                downloaded_files.append(file_path)

    # Optionally, print or log the downloaded file paths
    print("\nDownloaded files:")
    for file in downloaded_files:
        print(file)

    # Log failed downloads
    if failed_files:
        print("\nFailed downloads:")
        for key, yaml_url in failed_files:
            print(f"Failed to download for {key}: {yaml_url}")

# Run the main function
if __name__ == "__main__":
    asyncio.run(main())
