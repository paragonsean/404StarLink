# VideoDescriptionPosition


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**height** | **int** |  | [optional] 
**width** | **int** |  | [optional] 
**x** | **int** |  | [optional] 
**y** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.video_description_position import VideoDescriptionPosition

# TODO update the JSON string below
json = "{}"
# create an instance of VideoDescriptionPosition from a JSON string
video_description_position_instance = VideoDescriptionPosition.from_json(json)
# print the JSON string representation of the object
print(VideoDescriptionPosition.to_json())

# convert the object into a dict
video_description_position_dict = video_description_position_instance.to_dict()
# create an instance of VideoDescriptionPosition from a dict
video_description_position_from_dict = VideoDescriptionPosition.from_dict(video_description_position_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


