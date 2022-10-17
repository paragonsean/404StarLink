# MotionImageInsertionOffset

Specify the offset between the upper-left corner of the video frame and the top left corner of the overlay.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**image_x** | **int** |  | [optional] 
**image_y** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.motion_image_insertion_offset import MotionImageInsertionOffset

# TODO update the JSON string below
json = "{}"
# create an instance of MotionImageInsertionOffset from a JSON string
motion_image_insertion_offset_instance = MotionImageInsertionOffset.from_json(json)
# print the JSON string representation of the object
print(MotionImageInsertionOffset.to_json())

# convert the object into a dict
motion_image_insertion_offset_dict = motion_image_insertion_offset_instance.to_dict()
# create an instance of MotionImageInsertionOffset from a dict
motion_image_insertion_offset_from_dict = MotionImageInsertionOffset.from_dict(motion_image_insertion_offset_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


