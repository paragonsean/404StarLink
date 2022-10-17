# AudioDescription

Settings related to one audio tab on the MediaConvert console. In your job JSON, an instance of AudioDescription is equivalent to one audio tab in the console. Usually, one audio tab corresponds to one output audio track. Depending on how you set up your input audio selectors and whether you use audio selector groups, one audio tab can correspond to a group of output audio tracks.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audio_channel_tagging_settings** | [**AudioDescriptionAudioChannelTaggingSettings**](AudioDescriptionAudioChannelTaggingSettings.md) |  | [optional] 
**audio_normalization_settings** | [**AudioDescriptionAudioNormalizationSettings**](AudioDescriptionAudioNormalizationSettings.md) |  | [optional] 
**audio_source_name** | **str** |  | [optional] 
**audio_type** | **int** |  | [optional] 
**audio_type_control** | [**AudioTypeControl**](AudioTypeControl.md) |  | [optional] 
**codec_settings** | [**AudioDescriptionCodecSettings**](AudioDescriptionCodecSettings.md) |  | [optional] 
**custom_language_code** | **str** |  | [optional] 
**language_code** | [**LanguageCode**](LanguageCode.md) |  | [optional] 
**language_code_control** | [**AudioLanguageCodeControl**](AudioLanguageCodeControl.md) |  | [optional] 
**remix_settings** | [**AudioDescriptionRemixSettings**](AudioDescriptionRemixSettings.md) |  | [optional] 
**stream_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.audio_description import AudioDescription

# TODO update the JSON string below
json = "{}"
# create an instance of AudioDescription from a JSON string
audio_description_instance = AudioDescription.from_json(json)
# print the JSON string representation of the object
print(AudioDescription.to_json())

# convert the object into a dict
audio_description_dict = audio_description_instance.to_dict()
# create an instance of AudioDescription from a dict
audio_description_from_dict = AudioDescription.from_dict(audio_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


