# JourneyEmailMessage

Specifies the \"From\" address for an email message that's sent to participants in a journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from_address** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.journey_email_message import JourneyEmailMessage

# TODO update the JSON string below
json = "{}"
# create an instance of JourneyEmailMessage from a JSON string
journey_email_message_instance = JourneyEmailMessage.from_json(json)
# print the JSON string representation of the object
print(JourneyEmailMessage.to_json())

# convert the object into a dict
journey_email_message_dict = journey_email_message_instance.to_dict()
# create an instance of JourneyEmailMessage from a dict
journey_email_message_from_dict = JourneyEmailMessage.from_dict(journey_email_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


