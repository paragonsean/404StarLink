# ListTemplateActionsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**ListTemplateActionsRequestFilters**](ListTemplateActionsRequestFilters.md) |  | [optional] 
**launch_configuration_template_id** | **str** | Launch configuration template ID. | 
**max_results** | **int** | Maximum amount of items to return when listing template post migration custom actions. | [optional] 
**next_token** | **str** | Next token to use when listing template post migration custom actions. | [optional] 

## Example

```python
from openapi_client.models.list_template_actions_request import ListTemplateActionsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ListTemplateActionsRequest from a JSON string
list_template_actions_request_instance = ListTemplateActionsRequest.from_json(json)
# print the JSON string representation of the object
print(ListTemplateActionsRequest.to_json())

# convert the object into a dict
list_template_actions_request_dict = list_template_actions_request_instance.to_dict()
# create an instance of ListTemplateActionsRequest from a dict
list_template_actions_request_from_dict = ListTemplateActionsRequest.from_dict(list_template_actions_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


