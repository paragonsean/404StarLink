# TaskrouterV1WorkspaceWorkspaceStatistics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Workspace resource. | [optional] 
**cumulative** | **object** | An object that contains the cumulative statistics for the Workspace. | [optional] 
**realtime** | **object** | An object that contains the real-time statistics for the Workspace. | [optional] 
**url** | **str** | The absolute URL of the Workspace statistics resource. | [optional] 
**workspace_sid** | **str** | The SID of the Workspace. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace_workspace_statistics import TaskrouterV1WorkspaceWorkspaceStatistics

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1WorkspaceWorkspaceStatistics from a JSON string
taskrouter_v1_workspace_workspace_statistics_instance = TaskrouterV1WorkspaceWorkspaceStatistics.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1WorkspaceWorkspaceStatistics.to_json())

# convert the object into a dict
taskrouter_v1_workspace_workspace_statistics_dict = taskrouter_v1_workspace_workspace_statistics_instance.to_dict()
# create an instance of TaskrouterV1WorkspaceWorkspaceStatistics from a dict
taskrouter_v1_workspace_workspace_statistics_from_dict = TaskrouterV1WorkspaceWorkspaceStatistics.from_dict(taskrouter_v1_workspace_workspace_statistics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


