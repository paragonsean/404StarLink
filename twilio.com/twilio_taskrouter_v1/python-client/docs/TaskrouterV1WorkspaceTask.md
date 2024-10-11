# TaskrouterV1WorkspaceTask


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Task resource. | [optional] 
**addons** | **str** | An object that contains the [addon](https://www.twilio.com/docs/taskrouter/marketplace) data for all installed addons. | [optional] 
**age** | **int** | The number of seconds since the Task was created. | [optional] 
**assignment_status** | [**TaskEnumStatus**](TaskEnumStatus.md) |  | [optional] 
**attributes** | **str** | The JSON string with custom attributes of the work. **Note** If this property has been assigned a value, it will only be displayed in FETCH action that returns a single resource. Otherwise, it will be null. | [optional] 
**date_created** | **datetime** | The date and time in GMT when the resource was created specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
**date_updated** | **datetime** | The date and time in GMT when the resource was last updated specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
**links** | **object** | The URLs of related resources. | [optional] 
**priority** | **int** | The current priority score of the Task as assigned to a Worker by the workflow. Tasks with higher priority values will be assigned before Tasks with lower values. | [optional] 
**reason** | **str** | The reason the Task was canceled or completed, if applicable. | [optional] 
**sid** | **str** | The unique string that we created to identify the Task resource. | [optional] 
**task_channel_sid** | **str** | The SID of the TaskChannel. | [optional] 
**task_channel_unique_name** | **str** | The unique name of the TaskChannel. | [optional] 
**task_queue_entered_date** | **datetime** | The date and time in GMT when the Task entered the TaskQueue, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
**task_queue_friendly_name** | **str** | The friendly name of the TaskQueue. | [optional] 
**task_queue_sid** | **str** | The SID of the TaskQueue. | [optional] 
**timeout** | **int** | The amount of time in seconds that the Task can live before being assigned. | [optional] 
**url** | **str** | The absolute URL of the Task resource. | [optional] 
**workflow_friendly_name** | **str** | The friendly name of the Workflow that is controlling the Task. | [optional] 
**workflow_sid** | **str** | The SID of the Workflow that is controlling the Task. | [optional] 
**workspace_sid** | **str** | The SID of the Workspace that contains the Task. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace_task import TaskrouterV1WorkspaceTask

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1WorkspaceTask from a JSON string
taskrouter_v1_workspace_task_instance = TaskrouterV1WorkspaceTask.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1WorkspaceTask.to_json())

# convert the object into a dict
taskrouter_v1_workspace_task_dict = taskrouter_v1_workspace_task_instance.to_dict()
# create an instance of TaskrouterV1WorkspaceTask from a dict
taskrouter_v1_workspace_task_from_dict = TaskrouterV1WorkspaceTask.from_dict(taskrouter_v1_workspace_task_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


