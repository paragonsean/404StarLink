# EndDates

Event's End Dates

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approximate** | **bool** | Boolean flag to indicate whether or not the end date is approximated | [optional] [default to False]
**date_time** | **datetime** | The event end date time | [optional] 
**local_date** | **date** | The event end date in local date | [optional] 
**local_time** | [**LocalTime**](LocalTime.md) |  | [optional] 
**no_specific_time** | **bool** | Boolean flag to indicate whether or not the event end time has no specific time | [optional] [default to False]

## Example

```python
from openapi_client.models.end_dates import EndDates

# TODO update the JSON string below
json = "{}"
# create an instance of EndDates from a JSON string
end_dates_instance = EndDates.from_json(json)
# print the JSON string representation of the object
print(EndDates.to_json())

# convert the object into a dict
end_dates_dict = end_dates_instance.to_dict()
# create an instance of EndDates from a dict
end_dates_from_dict = EndDates.from_dict(end_dates_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


