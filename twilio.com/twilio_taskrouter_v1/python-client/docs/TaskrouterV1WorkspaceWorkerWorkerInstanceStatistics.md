# TaskrouterV1WorkspaceWorkerWorkerInstanceStatistics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Worker resource. | [optional] 
**cumulative** | **object** | An object that contains the cumulative statistics for the Worker. | [optional] 
**url** | **str** | The absolute URL of the WorkerChannel statistics resource. | [optional] 
**worker_sid** | **str** | The SID of the Worker that contains the WorkerChannel. | [optional] 
**workspace_sid** | **str** | The SID of the Workspace that contains the WorkerChannel. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace_worker_worker_instance_statistics import TaskrouterV1WorkspaceWorkerWorkerInstanceStatistics

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1WorkspaceWorkerWorkerInstanceStatistics from a JSON string
taskrouter_v1_workspace_worker_worker_instance_statistics_instance = TaskrouterV1WorkspaceWorkerWorkerInstanceStatistics.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1WorkspaceWorkerWorkerInstanceStatistics.to_json())

# convert the object into a dict
taskrouter_v1_workspace_worker_worker_instance_statistics_dict = taskrouter_v1_workspace_worker_worker_instance_statistics_instance.to_dict()
# create an instance of TaskrouterV1WorkspaceWorkerWorkerInstanceStatistics from a dict
taskrouter_v1_workspace_worker_worker_instance_statistics_from_dict = TaskrouterV1WorkspaceWorkerWorkerInstanceStatistics.from_dict(taskrouter_v1_workspace_worker_worker_instance_statistics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


