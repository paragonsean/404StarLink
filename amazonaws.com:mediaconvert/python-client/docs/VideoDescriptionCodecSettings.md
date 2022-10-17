# VideoDescriptionCodecSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**av1_settings** | [**VideoCodecSettingsAv1Settings**](VideoCodecSettingsAv1Settings.md) |  | [optional] 
**avc_intra_settings** | [**VideoCodecSettingsAvcIntraSettings**](VideoCodecSettingsAvcIntraSettings.md) |  | [optional] 
**codec** | [**VideoCodec**](VideoCodec.md) |  | [optional] 
**frame_capture_settings** | [**VideoCodecSettingsFrameCaptureSettings**](VideoCodecSettingsFrameCaptureSettings.md) |  | [optional] 
**h264_settings** | [**VideoCodecSettingsH264Settings**](VideoCodecSettingsH264Settings.md) |  | [optional] 
**h265_settings** | [**VideoCodecSettingsH265Settings**](VideoCodecSettingsH265Settings.md) |  | [optional] 
**mpeg2_settings** | [**VideoCodecSettingsMpeg2Settings**](VideoCodecSettingsMpeg2Settings.md) |  | [optional] 
**prores_settings** | [**VideoCodecSettingsProresSettings**](VideoCodecSettingsProresSettings.md) |  | [optional] 
**vc3_settings** | [**VideoCodecSettingsVc3Settings**](VideoCodecSettingsVc3Settings.md) |  | [optional] 
**vp8_settings** | [**VideoCodecSettingsVp8Settings**](VideoCodecSettingsVp8Settings.md) |  | [optional] 
**vp9_settings** | [**VideoCodecSettingsVp9Settings**](VideoCodecSettingsVp9Settings.md) |  | [optional] 
**xavc_settings** | [**VideoCodecSettingsXavcSettings**](VideoCodecSettingsXavcSettings.md) |  | [optional] 

## Example

```python
from openapi_client.models.video_description_codec_settings import VideoDescriptionCodecSettings

# TODO update the JSON string below
json = "{}"
# create an instance of VideoDescriptionCodecSettings from a JSON string
video_description_codec_settings_instance = VideoDescriptionCodecSettings.from_json(json)
# print the JSON string representation of the object
print(VideoDescriptionCodecSettings.to_json())

# convert the object into a dict
video_description_codec_settings_dict = video_description_codec_settings_instance.to_dict()
# create an instance of VideoDescriptionCodecSettings from a dict
video_description_codec_settings_from_dict = VideoDescriptionCodecSettings.from_dict(video_description_codec_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


