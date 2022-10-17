# H264Settings

Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value H_264.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adaptive_quantization** | [**H264AdaptiveQuantization**](H264AdaptiveQuantization.md) |  | [optional] 
**bandwidth_reduction_filter** | [**H264SettingsBandwidthReductionFilter**](H264SettingsBandwidthReductionFilter.md) |  | [optional] 
**bitrate** | **int** |  | [optional] 
**codec_level** | [**H264CodecLevel**](H264CodecLevel.md) |  | [optional] 
**codec_profile** | [**H264CodecProfile**](H264CodecProfile.md) |  | [optional] 
**dynamic_sub_gop** | [**H264DynamicSubGop**](H264DynamicSubGop.md) |  | [optional] 
**entropy_encoding** | [**H264EntropyEncoding**](H264EntropyEncoding.md) |  | [optional] 
**field_encoding** | [**H264FieldEncoding**](H264FieldEncoding.md) |  | [optional] 
**flicker_adaptive_quantization** | [**H264FlickerAdaptiveQuantization**](H264FlickerAdaptiveQuantization.md) |  | [optional] 
**framerate_control** | [**H264FramerateControl**](H264FramerateControl.md) |  | [optional] 
**framerate_conversion_algorithm** | [**H264FramerateConversionAlgorithm**](H264FramerateConversionAlgorithm.md) |  | [optional] 
**framerate_denominator** | **int** |  | [optional] 
**framerate_numerator** | **int** |  | [optional] 
**gop_b_reference** | [**H264GopBReference**](H264GopBReference.md) |  | [optional] 
**gop_closed_cadence** | **int** |  | [optional] 
**gop_size** | **float** |  | [optional] 
**gop_size_units** | [**H264GopSizeUnits**](H264GopSizeUnits.md) |  | [optional] 
**hrd_buffer_final_fill_percentage** | **int** |  | [optional] 
**hrd_buffer_initial_fill_percentage** | **int** |  | [optional] 
**hrd_buffer_size** | **int** |  | [optional] 
**interlace_mode** | [**H264InterlaceMode**](H264InterlaceMode.md) |  | [optional] 
**max_bitrate** | **int** |  | [optional] 
**min_i_interval** | **int** |  | [optional] 
**number_b_frames_between_reference_frames** | **int** |  | [optional] 
**number_reference_frames** | **int** |  | [optional] 
**par_control** | [**H264ParControl**](H264ParControl.md) |  | [optional] 
**par_denominator** | **int** |  | [optional] 
**par_numerator** | **int** |  | [optional] 
**quality_tuning_level** | [**H264QualityTuningLevel**](H264QualityTuningLevel.md) |  | [optional] 
**qvbr_settings** | [**H264SettingsQvbrSettings**](H264SettingsQvbrSettings.md) |  | [optional] 
**rate_control_mode** | [**H264RateControlMode**](H264RateControlMode.md) |  | [optional] 
**repeat_pps** | [**H264RepeatPps**](H264RepeatPps.md) |  | [optional] 
**scan_type_conversion_mode** | [**H264ScanTypeConversionMode**](H264ScanTypeConversionMode.md) |  | [optional] 
**scene_change_detect** | [**H264SceneChangeDetect**](H264SceneChangeDetect.md) |  | [optional] 
**slices** | **int** |  | [optional] 
**slow_pal** | [**H264SlowPal**](H264SlowPal.md) |  | [optional] 
**softness** | **int** |  | [optional] 
**spatial_adaptive_quantization** | [**H264SpatialAdaptiveQuantization**](H264SpatialAdaptiveQuantization.md) |  | [optional] 
**syntax** | [**H264Syntax**](H264Syntax.md) |  | [optional] 
**telecine** | [**H264Telecine**](H264Telecine.md) |  | [optional] 
**temporal_adaptive_quantization** | [**H264TemporalAdaptiveQuantization**](H264TemporalAdaptiveQuantization.md) |  | [optional] 
**unregistered_sei_timecode** | [**H264UnregisteredSeiTimecode**](H264UnregisteredSeiTimecode.md) |  | [optional] 

## Example

```python
from openapi_client.models.h264_settings import H264Settings

# TODO update the JSON string below
json = "{}"
# create an instance of H264Settings from a JSON string
h264_settings_instance = H264Settings.from_json(json)
# print the JSON string representation of the object
print(H264Settings.to_json())

# convert the object into a dict
h264_settings_dict = h264_settings_instance.to_dict()
# create an instance of H264Settings from a dict
h264_settings_from_dict = H264Settings.from_dict(h264_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


