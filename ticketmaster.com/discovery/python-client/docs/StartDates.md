# StartDates

Event's Start Dates

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_tba** | **bool** | Boolean flag to indicate whether or not the start date is TBA | [optional] [default to False]
**date_tbd** | **bool** | Boolean flag to indicate whether or not the start date is TBD | [optional] [default to False]
**date_time** | **datetime** | The event start datetime | [optional] 
**local_date** | **date** | The event start date in local date | [optional] 
**local_time** | [**LocalTime**](LocalTime.md) |  | [optional] 
**no_specific_time** | **bool** | Boolean flag to indicate whether or not the event start time has no specific time | [optional] [default to False]
**time_tba** | **bool** | Boolean flag to indicate whether or not the start time is TBA | [optional] [default to False]

## Example

```python
from openapi_client.models.start_dates import StartDates

# TODO update the JSON string below
json = "{}"
# create an instance of StartDates from a JSON string
start_dates_instance = StartDates.from_json(json)
# print the JSON string representation of the object
print(StartDates.to_json())

# convert the object into a dict
start_dates_dict = start_dates_instance.to_dict()
# create an instance of StartDates from a dict
start_dates_from_dict = StartDates.from_dict(start_dates_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


