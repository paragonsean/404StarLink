# AudioCodecSettingsMp3Settings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bitrate** | **int** |  | [optional] 
**channels** | **int** |  | [optional] 
**rate_control_mode** | [**Mp3RateControlMode**](Mp3RateControlMode.md) |  | [optional] 
**sample_rate** | **int** |  | [optional] 
**vbr_quality** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.audio_codec_settings_mp3_settings import AudioCodecSettingsMp3Settings

# TODO update the JSON string below
json = "{}"
# create an instance of AudioCodecSettingsMp3Settings from a JSON string
audio_codec_settings_mp3_settings_instance = AudioCodecSettingsMp3Settings.from_json(json)
# print the JSON string representation of the object
print(AudioCodecSettingsMp3Settings.to_json())

# convert the object into a dict
audio_codec_settings_mp3_settings_dict = audio_codec_settings_mp3_settings_instance.to_dict()
# create an instance of AudioCodecSettingsMp3Settings from a dict
audio_codec_settings_mp3_settings_from_dict = AudioCodecSettingsMp3Settings.from_dict(audio_codec_settings_mp3_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


