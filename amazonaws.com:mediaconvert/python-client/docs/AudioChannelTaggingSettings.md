# AudioChannelTaggingSettings

When you mimic a multi-channel audio layout with multiple mono-channel tracks, you can tag each channel layout manually. For example, you would tag the tracks that contain your left, right, and center audio with Left (L), Right (R), and Center (C), respectively. When you don't specify a value, MediaConvert labels your track as Center (C) by default. To use audio layout tagging, your output must be in a QuickTime (.mov) container; your audio codec must be AAC, WAV, or AIFF; and you must set up your audio track to have only one channel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channel_tag** | [**AudioChannelTag**](AudioChannelTag.md) |  | [optional] 

## Example

```python
from openapi_client.models.audio_channel_tagging_settings import AudioChannelTaggingSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AudioChannelTaggingSettings from a JSON string
audio_channel_tagging_settings_instance = AudioChannelTaggingSettings.from_json(json)
# print the JSON string representation of the object
print(AudioChannelTaggingSettings.to_json())

# convert the object into a dict
audio_channel_tagging_settings_dict = audio_channel_tagging_settings_instance.to_dict()
# create an instance of AudioChannelTaggingSettings from a dict
audio_channel_tagging_settings_from_dict = AudioChannelTaggingSettings.from_dict(audio_channel_tagging_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


