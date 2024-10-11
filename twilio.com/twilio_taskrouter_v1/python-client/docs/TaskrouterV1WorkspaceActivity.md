# TaskrouterV1WorkspaceActivity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Activity resource. | [optional] 
**available** | **bool** | Whether the Worker is eligible to receive a Task when it occupies the Activity. A value of &#x60;true&#x60;, &#x60;1&#x60;, or &#x60;yes&#x60; indicates the Activity is available. All other values indicate that it is not. The value cannot be changed after the Activity is created. | [optional] 
**date_created** | **datetime** | The date and time in GMT when the resource was created specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
**date_updated** | **datetime** | The date and time in GMT when the resource was last updated specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
**friendly_name** | **str** | The string that you assigned to describe the Activity resource. | [optional] 
**links** | **object** |  | [optional] 
**sid** | **str** | The unique string that we created to identify the Activity resource. | [optional] 
**url** | **str** | The absolute URL of the Activity resource. | [optional] 
**workspace_sid** | **str** | The SID of the Workspace that contains the Activity. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace_activity import TaskrouterV1WorkspaceActivity

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1WorkspaceActivity from a JSON string
taskrouter_v1_workspace_activity_instance = TaskrouterV1WorkspaceActivity.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1WorkspaceActivity.to_json())

# convert the object into a dict
taskrouter_v1_workspace_activity_dict = taskrouter_v1_workspace_activity_instance.to_dict()
# create an instance of TaskrouterV1WorkspaceActivity from a dict
taskrouter_v1_workspace_activity_from_dict = TaskrouterV1WorkspaceActivity.from_dict(taskrouter_v1_workspace_activity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


