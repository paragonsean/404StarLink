# UpdateJourneyStateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**journey_response** | [**JourneyResponse**](JourneyResponse.md) |  | 

## Example

```python
from openapi_client.models.update_journey_state_response import UpdateJourneyStateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateJourneyStateResponse from a JSON string
update_journey_state_response_instance = UpdateJourneyStateResponse.from_json(json)
# print the JSON string representation of the object
print(UpdateJourneyStateResponse.to_json())

# convert the object into a dict
update_journey_state_response_dict = update_journey_state_response_instance.to_dict()
# create an instance of UpdateJourneyStateResponse from a dict
update_journey_state_response_from_dict = UpdateJourneyStateResponse.from_dict(update_journey_state_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


