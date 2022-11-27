# JourneyPushMessage

Specifies the message configuration for a push notification that's sent to participants in a journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time_to_live** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.journey_push_message import JourneyPushMessage

# TODO update the JSON string below
json = "{}"
# create an instance of JourneyPushMessage from a JSON string
journey_push_message_instance = JourneyPushMessage.from_json(json)
# print the JSON string representation of the object
print(JourneyPushMessage.to_json())

# convert the object into a dict
journey_push_message_dict = journey_push_message_instance.to_dict()
# create an instance of JourneyPushMessage from a dict
journey_push_message_from_dict = JourneyPushMessage.from_dict(journey_push_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


