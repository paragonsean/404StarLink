# TaskrouterV1WorkspaceWorkflowWorkflowStatistics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Workflow resource. | [optional] 
**cumulative** | **object** | An object that contains the cumulative statistics for the Workflow. | [optional] 
**realtime** | **object** | An object that contains the real-time statistics for the Workflow. | [optional] 
**url** | **str** | The absolute URL of the Workflow statistics resource. | [optional] 
**workflow_sid** | **str** | Returns the list of Tasks that are being controlled by the Workflow with the specified SID value. | [optional] 
**workspace_sid** | **str** | The SID of the Workspace that contains the Workflow. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace_workflow_workflow_statistics import TaskrouterV1WorkspaceWorkflowWorkflowStatistics

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1WorkspaceWorkflowWorkflowStatistics from a JSON string
taskrouter_v1_workspace_workflow_workflow_statistics_instance = TaskrouterV1WorkspaceWorkflowWorkflowStatistics.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1WorkspaceWorkflowWorkflowStatistics.to_json())

# convert the object into a dict
taskrouter_v1_workspace_workflow_workflow_statistics_dict = taskrouter_v1_workspace_workflow_workflow_statistics_instance.to_dict()
# create an instance of TaskrouterV1WorkspaceWorkflowWorkflowStatistics from a dict
taskrouter_v1_workspace_workflow_workflow_statistics_from_dict = TaskrouterV1WorkspaceWorkflowWorkflowStatistics.from_dict(taskrouter_v1_workspace_workflow_workflow_statistics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


