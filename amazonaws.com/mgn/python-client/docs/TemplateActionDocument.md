# TemplateActionDocument


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_id** | **str** |  | [optional] 
**action_name** | **str** |  | [optional] 
**active** | **bool** |  | [optional] 
**category** | [**ActionCategory**](ActionCategory.md) |  | [optional] 
**description** | **str** |  | [optional] 
**document_identifier** | **str** |  | [optional] 
**document_version** | **str** |  | [optional] 
**external_parameters** | **Dict** |  | [optional] 
**must_succeed_for_cutover** | **bool** |  | [optional] 
**operating_system** | **str** |  | [optional] 
**order** | **int** |  | [optional] 
**parameters** | **Dict** |  | [optional] 
**timeout_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.template_action_document import TemplateActionDocument

# TODO update the JSON string below
json = "{}"
# create an instance of TemplateActionDocument from a JSON string
template_action_document_instance = TemplateActionDocument.from_json(json)
# print the JSON string representation of the object
print(TemplateActionDocument.to_json())

# convert the object into a dict
template_action_document_dict = template_action_document_instance.to_dict()
# create an instance of TemplateActionDocument from a dict
template_action_document_from_dict = TemplateActionDocument.from_dict(template_action_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


