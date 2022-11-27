# DeleteVoiceChannelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**voice_channel_response** | [**VoiceChannelResponse**](VoiceChannelResponse.md) |  | 

## Example

```python
from openapi_client.models.delete_voice_channel_response import DeleteVoiceChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteVoiceChannelResponse from a JSON string
delete_voice_channel_response_instance = DeleteVoiceChannelResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteVoiceChannelResponse.to_json())

# convert the object into a dict
delete_voice_channel_response_dict = delete_voice_channel_response_instance.to_dict()
# create an instance of DeleteVoiceChannelResponse from a dict
delete_voice_channel_response_from_dict = DeleteVoiceChannelResponse.from_dict(delete_voice_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


