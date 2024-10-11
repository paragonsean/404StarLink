# VideoPreprocessorNoiseReducer


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter** | [**NoiseReducerFilter**](NoiseReducerFilter.md) |  | [optional] 
**filter_settings** | [**NoiseReducerFilterSettings**](NoiseReducerFilterSettings.md) |  | [optional] 
**spatial_filter_settings** | [**NoiseReducerSpatialFilterSettings**](NoiseReducerSpatialFilterSettings.md) |  | [optional] 
**temporal_filter_settings** | [**NoiseReducerTemporalFilterSettings**](NoiseReducerTemporalFilterSettings.md) |  | [optional] 

## Example

```python
from openapi_client.models.video_preprocessor_noise_reducer import VideoPreprocessorNoiseReducer

# TODO update the JSON string below
json = "{}"
# create an instance of VideoPreprocessorNoiseReducer from a JSON string
video_preprocessor_noise_reducer_instance = VideoPreprocessorNoiseReducer.from_json(json)
# print the JSON string representation of the object
print(VideoPreprocessorNoiseReducer.to_json())

# convert the object into a dict
video_preprocessor_noise_reducer_dict = video_preprocessor_noise_reducer_instance.to_dict()
# create an instance of VideoPreprocessorNoiseReducer from a dict
video_preprocessor_noise_reducer_from_dict = VideoPreprocessorNoiseReducer.from_dict(video_preprocessor_noise_reducer_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


