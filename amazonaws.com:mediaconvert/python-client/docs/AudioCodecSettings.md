# AudioCodecSettings

Settings related to audio encoding. The settings in this group vary depending on the value that you choose for your audio codec.

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
from openapi_client.models.audio_codec_settings import AudioCodecSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AudioCodecSettings from a JSON string
audio_codec_settings_instance = AudioCodecSettings.from_json(json)
# print the JSON string representation of the object
print(AudioCodecSettings.to_json())

# convert the object into a dict
audio_codec_settings_dict = audio_codec_settings_instance.to_dict()
# create an instance of AudioCodecSettings from a dict
audio_codec_settings_from_dict = AudioCodecSettings.from_dict(audio_codec_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


