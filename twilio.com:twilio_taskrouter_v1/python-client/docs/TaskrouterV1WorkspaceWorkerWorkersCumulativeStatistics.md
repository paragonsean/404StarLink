# TaskrouterV1WorkspaceWorkerWorkersCumulativeStatistics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Worker resource. | [optional] 
**activity_durations** | **List[object]** | The minimum, average, maximum, and total time (in seconds) that Workers spent in each Activity. | [optional] 
**end_time** | **datetime** | The end of the interval during which these statistics were calculated, in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
**reservations_accepted** | **int** | The total number of Reservations that were accepted. | [optional] 
**reservations_canceled** | **int** | The total number of Reservations that were canceled. | [optional] 
**reservations_created** | **int** | The total number of Reservations that were created. | [optional] 
**reservations_rejected** | **int** | The total number of Reservations that were rejected. | [optional] 
**reservations_rescinded** | **int** | The total number of Reservations that were rescinded. | [optional] 
**reservations_timed_out** | **int** | The total number of Reservations that were timed out. | [optional] 
**start_time** | **datetime** | The beginning of the interval during which these statistics were calculated, in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
**url** | **str** | The absolute URL of the Workers statistics resource. | [optional] 
**workspace_sid** | **str** | The SID of the Workspace that contains the Workers. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace_worker_workers_cumulative_statistics import TaskrouterV1WorkspaceWorkerWorkersCumulativeStatistics

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1WorkspaceWorkerWorkersCumulativeStatistics from a JSON string
taskrouter_v1_workspace_worker_workers_cumulative_statistics_instance = TaskrouterV1WorkspaceWorkerWorkersCumulativeStatistics.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1WorkspaceWorkerWorkersCumulativeStatistics.to_json())

# convert the object into a dict
taskrouter_v1_workspace_worker_workers_cumulative_statistics_dict = taskrouter_v1_workspace_worker_workers_cumulative_statistics_instance.to_dict()
# create an instance of TaskrouterV1WorkspaceWorkerWorkersCumulativeStatistics from a dict
taskrouter_v1_workspace_worker_workers_cumulative_statistics_from_dict = TaskrouterV1WorkspaceWorkerWorkersCumulativeStatistics.from_dict(taskrouter_v1_workspace_worker_workers_cumulative_statistics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


