# FrameCaptureSettings

Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value FRAME_CAPTURE.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**framerate_denominator** | **int** |  | [optional] 
**framerate_numerator** | **int** |  | [optional] 
**max_captures** | **int** |  | [optional] 
**quality** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.frame_capture_settings import FrameCaptureSettings

# TODO update the JSON string below
json = "{}"
# create an instance of FrameCaptureSettings from a JSON string
frame_capture_settings_instance = FrameCaptureSettings.from_json(json)
# print the JSON string representation of the object
print(FrameCaptureSettings.to_json())

# convert the object into a dict
frame_capture_settings_dict = frame_capture_settings_instance.to_dict()
# create an instance of FrameCaptureSettings from a dict
frame_capture_settings_from_dict = FrameCaptureSettings.from_dict(frame_capture_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


