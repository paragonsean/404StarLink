# ListTaskResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meta** | [**ListWorkspaceResponseMeta**](ListWorkspaceResponseMeta.md) |  | [optional] 
**tasks** | [**List[TaskrouterV1WorkspaceTask]**](TaskrouterV1WorkspaceTask.md) |  | [optional] 

## Example

```python
from openapi_client.models.list_task_response import ListTaskResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListTaskResponse from a JSON string
list_task_response_instance = ListTaskResponse.from_json(json)
# print the JSON string representation of the object
print(ListTaskResponse.to_json())

# convert the object into a dict
list_task_response_dict = list_task_response_instance.to_dict()
# create an instance of ListTaskResponse from a dict
list_task_response_from_dict = ListTaskResponse.from_dict(list_task_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


