# ListWorkspaceResponseMeta


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**first_page_url** | **str** |  | [optional] 
**key** | **str** |  | [optional] 
**next_page_url** | **str** |  | [optional] 
**page** | **int** |  | [optional] 
**page_size** | **int** |  | [optional] 
**previous_page_url** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_workspace_response_meta import ListWorkspaceResponseMeta

# TODO update the JSON string below
json = "{}"
# create an instance of ListWorkspaceResponseMeta from a JSON string
list_workspace_response_meta_instance = ListWorkspaceResponseMeta.from_json(json)
# print the JSON string representation of the object
print(ListWorkspaceResponseMeta.to_json())

# convert the object into a dict
list_workspace_response_meta_dict = list_workspace_response_meta_instance.to_dict()
# create an instance of ListWorkspaceResponseMeta from a dict
list_workspace_response_meta_from_dict = ListWorkspaceResponseMeta.from_dict(list_workspace_response_meta_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


