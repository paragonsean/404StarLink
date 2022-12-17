# ListWorkflowResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meta** | [**ListWorkspaceResponseMeta**](ListWorkspaceResponseMeta.md) |  | [optional] 
**workflows** | [**List[TaskrouterV1WorkspaceWorkflow]**](TaskrouterV1WorkspaceWorkflow.md) |  | [optional] 

## Example

```python
from openapi_client.models.list_workflow_response import ListWorkflowResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListWorkflowResponse from a JSON string
list_workflow_response_instance = ListWorkflowResponse.from_json(json)
# print the JSON string representation of the object
print(ListWorkflowResponse.to_json())

# convert the object into a dict
list_workflow_response_dict = list_workflow_response_instance.to_dict()
# create an instance of ListWorkflowResponse from a dict
list_workflow_response_from_dict = ListWorkflowResponse.from_dict(list_workflow_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


