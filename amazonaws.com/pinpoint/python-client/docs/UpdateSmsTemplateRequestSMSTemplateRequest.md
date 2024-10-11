# UpdateSmsTemplateRequestSMSTemplateRequest

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
from openapi_client.models.update_sms_template_request_sms_template_request import UpdateSmsTemplateRequestSMSTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateSmsTemplateRequestSMSTemplateRequest from a JSON string
update_sms_template_request_sms_template_request_instance = UpdateSmsTemplateRequestSMSTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateSmsTemplateRequestSMSTemplateRequest.to_json())

# convert the object into a dict
update_sms_template_request_sms_template_request_dict = update_sms_template_request_sms_template_request_instance.to_dict()
# create an instance of UpdateSmsTemplateRequestSMSTemplateRequest from a dict
update_sms_template_request_sms_template_request_from_dict = UpdateSmsTemplateRequestSMSTemplateRequest.from_dict(update_sms_template_request_sms_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


