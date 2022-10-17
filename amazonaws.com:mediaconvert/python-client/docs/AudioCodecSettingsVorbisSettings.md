# AudioCodecSettingsVorbisSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channels** | **int** |  | [optional] 
**sample_rate** | **int** |  | [optional] 
**vbr_quality** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.audio_codec_settings_vorbis_settings import AudioCodecSettingsVorbisSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AudioCodecSettingsVorbisSettings from a JSON string
audio_codec_settings_vorbis_settings_instance = AudioCodecSettingsVorbisSettings.from_json(json)
# print the JSON string representation of the object
print(AudioCodecSettingsVorbisSettings.to_json())

# convert the object into a dict
audio_codec_settings_vorbis_settings_dict = audio_codec_settings_vorbis_settings_instance.to_dict()
# create an instance of AudioCodecSettingsVorbisSettings from a dict
audio_codec_settings_vorbis_settings_from_dict = AudioCodecSettingsVorbisSettings.from_dict(audio_codec_settings_vorbis_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


