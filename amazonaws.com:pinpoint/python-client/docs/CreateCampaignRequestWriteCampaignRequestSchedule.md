# CreateCampaignRequestWriteCampaignRequestSchedule


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_time** | **str** |  | [optional] 
**event_filter** | [**ScheduleEventFilter**](ScheduleEventFilter.md) |  | [optional] 
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**is_local_time** | **bool** |  | [optional] 
**quiet_time** | [**ScheduleQuietTime**](ScheduleQuietTime.md) |  | [optional] 
**start_time** | **str** |  | 
**timezone** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.create_campaign_request_write_campaign_request_schedule import CreateCampaignRequestWriteCampaignRequestSchedule

# TODO update the JSON string below
json = "{}"
# create an instance of CreateCampaignRequestWriteCampaignRequestSchedule from a JSON string
create_campaign_request_write_campaign_request_schedule_instance = CreateCampaignRequestWriteCampaignRequestSchedule.from_json(json)
# print the JSON string representation of the object
print(CreateCampaignRequestWriteCampaignRequestSchedule.to_json())

# convert the object into a dict
create_campaign_request_write_campaign_request_schedule_dict = create_campaign_request_write_campaign_request_schedule_instance.to_dict()
# create an instance of CreateCampaignRequestWriteCampaignRequestSchedule from a dict
create_campaign_request_write_campaign_request_schedule_from_dict = CreateCampaignRequestWriteCampaignRequestSchedule.from_dict(create_campaign_request_write_campaign_request_schedule_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


