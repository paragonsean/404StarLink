# ContentTreeEntriesInner


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
from openapi_client.models.content_tree_entries_inner import ContentTreeEntriesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ContentTreeEntriesInner from a JSON string
content_tree_entries_inner_instance = ContentTreeEntriesInner.from_json(json)
# print the JSON string representation of the object
print(ContentTreeEntriesInner.to_json())

# convert the object into a dict
content_tree_entries_inner_dict = content_tree_entries_inner_instance.to_dict()
# create an instance of ContentTreeEntriesInner from a dict
content_tree_entries_inner_from_dict = ContentTreeEntriesInner.from_dict(content_tree_entries_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


