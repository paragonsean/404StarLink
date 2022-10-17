# Eac3AtmosSettings

Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value EAC3_ATMOS.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bitrate** | **int** |  | [optional] 
**bitstream_mode** | [**Eac3AtmosBitstreamMode**](Eac3AtmosBitstreamMode.md) |  | [optional] 
**coding_mode** | [**Eac3AtmosCodingMode**](Eac3AtmosCodingMode.md) |  | [optional] 
**dialogue_intelligence** | [**Eac3AtmosDialogueIntelligence**](Eac3AtmosDialogueIntelligence.md) |  | [optional] 
**downmix_control** | [**Eac3AtmosDownmixControl**](Eac3AtmosDownmixControl.md) |  | [optional] 
**dynamic_range_compression_line** | [**Eac3AtmosDynamicRangeCompressionLine**](Eac3AtmosDynamicRangeCompressionLine.md) |  | [optional] 
**dynamic_range_compression_rf** | [**Eac3AtmosDynamicRangeCompressionRf**](Eac3AtmosDynamicRangeCompressionRf.md) |  | [optional] 
**dynamic_range_control** | [**Eac3AtmosDynamicRangeControl**](Eac3AtmosDynamicRangeControl.md) |  | [optional] 
**lo_ro_center_mix_level** | **float** |  | [optional] 
**lo_ro_surround_mix_level** | **float** |  | [optional] 
**lt_rt_center_mix_level** | **float** |  | [optional] 
**lt_rt_surround_mix_level** | **float** |  | [optional] 
**metering_mode** | [**Eac3AtmosMeteringMode**](Eac3AtmosMeteringMode.md) |  | [optional] 
**sample_rate** | **int** |  | [optional] 
**speech_threshold** | **int** |  | [optional] 
**stereo_downmix** | [**Eac3AtmosStereoDownmix**](Eac3AtmosStereoDownmix.md) |  | [optional] 
**surround_ex_mode** | [**Eac3AtmosSurroundExMode**](Eac3AtmosSurroundExMode.md) |  | [optional] 

## Example

```python
from openapi_client.models.eac3_atmos_settings import Eac3AtmosSettings

# TODO update the JSON string below
json = "{}"
# create an instance of Eac3AtmosSettings from a JSON string
eac3_atmos_settings_instance = Eac3AtmosSettings.from_json(json)
# print the JSON string representation of the object
print(Eac3AtmosSettings.to_json())

# convert the object into a dict
eac3_atmos_settings_dict = eac3_atmos_settings_instance.to_dict()
# create an instance of Eac3AtmosSettings from a dict
eac3_atmos_settings_from_dict = Eac3AtmosSettings.from_dict(eac3_atmos_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


