# AudioDescriptionCodecSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aac_settings** | [**AudioCodecSettingsAacSettings**](AudioCodecSettingsAacSettings.md) |  | [optional] 
**ac3_settings** | [**AudioCodecSettingsAc3Settings**](AudioCodecSettingsAc3Settings.md) |  | [optional] 
**aiff_settings** | [**AudioCodecSettingsAiffSettings**](AudioCodecSettingsAiffSettings.md) |  | [optional] 
**codec** | [**AudioCodec**](AudioCodec.md) |  | [optional] 
**eac3_atmos_settings** | [**AudioCodecSettingsEac3AtmosSettings**](AudioCodecSettingsEac3AtmosSettings.md) |  | [optional] 
**eac3_settings** | [**AudioCodecSettingsEac3Settings**](AudioCodecSettingsEac3Settings.md) |  | [optional] 
**mp2_settings** | [**AudioCodecSettingsMp2Settings**](AudioCodecSettingsMp2Settings.md) |  | [optional] 
**mp3_settings** | [**AudioCodecSettingsMp3Settings**](AudioCodecSettingsMp3Settings.md) |  | [optional] 
**opus_settings** | [**AudioCodecSettingsOpusSettings**](AudioCodecSettingsOpusSettings.md) |  | [optional] 
**vorbis_settings** | [**AudioCodecSettingsVorbisSettings**](AudioCodecSettingsVorbisSettings.md) |  | [optional] 
**wav_settings** | [**AudioCodecSettingsWavSettings**](AudioCodecSettingsWavSettings.md) |  | [optional] 

## Example

```python
from openapi_client.models.audio_description_codec_settings import AudioDescriptionCodecSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AudioDescriptionCodecSettings from a JSON string
audio_description_codec_settings_instance = AudioDescriptionCodecSettings.from_json(json)
# print the JSON string representation of the object
print(AudioDescriptionCodecSettings.to_json())

# convert the object into a dict
audio_description_codec_settings_dict = audio_description_codec_settings_instance.to_dict()
# create an instance of AudioDescriptionCodecSettings from a dict
audio_description_codec_settings_from_dict = AudioDescriptionCodecSettings.from_dict(audio_description_codec_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


