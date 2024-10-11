import json
import os
import aiohttp
import asyncio
from tqdm.asyncio import tqdm
import re

def get_openapi_urls(json_data):
    """
    Extract all OpenAPI URLs (YAML or JSON) from the JSON data along with their corresponding keys and versions.
    """
    openapi_urls = []
    for key, value in json_data.items():
        for version_key, version_value in value.get('versions', {}).items():
            # Try to get swaggerYamlUrl first, fallback to swaggerUrl if missing
            yaml_url = version_value.get('swaggerYamlUrl') or version_value.get('swaggerUrl')
            if yaml_url:
                # Collect the key with the version and the URL
                openapi_urls.append((key, version_key, yaml_url))
    return openapi_urls

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

async def download_openapi_file(session, key, version, url, failed_files):
    """
    Download an OpenAPI spec (YAML or JSON) from a URL and save it in a directory named after the key and version.
    """
    try:
        async with session.get(url) as response:
            response.raise_for_status()
            file_name = url.split('/')[-1]

            # Create a directory for each key and version (e.g., "adyen.com:AccountService/v4")
            key_dir = os.path.join(key, version)
            os.makedirs(key_dir, exist_ok=True)

            file_path = os.path.join(key_dir, file_name)

            # Check the content type to decide how to handle the response
            content_type = response.headers.get('Content-Type', '').lower()

            if 'application/json' in content_type or 'text' in content_type:
                # If content is text or JSON, decode as text
                try:
                    file_content = await response.text()
                except UnicodeDecodeError:
                    print(f"Failed to decode content as UTF-8 from {url}. Saving as binary.")
                    file_content = await response.read()  # Save binary data

                # Save the file in the key-based directory
                with open(file_path, 'wb' if isinstance(file_content, bytes) else 'w') as file:
                    file.write(file_content)

            else:
                # Otherwise, save as binary
                file_content = await response.read()
                with open(file_path, 'wb') as file:
                    file.write(file_content)

            return file_path
    except aiohttp.ClientError as e:
        print(f"Error downloading file from {url}: {e}")
        failed_files.append((key, version, url))
    except IOError as e:
        print(f"Error saving file {file_name}: {e}")
        failed_files.append((key, version, url))
    return None

async def main():
    # Fetch JSON data from the URL
    url = "https://api.apis.guru/v2/list.json"
    data = await fetch_json_data(url)
    if not data:
        return  # Exit if data couldn't be fetched

    # Extract OpenAPI URLs from the fetched data
    openapi_urls = get_openapi_urls(data)

    # Download OpenAPI files concurrently with a progress bar
    downloaded_files = []
    failed_files = []
    
    async with aiohttp.ClientSession() as session:
        tasks = [
            download_openapi_file(session, key, version, url, failed_files)
            for key, version, url in openapi_urls
            if is_valid_url(url)  # Only download from valid URLs
        ]
        for result in tqdm.as_completed(tasks, desc="Downloading OpenAPI files", unit="file"):
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
        for key, version, url in failed_files:
            print(f"Failed to download for {key} (version {version}): {url}")

# Run the main function
if __name__ == "__main__":
    asyncio.run(main())
