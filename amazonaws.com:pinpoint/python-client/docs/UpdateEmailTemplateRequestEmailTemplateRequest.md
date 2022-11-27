# UpdateEmailTemplateRequestEmailTemplateRequest

Specifies the content and settings for a message template that can be used in messages that are sent through the email channel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_substitutions** | **str** |  | [optional] 
**html_part** | **str** |  | [optional] 
**recommender_id** | **str** |  | [optional] 
**subject** | **str** |  | [optional] 
**tags** | **Dict** |  | [optional] 
**template_description** | **str** |  | [optional] 
**text_part** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.update_email_template_request_email_template_request import UpdateEmailTemplateRequestEmailTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateEmailTemplateRequestEmailTemplateRequest from a JSON string
update_email_template_request_email_template_request_instance = UpdateEmailTemplateRequestEmailTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateEmailTemplateRequestEmailTemplateRequest.to_json())

# convert the object into a dict
update_email_template_request_email_template_request_dict = update_email_template_request_email_template_request_instance.to_dict()
# create an instance of UpdateEmailTemplateRequestEmailTemplateRequest from a dict
update_email_template_request_email_template_request_from_dict = UpdateEmailTemplateRequestEmailTemplateRequest.from_dict(update_email_template_request_email_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


