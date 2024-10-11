# TaskrouterV1WorkspaceWorkflowWorkflowRealTimeStatistics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Workflow resource. | [optional] 
**longest_task_waiting_age** | **int** | The age of the longest waiting Task. | [optional] 
**longest_task_waiting_sid** | **str** | The SID of the longest waiting Task. | [optional] 
**tasks_by_priority** | **object** | The number of Tasks by priority. For example: &#x60;{\&quot;0\&quot;: \&quot;10\&quot;, \&quot;99\&quot;: \&quot;5\&quot;}&#x60; shows 10 Tasks at priority 0 and 5 at priority 99. | [optional] 
**tasks_by_status** | **object** | The number of Tasks by their current status. For example: &#x60;{\&quot;pending\&quot;: \&quot;1\&quot;, \&quot;reserved\&quot;: \&quot;3\&quot;, \&quot;assigned\&quot;: \&quot;2\&quot;, \&quot;completed\&quot;: \&quot;5\&quot;}&#x60;. | [optional] 
**total_tasks** | **int** | The total number of Tasks. | [optional] 
**url** | **str** | The absolute URL of the Workflow statistics resource. | [optional] 
**workflow_sid** | **str** | Returns the list of Tasks that are being controlled by the Workflow with the specified SID value. | [optional] 
**workspace_sid** | **str** | The SID of the Workspace that contains the Workflow. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace_workflow_workflow_real_time_statistics import TaskrouterV1WorkspaceWorkflowWorkflowRealTimeStatistics

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1WorkspaceWorkflowWorkflowRealTimeStatistics from a JSON string
taskrouter_v1_workspace_workflow_workflow_real_time_statistics_instance = TaskrouterV1WorkspaceWorkflowWorkflowRealTimeStatistics.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1WorkspaceWorkflowWorkflowRealTimeStatistics.to_json())

# convert the object into a dict
taskrouter_v1_workspace_workflow_workflow_real_time_statistics_dict = taskrouter_v1_workspace_workflow_workflow_real_time_statistics_instance.to_dict()
# create an instance of TaskrouterV1WorkspaceWorkflowWorkflowRealTimeStatistics from a dict
taskrouter_v1_workspace_workflow_workflow_real_time_statistics_from_dict = TaskrouterV1WorkspaceWorkflowWorkflowRealTimeStatistics.from_dict(taskrouter_v1_workspace_workflow_workflow_real_time_statistics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


