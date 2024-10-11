# Ac3Settings

Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AC3.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bitrate** | **int** |  | [optional] 
**bitstream_mode** | [**Ac3BitstreamMode**](Ac3BitstreamMode.md) |  | [optional] 
**coding_mode** | [**Ac3CodingMode**](Ac3CodingMode.md) |  | [optional] 
**dialnorm** | **int** |  | [optional] 
**dynamic_range_compression_line** | [**Ac3DynamicRangeCompressionLine**](Ac3DynamicRangeCompressionLine.md) |  | [optional] 
**dynamic_range_compression_profile** | [**Ac3DynamicRangeCompressionProfile**](Ac3DynamicRangeCompressionProfile.md) |  | [optional] 
**dynamic_range_compression_rf** | [**Ac3DynamicRangeCompressionRf**](Ac3DynamicRangeCompressionRf.md) |  | [optional] 
**lfe_filter** | [**Ac3LfeFilter**](Ac3LfeFilter.md) |  | [optional] 
**metadata_control** | [**Ac3MetadataControl**](Ac3MetadataControl.md) |  | [optional] 
**sample_rate** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.ac3_settings import Ac3Settings

# TODO update the JSON string below
json = "{}"
# create an instance of Ac3Settings from a JSON string
ac3_settings_instance = Ac3Settings.from_json(json)
# print the JSON string representation of the object
print(Ac3Settings.to_json())

# convert the object into a dict
ac3_settings_dict = ac3_settings_instance.to_dict()
# create an instance of Ac3Settings from a dict
ac3_settings_from_dict = Ac3Settings.from_dict(ac3_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


