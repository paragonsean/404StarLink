# CreateJourneyRequestWriteJourneyRequestSchedule


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_time** | **datetime** |  | [optional] 
**start_time** | **datetime** |  | [optional] 
**timezone** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.create_journey_request_write_journey_request_schedule import CreateJourneyRequestWriteJourneyRequestSchedule

# TODO update the JSON string below
json = "{}"
# create an instance of CreateJourneyRequestWriteJourneyRequestSchedule from a JSON string
create_journey_request_write_journey_request_schedule_instance = CreateJourneyRequestWriteJourneyRequestSchedule.from_json(json)
# print the JSON string representation of the object
print(CreateJourneyRequestWriteJourneyRequestSchedule.to_json())

# convert the object into a dict
create_journey_request_write_journey_request_schedule_dict = create_journey_request_write_journey_request_schedule_instance.to_dict()
# create an instance of CreateJourneyRequestWriteJourneyRequestSchedule from a dict
create_journey_request_write_journey_request_schedule_from_dict = CreateJourneyRequestWriteJourneyRequestSchedule.from_dict(create_journey_request_write_journey_request_schedule_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


