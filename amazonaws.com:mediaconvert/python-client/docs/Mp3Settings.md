# Mp3Settings

Required when you set Codec, under AudioDescriptions>CodecSettings, to the value MP3.

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
from openapi_client.models.mp3_settings import Mp3Settings

# TODO update the JSON string below
json = "{}"
# create an instance of Mp3Settings from a JSON string
mp3_settings_instance = Mp3Settings.from_json(json)
# print the JSON string representation of the object
print(Mp3Settings.to_json())

# convert the object into a dict
mp3_settings_dict = mp3_settings_instance.to_dict()
# create an instance of Mp3Settings from a dict
mp3_settings_from_dict = Mp3Settings.from_dict(mp3_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


