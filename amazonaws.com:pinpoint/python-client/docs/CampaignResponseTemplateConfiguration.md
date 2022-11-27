# CampaignResponseTemplateConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email_template** | [**TemplateConfigurationEmailTemplate**](TemplateConfigurationEmailTemplate.md) |  | [optional] 
**push_template** | [**TemplateConfigurationPushTemplate**](TemplateConfigurationPushTemplate.md) |  | [optional] 
**sms_template** | [**TemplateConfigurationSMSTemplate**](TemplateConfigurationSMSTemplate.md) |  | [optional] 
**voice_template** | [**TemplateConfigurationVoiceTemplate**](TemplateConfigurationVoiceTemplate.md) |  | [optional] 

## Example

```python
from openapi_client.models.campaign_response_template_configuration import CampaignResponseTemplateConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignResponseTemplateConfiguration from a JSON string
campaign_response_template_configuration_instance = CampaignResponseTemplateConfiguration.from_json(json)
# print the JSON string representation of the object
print(CampaignResponseTemplateConfiguration.to_json())

# convert the object into a dict
campaign_response_template_configuration_dict = campaign_response_template_configuration_instance.to_dict()
# create an instance of CampaignResponseTemplateConfiguration from a dict
campaign_response_template_configuration_from_dict = CampaignResponseTemplateConfiguration.from_dict(campaign_response_template_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


