# TaskrouterV1WorkspaceWorkspaceRealTimeStatistics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Workspace resource. | [optional] 
**activity_statistics** | **List[object]** | The number of current Workers by Activity. | [optional] 
**longest_task_waiting_age** | **int** | The age of the longest waiting Task. | [optional] 
**longest_task_waiting_sid** | **str** | The SID of the longest waiting Task. | [optional] 
**tasks_by_priority** | **object** | The number of Tasks by priority. For example: &#x60;{\&quot;0\&quot;: \&quot;10\&quot;, \&quot;99\&quot;: \&quot;5\&quot;}&#x60; shows 10 Tasks at priority 0 and 5 at priority 99. | [optional] 
**tasks_by_status** | **object** | The number of Tasks by their current status. For example: &#x60;{\&quot;pending\&quot;: \&quot;1\&quot;, \&quot;reserved\&quot;: \&quot;3\&quot;, \&quot;assigned\&quot;: \&quot;2\&quot;, \&quot;completed\&quot;: \&quot;5\&quot;}&#x60;. | [optional] 
**total_tasks** | **int** | The total number of Tasks. | [optional] 
**total_workers** | **int** | The total number of Workers in the Workspace. | [optional] 
**url** | **str** | The absolute URL of the Workspace statistics resource. | [optional] 
**workspace_sid** | **str** | The SID of the Workspace. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace_workspace_real_time_statistics import TaskrouterV1WorkspaceWorkspaceRealTimeStatistics

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1WorkspaceWorkspaceRealTimeStatistics from a JSON string
taskrouter_v1_workspace_workspace_real_time_statistics_instance = TaskrouterV1WorkspaceWorkspaceRealTimeStatistics.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1WorkspaceWorkspaceRealTimeStatistics.to_json())

# convert the object into a dict
taskrouter_v1_workspace_workspace_real_time_statistics_dict = taskrouter_v1_workspace_workspace_real_time_statistics_instance.to_dict()
# create an instance of TaskrouterV1WorkspaceWorkspaceRealTimeStatistics from a dict
taskrouter_v1_workspace_workspace_real_time_statistics_from_dict = TaskrouterV1WorkspaceWorkspaceRealTimeStatistics.from_dict(taskrouter_v1_workspace_workspace_real_time_statistics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


