# JourneyDateRangeKpiResponse

Provides the results of a query that retrieved the data for a standard engagement metric that applies to a journey, and provides information about that query.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | 
**end_time** | **datetime** |  | 
**journey_id** | **str** |  | 
**kpi_name** | **str** |  | 
**kpi_result** | [**ApplicationDateRangeKpiResponseKpiResult**](ApplicationDateRangeKpiResponseKpiResult.md) |  | 
**next_token** | **str** |  | [optional] 
**start_time** | **datetime** |  | 

## Example

```python
from openapi_client.models.journey_date_range_kpi_response import JourneyDateRangeKpiResponse

# TODO update the JSON string below
json = "{}"
# create an instance of JourneyDateRangeKpiResponse from a JSON string
journey_date_range_kpi_response_instance = JourneyDateRangeKpiResponse.from_json(json)
# print the JSON string representation of the object
print(JourneyDateRangeKpiResponse.to_json())

# convert the object into a dict
journey_date_range_kpi_response_dict = journey_date_range_kpi_response_instance.to_dict()
# create an instance of JourneyDateRangeKpiResponse from a dict
journey_date_range_kpi_response_from_dict = JourneyDateRangeKpiResponse.from_dict(journey_date_range_kpi_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


