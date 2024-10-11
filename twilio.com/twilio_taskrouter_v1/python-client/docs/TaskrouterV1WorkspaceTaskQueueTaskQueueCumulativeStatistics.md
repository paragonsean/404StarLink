# TaskrouterV1WorkspaceTaskQueueTaskQueueCumulativeStatistics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the TaskQueue resource. | [optional] 
**avg_task_acceptance_time** | **int** | The average time in seconds between Task creation and acceptance. | [optional] 
**end_time** | **datetime** | The end of the interval during which these statistics were calculated, in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
**reservations_accepted** | **int** | The total number of Reservations accepted for Tasks in the TaskQueue. | [optional] 
**reservations_canceled** | **int** | The total number of Reservations canceled for Tasks in the TaskQueue. | [optional] 
**reservations_created** | **int** | The total number of Reservations created for Tasks in the TaskQueue. | [optional] 
**reservations_rejected** | **int** | The total number of Reservations rejected for Tasks in the TaskQueue. | [optional] 
**reservations_rescinded** | **int** | The total number of Reservations rescinded. | [optional] 
**reservations_timed_out** | **int** | The total number of Reservations that timed out for Tasks in the TaskQueue. | [optional] 
**split_by_wait_time** | **object** | A list of objects that describe the number of Tasks canceled and reservations accepted above and below the thresholds specified in seconds. | [optional] 
**start_time** | **datetime** | The beginning of the interval during which these statistics were calculated, in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
**task_queue_sid** | **str** | The SID of the TaskQueue from which these statistics were calculated. | [optional] 
**tasks_canceled** | **int** | The total number of Tasks canceled in the TaskQueue. | [optional] 
**tasks_completed** | **int** | The total number of Tasks completed in the TaskQueue. | [optional] 
**tasks_deleted** | **int** | The total number of Tasks deleted in the TaskQueue. | [optional] 
**tasks_entered** | **int** | The total number of Tasks entered into the TaskQueue. | [optional] 
**tasks_moved** | **int** | The total number of Tasks that were moved from one queue to another. | [optional] 
**url** | **str** | The absolute URL of the TaskQueue statistics resource. | [optional] 
**wait_duration_in_queue_until_accepted** | **object** | The relative wait duration statistics (&#x60;avg&#x60;, &#x60;min&#x60;, &#x60;max&#x60;, &#x60;total&#x60;) for Tasks accepted while in the TaskQueue. Calculation is based on the time when the Tasks entered the TaskQueue. | [optional] 
**wait_duration_until_accepted** | **object** | The wait duration statistics (&#x60;avg&#x60;, &#x60;min&#x60;, &#x60;max&#x60;, &#x60;total&#x60;) for Tasks accepted while in the TaskQueue. Calculation is based on the time when the Tasks were created. For transfers, the wait duration is counted from the moment ***the Task was created***, and not from when the transfer was initiated. | [optional] 
**wait_duration_until_canceled** | **object** | The wait duration statistics (&#x60;avg&#x60;, &#x60;min&#x60;, &#x60;max&#x60;, &#x60;total&#x60;) for Tasks canceled while in the TaskQueue. | [optional] 
**workspace_sid** | **str** | The SID of the Workspace that contains the TaskQueue. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace_task_queue_task_queue_cumulative_statistics import TaskrouterV1WorkspaceTaskQueueTaskQueueCumulativeStatistics

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1WorkspaceTaskQueueTaskQueueCumulativeStatistics from a JSON string
taskrouter_v1_workspace_task_queue_task_queue_cumulative_statistics_instance = TaskrouterV1WorkspaceTaskQueueTaskQueueCumulativeStatistics.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1WorkspaceTaskQueueTaskQueueCumulativeStatistics.to_json())

# convert the object into a dict
taskrouter_v1_workspace_task_queue_task_queue_cumulative_statistics_dict = taskrouter_v1_workspace_task_queue_task_queue_cumulative_statistics_instance.to_dict()
# create an instance of TaskrouterV1WorkspaceTaskQueueTaskQueueCumulativeStatistics from a dict
taskrouter_v1_workspace_task_queue_task_queue_cumulative_statistics_from_dict = TaskrouterV1WorkspaceTaskQueueTaskQueueCumulativeStatistics.from_dict(taskrouter_v1_workspace_task_queue_task_queue_cumulative_statistics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


