# VideoSelectorHdr10Metadata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blue_primary_x** | **int** |  | [optional] 
**blue_primary_y** | **int** |  | [optional] 
**green_primary_x** | **int** |  | [optional] 
**green_primary_y** | **int** |  | [optional] 
**max_content_light_level** | **int** |  | [optional] 
**max_frame_average_light_level** | **int** |  | [optional] 
**max_luminance** | **int** |  | [optional] 
**min_luminance** | **int** |  | [optional] 
**red_primary_x** | **int** |  | [optional] 
**red_primary_y** | **int** |  | [optional] 
**white_point_x** | **int** |  | [optional] 
**white_point_y** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.video_selector_hdr10_metadata import VideoSelectorHdr10Metadata

# TODO update the JSON string below
json = "{}"
# create an instance of VideoSelectorHdr10Metadata from a JSON string
video_selector_hdr10_metadata_instance = VideoSelectorHdr10Metadata.from_json(json)
# print the JSON string representation of the object
print(VideoSelectorHdr10Metadata.to_json())

# convert the object into a dict
video_selector_hdr10_metadata_dict = video_selector_hdr10_metadata_instance.to_dict()
# create an instance of VideoSelectorHdr10Metadata from a dict
video_selector_hdr10_metadata_from_dict = VideoSelectorHdr10Metadata.from_dict(video_selector_hdr10_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


