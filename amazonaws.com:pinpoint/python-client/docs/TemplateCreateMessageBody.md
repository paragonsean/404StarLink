# TemplateCreateMessageBody

Provides information about a request to create a message template.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**message** | **str** |  | [optional] 
**request_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.template_create_message_body import TemplateCreateMessageBody

# TODO update the JSON string below
json = "{}"
# create an instance of TemplateCreateMessageBody from a JSON string
template_create_message_body_instance = TemplateCreateMessageBody.from_json(json)
# print the JSON string representation of the object
print(TemplateCreateMessageBody.to_json())

# convert the object into a dict
template_create_message_body_dict = template_create_message_body_instance.to_dict()
# create an instance of TemplateCreateMessageBody from a dict
template_create_message_body_from_dict = TemplateCreateMessageBody.from_dict(template_create_message_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


