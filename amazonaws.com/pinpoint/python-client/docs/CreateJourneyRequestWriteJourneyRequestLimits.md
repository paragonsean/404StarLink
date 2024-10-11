# CreateJourneyRequestWriteJourneyRequestLimits


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**daily_cap** | **int** |  | [optional] 
**endpoint_reentry_cap** | **int** |  | [optional] 
**messages_per_second** | **int** |  | [optional] 
**endpoint_reentry_interval** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.create_journey_request_write_journey_request_limits import CreateJourneyRequestWriteJourneyRequestLimits

# TODO update the JSON string below
json = "{}"
# create an instance of CreateJourneyRequestWriteJourneyRequestLimits from a JSON string
create_journey_request_write_journey_request_limits_instance = CreateJourneyRequestWriteJourneyRequestLimits.from_json(json)
# print the JSON string representation of the object
print(CreateJourneyRequestWriteJourneyRequestLimits.to_json())

# convert the object into a dict
create_journey_request_write_journey_request_limits_dict = create_journey_request_write_journey_request_limits_instance.to_dict()
# create an instance of CreateJourneyRequestWriteJourneyRequestLimits from a dict
create_journey_request_write_journey_request_limits_from_dict = CreateJourneyRequestWriteJourneyRequestLimits.from_dict(create_journey_request_write_journey_request_limits_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


