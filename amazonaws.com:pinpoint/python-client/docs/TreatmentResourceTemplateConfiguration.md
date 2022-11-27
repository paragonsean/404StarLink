# TreatmentResourceTemplateConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email_template** | [**TemplateConfigurationEmailTemplate**](TemplateConfigurationEmailTemplate.md) |  | [optional] 
**push_template** | [**TemplateConfigurationPushTemplate**](TemplateConfigurationPushTemplate.md) |  | [optional] 
**sms_template** | [**TemplateConfigurationSMSTemplate**](TemplateConfigurationSMSTemplate.md) |  | [optional] 
**voice_template** | [**TemplateConfigurationVoiceTemplate**](TemplateConfigurationVoiceTemplate.md) |  | [optional] 

## Example

```python
from openapi_client.models.treatment_resource_template_configuration import TreatmentResourceTemplateConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of TreatmentResourceTemplateConfiguration from a JSON string
treatment_resource_template_configuration_instance = TreatmentResourceTemplateConfiguration.from_json(json)
# print the JSON string representation of the object
print(TreatmentResourceTemplateConfiguration.to_json())

# convert the object into a dict
treatment_resource_template_configuration_dict = treatment_resource_template_configuration_instance.to_dict()
# create an instance of TreatmentResourceTemplateConfiguration from a dict
treatment_resource_template_configuration_from_dict = TreatmentResourceTemplateConfiguration.from_dict(treatment_resource_template_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


