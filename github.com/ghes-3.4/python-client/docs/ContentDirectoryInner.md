# ContentDirectoryInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**ContentDirectoryInnerLinks**](ContentDirectoryInnerLinks.md) |  | 
**content** | **str** |  | [optional] 
**download_url** | **str** |  | 
**git_url** | **str** |  | 
**html_url** | **str** |  | 
**name** | **str** |  | 
**path** | **str** |  | 
**sha** | **str** |  | 
**size** | **int** |  | 
**type** | **str** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.content_directory_inner import ContentDirectoryInner

# TODO update the JSON string below
json = "{}"
# create an instance of ContentDirectoryInner from a JSON string
content_directory_inner_instance = ContentDirectoryInner.from_json(json)
# print the JSON string representation of the object
print(ContentDirectoryInner.to_json())

# convert the object into a dict
content_directory_inner_dict = content_directory_inner_instance.to_dict()
# create an instance of ContentDirectoryInner from a dict
content_directory_inner_from_dict = ContentDirectoryInner.from_dict(content_directory_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


