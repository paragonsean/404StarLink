# TaskrouterV1WorkspaceWorkerWorkerChannel


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Worker resource. | [optional] 
**assigned_tasks** | **int** | The total number of Tasks assigned to Worker for the TaskChannel type. | [optional] 
**available** | **bool** | Whether the Worker should receive Tasks of the TaskChannel type. | [optional] 
**available_capacity_percentage** | **int** | The current percentage of capacity the TaskChannel has available. Can be a number between &#x60;0&#x60; and &#x60;100&#x60;. A value of &#x60;0&#x60; indicates that TaskChannel has no capacity available and a value of &#x60;100&#x60; means the  Worker is available to receive any Tasks of this TaskChannel type. | [optional] 
**configured_capacity** | **int** | The current configured capacity for the WorkerChannel. TaskRouter will not create any reservations after the assigned Tasks for the Worker reaches the value. | [optional] 
**date_created** | **datetime** | The date and time in GMT when the resource was created specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format. | [optional] 
**date_updated** | **datetime** | The date and time in GMT when the resource was last updated specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format. | [optional] 
**sid** | **str** | The unique string that we created to identify the WorkerChannel resource. | [optional] 
**task_channel_sid** | **str** | The SID of the TaskChannel. | [optional] 
**task_channel_unique_name** | **str** | The unique name of the TaskChannel, such as &#x60;voice&#x60; or &#x60;sms&#x60;. | [optional] 
**url** | **str** | The absolute URL of the WorkerChannel resource. | [optional] 
**worker_sid** | **str** | The SID of the Worker that contains the WorkerChannel. | [optional] 
**workspace_sid** | **str** | The SID of the Workspace that contains the WorkerChannel. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace_worker_worker_channel import TaskrouterV1WorkspaceWorkerWorkerChannel

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1WorkspaceWorkerWorkerChannel from a JSON string
taskrouter_v1_workspace_worker_worker_channel_instance = TaskrouterV1WorkspaceWorkerWorkerChannel.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1WorkspaceWorkerWorkerChannel.to_json())

# convert the object into a dict
taskrouter_v1_workspace_worker_worker_channel_dict = taskrouter_v1_workspace_worker_worker_channel_instance.to_dict()
# create an instance of TaskrouterV1WorkspaceWorkerWorkerChannel from a dict
taskrouter_v1_workspace_worker_worker_channel_from_dict = TaskrouterV1WorkspaceWorkerWorkerChannel.from_dict(taskrouter_v1_workspace_worker_worker_channel_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


