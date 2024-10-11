# SendMessagesRequestMessageRequestTemplateConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email_template** | [**TemplateConfigurationEmailTemplate**](TemplateConfigurationEmailTemplate.md) |  | [optional] 
**push_template** | [**TemplateConfigurationPushTemplate**](TemplateConfigurationPushTemplate.md) |  | [optional] 
**sms_template** | [**TemplateConfigurationSMSTemplate**](TemplateConfigurationSMSTemplate.md) |  | [optional] 
**voice_template** | [**TemplateConfigurationVoiceTemplate**](TemplateConfigurationVoiceTemplate.md) |  | [optional] 

## Example

```python
from openapi_client.models.send_messages_request_message_request_template_configuration import SendMessagesRequestMessageRequestTemplateConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of SendMessagesRequestMessageRequestTemplateConfiguration from a JSON string
send_messages_request_message_request_template_configuration_instance = SendMessagesRequestMessageRequestTemplateConfiguration.from_json(json)
# print the JSON string representation of the object
print(SendMessagesRequestMessageRequestTemplateConfiguration.to_json())

# convert the object into a dict
send_messages_request_message_request_template_configuration_dict = send_messages_request_message_request_template_configuration_instance.to_dict()
# create an instance of SendMessagesRequestMessageRequestTemplateConfiguration from a dict
send_messages_request_message_request_template_configuration_from_dict = SendMessagesRequestMessageRequestTemplateConfiguration.from_dict(send_messages_request_message_request_template_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


