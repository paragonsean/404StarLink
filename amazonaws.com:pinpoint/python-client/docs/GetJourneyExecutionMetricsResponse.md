# GetJourneyExecutionMetricsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**journey_execution_metrics_response** | [**JourneyExecutionMetricsResponse**](JourneyExecutionMetricsResponse.md) |  | 

## Example

```python
from openapi_client.models.get_journey_execution_metrics_response import GetJourneyExecutionMetricsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetJourneyExecutionMetricsResponse from a JSON string
get_journey_execution_metrics_response_instance = GetJourneyExecutionMetricsResponse.from_json(json)
# print the JSON string representation of the object
print(GetJourneyExecutionMetricsResponse.to_json())

# convert the object into a dict
get_journey_execution_metrics_response_dict = get_journey_execution_metrics_response_instance.to_dict()
# create an instance of GetJourneyExecutionMetricsResponse from a dict
get_journey_execution_metrics_response_from_dict = GetJourneyExecutionMetricsResponse.from_dict(get_journey_execution_metrics_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


