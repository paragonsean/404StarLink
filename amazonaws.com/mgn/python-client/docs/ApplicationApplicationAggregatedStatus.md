# ApplicationApplicationAggregatedStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**health_status** | [**ApplicationHealthStatus**](ApplicationHealthStatus.md) |  | [optional] 
**last_update_date_time** | **str** |  | [optional] 
**progress_status** | [**ApplicationProgressStatus**](ApplicationProgressStatus.md) |  | [optional] 
**total_source_servers** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.application_application_aggregated_status import ApplicationApplicationAggregatedStatus

# TODO update the JSON string below
json = "{}"
# create an instance of ApplicationApplicationAggregatedStatus from a JSON string
application_application_aggregated_status_instance = ApplicationApplicationAggregatedStatus.from_json(json)
# print the JSON string representation of the object
print(ApplicationApplicationAggregatedStatus.to_json())

# convert the object into a dict
application_application_aggregated_status_dict = application_application_aggregated_status_instance.to_dict()
# create an instance of ApplicationApplicationAggregatedStatus from a dict
application_application_aggregated_status_from_dict = ApplicationApplicationAggregatedStatus.from_dict(application_application_aggregated_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


