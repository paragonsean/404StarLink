# JourneyExecutionActivityMetricsResponse

Provides the results of a query that retrieved the data for a standard execution metric that applies to a journey activity, and provides information about that query.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activity_type** | **str** |  | 
**application_id** | **str** |  | 
**journey_activity_id** | **str** |  | 
**journey_id** | **str** |  | 
**last_evaluated_time** | **str** |  | 
**metrics** | **Dict** |  | 

## Example

```python
from openapi_client.models.journey_execution_activity_metrics_response import JourneyExecutionActivityMetricsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of JourneyExecutionActivityMetricsResponse from a JSON string
journey_execution_activity_metrics_response_instance = JourneyExecutionActivityMetricsResponse.from_json(json)
# print the JSON string representation of the object
print(JourneyExecutionActivityMetricsResponse.to_json())

# convert the object into a dict
journey_execution_activity_metrics_response_dict = journey_execution_activity_metrics_response_instance.to_dict()
# create an instance of JourneyExecutionActivityMetricsResponse from a dict
journey_execution_activity_metrics_response_from_dict = JourneyExecutionActivityMetricsResponse.from_dict(journey_execution_activity_metrics_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


