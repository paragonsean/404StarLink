# EventDates

Event's Dates

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access** | [**AccessDates**](AccessDates.md) |  | [optional] 
**end** | [**EndDates**](EndDates.md) |  | [optional] 
**span_multiple_days** | **bool** | Flag indicating if date spans of multiple days | [optional] [default to False]
**start** | [**StartDates**](StartDates.md) |  | [optional] 
**status** | [**EventStatus**](EventStatus.md) |  | [optional] 
**timezone** | **str** | Event&#39;s timezone | [optional] 

## Example

```python
from openapi_client.models.event_dates import EventDates

# TODO update the JSON string below
json = "{}"
# create an instance of EventDates from a JSON string
event_dates_instance = EventDates.from_json(json)
# print the JSON string representation of the object
print(EventDates.to_json())

# convert the object into a dict
event_dates_dict = event_dates_instance.to_dict()
# create an instance of EventDates from a dict
event_dates_from_dict = EventDates.from_dict(event_dates_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


