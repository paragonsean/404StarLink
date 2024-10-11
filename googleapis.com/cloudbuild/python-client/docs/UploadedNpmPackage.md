# UploadedNpmPackage

An npm package uploaded to Artifact Registry using the NpmPackage directive.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_hashes** | [**FileHashes**](FileHashes.md) |  | [optional] 
**push_timing** | [**TimeSpan**](TimeSpan.md) |  | [optional] 
**uri** | **str** | URI of the uploaded npm package. | [optional] 

## Example

```python
from openapi_client.models.uploaded_npm_package import UploadedNpmPackage

# TODO update the JSON string below
json = "{}"
# create an instance of UploadedNpmPackage from a JSON string
uploaded_npm_package_instance = UploadedNpmPackage.from_json(json)
# print the JSON string representation of the object
print(UploadedNpmPackage.to_json())

# convert the object into a dict
uploaded_npm_package_dict = uploaded_npm_package_instance.to_dict()
# create an instance of UploadedNpmPackage from a dict
uploaded_npm_package_from_dict = UploadedNpmPackage.from_dict(uploaded_npm_package_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


