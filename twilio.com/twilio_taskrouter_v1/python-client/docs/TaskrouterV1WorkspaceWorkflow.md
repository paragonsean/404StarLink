# TaskrouterV1WorkspaceWorkflow


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the Workflow resource. | [optional] 
**assignment_callback_url** | **str** | The URL that we call when a task managed by the Workflow is assigned to a Worker. See Assignment Callback URL for more information. | [optional] 
**configuration** | **str** | A JSON string that contains the Workflow&#39;s configuration. See [Configuring Workflows](https://www.twilio.com/docs/taskrouter/workflow-configuration) for more information. | [optional] 
**date_created** | **datetime** | The date and time in GMT when the resource was created specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format. | [optional] 
**date_updated** | **datetime** | The date and time in GMT when the resource was last updated specified in [RFC 2822](https://www.ietf.org/rfc/rfc2822.txt) format. | [optional] 
**document_content_type** | **str** | The MIME type of the document. | [optional] 
**fallback_assignment_callback_url** | **str** | The URL that we call when a call to the &#x60;assignment_callback_url&#x60; fails. | [optional] 
**friendly_name** | **str** | The string that you assigned to describe the Workflow resource. For example, &#x60;Customer Support&#x60; or &#x60;2014 Election Campaign&#x60;. | [optional] 
**links** | **object** | The URLs of related resources. | [optional] 
**sid** | **str** | The unique string that we created to identify the Workflow resource. | [optional] 
**task_reservation_timeout** | **int** | How long TaskRouter will wait for a confirmation response from your application after it assigns a Task to a Worker. Can be up to &#x60;86,400&#x60; (24 hours) and the default is &#x60;120&#x60;. | [optional] 
**url** | **str** | The absolute URL of the Workflow resource. | [optional] 
**workspace_sid** | **str** | The SID of the Workspace that contains the Workflow. | [optional] 

## Example

```python
from openapi_client.models.taskrouter_v1_workspace_workflow import TaskrouterV1WorkspaceWorkflow

# TODO update the JSON string below
json = "{}"
# create an instance of TaskrouterV1WorkspaceWorkflow from a JSON string
taskrouter_v1_workspace_workflow_instance = TaskrouterV1WorkspaceWorkflow.from_json(json)
# print the JSON string representation of the object
print(TaskrouterV1WorkspaceWorkflow.to_json())

# convert the object into a dict
taskrouter_v1_workspace_workflow_dict = taskrouter_v1_workspace_workflow_instance.to_dict()
# create an instance of TaskrouterV1WorkspaceWorkflow from a dict
taskrouter_v1_workspace_workflow_from_dict = TaskrouterV1WorkspaceWorkflow.from_dict(taskrouter_v1_workspace_workflow_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


