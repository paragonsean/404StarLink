# JourneyResponse

Provides information about the status, configuration, and other settings for a journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activities** | **Dict** |  | [optional] 
**application_id** | **str** |  | 
**creation_date** | **str** |  | [optional] 
**id** | **str** |  | 
**last_modified_date** | **str** |  | [optional] 
**limits** | [**CreateJourneyRequestWriteJourneyRequestLimits**](CreateJourneyRequestWriteJourneyRequestLimits.md) |  | [optional] 
**local_time** | **bool** |  | [optional] 
**name** | **str** |  | 
**quiet_time** | [**CreateJourneyRequestWriteJourneyRequestQuietTime**](CreateJourneyRequestWriteJourneyRequestQuietTime.md) |  | [optional] 
**refresh_frequency** | **str** |  | [optional] 
**schedule** | [**CreateJourneyRequestWriteJourneyRequestSchedule**](CreateJourneyRequestWriteJourneyRequestSchedule.md) |  | [optional] 
**start_activity** | **str** |  | [optional] 
**start_condition** | [**CreateJourneyRequestWriteJourneyRequestStartCondition**](CreateJourneyRequestWriteJourneyRequestStartCondition.md) |  | [optional] 
**state** | [**State**](State.md) |  | [optional] 
**tags** | **Dict** |  | [optional] 
**wait_for_quiet_time** | **bool** |  | [optional] 
**refresh_on_segment_update** | **bool** |  | [optional] 
**journey_channel_settings** | [**CreateJourneyRequestWriteJourneyRequestJourneyChannelSettings**](CreateJourneyRequestWriteJourneyRequestJourneyChannelSettings.md) |  | [optional] 
**sending_schedule** | **bool** |  | [optional] 
**open_hours** | [**CreateJourneyRequestWriteJourneyRequestOpenHours**](CreateJourneyRequestWriteJourneyRequestOpenHours.md) |  | [optional] 
**closed_days** | [**CreateJourneyRequestWriteJourneyRequestClosedDays**](CreateJourneyRequestWriteJourneyRequestClosedDays.md) |  | [optional] 

## Example

```python
from openapi_client.models.journey_response import JourneyResponse

# TODO update the JSON string below
json = "{}"
# create an instance of JourneyResponse from a JSON string
journey_response_instance = JourneyResponse.from_json(json)
# print the JSON string representation of the object
print(JourneyResponse.to_json())

# convert the object into a dict
journey_response_dict = journey_response_instance.to_dict()
# create an instance of JourneyResponse from a dict
journey_response_from_dict = JourneyResponse.from_dict(journey_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


