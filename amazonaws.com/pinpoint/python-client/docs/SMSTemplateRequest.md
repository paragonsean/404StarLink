# SMSTemplateRequest

Specifies the content and settings for a message template that can be used in text messages that are sent through the SMS channel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **str** |  | [optional] 
**default_substitutions** | **str** |  | [optional] 
**recommender_id** | **str** |  | [optional] 
**tags** | **Dict** |  | [optional] 
**template_description** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.sms_template_request import SMSTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SMSTemplateRequest from a JSON string
sms_template_request_instance = SMSTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(SMSTemplateRequest.to_json())

# convert the object into a dict
sms_template_request_dict = sms_template_request_instance.to_dict()
# create an instance of SMSTemplateRequest from a dict
sms_template_request_from_dict = SMSTemplateRequest.from_dict(sms_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


