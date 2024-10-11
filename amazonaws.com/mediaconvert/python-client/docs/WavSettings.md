# WavSettings

Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value WAV.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bit_depth** | **int** |  | [optional] 
**channels** | **int** |  | [optional] 
**format** | [**WavFormat**](WavFormat.md) |  | [optional] 
**sample_rate** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.wav_settings import WavSettings

# TODO update the JSON string below
json = "{}"
# create an instance of WavSettings from a JSON string
wav_settings_instance = WavSettings.from_json(json)
# print the JSON string representation of the object
print(WavSettings.to_json())

# convert the object into a dict
wav_settings_dict = wav_settings_instance.to_dict()
# create an instance of WavSettings from a dict
wav_settings_from_dict = WavSettings.from_dict(wav_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


