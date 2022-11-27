# InAppCampaignScheduleEventFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dimensions** | [**CampaignEventFilterDimensions**](CampaignEventFilterDimensions.md) |  | 
**filter_type** | [**FilterType**](FilterType.md) |  | 

## Example

```python
from openapi_client.models.in_app_campaign_schedule_event_filter import InAppCampaignScheduleEventFilter

# TODO update the JSON string below
json = "{}"
# create an instance of InAppCampaignScheduleEventFilter from a JSON string
in_app_campaign_schedule_event_filter_instance = InAppCampaignScheduleEventFilter.from_json(json)
# print the JSON string representation of the object
print(InAppCampaignScheduleEventFilter.to_json())

# convert the object into a dict
in_app_campaign_schedule_event_filter_dict = in_app_campaign_schedule_event_filter_instance.to_dict()
# create an instance of InAppCampaignScheduleEventFilter from a dict
in_app_campaign_schedule_event_filter_from_dict = InAppCampaignScheduleEventFilter.from_dict(in_app_campaign_schedule_event_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


