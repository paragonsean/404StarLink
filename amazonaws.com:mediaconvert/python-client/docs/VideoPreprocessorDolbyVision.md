# VideoPreprocessorDolbyVision


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**l6_metadata** | [**DolbyVisionL6Metadata**](DolbyVisionL6Metadata.md) |  | [optional] 
**l6_mode** | [**DolbyVisionLevel6Mode**](DolbyVisionLevel6Mode.md) |  | [optional] 
**mapping** | [**DolbyVisionMapping**](DolbyVisionMapping.md) |  | [optional] 
**profile** | [**DolbyVisionProfile**](DolbyVisionProfile.md) |  | [optional] 

## Example

```python
from openapi_client.models.video_preprocessor_dolby_vision import VideoPreprocessorDolbyVision

# TODO update the JSON string below
json = "{}"
# create an instance of VideoPreprocessorDolbyVision from a JSON string
video_preprocessor_dolby_vision_instance = VideoPreprocessorDolbyVision.from_json(json)
# print the JSON string representation of the object
print(VideoPreprocessorDolbyVision.to_json())

# convert the object into a dict
video_preprocessor_dolby_vision_dict = video_preprocessor_dolby_vision_instance.to_dict()
# create an instance of VideoPreprocessorDolbyVision from a dict
video_preprocessor_dolby_vision_from_dict = VideoPreprocessorDolbyVision.from_dict(video_preprocessor_dolby_vision_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


