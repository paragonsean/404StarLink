# TaskrouterV1WorkspaceWorkerWorkersRealTimeStatistics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Worker resource. | [optional] 
**activity_statistics** | **List[object]** | The number of current Workers by Activity. | [optional] 
**total_workers** | **int** | The total number of Workers. | [optional] 
**url** | **str** | The absolute URL of the Workers statistics resource. | [optional] 
**workspace_sid** | **str** | The SID of the Workspace that contains the Workers. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace_worker_workers_real_time_statistics import TaskrouterV1WorkspaceWorkerWorkersRealTimeStatistics

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1WorkspaceWorkerWorkersRealTimeStatistics from a JSON string
taskrouter_v1_workspace_worker_workers_real_time_statistics_instance = TaskrouterV1WorkspaceWorkerWorkersRealTimeStatistics.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1WorkspaceWorkerWorkersRealTimeStatistics.to_json())

# convert the object into a dict
taskrouter_v1_workspace_worker_workers_real_time_statistics_dict = taskrouter_v1_workspace_worker_workers_real_time_statistics_instance.to_dict()
# create an instance of TaskrouterV1WorkspaceWorkerWorkersRealTimeStatistics from a dict
taskrouter_v1_workspace_worker_workers_real_time_statistics_from_dict = TaskrouterV1WorkspaceWorkerWorkersRealTimeStatistics.from_dict(taskrouter_v1_workspace_worker_workers_real_time_statistics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


