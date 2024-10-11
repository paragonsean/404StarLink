# ReposGetContent200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**ContentDirectoryInnerLinks**](ContentDirectoryInnerLinks.md) |  | 
**content** | **str** |  | 
**download_url** | **str** |  | 
**encoding** | **str** |  | 
**git_url** | **str** |  | 
**html_url** | **str** |  | 
**name** | **str** |  | 
**path** | **str** |  | 
**sha** | **str** |  | 
**size** | **int** |  | 
**submodule_git_url** | **str** |  | 
**target** | **str** |  | 
**type** | **str** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.repos_get_content200_response import ReposGetContent200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ReposGetContent200Response from a JSON string
repos_get_content200_response_instance = ReposGetContent200Response.from_json(json)
# print the JSON string representation of the object
print(ReposGetContent200Response.to_json())

# convert the object into a dict
repos_get_content200_response_dict = repos_get_content200_response_instance.to_dict()
# create an instance of ReposGetContent200Response from a dict
repos_get_content200_response_from_dict = ReposGetContent200Response.from_dict(repos_get_content200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


