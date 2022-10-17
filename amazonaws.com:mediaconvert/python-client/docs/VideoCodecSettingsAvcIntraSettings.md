# VideoCodecSettingsAvcIntraSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avc_intra_class** | [**AvcIntraClass**](AvcIntraClass.md) |  | [optional] 
**avc_intra_uhd_settings** | [**AvcIntraSettingsAvcIntraUhdSettings**](AvcIntraSettingsAvcIntraUhdSettings.md) |  | [optional] 
**framerate_control** | [**AvcIntraFramerateControl**](AvcIntraFramerateControl.md) |  | [optional] 
**framerate_conversion_algorithm** | [**AvcIntraFramerateConversionAlgorithm**](AvcIntraFramerateConversionAlgorithm.md) |  | [optional] 
**framerate_denominator** | **int** |  | [optional] 
**framerate_numerator** | **int** |  | [optional] 
**interlace_mode** | [**AvcIntraInterlaceMode**](AvcIntraInterlaceMode.md) |  | [optional] 
**scan_type_conversion_mode** | [**AvcIntraScanTypeConversionMode**](AvcIntraScanTypeConversionMode.md) |  | [optional] 
**slow_pal** | [**AvcIntraSlowPal**](AvcIntraSlowPal.md) |  | [optional] 
**telecine** | [**AvcIntraTelecine**](AvcIntraTelecine.md) |  | [optional] 

## Example

```python
from openapi_client.models.video_codec_settings_avc_intra_settings import VideoCodecSettingsAvcIntraSettings

# TODO update the JSON string below
json = "{}"
# create an instance of VideoCodecSettingsAvcIntraSettings from a JSON string
video_codec_settings_avc_intra_settings_instance = VideoCodecSettingsAvcIntraSettings.from_json(json)
# print the JSON string representation of the object
print(VideoCodecSettingsAvcIntraSettings.to_json())

# convert the object into a dict
video_codec_settings_avc_intra_settings_dict = video_codec_settings_avc_intra_settings_instance.to_dict()
# create an instance of VideoCodecSettingsAvcIntraSettings from a dict
video_codec_settings_avc_intra_settings_from_dict = VideoCodecSettingsAvcIntraSettings.from_dict(video_codec_settings_avc_intra_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


