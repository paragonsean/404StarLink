# RemoveTemplateActionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_id** | **str** | Template post migration custom action ID to remove. | 
**launch_configuration_template_id** | **str** | Launch configuration template ID of the post migration custom action to remove. | 

## Example

```python
from openapi_client.models.remove_template_action_request import RemoveTemplateActionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RemoveTemplateActionRequest from a JSON string
remove_template_action_request_instance = RemoveTemplateActionRequest.from_json(json)
# print the JSON string representation of the object
print(RemoveTemplateActionRequest.to_json())

# convert the object into a dict
remove_template_action_request_dict = remove_template_action_request_instance.to_dict()
# create an instance of RemoveTemplateActionRequest from a dict
remove_template_action_request_from_dict = RemoveTemplateActionRequest.from_dict(remove_template_action_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


