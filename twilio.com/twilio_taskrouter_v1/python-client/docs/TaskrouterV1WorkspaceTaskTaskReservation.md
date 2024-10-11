# TaskrouterV1WorkspaceTaskTaskReservation


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the TaskReservation resource. | [optional] 
**date_created** | **datetime** | The date and time in GMT when the resource was created specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
**date_updated** | **datetime** | The date and time in GMT when the resource was last updated specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
**links** | **object** | The URLs of related resources. | [optional] 
**reservation_status** | [**TaskReservationEnumStatus**](TaskReservationEnumStatus.md) |  | [optional] 
**sid** | **str** | The unique string that we created to identify the TaskReservation resource. | [optional] 
**task_sid** | **str** | The SID of the reserved Task resource. | [optional] 
**url** | **str** | The absolute URL of the TaskReservation reservation. | [optional] 
**worker_name** | **str** | The &#x60;friendly_name&#x60; of the Worker that is reserved. | [optional] 
**worker_sid** | **str** | The SID of the reserved Worker resource. | [optional] 
**workspace_sid** | **str** | The SID of the Workspace that this task is contained within. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace_task_task_reservation import TaskrouterV1WorkspaceTaskTaskReservation

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1WorkspaceTaskTaskReservation from a JSON string
taskrouter_v1_workspace_task_task_reservation_instance = TaskrouterV1WorkspaceTaskTaskReservation.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1WorkspaceTaskTaskReservation.to_json())

# convert the object into a dict
taskrouter_v1_workspace_task_task_reservation_dict = taskrouter_v1_workspace_task_task_reservation_instance.to_dict()
# create an instance of TaskrouterV1WorkspaceTaskTaskReservation from a dict
taskrouter_v1_workspace_task_task_reservation_from_dict = TaskrouterV1WorkspaceTaskTaskReservation.from_dict(taskrouter_v1_workspace_task_task_reservation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


