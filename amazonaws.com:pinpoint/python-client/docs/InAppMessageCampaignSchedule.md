# InAppMessageCampaignSchedule


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_date** | **str** |  | [optional] 
**event_filter** | [**InAppCampaignScheduleEventFilter**](InAppCampaignScheduleEventFilter.md) |  | [optional] 
**quiet_time** | [**InAppCampaignScheduleQuietTime**](InAppCampaignScheduleQuietTime.md) |  | [optional] 

## Example

```python
from openapi_client.models.in_app_message_campaign_schedule import InAppMessageCampaignSchedule

# TODO update the JSON string below
json = "{}"
# create an instance of InAppMessageCampaignSchedule from a JSON string
in_app_message_campaign_schedule_instance = InAppMessageCampaignSchedule.from_json(json)
# print the JSON string representation of the object
print(InAppMessageCampaignSchedule.to_json())

# convert the object into a dict
in_app_message_campaign_schedule_dict = in_app_message_campaign_schedule_instance.to_dict()
# create an instance of InAppMessageCampaignSchedule from a dict
in_app_message_campaign_schedule_from_dict = InAppMessageCampaignSchedule.from_dict(in_app_message_campaign_schedule_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


