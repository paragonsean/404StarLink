# UpdateVoiceChannelRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**voice_channel_request** | [**UpdateVoiceChannelRequestVoiceChannelRequest**](UpdateVoiceChannelRequestVoiceChannelRequest.md) |  | 

## Example

```python
from openapi_client.models.update_voice_channel_request import UpdateVoiceChannelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateVoiceChannelRequest from a JSON string
update_voice_channel_request_instance = UpdateVoiceChannelRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateVoiceChannelRequest.to_json())

# convert the object into a dict
update_voice_channel_request_dict = update_voice_channel_request_instance.to_dict()
# create an instance of UpdateVoiceChannelRequest from a dict
update_voice_channel_request_from_dict = UpdateVoiceChannelRequest.from_dict(update_voice_channel_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


