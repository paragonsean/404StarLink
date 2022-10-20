# ApplicationAggregatedStatus

Application aggregated status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**health_status** | [**ApplicationHealthStatus**](ApplicationHealthStatus.md) |  | [optional] 
**last_update_date_time** | **str** |  | [optional] 
**progress_status** | [**ApplicationProgressStatus**](ApplicationProgressStatus.md) |  | [optional] 
**total_source_servers** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.application_aggregated_status import ApplicationAggregatedStatus

# TODO update the JSON string below
json = "{}"
# create an instance of ApplicationAggregatedStatus from a JSON string
application_aggregated_status_instance = ApplicationAggregatedStatus.from_json(json)
# print the JSON string representation of the object
print(ApplicationAggregatedStatus.to_json())

# convert the object into a dict
application_aggregated_status_dict = application_aggregated_status_instance.to_dict()
# create an instance of ApplicationAggregatedStatus from a dict
application_aggregated_status_from_dict = ApplicationAggregatedStatus.from_dict(application_aggregated_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


