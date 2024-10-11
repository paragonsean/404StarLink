# MotionImageInsertionFramerate

For motion overlays that don't have a built-in frame rate, specify the frame rate of the overlay in frames per second, as a fraction. For example, specify 24 fps as 24/1. The overlay frame rate doesn't need to match the frame rate of the underlying video.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**framerate_denominator** | **int** |  | [optional] 
**framerate_numerator** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.motion_image_insertion_framerate import MotionImageInsertionFramerate

# TODO update the JSON string below
json = "{}"
# create an instance of MotionImageInsertionFramerate from a JSON string
motion_image_insertion_framerate_instance = MotionImageInsertionFramerate.from_json(json)
# print the JSON string representation of the object
print(MotionImageInsertionFramerate.to_json())

# convert the object into a dict
motion_image_insertion_framerate_dict = motion_image_insertion_framerate_instance.to_dict()
# create an instance of MotionImageInsertionFramerate from a dict
motion_image_insertion_framerate_from_dict = MotionImageInsertionFramerate.from_dict(motion_image_insertion_framerate_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


