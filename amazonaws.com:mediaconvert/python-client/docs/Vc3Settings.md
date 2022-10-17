# Vc3Settings

Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VC3

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**framerate_control** | [**Vc3FramerateControl**](Vc3FramerateControl.md) |  | [optional] 
**framerate_conversion_algorithm** | [**Vc3FramerateConversionAlgorithm**](Vc3FramerateConversionAlgorithm.md) |  | [optional] 
**framerate_denominator** | **int** |  | [optional] 
**framerate_numerator** | **int** |  | [optional] 
**interlace_mode** | [**Vc3InterlaceMode**](Vc3InterlaceMode.md) |  | [optional] 
**scan_type_conversion_mode** | [**Vc3ScanTypeConversionMode**](Vc3ScanTypeConversionMode.md) |  | [optional] 
**slow_pal** | [**Vc3SlowPal**](Vc3SlowPal.md) |  | [optional] 
**telecine** | [**Vc3Telecine**](Vc3Telecine.md) |  | [optional] 
**vc3_class** | [**Vc3Class**](Vc3Class.md) |  | [optional] 

## Example

```python
from openapi_client.models.vc3_settings import Vc3Settings

# TODO update the JSON string below
json = "{}"
# create an instance of Vc3Settings from a JSON string
vc3_settings_instance = Vc3Settings.from_json(json)
# print the JSON string representation of the object
print(Vc3Settings.to_json())

# convert the object into a dict
vc3_settings_dict = vc3_settings_instance.to_dict()
# create an instance of Vc3Settings from a dict
vc3_settings_from_dict = Vc3Settings.from_dict(vc3_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


