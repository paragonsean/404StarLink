# VideoDescriptionCrop


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**height** | **int** |  | [optional] 
**width** | **int** |  | [optional] 
**x** | **int** |  | [optional] 
**y** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.video_description_crop import VideoDescriptionCrop

# TODO update the JSON string below
json = "{}"
# create an instance of VideoDescriptionCrop from a JSON string
video_description_crop_instance = VideoDescriptionCrop.from_json(json)
# print the JSON string representation of the object
print(VideoDescriptionCrop.to_json())

# convert the object into a dict
video_description_crop_dict = video_description_crop_instance.to_dict()
# create an instance of VideoDescriptionCrop from a dict
video_description_crop_from_dict = VideoDescriptionCrop.from_dict(video_description_crop_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


