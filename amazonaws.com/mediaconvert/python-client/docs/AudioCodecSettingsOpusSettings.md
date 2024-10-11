# AudioCodecSettingsOpusSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bitrate** | **int** |  | [optional] 
**channels** | **int** |  | [optional] 
**sample_rate** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.audio_codec_settings_opus_settings import AudioCodecSettingsOpusSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AudioCodecSettingsOpusSettings from a JSON string
audio_codec_settings_opus_settings_instance = AudioCodecSettingsOpusSettings.from_json(json)
# print the JSON string representation of the object
print(AudioCodecSettingsOpusSettings.to_json())

# convert the object into a dict
audio_codec_settings_opus_settings_dict = audio_codec_settings_opus_settings_instance.to_dict()
# create an instance of AudioCodecSettingsOpusSettings from a dict
audio_codec_settings_opus_settings_from_dict = AudioCodecSettingsOpusSettings.from_dict(audio_codec_settings_opus_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


