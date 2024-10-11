# VideoCodecSettingsFrameCaptureSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**framerate_denominator** | **int** |  | [optional] 
**framerate_numerator** | **int** |  | [optional] 
**max_captures** | **int** |  | [optional] 
**quality** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.video_codec_settings_frame_capture_settings import VideoCodecSettingsFrameCaptureSettings

# TODO update the JSON string below
json = "{}"
# create an instance of VideoCodecSettingsFrameCaptureSettings from a JSON string
video_codec_settings_frame_capture_settings_instance = VideoCodecSettingsFrameCaptureSettings.from_json(json)
# print the JSON string representation of the object
print(VideoCodecSettingsFrameCaptureSettings.to_json())

# convert the object into a dict
video_codec_settings_frame_capture_settings_dict = video_codec_settings_frame_capture_settings_instance.to_dict()
# create an instance of VideoCodecSettingsFrameCaptureSettings from a dict
video_codec_settings_frame_capture_settings_from_dict = VideoCodecSettingsFrameCaptureSettings.from_dict(video_codec_settings_frame_capture_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


