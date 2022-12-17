# ListTaskQueueResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meta** | [**ListWorkspaceResponseMeta**](ListWorkspaceResponseMeta.md) |  | [optional] 
**task_queues** | [**List[TaskrouterV1WorkspaceTaskQueue]**](TaskrouterV1WorkspaceTaskQueue.md) |  | [optional] 

## Example

```python
from openapi_client.models.list_task_queue_response import ListTaskQueueResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListTaskQueueResponse from a JSON string
list_task_queue_response_instance = ListTaskQueueResponse.from_json(json)
# print the JSON string representation of the object
print(ListTaskQueueResponse.to_json())

# convert the object into a dict
list_task_queue_response_dict = list_task_queue_response_instance.to_dict()
# create an instance of ListTaskQueueResponse from a dict
list_task_queue_response_from_dict = ListTaskQueueResponse.from_dict(list_task_queue_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


