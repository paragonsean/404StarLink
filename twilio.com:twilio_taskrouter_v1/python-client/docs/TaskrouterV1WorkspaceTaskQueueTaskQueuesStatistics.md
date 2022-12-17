# TaskrouterV1WorkspaceTaskQueueTaskQueuesStatistics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the TaskQueue resource. | [optional] 
**cumulative** | **object** | An object that contains the cumulative statistics for the TaskQueues. | [optional] 
**realtime** | **object** | An object that contains the real-time statistics for the TaskQueues. | [optional] 
**task_queue_sid** | **str** | The SID of the TaskQueue from which these statistics were calculated. | [optional] 
**workspace_sid** | **str** | The SID of the Workspace that contains the TaskQueues. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace_task_queue_task_queues_statistics import TaskrouterV1WorkspaceTaskQueueTaskQueuesStatistics

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1WorkspaceTaskQueueTaskQueuesStatistics from a JSON string
taskrouter_v1_workspace_task_queue_task_queues_statistics_instance = TaskrouterV1WorkspaceTaskQueueTaskQueuesStatistics.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1WorkspaceTaskQueueTaskQueuesStatistics.to_json())

# convert the object into a dict
taskrouter_v1_workspace_task_queue_task_queues_statistics_dict = taskrouter_v1_workspace_task_queue_task_queues_statistics_instance.to_dict()
# create an instance of TaskrouterV1WorkspaceTaskQueueTaskQueuesStatistics from a dict
taskrouter_v1_workspace_task_queue_task_queues_statistics_from_dict = TaskrouterV1WorkspaceTaskQueueTaskQueuesStatistics.from_dict(taskrouter_v1_workspace_task_queue_task_queues_statistics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


