# VideoDetail

Contains details about the output's video stream

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**height_in_px** | **int** |  | [optional] 
**width_in_px** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.video_detail import VideoDetail

# TODO update the JSON string below
json = "{}"
# create an instance of VideoDetail from a JSON string
video_detail_instance = VideoDetail.from_json(json)
# print the JSON string representation of the object
print(VideoDetail.to_json())

# convert the object into a dict
video_detail_dict = video_detail_instance.to_dict()
# create an instance of VideoDetail from a dict
video_detail_from_dict = VideoDetail.from_dict(video_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


