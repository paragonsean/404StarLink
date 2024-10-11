# WaveWaveAggregatedStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**health_status** | [**WaveHealthStatus**](WaveHealthStatus.md) |  | [optional] 
**last_update_date_time** | **str** |  | [optional] 
**progress_status** | [**WaveProgressStatus**](WaveProgressStatus.md) |  | [optional] 
**replication_started_date_time** | **str** |  | [optional] 
**total_applications** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.wave_wave_aggregated_status import WaveWaveAggregatedStatus

# TODO update the JSON string below
json = "{}"
# create an instance of WaveWaveAggregatedStatus from a JSON string
wave_wave_aggregated_status_instance = WaveWaveAggregatedStatus.from_json(json)
# print the JSON string representation of the object
print(WaveWaveAggregatedStatus.to_json())

# convert the object into a dict
wave_wave_aggregated_status_dict = wave_wave_aggregated_status_instance.to_dict()
# create an instance of WaveWaveAggregatedStatus from a dict
wave_wave_aggregated_status_from_dict = WaveWaveAggregatedStatus.from_dict(wave_wave_aggregated_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


