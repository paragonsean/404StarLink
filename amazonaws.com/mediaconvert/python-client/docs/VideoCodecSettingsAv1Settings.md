# VideoCodecSettingsAv1Settings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adaptive_quantization** | [**Av1AdaptiveQuantization**](Av1AdaptiveQuantization.md) |  | [optional] 
**bit_depth** | [**Av1BitDepth**](Av1BitDepth.md) |  | [optional] 
**framerate_control** | [**Av1FramerateControl**](Av1FramerateControl.md) |  | [optional] 
**framerate_conversion_algorithm** | [**Av1FramerateConversionAlgorithm**](Av1FramerateConversionAlgorithm.md) |  | [optional] 
**framerate_denominator** | **int** |  | [optional] 
**framerate_numerator** | **int** |  | [optional] 
**gop_size** | **float** |  | [optional] 
**max_bitrate** | **int** |  | [optional] 
**number_b_frames_between_reference_frames** | **int** |  | [optional] 
**qvbr_settings** | [**Av1SettingsQvbrSettings**](Av1SettingsQvbrSettings.md) |  | [optional] 
**rate_control_mode** | [**Av1RateControlMode**](Av1RateControlMode.md) |  | [optional] 
**slices** | **int** |  | [optional] 
**spatial_adaptive_quantization** | [**Av1SpatialAdaptiveQuantization**](Av1SpatialAdaptiveQuantization.md) |  | [optional] 

## Example

```python
from openapi_client.models.video_codec_settings_av1_settings import VideoCodecSettingsAv1Settings

# TODO update the JSON string below
json = "{}"
# create an instance of VideoCodecSettingsAv1Settings from a JSON string
video_codec_settings_av1_settings_instance = VideoCodecSettingsAv1Settings.from_json(json)
# print the JSON string representation of the object
print(VideoCodecSettingsAv1Settings.to_json())

# convert the object into a dict
video_codec_settings_av1_settings_dict = video_codec_settings_av1_settings_instance.to_dict()
# create an instance of VideoCodecSettingsAv1Settings from a dict
video_codec_settings_av1_settings_from_dict = VideoCodecSettingsAv1Settings.from_dict(video_codec_settings_av1_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


