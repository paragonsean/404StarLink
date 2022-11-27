# DirectMessageConfiguration

Specifies the settings and content for the default message and any default messages that you tailored for specific channels.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adm_message** | [**DirectMessageConfigurationADMMessage**](DirectMessageConfigurationADMMessage.md) |  | [optional] 
**apns_message** | [**DirectMessageConfigurationAPNSMessage**](DirectMessageConfigurationAPNSMessage.md) |  | [optional] 
**baidu_message** | [**DirectMessageConfigurationBaiduMessage**](DirectMessageConfigurationBaiduMessage.md) |  | [optional] 
**default_message** | [**DirectMessageConfigurationDefaultMessage**](DirectMessageConfigurationDefaultMessage.md) |  | [optional] 
**default_push_notification_message** | [**DirectMessageConfigurationDefaultPushNotificationMessage**](DirectMessageConfigurationDefaultPushNotificationMessage.md) |  | [optional] 
**email_message** | [**DirectMessageConfigurationEmailMessage**](DirectMessageConfigurationEmailMessage.md) |  | [optional] 
**gcm_message** | [**DirectMessageConfigurationGCMMessage**](DirectMessageConfigurationGCMMessage.md) |  | [optional] 
**sms_message** | [**DirectMessageConfigurationSMSMessage**](DirectMessageConfigurationSMSMessage.md) |  | [optional] 
**voice_message** | [**DirectMessageConfigurationVoiceMessage**](DirectMessageConfigurationVoiceMessage.md) |  | [optional] 

## Example

```python
from openapi_client.models.direct_message_configuration import DirectMessageConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of DirectMessageConfiguration from a JSON string
direct_message_configuration_instance = DirectMessageConfiguration.from_json(json)
# print the JSON string representation of the object
print(DirectMessageConfiguration.to_json())

# convert the object into a dict
direct_message_configuration_dict = direct_message_configuration_instance.to_dict()
# create an instance of DirectMessageConfiguration from a dict
direct_message_configuration_from_dict = DirectMessageConfiguration.from_dict(direct_message_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


