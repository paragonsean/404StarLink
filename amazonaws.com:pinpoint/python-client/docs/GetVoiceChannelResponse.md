# GetVoiceChannelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**voice_channel_response** | [**VoiceChannelResponse**](VoiceChannelResponse.md) |  | 

## Example

```python
from openapi_client.models.get_voice_channel_response import GetVoiceChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetVoiceChannelResponse from a JSON string
get_voice_channel_response_instance = GetVoiceChannelResponse.from_json(json)
# print the JSON string representation of the object
print(GetVoiceChannelResponse.to_json())

# convert the object into a dict
get_voice_channel_response_dict = get_voice_channel_response_instance.to_dict()
# create an instance of GetVoiceChannelResponse from a dict
get_voice_channel_response_from_dict = GetVoiceChannelResponse.from_dict(get_voice_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


