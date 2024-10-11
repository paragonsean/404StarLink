# JourneyStateRequest

Changes the status of a journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**State**](State.md) |  | [optional] 

## Example

```python
from openapi_client.models.journey_state_request import JourneyStateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of JourneyStateRequest from a JSON string
journey_state_request_instance = JourneyStateRequest.from_json(json)
# print the JSON string representation of the object
print(JourneyStateRequest.to_json())

# convert the object into a dict
journey_state_request_dict = journey_state_request_instance.to_dict()
# create an instance of JourneyStateRequest from a dict
journey_state_request_from_dict = JourneyStateRequest.from_dict(journey_state_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


