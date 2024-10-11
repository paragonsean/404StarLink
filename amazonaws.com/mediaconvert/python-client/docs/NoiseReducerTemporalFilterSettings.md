# NoiseReducerTemporalFilterSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggressive_mode** | **int** |  | [optional] 
**post_temporal_sharpening** | [**NoiseFilterPostTemporalSharpening**](NoiseFilterPostTemporalSharpening.md) |  | [optional] 
**post_temporal_sharpening_strength** | [**NoiseFilterPostTemporalSharpeningStrength**](NoiseFilterPostTemporalSharpeningStrength.md) |  | [optional] 
**speed** | **int** |  | [optional] 
**strength** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.noise_reducer_temporal_filter_settings import NoiseReducerTemporalFilterSettings

# TODO update the JSON string below
json = "{}"
# create an instance of NoiseReducerTemporalFilterSettings from a JSON string
noise_reducer_temporal_filter_settings_instance = NoiseReducerTemporalFilterSettings.from_json(json)
# print the JSON string representation of the object
print(NoiseReducerTemporalFilterSettings.to_json())

# convert the object into a dict
noise_reducer_temporal_filter_settings_dict = noise_reducer_temporal_filter_settings_instance.to_dict()
# create an instance of NoiseReducerTemporalFilterSettings from a dict
noise_reducer_temporal_filter_settings_from_dict = NoiseReducerTemporalFilterSettings.from_dict(noise_reducer_temporal_filter_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


