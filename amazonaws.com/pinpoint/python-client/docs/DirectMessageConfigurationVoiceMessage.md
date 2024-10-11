# DirectMessageConfigurationVoiceMessage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **str** |  | [optional] 
**language_code** | **str** |  | [optional] 
**origination_number** | **str** |  | [optional] 
**substitutions** | **Dict** |  | [optional] 
**voice_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.direct_message_configuration_voice_message import DirectMessageConfigurationVoiceMessage

# TODO update the JSON string below
json = "{}"
# create an instance of DirectMessageConfigurationVoiceMessage from a JSON string
direct_message_configuration_voice_message_instance = DirectMessageConfigurationVoiceMessage.from_json(json)
# print the JSON string representation of the object
print(DirectMessageConfigurationVoiceMessage.to_json())

# convert the object into a dict
direct_message_configuration_voice_message_dict = direct_message_configuration_voice_message_instance.to_dict()
# create an instance of DirectMessageConfigurationVoiceMessage from a dict
direct_message_configuration_voice_message_from_dict = DirectMessageConfigurationVoiceMessage.from_dict(direct_message_configuration_voice_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


