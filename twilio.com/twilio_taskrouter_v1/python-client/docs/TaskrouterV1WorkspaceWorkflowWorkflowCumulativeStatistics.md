# TaskrouterV1WorkspaceWorkflowWorkflowCumulativeStatistics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Workflow resource. | [optional] 
**avg_task_acceptance_time** | **int** | The average time in seconds between Task creation and acceptance. | [optional] 
**end_time** | **datetime** | The end of the interval during which these statistics were calculated, in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
**reservations_accepted** | **int** | The total number of Reservations accepted by Workers. | [optional] 
**reservations_canceled** | **int** | The total number of Reservations that were canceled. | [optional] 
**reservations_created** | **int** | The total number of Reservations that were created for Workers. | [optional] 
**reservations_rejected** | **int** | The total number of Reservations that were rejected. | [optional] 
**reservations_rescinded** | **int** | The total number of Reservations that were rescinded. | [optional] 
**reservations_timed_out** | **int** | The total number of Reservations that were timed out. | [optional] 
**split_by_wait_time** | **object** | A list of objects that describe the number of Tasks canceled and reservations accepted above and below the thresholds specified in seconds. | [optional] 
**start_time** | **datetime** | The beginning of the interval during which these statistics were calculated, in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
**tasks_canceled** | **int** | The total number of Tasks that were canceled. | [optional] 
**tasks_completed** | **int** | The total number of Tasks that were completed. | [optional] 
**tasks_deleted** | **int** | The total number of Tasks that were deleted. | [optional] 
**tasks_entered** | **int** | The total number of Tasks that entered the Workflow. | [optional] 
**tasks_moved** | **int** | The total number of Tasks that were moved from one queue to another. | [optional] 
**tasks_timed_out_in_workflow** | **int** | The total number of Tasks that were timed out of their Workflows (and deleted). | [optional] 
**url** | **str** | The absolute URL of the Workflow statistics resource. | [optional] 
**wait_duration_until_accepted** | **object** | The wait duration statistics (&#x60;avg&#x60;, &#x60;min&#x60;, &#x60;max&#x60;, &#x60;total&#x60;) for Tasks that were accepted. | [optional] 
**wait_duration_until_canceled** | **object** | The wait duration statistics (&#x60;avg&#x60;, &#x60;min&#x60;, &#x60;max&#x60;, &#x60;total&#x60;) for Tasks that were canceled. | [optional] 
**workflow_sid** | **str** | Returns the list of Tasks that are being controlled by the Workflow with the specified Sid value. | [optional] 
**workspace_sid** | **str** | The SID of the Workspace that contains the Workflow. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace_workflow_workflow_cumulative_statistics import TaskrouterV1WorkspaceWorkflowWorkflowCumulativeStatistics

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1WorkspaceWorkflowWorkflowCumulativeStatistics from a JSON string
taskrouter_v1_workspace_workflow_workflow_cumulative_statistics_instance = TaskrouterV1WorkspaceWorkflowWorkflowCumulativeStatistics.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1WorkspaceWorkflowWorkflowCumulativeStatistics.to_json())

# convert the object into a dict
taskrouter_v1_workspace_workflow_workflow_cumulative_statistics_dict = taskrouter_v1_workspace_workflow_workflow_cumulative_statistics_instance.to_dict()
# create an instance of TaskrouterV1WorkspaceWorkflowWorkflowCumulativeStatistics from a dict
taskrouter_v1_workspace_workflow_workflow_cumulative_statistics_from_dict = TaskrouterV1WorkspaceWorkflowWorkflowCumulativeStatistics.from_dict(taskrouter_v1_workspace_workflow_workflow_cumulative_statistics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


