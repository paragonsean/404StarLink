# TemplateConfiguration

Specifies the message template to use for the message, for each type of channel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email_template** | [**TemplateConfigurationEmailTemplate**](TemplateConfigurationEmailTemplate.md) |  | [optional] 
**push_template** | [**TemplateConfigurationPushTemplate**](TemplateConfigurationPushTemplate.md) |  | [optional] 
**sms_template** | [**TemplateConfigurationSMSTemplate**](TemplateConfigurationSMSTemplate.md) |  | [optional] 
**voice_template** | [**TemplateConfigurationVoiceTemplate**](TemplateConfigurationVoiceTemplate.md) |  | [optional] 

## Example

```python
from openapi_client.models.template_configuration import TemplateConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of TemplateConfiguration from a JSON string
template_configuration_instance = TemplateConfiguration.from_json(json)
# print the JSON string representation of the object
print(TemplateConfiguration.to_json())

# convert the object into a dict
template_configuration_dict = template_configuration_instance.to_dict()
# create an instance of TemplateConfiguration from a dict
template_configuration_from_dict = TemplateConfiguration.from_dict(template_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


