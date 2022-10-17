# Vp8Settings

Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP8.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bitrate** | **int** |  | [optional] 
**framerate_control** | [**Vp8FramerateControl**](Vp8FramerateControl.md) |  | [optional] 
**framerate_conversion_algorithm** | [**Vp8FramerateConversionAlgorithm**](Vp8FramerateConversionAlgorithm.md) |  | [optional] 
**framerate_denominator** | **int** |  | [optional] 
**framerate_numerator** | **int** |  | [optional] 
**gop_size** | **float** |  | [optional] 
**hrd_buffer_size** | **int** |  | [optional] 
**max_bitrate** | **int** |  | [optional] 
**par_control** | [**Vp8ParControl**](Vp8ParControl.md) |  | [optional] 
**par_denominator** | **int** |  | [optional] 
**par_numerator** | **int** |  | [optional] 
**quality_tuning_level** | [**Vp8QualityTuningLevel**](Vp8QualityTuningLevel.md) |  | [optional] 
**rate_control_mode** | [**Vp8RateControlMode**](Vp8RateControlMode.md) |  | [optional] 

## Example

```python
from openapi_client.models.vp8_settings import Vp8Settings

# TODO update the JSON string below
json = "{}"
# create an instance of Vp8Settings from a JSON string
vp8_settings_instance = Vp8Settings.from_json(json)
# print the JSON string representation of the object
print(Vp8Settings.to_json())

# convert the object into a dict
vp8_settings_dict = vp8_settings_instance.to_dict()
# create an instance of Vp8Settings from a dict
vp8_settings_from_dict = Vp8Settings.from_dict(vp8_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


