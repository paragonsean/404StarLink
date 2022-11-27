# ScheduleEventFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dimensions** | [**CampaignEventFilterDimensions**](CampaignEventFilterDimensions.md) |  | 
**filter_type** | [**FilterType**](FilterType.md) |  | 

## Example

```python
from openapi_client.models.schedule_event_filter import ScheduleEventFilter

# TODO update the JSON string below
json = "{}"
# create an instance of ScheduleEventFilter from a JSON string
schedule_event_filter_instance = ScheduleEventFilter.from_json(json)
# print the JSON string representation of the object
print(ScheduleEventFilter.to_json())

# convert the object into a dict
schedule_event_filter_dict = schedule_event_filter_instance.to_dict()
# create an instance of ScheduleEventFilter from a dict
schedule_event_filter_from_dict = ScheduleEventFilter.from_dict(schedule_event_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


