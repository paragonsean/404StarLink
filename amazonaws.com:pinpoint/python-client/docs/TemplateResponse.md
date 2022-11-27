# TemplateResponse

Provides information about a message template that's associated with your Amazon Pinpoint account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**creation_date** | **str** |  | 
**default_substitutions** | **str** |  | [optional] 
**last_modified_date** | **str** |  | 
**tags** | **Dict** |  | [optional] 
**template_description** | **str** |  | [optional] 
**template_name** | **str** |  | 
**template_type** | [**TemplateType**](TemplateType.md) |  | 
**version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.template_response import TemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of TemplateResponse from a JSON string
template_response_instance = TemplateResponse.from_json(json)
# print the JSON string representation of the object
print(TemplateResponse.to_json())

# convert the object into a dict
template_response_dict = template_response_instance.to_dict()
# create an instance of TemplateResponse from a dict
template_response_from_dict = TemplateResponse.from_dict(template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


