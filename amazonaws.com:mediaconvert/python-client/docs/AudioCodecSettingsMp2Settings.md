# AudioCodecSettingsMp2Settings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bitrate** | **int** |  | [optional] 
**channels** | **int** |  | [optional] 
**sample_rate** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.audio_codec_settings_mp2_settings import AudioCodecSettingsMp2Settings

# TODO update the JSON string below
json = "{}"
# create an instance of AudioCodecSettingsMp2Settings from a JSON string
audio_codec_settings_mp2_settings_instance = AudioCodecSettingsMp2Settings.from_json(json)
# print the JSON string representation of the object
print(AudioCodecSettingsMp2Settings.to_json())

# convert the object into a dict
audio_codec_settings_mp2_settings_dict = audio_codec_settings_mp2_settings_instance.to_dict()
# create an instance of AudioCodecSettingsMp2Settings from a dict
audio_codec_settings_mp2_settings_from_dict = AudioCodecSettingsMp2Settings.from_dict(audio_codec_settings_mp2_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


