# AudioDescriptionAudioChannelTaggingSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channel_tag** | [**AudioChannelTag**](AudioChannelTag.md) |  | [optional] 

## Example

```python
from openapi_client.models.audio_description_audio_channel_tagging_settings import AudioDescriptionAudioChannelTaggingSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AudioDescriptionAudioChannelTaggingSettings from a JSON string
audio_description_audio_channel_tagging_settings_instance = AudioDescriptionAudioChannelTaggingSettings.from_json(json)
# print the JSON string representation of the object
print(AudioDescriptionAudioChannelTaggingSettings.to_json())

# convert the object into a dict
audio_description_audio_channel_tagging_settings_dict = audio_description_audio_channel_tagging_settings_instance.to_dict()
# create an instance of AudioDescriptionAudioChannelTaggingSettings from a dict
audio_description_audio_channel_tagging_settings_from_dict = AudioDescriptionAudioChannelTaggingSettings.from_dict(audio_description_audio_channel_tagging_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


