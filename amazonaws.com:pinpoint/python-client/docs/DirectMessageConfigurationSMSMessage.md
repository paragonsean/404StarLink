# DirectMessageConfigurationSMSMessage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **str** |  | [optional] 
**keyword** | **str** |  | [optional] 
**media_url** | **str** |  | [optional] 
**message_type** | [**MessageType**](MessageType.md) |  | [optional] 
**origination_number** | **str** |  | [optional] 
**sender_id** | **str** |  | [optional] 
**substitutions** | **Dict** |  | [optional] 
**entity_id** | **str** |  | [optional] 
**template_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.direct_message_configuration_sms_message import DirectMessageConfigurationSMSMessage

# TODO update the JSON string below
json = "{}"
# create an instance of DirectMessageConfigurationSMSMessage from a JSON string
direct_message_configuration_sms_message_instance = DirectMessageConfigurationSMSMessage.from_json(json)
# print the JSON string representation of the object
print(DirectMessageConfigurationSMSMessage.to_json())

# convert the object into a dict
direct_message_configuration_sms_message_dict = direct_message_configuration_sms_message_instance.to_dict()
# create an instance of DirectMessageConfigurationSMSMessage from a dict
direct_message_configuration_sms_message_from_dict = DirectMessageConfigurationSMSMessage.from_dict(direct_message_configuration_sms_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


