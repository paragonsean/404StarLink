# PutTemplateActionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_id** | **str** | Template post migration custom action ID. | 
**action_name** | **str** | Template post migration custom action name. | 
**active** | **bool** | Template post migration custom action active status. | [optional] 
**category** | **str** | Template post migration custom action category. | [optional] 
**description** | **str** | Template post migration custom action description. | [optional] 
**document_identifier** | **str** | Template post migration custom action document identifier. | 
**document_version** | **str** | Template post migration custom action document version. | [optional] 
**external_parameters** | [**Dict[str, SsmExternalParameter]**](SsmExternalParameter.md) | Template post migration custom action external parameters. | [optional] 
**launch_configuration_template_id** | **str** | Launch configuration template ID. | 
**must_succeed_for_cutover** | **bool** | Template post migration custom action must succeed for cutover. | [optional] 
**operating_system** | **str** | Operating system eligible for this template post migration custom action. | [optional] 
**order** | **int** | Template post migration custom action order. | 
**parameters** | **Dict[str, List[SsmParameterStoreParameter]]** | Template post migration custom action parameters. | [optional] 
**timeout_seconds** | **int** | Template post migration custom action timeout in seconds. | [optional] 

## Example

```python
from openapi_client.models.put_template_action_request import PutTemplateActionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PutTemplateActionRequest from a JSON string
put_template_action_request_instance = PutTemplateActionRequest.from_json(json)
# print the JSON string representation of the object
print(PutTemplateActionRequest.to_json())

# convert the object into a dict
put_template_action_request_dict = put_template_action_request_instance.to_dict()
# create an instance of PutTemplateActionRequest from a dict
put_template_action_request_from_dict = PutTemplateActionRequest.from_dict(put_template_action_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


