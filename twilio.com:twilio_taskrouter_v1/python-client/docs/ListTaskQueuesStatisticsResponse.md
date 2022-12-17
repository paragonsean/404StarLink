# ListTaskQueuesStatisticsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meta** | [**ListWorkspaceResponseMeta**](ListWorkspaceResponseMeta.md) |  | [optional] 
**task_queues_statistics** | [**List[TaskrouterV1WorkspaceTaskQueueTaskQueuesStatistics]**](TaskrouterV1WorkspaceTaskQueueTaskQueuesStatistics.md) |  | [optional] 

## Example

```python
from openapi_client.models.list_task_queues_statistics_response import ListTaskQueuesStatisticsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListTaskQueuesStatisticsResponse from a JSON string
list_task_queues_statistics_response_instance = ListTaskQueuesStatisticsResponse.from_json(json)
# print the JSON string representation of the object
print(ListTaskQueuesStatisticsResponse.to_json())

# convert the object into a dict
list_task_queues_statistics_response_dict = list_task_queues_statistics_response_instance.to_dict()
# create an instance of ListTaskQueuesStatisticsResponse from a dict
list_task_queues_statistics_response_from_dict = ListTaskQueuesStatisticsResponse.from_dict(list_task_queues_statistics_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


