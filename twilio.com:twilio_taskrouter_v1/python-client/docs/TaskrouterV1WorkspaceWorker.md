# TaskrouterV1WorkspaceWorker


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Worker resource. | [optional] 
**activity_name** | **str** | The &#x60;friendly_name&#x60; of the Worker&#39;s current Activity. | [optional] 
**activity_sid** | **str** | The SID of the Worker&#39;s current Activity. | [optional] 
**attributes** | **str** | The JSON string that describes the Worker. For example: &#x60;{ \&quot;email\&quot;: \&quot;Bob@example.com\&quot;, \&quot;phone\&quot;: \&quot;+5095551234\&quot; }&#x60;. **Note** If this property has been assigned a value, it will only be displayed in FETCH actions that return a single resource. Otherwise, this property will be null, even if it has a value. This data is passed to the &#x60;assignment_callback_url&#x60; when TaskRouter assigns a Task to the Worker. | [optional] 
**available** | **bool** | Whether the Worker is available to perform tasks. | [optional] 
**date_created** | **datetime** | The date and time in GMT when the resource was created specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
**date_status_changed** | **datetime** | The date and time in GMT of the last change to the Worker&#39;s activity specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. Used to calculate Workflow statistics. | [optional] 
**date_updated** | **datetime** | The date and time in GMT when the resource was last updated specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | [optional] 
**friendly_name** | **str** | The string that you assigned to describe the resource. Friendly names are case insensitive, and unique within the TaskRouter Workspace. | [optional] 
**links** | **object** | The URLs of related resources. | [optional] 
**sid** | **str** | The unique string that we created to identify the Worker resource. | [optional] 
**url** | **str** | The absolute URL of the Worker resource. | [optional] 
**workspace_sid** | **str** | The SID of the Workspace that contains the Worker. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace_worker import TaskrouterV1WorkspaceWorker

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1WorkspaceWorker from a JSON string
taskrouter_v1_workspace_worker_instance = TaskrouterV1WorkspaceWorker.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1WorkspaceWorker.to_json())

# convert the object into a dict
taskrouter_v1_workspace_worker_dict = taskrouter_v1_workspace_worker_instance.to_dict()
# create an instance of TaskrouterV1WorkspaceWorker from a dict
taskrouter_v1_workspace_worker_from_dict = TaskrouterV1WorkspaceWorker.from_dict(taskrouter_v1_workspace_worker_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


