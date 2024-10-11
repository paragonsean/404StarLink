# CreateJourneyRequestWriteJourneyRequest

Specifies the configuration and other settings for a journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activities** | **Dict** |  | [optional] 
**creation_date** | **str** |  | [optional] 
**last_modified_date** | **str** |  | [optional] 
**limits** | [**CreateJourneyRequestWriteJourneyRequestLimits**](CreateJourneyRequestWriteJourneyRequestLimits.md) |  | [optional] 
**local_time** | **bool** |  | [optional] 
**name** | **str** |  | [optional] 
**quiet_time** | [**CreateJourneyRequestWriteJourneyRequestQuietTime**](CreateJourneyRequestWriteJourneyRequestQuietTime.md) |  | [optional] 
**refresh_frequency** | **str** |  | [optional] 
**schedule** | [**CreateJourneyRequestWriteJourneyRequestSchedule**](CreateJourneyRequestWriteJourneyRequestSchedule.md) |  | [optional] 
**start_activity** | **str** |  | [optional] 
**start_condition** | [**CreateJourneyRequestWriteJourneyRequestStartCondition**](CreateJourneyRequestWriteJourneyRequestStartCondition.md) |  | [optional] 
**state** | [**State**](State.md) |  | [optional] 
**wait_for_quiet_time** | **bool** |  | [optional] 
**refresh_on_segment_update** | **bool** |  | [optional] 
**journey_channel_settings** | [**CreateJourneyRequestWriteJourneyRequestJourneyChannelSettings**](CreateJourneyRequestWriteJourneyRequestJourneyChannelSettings.md) |  | [optional] 
**sending_schedule** | **bool** |  | [optional] 
**open_hours** | [**CreateJourneyRequestWriteJourneyRequestOpenHours**](CreateJourneyRequestWriteJourneyRequestOpenHours.md) |  | [optional] 
**closed_days** | [**CreateJourneyRequestWriteJourneyRequestClosedDays**](CreateJourneyRequestWriteJourneyRequestClosedDays.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_journey_request_write_journey_request import CreateJourneyRequestWriteJourneyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateJourneyRequestWriteJourneyRequest from a JSON string
create_journey_request_write_journey_request_instance = CreateJourneyRequestWriteJourneyRequest.from_json(json)
# print the JSON string representation of the object
print(CreateJourneyRequestWriteJourneyRequest.to_json())

# convert the object into a dict
create_journey_request_write_journey_request_dict = create_journey_request_write_journey_request_instance.to_dict()
# create an instance of CreateJourneyRequestWriteJourneyRequest from a dict
create_journey_request_write_journey_request_from_dict = CreateJourneyRequestWriteJourneyRequest.from_dict(create_journey_request_write_journey_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


