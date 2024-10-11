# VoiceMessage

Specifies the settings for a one-time voice message that's sent directly to an endpoint through the voice channel.

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
from openapi_client.models.voice_message import VoiceMessage

# TODO update the JSON string below
json = "{}"
# create an instance of VoiceMessage from a JSON string
voice_message_instance = VoiceMessage.from_json(json)
# print the JSON string representation of the object
print(VoiceMessage.to_json())

# convert the object into a dict
voice_message_dict = voice_message_instance.to_dict()
# create an instance of VoiceMessage from a dict
voice_message_from_dict = VoiceMessage.from_dict(voice_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


