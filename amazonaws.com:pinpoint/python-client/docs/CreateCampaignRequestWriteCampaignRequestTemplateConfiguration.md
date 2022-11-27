# CreateCampaignRequestWriteCampaignRequestTemplateConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email_template** | [**TemplateConfigurationEmailTemplate**](TemplateConfigurationEmailTemplate.md) |  | [optional] 
**push_template** | [**TemplateConfigurationPushTemplate**](TemplateConfigurationPushTemplate.md) |  | [optional] 
**sms_template** | [**TemplateConfigurationSMSTemplate**](TemplateConfigurationSMSTemplate.md) |  | [optional] 
**voice_template** | [**TemplateConfigurationVoiceTemplate**](TemplateConfigurationVoiceTemplate.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_campaign_request_write_campaign_request_template_configuration import CreateCampaignRequestWriteCampaignRequestTemplateConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of CreateCampaignRequestWriteCampaignRequestTemplateConfiguration from a JSON string
create_campaign_request_write_campaign_request_template_configuration_instance = CreateCampaignRequestWriteCampaignRequestTemplateConfiguration.from_json(json)
# print the JSON string representation of the object
print(CreateCampaignRequestWriteCampaignRequestTemplateConfiguration.to_json())

# convert the object into a dict
create_campaign_request_write_campaign_request_template_configuration_dict = create_campaign_request_write_campaign_request_template_configuration_instance.to_dict()
# create an instance of CreateCampaignRequestWriteCampaignRequestTemplateConfiguration from a dict
create_campaign_request_write_campaign_request_template_configuration_from_dict = CreateCampaignRequestWriteCampaignRequestTemplateConfiguration.from_dict(create_campaign_request_write_campaign_request_template_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


