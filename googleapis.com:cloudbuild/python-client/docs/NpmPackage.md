# NpmPackage

Npm package to upload to Artifact Registry upon successful completion of all build steps.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**package_path** | **str** | Path to the package.json. e.g. workspace/path/to/package | [optional] 
**repository** | **str** | Artifact Registry repository, in the form \&quot;https://$REGION-npm.pkg.dev/$PROJECT/$REPOSITORY\&quot; Npm package in the workspace specified by path will be zipped and uploaded to Artifact Registry with this location as a prefix. | [optional] 

## Example

```python
from openapi_client.models.npm_package import NpmPackage

# TODO update the JSON string below
json = "{}"
# create an instance of NpmPackage from a JSON string
npm_package_instance = NpmPackage.from_json(json)
# print the JSON string representation of the object
print(NpmPackage.to_json())

# convert the object into a dict
npm_package_dict = npm_package_instance.to_dict()
# create an instance of NpmPackage from a dict
npm_package_from_dict = NpmPackage.from_dict(npm_package_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


