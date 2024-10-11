# ListTemplateActionsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | **List** |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_template_actions_response import ListTemplateActionsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListTemplateActionsResponse from a JSON string
list_template_actions_response_instance = ListTemplateActionsResponse.from_json(json)
# print the JSON string representation of the object
print(ListTemplateActionsResponse.to_json())

# convert the object into a dict
list_template_actions_response_dict = list_template_actions_response_instance.to_dict()
# create an instance of ListTemplateActionsResponse from a dict
list_template_actions_response_from_dict = ListTemplateActionsResponse.from_dict(list_template_actions_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


