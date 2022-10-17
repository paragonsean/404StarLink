# AudioCodecSettingsAiffSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bit_depth** | **int** |  | [optional] 
**channels** | **int** |  | [optional] 
**sample_rate** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.audio_codec_settings_aiff_settings import AudioCodecSettingsAiffSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AudioCodecSettingsAiffSettings from a JSON string
audio_codec_settings_aiff_settings_instance = AudioCodecSettingsAiffSettings.from_json(json)
# print the JSON string representation of the object
print(AudioCodecSettingsAiffSettings.to_json())

# convert the object into a dict
audio_codec_settings_aiff_settings_dict = audio_codec_settings_aiff_settings_instance.to_dict()
# create an instance of AudioCodecSettingsAiffSettings from a dict
audio_codec_settings_aiff_settings_from_dict = AudioCodecSettingsAiffSettings.from_dict(audio_codec_settings_aiff_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


