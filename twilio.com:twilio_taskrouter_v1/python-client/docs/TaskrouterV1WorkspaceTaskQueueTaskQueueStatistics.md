# TaskrouterV1WorkspaceTaskQueueTaskQueueStatistics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the TaskQueue resource. | [optional] 
**cumulative** | **object** | An object that contains the cumulative statistics for the TaskQueue. | [optional] 
**realtime** | **object** | An object that contains the real-time statistics for the TaskQueue. | [optional] 
**task_queue_sid** | **str** | The SID of the TaskQueue from which these statistics were calculated. | [optional] 
**url** | **str** | The absolute URL of the TaskQueue statistics resource. | [optional] 
**workspace_sid** | **str** | The SID of the Workspace that contains the TaskQueue. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace_task_queue_task_queue_statistics import TaskrouterV1WorkspaceTaskQueueTaskQueueStatistics

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1WorkspaceTaskQueueTaskQueueStatistics from a JSON string
taskrouter_v1_workspace_task_queue_task_queue_statistics_instance = TaskrouterV1WorkspaceTaskQueueTaskQueueStatistics.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1WorkspaceTaskQueueTaskQueueStatistics.to_json())

# convert the object into a dict
taskrouter_v1_workspace_task_queue_task_queue_statistics_dict = taskrouter_v1_workspace_task_queue_task_queue_statistics_instance.to_dict()
# create an instance of TaskrouterV1WorkspaceTaskQueueTaskQueueStatistics from a dict
taskrouter_v1_workspace_task_queue_task_queue_statistics_from_dict = TaskrouterV1WorkspaceTaskQueueTaskQueueStatistics.from_dict(taskrouter_v1_workspace_task_queue_task_queue_statistics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


