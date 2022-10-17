# Eac3Settings

Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value EAC3.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attenuation_control** | [**Eac3AttenuationControl**](Eac3AttenuationControl.md) |  | [optional] 
**bitrate** | **int** |  | [optional] 
**bitstream_mode** | [**Eac3BitstreamMode**](Eac3BitstreamMode.md) |  | [optional] 
**coding_mode** | [**Eac3CodingMode**](Eac3CodingMode.md) |  | [optional] 
**dc_filter** | [**Eac3DcFilter**](Eac3DcFilter.md) |  | [optional] 
**dialnorm** | **int** |  | [optional] 
**dynamic_range_compression_line** | [**Eac3DynamicRangeCompressionLine**](Eac3DynamicRangeCompressionLine.md) |  | [optional] 
**dynamic_range_compression_rf** | [**Eac3DynamicRangeCompressionRf**](Eac3DynamicRangeCompressionRf.md) |  | [optional] 
**lfe_control** | [**Eac3LfeControl**](Eac3LfeControl.md) |  | [optional] 
**lfe_filter** | [**Eac3LfeFilter**](Eac3LfeFilter.md) |  | [optional] 
**lo_ro_center_mix_level** | **float** |  | [optional] 
**lo_ro_surround_mix_level** | **float** |  | [optional] 
**lt_rt_center_mix_level** | **float** |  | [optional] 
**lt_rt_surround_mix_level** | **float** |  | [optional] 
**metadata_control** | [**Eac3MetadataControl**](Eac3MetadataControl.md) |  | [optional] 
**passthrough_control** | [**Eac3PassthroughControl**](Eac3PassthroughControl.md) |  | [optional] 
**phase_control** | [**Eac3PhaseControl**](Eac3PhaseControl.md) |  | [optional] 
**sample_rate** | **int** |  | [optional] 
**stereo_downmix** | [**Eac3StereoDownmix**](Eac3StereoDownmix.md) |  | [optional] 
**surround_ex_mode** | [**Eac3SurroundExMode**](Eac3SurroundExMode.md) |  | [optional] 
**surround_mode** | [**Eac3SurroundMode**](Eac3SurroundMode.md) |  | [optional] 

## Example

```python
from openapi_client.models.eac3_settings import Eac3Settings

# TODO update the JSON string below
json = "{}"
# create an instance of Eac3Settings from a JSON string
eac3_settings_instance = Eac3Settings.from_json(json)
# print the JSON string representation of the object
print(Eac3Settings.to_json())

# convert the object into a dict
eac3_settings_dict = eac3_settings_instance.to_dict()
# create an instance of Eac3Settings from a dict
eac3_settings_from_dict = Eac3Settings.from_dict(eac3_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


