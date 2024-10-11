# Workflow

A GitHub Actions workflow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**badge_url** | **str** |  | 
**created_at** | **datetime** |  | 
**deleted_at** | **datetime** |  | [optional] 
**html_url** | **str** |  | 
**id** | **int** |  | 
**name** | **str** |  | 
**node_id** | **str** |  | 
**path** | **str** |  | 
**state** | **str** |  | 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.workflow import Workflow

# TODO update the JSON string below
json = "{}"
# create an instance of Workflow from a JSON string
workflow_instance = Workflow.from_json(json)
# print the JSON string representation of the object
print(Workflow.to_json())

# convert the object into a dict
workflow_dict = workflow_instance.to_dict()
# create an instance of Workflow from a dict
workflow_from_dict = Workflow.from_dict(workflow_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


