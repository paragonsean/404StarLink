# UpdateVoiceChannelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**voice_channel_response** | [**VoiceChannelResponse**](VoiceChannelResponse.md) |  | 

## Example

```python
from openapi_client.models.update_voice_channel_response import UpdateVoiceChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateVoiceChannelResponse from a JSON string
update_voice_channel_response_instance = UpdateVoiceChannelResponse.from_json(json)
# print the JSON string representation of the object
print(UpdateVoiceChannelResponse.to_json())

# convert the object into a dict
update_voice_channel_response_dict = update_voice_channel_response_instance.to_dict()
# create an instance of UpdateVoiceChannelResponse from a dict
update_voice_channel_response_from_dict = UpdateVoiceChannelResponse.from_dict(update_voice_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


