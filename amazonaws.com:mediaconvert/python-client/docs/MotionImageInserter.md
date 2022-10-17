# MotionImageInserter

Overlay motion graphics on top of your video. The motion graphics that you specify here appear on all outputs in all output groups. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/motion-graphic-overlay.html.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**framerate** | [**MotionImageInserterFramerate**](MotionImageInserterFramerate.md) |  | [optional] 
**input** | **str** |  | [optional] 
**insertion_mode** | [**MotionImageInsertionMode**](MotionImageInsertionMode.md) |  | [optional] 
**offset** | [**MotionImageInserterOffset**](MotionImageInserterOffset.md) |  | [optional] 
**playback** | [**MotionImagePlayback**](MotionImagePlayback.md) |  | [optional] 
**start_time** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.motion_image_inserter import MotionImageInserter

# TODO update the JSON string below
json = "{}"
# create an instance of MotionImageInserter from a JSON string
motion_image_inserter_instance = MotionImageInserter.from_json(json)
# print the JSON string representation of the object
print(MotionImageInserter.to_json())

# convert the object into a dict
motion_image_inserter_dict = motion_image_inserter_instance.to_dict()
# create an instance of MotionImageInserter from a dict
motion_image_inserter_from_dict = MotionImageInserter.from_dict(motion_image_inserter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


