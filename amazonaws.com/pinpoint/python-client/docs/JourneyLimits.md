# JourneyLimits

Specifies limits on the messages that a journey can send and the number of times participants can enter a journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**daily_cap** | **int** |  | [optional] 
**endpoint_reentry_cap** | **int** |  | [optional] 
**messages_per_second** | **int** |  | [optional] 
**endpoint_reentry_interval** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.journey_limits import JourneyLimits

# TODO update the JSON string below
json = "{}"
# create an instance of JourneyLimits from a JSON string
journey_limits_instance = JourneyLimits.from_json(json)
# print the JSON string representation of the object
print(JourneyLimits.to_json())

# convert the object into a dict
journey_limits_dict = journey_limits_instance.to_dict()
# create an instance of JourneyLimits from a dict
journey_limits_from_dict = JourneyLimits.from_dict(journey_limits_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


