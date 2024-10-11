# AudioCodecSettingsWavSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bit_depth** | **int** |  | [optional] 
**channels** | **int** |  | [optional] 
**format** | [**WavFormat**](WavFormat.md) |  | [optional] 
**sample_rate** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.audio_codec_settings_wav_settings import AudioCodecSettingsWavSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AudioCodecSettingsWavSettings from a JSON string
audio_codec_settings_wav_settings_instance = AudioCodecSettingsWavSettings.from_json(json)
# print the JSON string representation of the object
print(AudioCodecSettingsWavSettings.to_json())

# convert the object into a dict
audio_codec_settings_wav_settings_dict = audio_codec_settings_wav_settings_instance.to_dict()
# create an instance of AudioCodecSettingsWavSettings from a dict
audio_codec_settings_wav_settings_from_dict = AudioCodecSettingsWavSettings.from_dict(audio_codec_settings_wav_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


