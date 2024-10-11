# NoiseReducer

Enable the Noise reducer feature to remove noise from your video output if necessary. Enable or disable this feature for each output individually. This setting is disabled by default. When you enable Noise reducer, you must also select a value for Noise reducer filter. For AVC outputs, when you include Noise reducer, you cannot include the Bandwidth reduction filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter** | [**NoiseReducerFilter**](NoiseReducerFilter.md) |  | [optional] 
**filter_settings** | [**NoiseReducerFilterSettings**](NoiseReducerFilterSettings.md) |  | [optional] 
**spatial_filter_settings** | [**NoiseReducerSpatialFilterSettings**](NoiseReducerSpatialFilterSettings.md) |  | [optional] 
**temporal_filter_settings** | [**NoiseReducerTemporalFilterSettings**](NoiseReducerTemporalFilterSettings.md) |  | [optional] 

## Example

```python
from openapi_client.models.noise_reducer import NoiseReducer

# TODO update the JSON string below
json = "{}"
# create an instance of NoiseReducer from a JSON string
noise_reducer_instance = NoiseReducer.from_json(json)
# print the JSON string representation of the object
print(NoiseReducer.to_json())

# convert the object into a dict
noise_reducer_dict = noise_reducer_instance.to_dict()
# create an instance of NoiseReducer from a dict
noise_reducer_from_dict = NoiseReducer.from_dict(noise_reducer_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


