# UpdateJourneyStateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**journey_state_request** | [**UpdateJourneyStateRequestJourneyStateRequest**](UpdateJourneyStateRequestJourneyStateRequest.md) |  | 

## Example

```python
from openapi_client.models.update_journey_state_request import UpdateJourneyStateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateJourneyStateRequest from a JSON string
update_journey_state_request_instance = UpdateJourneyStateRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateJourneyStateRequest.to_json())

# convert the object into a dict
update_journey_state_request_dict = update_journey_state_request_instance.to_dict()
# create an instance of UpdateJourneyStateRequest from a dict
update_journey_state_request_from_dict = UpdateJourneyStateRequest.from_dict(update_journey_state_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


