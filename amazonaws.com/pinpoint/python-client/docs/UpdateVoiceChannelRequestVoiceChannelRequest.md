# UpdateVoiceChannelRequestVoiceChannelRequest

Specifies the status and settings of the voice channel for an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.update_voice_channel_request_voice_channel_request import UpdateVoiceChannelRequestVoiceChannelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateVoiceChannelRequestVoiceChannelRequest from a JSON string
update_voice_channel_request_voice_channel_request_instance = UpdateVoiceChannelRequestVoiceChannelRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateVoiceChannelRequestVoiceChannelRequest.to_json())

# convert the object into a dict
update_voice_channel_request_voice_channel_request_dict = update_voice_channel_request_voice_channel_request_instance.to_dict()
# create an instance of UpdateVoiceChannelRequestVoiceChannelRequest from a dict
update_voice_channel_request_voice_channel_request_from_dict = UpdateVoiceChannelRequestVoiceChannelRequest.from_dict(update_voice_channel_request_voice_channel_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


