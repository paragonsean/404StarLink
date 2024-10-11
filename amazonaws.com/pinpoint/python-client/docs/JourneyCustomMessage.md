# JourneyCustomMessage

Specifies the message content for a custom channel message that's sent to participants in a journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.journey_custom_message import JourneyCustomMessage

# TODO update the JSON string below
json = "{}"
# create an instance of JourneyCustomMessage from a JSON string
journey_custom_message_instance = JourneyCustomMessage.from_json(json)
# print the JSON string representation of the object
print(JourneyCustomMessage.to_json())

# convert the object into a dict
journey_custom_message_dict = journey_custom_message_instance.to_dict()
# create an instance of JourneyCustomMessage from a dict
journey_custom_message_from_dict = JourneyCustomMessage.from_dict(journey_custom_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


