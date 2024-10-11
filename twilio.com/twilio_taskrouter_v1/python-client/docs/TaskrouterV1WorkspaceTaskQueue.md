# TaskrouterV1WorkspaceTaskQueue


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the TaskQueue resource. | [optional] 
**assignment_activity_name** | **str** | The name of the Activity to assign Workers when a task is assigned for them. | [optional] 
**assignment_activity_sid** | **str** | The SID of the Activity to assign Workers when a task is assigned for them. | [optional] 
**date_created** | **datetime** | The date and time in GMT when the resource was created specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format. | [optional] 
**date_updated** | **datetime** | The date and time in GMT when the resource was last updated specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format. | [optional] 
**friendly_name** | **str** | The string that you assigned to describe the resource. | [optional] 
**links** | **object** | The URLs of related resources. | [optional] 
**max_reserved_workers** | **int** | The maximum number of Workers to reserve for the assignment of a task in the queue. Can be an integer between 1 and 50, inclusive and defaults to 1. | [optional] 
**reservation_activity_name** | **str** | The name of the Activity to assign Workers once a task is reserved for them. | [optional] 
**reservation_activity_sid** | **str** | The SID of the Activity to assign Workers once a task is reserved for them. | [optional] 
**sid** | **str** | The unique string that we created to identify the TaskQueue resource. | [optional] 
**target_workers** | **str** | A string describing the Worker selection criteria for any Tasks that enter the TaskQueue. For example &#x60;&#39;\&quot;language\&quot; &#x3D;&#x3D; \&quot;spanish\&quot;&#39;&#x60; If no TargetWorkers parameter is provided, Tasks will wait in the TaskQueue until they are either deleted or moved to another TaskQueue. Additional examples on how to describing Worker selection criteria below. Defaults to 1&#x3D;&#x3D;1. | [optional] 
**task_order** | [**TaskQueueEnumTaskOrder**](TaskQueueEnumTaskOrder.md) |  | [optional] 
**url** | **str** | The absolute URL of the TaskQueue resource. | [optional] 
**workspace_sid** | **str** | The SID of the Workspace that contains the TaskQueue. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace_task_queue import TaskrouterV1WorkspaceTaskQueue

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1WorkspaceTaskQueue from a JSON string
taskrouter_v1_workspace_task_queue_instance = TaskrouterV1WorkspaceTaskQueue.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1WorkspaceTaskQueue.to_json())

# convert the object into a dict
taskrouter_v1_workspace_task_queue_dict = taskrouter_v1_workspace_task_queue_instance.to_dict()
# create an instance of TaskrouterV1WorkspaceTaskQueue from a dict
taskrouter_v1_workspace_task_queue_from_dict = TaskrouterV1WorkspaceTaskQueue.from_dict(taskrouter_v1_workspace_task_queue_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


