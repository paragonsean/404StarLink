# TreatmentResourceMessageConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adm_message** | [**MessageConfigurationADMMessage**](MessageConfigurationADMMessage.md) |  | [optional] 
**apns_message** | [**MessageConfigurationAPNSMessage**](MessageConfigurationAPNSMessage.md) |  | [optional] 
**baidu_message** | [**MessageConfigurationBaiduMessage**](MessageConfigurationBaiduMessage.md) |  | [optional] 
**custom_message** | [**MessageConfigurationCustomMessage**](MessageConfigurationCustomMessage.md) |  | [optional] 
**default_message** | [**MessageConfigurationDefaultMessage**](MessageConfigurationDefaultMessage.md) |  | [optional] 
**email_message** | [**MessageConfigurationEmailMessage**](MessageConfigurationEmailMessage.md) |  | [optional] 
**gcm_message** | [**MessageConfigurationGCMMessage**](MessageConfigurationGCMMessage.md) |  | [optional] 
**sms_message** | [**MessageConfigurationSMSMessage**](MessageConfigurationSMSMessage.md) |  | [optional] 
**in_app_message** | [**MessageConfigurationInAppMessage**](MessageConfigurationInAppMessage.md) |  | [optional] 

## Example

```python
from openapi_client.models.treatment_resource_message_configuration import TreatmentResourceMessageConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of TreatmentResourceMessageConfiguration from a JSON string
treatment_resource_message_configuration_instance = TreatmentResourceMessageConfiguration.from_json(json)
# print the JSON string representation of the object
print(TreatmentResourceMessageConfiguration.to_json())

# convert the object into a dict
treatment_resource_message_configuration_dict = treatment_resource_message_configuration_instance.to_dict()
# create an instance of TreatmentResourceMessageConfiguration from a dict
treatment_resource_message_configuration_from_dict = TreatmentResourceMessageConfiguration.from_dict(treatment_resource_message_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


