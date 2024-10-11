# AudioCodecSettingsAacSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audio_description_broadcaster_mix** | [**AacAudioDescriptionBroadcasterMix**](AacAudioDescriptionBroadcasterMix.md) |  | [optional] 
**bitrate** | **int** |  | [optional] 
**codec_profile** | [**AacCodecProfile**](AacCodecProfile.md) |  | [optional] 
**coding_mode** | [**AacCodingMode**](AacCodingMode.md) |  | [optional] 
**rate_control_mode** | [**AacRateControlMode**](AacRateControlMode.md) |  | [optional] 
**raw_format** | [**AacRawFormat**](AacRawFormat.md) |  | [optional] 
**sample_rate** | **int** |  | [optional] 
**specification** | [**AacSpecification**](AacSpecification.md) |  | [optional] 
**vbr_quality** | [**AacVbrQuality**](AacVbrQuality.md) |  | [optional] 

## Example

```python
from openapi_client.models.audio_codec_settings_aac_settings import AudioCodecSettingsAacSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AudioCodecSettingsAacSettings from a JSON string
audio_codec_settings_aac_settings_instance = AudioCodecSettingsAacSettings.from_json(json)
# print the JSON string representation of the object
print(AudioCodecSettingsAacSettings.to_json())

# convert the object into a dict
audio_codec_settings_aac_settings_dict = audio_codec_settings_aac_settings_instance.to_dict()
# create an instance of AudioCodecSettingsAacSettings from a dict
audio_codec_settings_aac_settings_from_dict = AudioCodecSettingsAacSettings.from_dict(audio_codec_settings_aac_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


