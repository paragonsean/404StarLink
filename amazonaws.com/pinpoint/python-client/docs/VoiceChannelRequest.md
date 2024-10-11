# VoiceChannelRequest

Specifies the status and settings of the voice channel for an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.voice_channel_request import VoiceChannelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of VoiceChannelRequest from a JSON string
voice_channel_request_instance = VoiceChannelRequest.from_json(json)
# print the JSON string representation of the object
print(VoiceChannelRequest.to_json())

# convert the object into a dict
voice_channel_request_dict = voice_channel_request_instance.to_dict()
# create an instance of VoiceChannelRequest from a dict
voice_channel_request_from_dict = VoiceChannelRequest.from_dict(voice_channel_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


