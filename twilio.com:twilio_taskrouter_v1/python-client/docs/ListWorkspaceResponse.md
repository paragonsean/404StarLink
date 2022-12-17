# ListWorkspaceResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meta** | [**ListWorkspaceResponseMeta**](ListWorkspaceResponseMeta.md) |  | [optional] 
**workspaces** | [**List[TaskrouterV1Workspace]**](TaskrouterV1Workspace.md) |  | [optional] 

## Example

```python
from openapi_client.models.list_workspace_response import ListWorkspaceResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListWorkspaceResponse from a JSON string
list_workspace_response_instance = ListWorkspaceResponse.from_json(json)
# print the JSON string representation of the object
print(ListWorkspaceResponse.to_json())

# convert the object into a dict
list_workspace_response_dict = list_workspace_response_instance.to_dict()
# create an instance of ListWorkspaceResponse from a dict
list_workspace_response_from_dict = ListWorkspaceResponse.from_dict(list_workspace_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


