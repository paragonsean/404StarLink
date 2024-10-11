import json
import os
import aiohttp
import asyncio
from tqdm.asyncio import tqdm

def get_swagger_yaml_urls(json_data):
    """
    Extract all Swagger YAML URLs from the JSON data along with their corresponding keys.
    """
    yaml_urls = []
    for key, value in json_data.items():
        for version_key, version_value in value.get('versions', {}).items():
            yaml_url = version_value.get('swaggerYamlUrl')
            if yaml_url:
                yaml_urls.append((key, yaml_url))  # Collect the key with the URL
    return yaml_urls

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

async def download_yaml_file(session, key, url, base_output_dir):
    """
    Download a YAML file from a URL and save it in the specified output directory.
    """
    try:
        async with session.get(url) as response:
            response.raise_for_status()
            file_name = url.split('/')[-1]

            # Create directory for the key if it doesn't exist
            key_dir = os.path.join(base_output_dir, key)
            os.makedirs(key_dir, exist_ok=True)

            file_path = os.path.join(key_dir, file_name)
            file_content = await response.text()

            # Save the file
            with open(file_path, 'w') as file:
                file.write(file_content)

            return file_path
    except aiohttp.ClientError as e:
        print(f"Error downloading file from {url}: {e}")
    except IOError as e:
        print(f"Error saving file {file_name}: {e}")
    return None

async def main():
    # Fetch JSON data from the URL
    url = "https://api.apis.guru/v2/list.json"
    data = await fetch_json_data(url)
    if not data:
        return  # Exit if data couldn't be fetched

    # Extract swaggerYamlUrls from the fetched data
    swagger_yaml_urls = get_swagger_yaml_urls(data)

    # Base directory to store the downloaded YAML files
    base_output_dir = './downloaded_yaml_files'
    os.makedirs(base_output_dir, exist_ok=True)

    # Download YAML files concurrently with a progress bar
    downloaded_files = []
    async with aiohttp.ClientSession() as session:
        tasks = [
            download_yaml_file(session, key, yaml_url, base_output_dir)
            for key, yaml_url in swagger_yaml_urls
        ]
        for result in tqdm.as_completed(tasks, desc="Downloading YAML files", unit="file"):
            file_path = await result
            if file_path:
                downloaded_files.append(file_path)

    # Optionally, print or log the downloaded file paths
    print("\nDownloaded files:")
    for file in downloaded_files:
        print(file)

# Run the main function
if __name__ == "__main__":
    asyncio.run(main())
