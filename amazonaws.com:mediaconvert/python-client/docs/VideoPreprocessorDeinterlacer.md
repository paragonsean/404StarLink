# VideoPreprocessorDeinterlacer


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**algorithm** | [**DeinterlaceAlgorithm**](DeinterlaceAlgorithm.md) |  | [optional] 
**control** | [**DeinterlacerControl**](DeinterlacerControl.md) |  | [optional] 
**mode** | [**DeinterlacerMode**](DeinterlacerMode.md) |  | [optional] 

## Example

```python
from openapi_client.models.video_preprocessor_deinterlacer import VideoPreprocessorDeinterlacer

# TODO update the JSON string below
json = "{}"
# create an instance of VideoPreprocessorDeinterlacer from a JSON string
video_preprocessor_deinterlacer_instance = VideoPreprocessorDeinterlacer.from_json(json)
# print the JSON string representation of the object
print(VideoPreprocessorDeinterlacer.to_json())

# convert the object into a dict
video_preprocessor_deinterlacer_dict = video_preprocessor_deinterlacer_instance.to_dict()
# create an instance of VideoPreprocessorDeinterlacer from a dict
video_preprocessor_deinterlacer_from_dict = VideoPreprocessorDeinterlacer.from_dict(video_preprocessor_deinterlacer_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


