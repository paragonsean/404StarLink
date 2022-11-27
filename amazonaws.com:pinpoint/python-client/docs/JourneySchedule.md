# JourneySchedule

Specifies the schedule settings for a journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_time** | **datetime** |  | [optional] 
**start_time** | **datetime** |  | [optional] 
**timezone** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.journey_schedule import JourneySchedule

# TODO update the JSON string below
json = "{}"
# create an instance of JourneySchedule from a JSON string
journey_schedule_instance = JourneySchedule.from_json(json)
# print the JSON string representation of the object
print(JourneySchedule.to_json())

# convert the object into a dict
journey_schedule_dict = journey_schedule_instance.to_dict()
# create an instance of JourneySchedule from a dict
journey_schedule_from_dict = JourneySchedule.from_dict(journey_schedule_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


