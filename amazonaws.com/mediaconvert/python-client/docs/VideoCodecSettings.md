# VideoCodecSettings

Video codec settings, (CodecSettings) under (VideoDescription), contains the group of settings related to video encoding. The settings in this group vary depending on the value that you choose for Video codec (Codec). For each codec enum that you choose, define the corresponding settings object. The following lists the codec enum, settings object pairs. * AV1, Av1Settings * AVC_INTRA, AvcIntraSettings * FRAME_CAPTURE, FrameCaptureSettings * H_264, H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES, ProresSettings * VC3, Vc3Settings * VP8, Vp8Settings * VP9, Vp9Settings * XAVC, XavcSettings

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
from openapi_client.models.video_codec_settings import VideoCodecSettings

# TODO update the JSON string below
json = "{}"
# create an instance of VideoCodecSettings from a JSON string
video_codec_settings_instance = VideoCodecSettings.from_json(json)
# print the JSON string representation of the object
print(VideoCodecSettings.to_json())

# convert the object into a dict
video_codec_settings_dict = video_codec_settings_instance.to_dict()
# create an instance of VideoCodecSettings from a dict
video_codec_settings_from_dict = VideoCodecSettings.from_dict(video_codec_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


