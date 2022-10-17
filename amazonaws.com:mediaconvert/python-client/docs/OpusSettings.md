# OpusSettings

Required when you set Codec, under AudioDescriptions>CodecSettings, to the value OPUS.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bitrate** | **int** |  | [optional] 
**channels** | **int** |  | [optional] 
**sample_rate** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.opus_settings import OpusSettings

# TODO update the JSON string below
json = "{}"
# create an instance of OpusSettings from a JSON string
opus_settings_instance = OpusSettings.from_json(json)
# print the JSON string representation of the object
print(OpusSettings.to_json())

# convert the object into a dict
opus_settings_dict = opus_settings_instance.to_dict()
# create an instance of OpusSettings from a dict
opus_settings_from_dict = OpusSettings.from_dict(opus_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


