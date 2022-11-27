# JourneyExecutionMetricsResponse

Provides the results of a query that retrieved the data for a standard execution metric that applies to a journey, and provides information about that query.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | 
**journey_id** | **str** |  | 
**last_evaluated_time** | **str** |  | 
**metrics** | **Dict** |  | 

## Example

```python
from openapi_client.models.journey_execution_metrics_response import JourneyExecutionMetricsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of JourneyExecutionMetricsResponse from a JSON string
journey_execution_metrics_response_instance = JourneyExecutionMetricsResponse.from_json(json)
# print the JSON string representation of the object
print(JourneyExecutionMetricsResponse.to_json())

# convert the object into a dict
journey_execution_metrics_response_dict = journey_execution_metrics_response_instance.to_dict()
# create an instance of JourneyExecutionMetricsResponse from a dict
journey_execution_metrics_response_from_dict = JourneyExecutionMetricsResponse.from_dict(journey_execution_metrics_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


