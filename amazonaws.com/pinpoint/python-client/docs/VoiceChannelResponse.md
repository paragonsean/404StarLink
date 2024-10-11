# VoiceChannelResponse

Provides information about the status and settings of the voice channel for an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | [optional] 
**creation_date** | **str** |  | [optional] 
**enabled** | **bool** |  | [optional] 
**has_credential** | **bool** |  | [optional] 
**id** | **str** |  | [optional] 
**is_archived** | **bool** |  | [optional] 
**last_modified_by** | **str** |  | [optional] 
**last_modified_date** | **str** |  | [optional] 
**platform** | **str** |  | 
**version** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.voice_channel_response import VoiceChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of VoiceChannelResponse from a JSON string
voice_channel_response_instance = VoiceChannelResponse.from_json(json)
# print the JSON string representation of the object
print(VoiceChannelResponse.to_json())

# convert the object into a dict
voice_channel_response_dict = voice_channel_response_instance.to_dict()
# create an instance of VoiceChannelResponse from a dict
voice_channel_response_from_dict = VoiceChannelResponse.from_dict(voice_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


