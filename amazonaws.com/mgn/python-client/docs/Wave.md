# Wave


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**creation_date_time** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**is_archived** | **bool** |  | [optional] 
**last_modified_date_time** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**tags** | **Dict** |  | [optional] 
**wave_aggregated_status** | [**WaveWaveAggregatedStatus**](WaveWaveAggregatedStatus.md) |  | [optional] 
**wave_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.wave import Wave

# TODO update the JSON string below
json = "{}"
# create an instance of Wave from a JSON string
wave_instance = Wave.from_json(json)
# print the JSON string representation of the object
print(Wave.to_json())

# convert the object into a dict
wave_dict = wave_instance.to_dict()
# create an instance of Wave from a dict
wave_from_dict = Wave.from_dict(wave_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


