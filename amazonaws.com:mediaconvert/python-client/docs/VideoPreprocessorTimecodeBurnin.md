# VideoPreprocessorTimecodeBurnin


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**font_size** | **int** |  | [optional] 
**position** | [**TimecodeBurninPosition**](TimecodeBurninPosition.md) |  | [optional] 
**prefix** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.video_preprocessor_timecode_burnin import VideoPreprocessorTimecodeBurnin

# TODO update the JSON string below
json = "{}"
# create an instance of VideoPreprocessorTimecodeBurnin from a JSON string
video_preprocessor_timecode_burnin_instance = VideoPreprocessorTimecodeBurnin.from_json(json)
# print the JSON string representation of the object
print(VideoPreprocessorTimecodeBurnin.to_json())

# convert the object into a dict
video_preprocessor_timecode_burnin_dict = video_preprocessor_timecode_burnin_instance.to_dict()
# create an instance of VideoPreprocessorTimecodeBurnin from a dict
video_preprocessor_timecode_burnin_from_dict = VideoPreprocessorTimecodeBurnin.from_dict(video_preprocessor_timecode_burnin_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


