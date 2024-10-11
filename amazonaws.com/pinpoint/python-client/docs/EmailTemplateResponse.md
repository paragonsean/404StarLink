# EmailTemplateResponse

Provides information about the content and settings for a message template that can be used in messages that are sent through the email channel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**creation_date** | **str** |  | 
**default_substitutions** | **str** |  | [optional] 
**html_part** | **str** |  | [optional] 
**last_modified_date** | **str** |  | 
**recommender_id** | **str** |  | [optional] 
**subject** | **str** |  | [optional] 
**tags** | **Dict** |  | [optional] 
**template_description** | **str** |  | [optional] 
**template_name** | **str** |  | 
**template_type** | [**TemplateType**](TemplateType.md) |  | 
**text_part** | **str** |  | [optional] 
**version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.email_template_response import EmailTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of EmailTemplateResponse from a JSON string
email_template_response_instance = EmailTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(EmailTemplateResponse.to_json())

# convert the object into a dict
email_template_response_dict = email_template_response_instance.to_dict()
# create an instance of EmailTemplateResponse from a dict
email_template_response_from_dict = EmailTemplateResponse.from_dict(email_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


