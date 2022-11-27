# InAppTemplateRequest

InApp Template Request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **List** |  | [optional] 
**custom_config** | **Dict** |  | [optional] 
**layout** | [**Layout**](Layout.md) |  | [optional] 
**tags** | **Dict** |  | [optional] 
**template_description** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.in_app_template_request import InAppTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of InAppTemplateRequest from a JSON string
in_app_template_request_instance = InAppTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(InAppTemplateRequest.to_json())

# convert the object into a dict
in_app_template_request_dict = in_app_template_request_instance.to_dict()
# create an instance of InAppTemplateRequest from a dict
in_app_template_request_from_dict = InAppTemplateRequest.from_dict(in_app_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


