# NoiseReducerSpatialFilterSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**post_filter_sharpen_strength** | **int** |  | [optional] 
**speed** | **int** |  | [optional] 
**strength** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.noise_reducer_spatial_filter_settings import NoiseReducerSpatialFilterSettings

# TODO update the JSON string below
json = "{}"
# create an instance of NoiseReducerSpatialFilterSettings from a JSON string
noise_reducer_spatial_filter_settings_instance = NoiseReducerSpatialFilterSettings.from_json(json)
# print the JSON string representation of the object
print(NoiseReducerSpatialFilterSettings.to_json())

# convert the object into a dict
noise_reducer_spatial_filter_settings_dict = noise_reducer_spatial_filter_settings_instance.to_dict()
# create an instance of NoiseReducerSpatialFilterSettings from a dict
noise_reducer_spatial_filter_settings_from_dict = NoiseReducerSpatialFilterSettings.from_dict(noise_reducer_spatial_filter_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


