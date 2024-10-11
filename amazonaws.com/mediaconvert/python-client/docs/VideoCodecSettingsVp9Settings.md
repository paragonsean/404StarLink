# VideoCodecSettingsVp9Settings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bitrate** | **int** |  | [optional] 
**framerate_control** | [**Vp9FramerateControl**](Vp9FramerateControl.md) |  | [optional] 
**framerate_conversion_algorithm** | [**Vp9FramerateConversionAlgorithm**](Vp9FramerateConversionAlgorithm.md) |  | [optional] 
**framerate_denominator** | **int** |  | [optional] 
**framerate_numerator** | **int** |  | [optional] 
**gop_size** | **float** |  | [optional] 
**hrd_buffer_size** | **int** |  | [optional] 
**max_bitrate** | **int** |  | [optional] 
**par_control** | [**Vp9ParControl**](Vp9ParControl.md) |  | [optional] 
**par_denominator** | **int** |  | [optional] 
**par_numerator** | **int** |  | [optional] 
**quality_tuning_level** | [**Vp9QualityTuningLevel**](Vp9QualityTuningLevel.md) |  | [optional] 
**rate_control_mode** | [**Vp9RateControlMode**](Vp9RateControlMode.md) |  | [optional] 

## Example

```python
from openapi_client.models.video_codec_settings_vp9_settings import VideoCodecSettingsVp9Settings

# TODO update the JSON string below
json = "{}"
# create an instance of VideoCodecSettingsVp9Settings from a JSON string
video_codec_settings_vp9_settings_instance = VideoCodecSettingsVp9Settings.from_json(json)
# print the JSON string representation of the object
print(VideoCodecSettingsVp9Settings.to_json())

# convert the object into a dict
video_codec_settings_vp9_settings_dict = video_codec_settings_vp9_settings_instance.to_dict()
# create an instance of VideoCodecSettingsVp9Settings from a dict
video_codec_settings_vp9_settings_from_dict = VideoCodecSettingsVp9Settings.from_dict(video_codec_settings_vp9_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


