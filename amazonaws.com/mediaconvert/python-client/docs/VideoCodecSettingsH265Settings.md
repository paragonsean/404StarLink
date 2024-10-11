# VideoCodecSettingsH265Settings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adaptive_quantization** | [**H265AdaptiveQuantization**](H265AdaptiveQuantization.md) |  | [optional] 
**alternate_transfer_function_sei** | [**H265AlternateTransferFunctionSei**](H265AlternateTransferFunctionSei.md) |  | [optional] 
**bitrate** | **int** |  | [optional] 
**codec_level** | [**H265CodecLevel**](H265CodecLevel.md) |  | [optional] 
**codec_profile** | [**H265CodecProfile**](H265CodecProfile.md) |  | [optional] 
**dynamic_sub_gop** | [**H265DynamicSubGop**](H265DynamicSubGop.md) |  | [optional] 
**flicker_adaptive_quantization** | [**H265FlickerAdaptiveQuantization**](H265FlickerAdaptiveQuantization.md) |  | [optional] 
**framerate_control** | [**H265FramerateControl**](H265FramerateControl.md) |  | [optional] 
**framerate_conversion_algorithm** | [**H265FramerateConversionAlgorithm**](H265FramerateConversionAlgorithm.md) |  | [optional] 
**framerate_denominator** | **int** |  | [optional] 
**framerate_numerator** | **int** |  | [optional] 
**gop_b_reference** | [**H265GopBReference**](H265GopBReference.md) |  | [optional] 
**gop_closed_cadence** | **int** |  | [optional] 
**gop_size** | **float** |  | [optional] 
**gop_size_units** | [**H265GopSizeUnits**](H265GopSizeUnits.md) |  | [optional] 
**hrd_buffer_final_fill_percentage** | **int** |  | [optional] 
**hrd_buffer_initial_fill_percentage** | **int** |  | [optional] 
**hrd_buffer_size** | **int** |  | [optional] 
**interlace_mode** | [**H265InterlaceMode**](H265InterlaceMode.md) |  | [optional] 
**max_bitrate** | **int** |  | [optional] 
**min_i_interval** | **int** |  | [optional] 
**number_b_frames_between_reference_frames** | **int** |  | [optional] 
**number_reference_frames** | **int** |  | [optional] 
**par_control** | [**H265ParControl**](H265ParControl.md) |  | [optional] 
**par_denominator** | **int** |  | [optional] 
**par_numerator** | **int** |  | [optional] 
**quality_tuning_level** | [**H265QualityTuningLevel**](H265QualityTuningLevel.md) |  | [optional] 
**qvbr_settings** | [**H265SettingsQvbrSettings**](H265SettingsQvbrSettings.md) |  | [optional] 
**rate_control_mode** | [**H265RateControlMode**](H265RateControlMode.md) |  | [optional] 
**sample_adaptive_offset_filter_mode** | [**H265SampleAdaptiveOffsetFilterMode**](H265SampleAdaptiveOffsetFilterMode.md) |  | [optional] 
**scan_type_conversion_mode** | [**H265ScanTypeConversionMode**](H265ScanTypeConversionMode.md) |  | [optional] 
**scene_change_detect** | [**H265SceneChangeDetect**](H265SceneChangeDetect.md) |  | [optional] 
**slices** | **int** |  | [optional] 
**slow_pal** | [**H265SlowPal**](H265SlowPal.md) |  | [optional] 
**spatial_adaptive_quantization** | [**H265SpatialAdaptiveQuantization**](H265SpatialAdaptiveQuantization.md) |  | [optional] 
**telecine** | [**H265Telecine**](H265Telecine.md) |  | [optional] 
**temporal_adaptive_quantization** | [**H265TemporalAdaptiveQuantization**](H265TemporalAdaptiveQuantization.md) |  | [optional] 
**temporal_ids** | [**H265TemporalIds**](H265TemporalIds.md) |  | [optional] 
**tiles** | [**H265Tiles**](H265Tiles.md) |  | [optional] 
**unregistered_sei_timecode** | [**H265UnregisteredSeiTimecode**](H265UnregisteredSeiTimecode.md) |  | [optional] 
**write_mp4_packaging_type** | [**H265WriteMp4PackagingType**](H265WriteMp4PackagingType.md) |  | [optional] 

## Example

```python
from openapi_client.models.video_codec_settings_h265_settings import VideoCodecSettingsH265Settings

# TODO update the JSON string below
json = "{}"
# create an instance of VideoCodecSettingsH265Settings from a JSON string
video_codec_settings_h265_settings_instance = VideoCodecSettingsH265Settings.from_json(json)
# print the JSON string representation of the object
print(VideoCodecSettingsH265Settings.to_json())

# convert the object into a dict
video_codec_settings_h265_settings_dict = video_codec_settings_h265_settings_instance.to_dict()
# create an instance of VideoCodecSettingsH265Settings from a dict
video_codec_settings_h265_settings_from_dict = VideoCodecSettingsH265Settings.from_dict(video_codec_settings_h265_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


