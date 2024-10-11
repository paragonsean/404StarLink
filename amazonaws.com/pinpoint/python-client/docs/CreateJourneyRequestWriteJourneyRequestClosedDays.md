# CreateJourneyRequestWriteJourneyRequestClosedDays


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **List** |  | [optional] 
**sms** | **List** |  | [optional] 
**push** | **List** |  | [optional] 
**voice** | **List** |  | [optional] 
**custom** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.create_journey_request_write_journey_request_closed_days import CreateJourneyRequestWriteJourneyRequestClosedDays

# TODO update the JSON string below
json = "{}"
# create an instance of CreateJourneyRequestWriteJourneyRequestClosedDays from a JSON string
create_journey_request_write_journey_request_closed_days_instance = CreateJourneyRequestWriteJourneyRequestClosedDays.from_json(json)
# print the JSON string representation of the object
print(CreateJourneyRequestWriteJourneyRequestClosedDays.to_json())

# convert the object into a dict
create_journey_request_write_journey_request_closed_days_dict = create_journey_request_write_journey_request_closed_days_instance.to_dict()
# create an instance of CreateJourneyRequestWriteJourneyRequestClosedDays from a dict
create_journey_request_write_journey_request_closed_days_from_dict = CreateJourneyRequestWriteJourneyRequestClosedDays.from_dict(create_journey_request_write_journey_request_closed_days_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


