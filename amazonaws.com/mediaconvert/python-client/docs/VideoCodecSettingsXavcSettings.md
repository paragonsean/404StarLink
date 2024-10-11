# VideoCodecSettingsXavcSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adaptive_quantization** | [**XavcAdaptiveQuantization**](XavcAdaptiveQuantization.md) |  | [optional] 
**entropy_encoding** | [**XavcEntropyEncoding**](XavcEntropyEncoding.md) |  | [optional] 
**framerate_control** | [**XavcFramerateControl**](XavcFramerateControl.md) |  | [optional] 
**framerate_conversion_algorithm** | [**XavcFramerateConversionAlgorithm**](XavcFramerateConversionAlgorithm.md) |  | [optional] 
**framerate_denominator** | **int** |  | [optional] 
**framerate_numerator** | **int** |  | [optional] 
**profile** | [**XavcProfile**](XavcProfile.md) |  | [optional] 
**slow_pal** | [**XavcSlowPal**](XavcSlowPal.md) |  | [optional] 
**softness** | **int** |  | [optional] 
**spatial_adaptive_quantization** | [**XavcSpatialAdaptiveQuantization**](XavcSpatialAdaptiveQuantization.md) |  | [optional] 
**temporal_adaptive_quantization** | [**XavcTemporalAdaptiveQuantization**](XavcTemporalAdaptiveQuantization.md) |  | [optional] 
**xavc4k_intra_cbg_profile_settings** | [**XavcSettingsXavc4kIntraCbgProfileSettings**](XavcSettingsXavc4kIntraCbgProfileSettings.md) |  | [optional] 
**xavc4k_intra_vbr_profile_settings** | [**XavcSettingsXavc4kIntraVbrProfileSettings**](XavcSettingsXavc4kIntraVbrProfileSettings.md) |  | [optional] 
**xavc4k_profile_settings** | [**XavcSettingsXavc4kProfileSettings**](XavcSettingsXavc4kProfileSettings.md) |  | [optional] 
**xavc_hd_intra_cbg_profile_settings** | [**XavcSettingsXavcHdIntraCbgProfileSettings**](XavcSettingsXavcHdIntraCbgProfileSettings.md) |  | [optional] 
**xavc_hd_profile_settings** | [**XavcSettingsXavcHdProfileSettings**](XavcSettingsXavcHdProfileSettings.md) |  | [optional] 

## Example

```python
from openapi_client.models.video_codec_settings_xavc_settings import VideoCodecSettingsXavcSettings

# TODO update the JSON string below
json = "{}"
# create an instance of VideoCodecSettingsXavcSettings from a JSON string
video_codec_settings_xavc_settings_instance = VideoCodecSettingsXavcSettings.from_json(json)
# print the JSON string representation of the object
print(VideoCodecSettingsXavcSettings.to_json())

# convert the object into a dict
video_codec_settings_xavc_settings_dict = video_codec_settings_xavc_settings_instance.to_dict()
# create an instance of VideoCodecSettingsXavcSettings from a dict
video_codec_settings_xavc_settings_from_dict = VideoCodecSettingsXavcSettings.from_dict(video_codec_settings_xavc_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


