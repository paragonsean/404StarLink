# TaskrouterV1WorkspaceWorkerWorkerStatistics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Worker resource. | [optional] 
**cumulative** | **object** | An object that contains the cumulative statistics for the Worker. | [optional] 
**realtime** | **object** | An object that contains the real-time statistics for the Worker. | [optional] 
**url** | **str** | The absolute URL of the Worker statistics resource. | [optional] 
**workspace_sid** | **str** | The SID of the Workspace that contains the Worker. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace_worker_worker_statistics import TaskrouterV1WorkspaceWorkerWorkerStatistics

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1WorkspaceWorkerWorkerStatistics from a JSON string
taskrouter_v1_workspace_worker_worker_statistics_instance = TaskrouterV1WorkspaceWorkerWorkerStatistics.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1WorkspaceWorkerWorkerStatistics.to_json())

# convert the object into a dict
taskrouter_v1_workspace_worker_worker_statistics_dict = taskrouter_v1_workspace_worker_worker_statistics_instance.to_dict()
# create an instance of TaskrouterV1WorkspaceWorkerWorkerStatistics from a dict
taskrouter_v1_workspace_worker_worker_statistics_from_dict = TaskrouterV1WorkspaceWorkerWorkerStatistics.from_dict(taskrouter_v1_workspace_worker_worker_statistics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


