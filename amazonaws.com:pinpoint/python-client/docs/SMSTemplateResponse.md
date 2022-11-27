# SMSTemplateResponse

Provides information about the content and settings for a message template that can be used in text messages that are sent through the SMS channel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**body** | **str** |  | [optional] 
**creation_date** | **str** |  | 
**default_substitutions** | **str** |  | [optional] 
**last_modified_date** | **str** |  | 
**recommender_id** | **str** |  | [optional] 
**tags** | **Dict** |  | [optional] 
**template_description** | **str** |  | [optional] 
**template_name** | **str** |  | 
**template_type** | [**TemplateType**](TemplateType.md) |  | 
**version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.sms_template_response import SMSTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of SMSTemplateResponse from a JSON string
sms_template_response_instance = SMSTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(SMSTemplateResponse.to_json())

# convert the object into a dict
sms_template_response_dict = sms_template_response_instance.to_dict()
# create an instance of SMSTemplateResponse from a dict
sms_template_response_from_dict = SMSTemplateResponse.from_dict(sms_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


