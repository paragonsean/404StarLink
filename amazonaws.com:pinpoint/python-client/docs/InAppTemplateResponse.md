# InAppTemplateResponse

In-App Template Response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**content** | **List** |  | [optional] 
**creation_date** | **str** |  | 
**custom_config** | **Dict** |  | [optional] 
**last_modified_date** | **str** |  | 
**layout** | [**Layout**](Layout.md) |  | [optional] 
**tags** | **Dict** |  | [optional] 
**template_description** | **str** |  | [optional] 
**template_name** | **str** |  | 
**template_type** | [**TemplateType**](TemplateType.md) |  | 
**version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.in_app_template_response import InAppTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of InAppTemplateResponse from a JSON string
in_app_template_response_instance = InAppTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(InAppTemplateResponse.to_json())

# convert the object into a dict
in_app_template_response_dict = in_app_template_response_instance.to_dict()
# create an instance of InAppTemplateResponse from a dict
in_app_template_response_from_dict = InAppTemplateResponse.from_dict(in_app_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


