# TaskrouterV1WorkspaceEvent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Event resource. | [optional] 
**actor_sid** | **str** | The SID of the resource that triggered the event. | [optional] 
**actor_type** | **str** | The type of resource that triggered the event. | [optional] 
**actor_url** | **str** | The absolute URL of the resource that triggered the event. | [optional] 
**description** | **str** | A description of the event. | [optional] 
**event_data** | **object** | Data about the event. For more information, see [Event types](https://www.twilio.com/docs/taskrouter/api/event#event-types). | [optional] 
**event_date** | **datetime** | The time the event was sent, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
**event_date_ms** | **int** | The time the event was sent in milliseconds. | [optional] 
**event_type** | **str** | The identifier for the event. | [optional] 
**resource_sid** | **str** | The SID of the object the event is most relevant to, such as a TaskSid, ReservationSid, or a  WorkerSid. | [optional] 
**resource_type** | **str** | The type of object the event is most relevant to, such as a Task, Reservation, or a Worker). | [optional] 
**resource_url** | **str** | The URL of the resource the event is most relevant to. | [optional] 
**sid** | **str** | The unique string that we created to identify the Event resource. | [optional] 
**source** | **str** | Where the Event originated. | [optional] 
**source_ip_address** | **str** | The IP from which the Event originated. | [optional] 
**url** | **str** | The absolute URL of the Event resource. | [optional] 
**workspace_sid** | **str** | The SID of the Workspace that contains the Event. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace_event import TaskrouterV1WorkspaceEvent

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1WorkspaceEvent from a JSON string
taskrouter_v1_workspace_event_instance = TaskrouterV1WorkspaceEvent.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1WorkspaceEvent.to_json())

# convert the object into a dict
taskrouter_v1_workspace_event_dict = taskrouter_v1_workspace_event_instance.to_dict()
# create an instance of TaskrouterV1WorkspaceEvent from a dict
taskrouter_v1_workspace_event_from_dict = TaskrouterV1WorkspaceEvent.from_dict(taskrouter_v1_workspace_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


