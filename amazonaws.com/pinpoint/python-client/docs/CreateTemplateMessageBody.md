# CreateTemplateMessageBody

Provides information about a request to create a message template.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**message** | **str** |  | [optional] 
**request_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.create_template_message_body import CreateTemplateMessageBody

# TODO update the JSON string below
json = "{}"
# create an instance of CreateTemplateMessageBody from a JSON string
create_template_message_body_instance = CreateTemplateMessageBody.from_json(json)
# print the JSON string representation of the object
print(CreateTemplateMessageBody.to_json())

# convert the object into a dict
create_template_message_body_dict = create_template_message_body_instance.to_dict()
# create an instance of CreateTemplateMessageBody from a dict
create_template_message_body_from_dict = CreateTemplateMessageBody.from_dict(create_template_message_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


