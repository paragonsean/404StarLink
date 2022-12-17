# TaskrouterV1WorkspaceTaskChannel


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Task Channel resource. | [optional] 
**channel_optimized_routing** | **bool** | Whether the Task Channel will prioritize Workers that have been idle. When &#x60;true&#x60;, Workers that have been idle the longest are prioritized. | [optional] 
**date_created** | **datetime** | The date and time in GMT when the resource was created specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
**date_updated** | **datetime** | The date and time in GMT when the resource was last updated specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
**friendly_name** | **str** | The string that you assigned to describe the resource. | [optional] 
**links** | **object** | The URLs of related resources. | [optional] 
**sid** | **str** | The unique string that we created to identify the Task Channel resource. | [optional] 
**unique_name** | **str** | An application-defined string that uniquely identifies the Task Channel, such as &#x60;voice&#x60; or &#x60;sms&#x60;. | [optional] 
**url** | **str** | The absolute URL of the Task Channel resource. | [optional] 
**workspace_sid** | **str** | The SID of the Workspace that contains the Task Channel. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace_task_channel import TaskrouterV1WorkspaceTaskChannel

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1WorkspaceTaskChannel from a JSON string
taskrouter_v1_workspace_task_channel_instance = TaskrouterV1WorkspaceTaskChannel.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1WorkspaceTaskChannel.to_json())

# convert the object into a dict
taskrouter_v1_workspace_task_channel_dict = taskrouter_v1_workspace_task_channel_instance.to_dict()
# create an instance of TaskrouterV1WorkspaceTaskChannel from a dict
taskrouter_v1_workspace_task_channel_from_dict = TaskrouterV1WorkspaceTaskChannel.from_dict(taskrouter_v1_workspace_task_channel_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


