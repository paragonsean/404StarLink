# VideoCodecSettingsMpeg2Settings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adaptive_quantization** | [**Mpeg2AdaptiveQuantization**](Mpeg2AdaptiveQuantization.md) |  | [optional] 
**bitrate** | **int** |  | [optional] 
**codec_level** | [**Mpeg2CodecLevel**](Mpeg2CodecLevel.md) |  | [optional] 
**codec_profile** | [**Mpeg2CodecProfile**](Mpeg2CodecProfile.md) |  | [optional] 
**dynamic_sub_gop** | [**Mpeg2DynamicSubGop**](Mpeg2DynamicSubGop.md) |  | [optional] 
**framerate_control** | [**Mpeg2FramerateControl**](Mpeg2FramerateControl.md) |  | [optional] 
**framerate_conversion_algorithm** | [**Mpeg2FramerateConversionAlgorithm**](Mpeg2FramerateConversionAlgorithm.md) |  | [optional] 
**framerate_denominator** | **int** |  | [optional] 
**framerate_numerator** | **int** |  | [optional] 
**gop_closed_cadence** | **int** |  | [optional] 
**gop_size** | **float** |  | [optional] 
**gop_size_units** | [**Mpeg2GopSizeUnits**](Mpeg2GopSizeUnits.md) |  | [optional] 
**hrd_buffer_final_fill_percentage** | **int** |  | [optional] 
**hrd_buffer_initial_fill_percentage** | **int** |  | [optional] 
**hrd_buffer_size** | **int** |  | [optional] 
**interlace_mode** | [**Mpeg2InterlaceMode**](Mpeg2InterlaceMode.md) |  | [optional] 
**intra_dc_precision** | [**Mpeg2IntraDcPrecision**](Mpeg2IntraDcPrecision.md) |  | [optional] 
**max_bitrate** | **int** |  | [optional] 
**min_i_interval** | **int** |  | [optional] 
**number_b_frames_between_reference_frames** | **int** |  | [optional] 
**par_control** | [**Mpeg2ParControl**](Mpeg2ParControl.md) |  | [optional] 
**par_denominator** | **int** |  | [optional] 
**par_numerator** | **int** |  | [optional] 
**quality_tuning_level** | [**Mpeg2QualityTuningLevel**](Mpeg2QualityTuningLevel.md) |  | [optional] 
**rate_control_mode** | [**Mpeg2RateControlMode**](Mpeg2RateControlMode.md) |  | [optional] 
**scan_type_conversion_mode** | [**Mpeg2ScanTypeConversionMode**](Mpeg2ScanTypeConversionMode.md) |  | [optional] 
**scene_change_detect** | [**Mpeg2SceneChangeDetect**](Mpeg2SceneChangeDetect.md) |  | [optional] 
**slow_pal** | [**Mpeg2SlowPal**](Mpeg2SlowPal.md) |  | [optional] 
**softness** | **int** |  | [optional] 
**spatial_adaptive_quantization** | [**Mpeg2SpatialAdaptiveQuantization**](Mpeg2SpatialAdaptiveQuantization.md) |  | [optional] 
**syntax** | [**Mpeg2Syntax**](Mpeg2Syntax.md) |  | [optional] 
**telecine** | [**Mpeg2Telecine**](Mpeg2Telecine.md) |  | [optional] 
**temporal_adaptive_quantization** | [**Mpeg2TemporalAdaptiveQuantization**](Mpeg2TemporalAdaptiveQuantization.md) |  | [optional] 

## Example

```python
from openapi_client.models.video_codec_settings_mpeg2_settings import VideoCodecSettingsMpeg2Settings

# TODO update the JSON string below
json = "{}"
# create an instance of VideoCodecSettingsMpeg2Settings from a JSON string
video_codec_settings_mpeg2_settings_instance = VideoCodecSettingsMpeg2Settings.from_json(json)
# print the JSON string representation of the object
print(VideoCodecSettingsMpeg2Settings.to_json())

# convert the object into a dict
video_codec_settings_mpeg2_settings_dict = video_codec_settings_mpeg2_settings_instance.to_dict()
# create an instance of VideoCodecSettingsMpeg2Settings from a dict
video_codec_settings_mpeg2_settings_from_dict = VideoCodecSettingsMpeg2Settings.from_dict(video_codec_settings_mpeg2_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


