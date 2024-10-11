# ContentTree

Content Tree

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**ContentDirectoryInnerLinks**](ContentDirectoryInnerLinks.md) |  | 
**download_url** | **str** |  | 
**entries** | [**List[ContentTreeEntriesInner]**](ContentTreeEntriesInner.md) |  | [optional] 
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
from openapi_client.models.content_tree import ContentTree

# TODO update the JSON string below
json = "{}"
# create an instance of ContentTree from a JSON string
content_tree_instance = ContentTree.from_json(json)
# print the JSON string representation of the object
print(ContentTree.to_json())

# convert the object into a dict
content_tree_dict = content_tree_instance.to_dict()
# create an instance of ContentTree from a dict
content_tree_from_dict = ContentTree.from_dict(content_tree_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


