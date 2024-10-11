# TaskrouterV1Workspace


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Workspace resource. | [optional] 
**date_created** | **datetime** | The date and time in GMT when the resource was created specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
**date_updated** | **datetime** | The date and time in GMT when the resource was last updated specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
**default_activity_name** | **str** | The name of the default activity. | [optional] 
**default_activity_sid** | **str** | The SID of the Activity that will be used when new Workers are created in the Workspace. | [optional] 
**event_callback_url** | **str** | The URL we call when an event occurs. If provided, the Workspace will publish events to this URL, for example, to collect data for reporting. See [Workspace Events](https://www.twilio.com/docs/taskrouter/api/event) for more information. This parameter supports Twilio&#39;s [Webhooks (HTTP callbacks) Connection Overrides](https://www.twilio.com/docs/usage/webhooks/webhooks-connection-overrides). | [optional] 
**events_filter** | **str** | The list of Workspace events for which to call &#x60;event_callback_url&#x60;. For example, if &#x60;EventsFilter&#x3D;task.created, task.canceled, worker.activity.update&#x60;, then TaskRouter will call event_callback_url only when a task is created, canceled, or a Worker activity is updated. | [optional] 
**friendly_name** | **str** | The string that you assigned to describe the Workspace resource. For example &#x60;Customer Support&#x60; or &#x60;2014 Election Campaign&#x60;. | [optional] 
**links** | **object** | The URLs of related resources. | [optional] 
**multi_task_enabled** | **bool** | Whether multi-tasking is enabled. The default is &#x60;true&#x60;, which enables multi-tasking. Multi-tasking allows Workers to handle multiple Tasks simultaneously. When enabled (&#x60;true&#x60;), each Worker can receive parallel reservations up to the per-channel maximums defined in the Workers section. In single-tasking each Worker would only receive a new reservation when the previous task is completed. Learn more at [Multitasking](https://www.twilio.com/docs/taskrouter/multitasking). | [optional] 
**prioritize_queue_order** | [**WorkspaceEnumQueueOrder**](WorkspaceEnumQueueOrder.md) |  | [optional] 
**sid** | **str** | The unique string that we created to identify the Workspace resource. | [optional] 
**timeout_activity_name** | **str** | The name of the timeout activity. | [optional] 
**timeout_activity_sid** | **str** | The SID of the Activity that will be assigned to a Worker when a Task reservation times out without a response. | [optional] 
**url** | **str** | The absolute URL of the Workspace resource. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace import TaskrouterV1Workspace

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1Workspace from a JSON string
taskrouter_v1_workspace_instance = TaskrouterV1Workspace.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1Workspace.to_json())

# convert the object into a dict
taskrouter_v1_workspace_dict = taskrouter_v1_workspace_instance.to_dict()
# create an instance of TaskrouterV1Workspace from a dict
taskrouter_v1_workspace_from_dict = TaskrouterV1Workspace.from_dict(taskrouter_v1_workspace_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


