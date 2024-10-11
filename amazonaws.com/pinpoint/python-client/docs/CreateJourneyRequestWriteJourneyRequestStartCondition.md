# CreateJourneyRequestWriteJourneyRequestStartCondition


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**event_start_condition** | [**EventStartCondition**](EventStartCondition.md) |  | [optional] 
**segment_start_condition** | [**StartConditionSegmentStartCondition**](StartConditionSegmentStartCondition.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_journey_request_write_journey_request_start_condition import CreateJourneyRequestWriteJourneyRequestStartCondition

# TODO update the JSON string below
json = "{}"
# create an instance of CreateJourneyRequestWriteJourneyRequestStartCondition from a JSON string
create_journey_request_write_journey_request_start_condition_instance = CreateJourneyRequestWriteJourneyRequestStartCondition.from_json(json)
# print the JSON string representation of the object
print(CreateJourneyRequestWriteJourneyRequestStartCondition.to_json())

# convert the object into a dict
create_journey_request_write_journey_request_start_condition_dict = create_journey_request_write_journey_request_start_condition_instance.to_dict()
# create an instance of CreateJourneyRequestWriteJourneyRequestStartCondition from a dict
create_journey_request_write_journey_request_start_condition_from_dict = CreateJourneyRequestWriteJourneyRequestStartCondition.from_dict(create_journey_request_write_journey_request_start_condition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


