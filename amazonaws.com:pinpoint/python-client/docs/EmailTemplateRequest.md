# EmailTemplateRequest

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
from openapi_client.models.email_template_request import EmailTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EmailTemplateRequest from a JSON string
email_template_request_instance = EmailTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(EmailTemplateRequest.to_json())

# convert the object into a dict
email_template_request_dict = email_template_request_instance.to_dict()
# create an instance of EmailTemplateRequest from a dict
email_template_request_from_dict = EmailTemplateRequest.from_dict(email_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


