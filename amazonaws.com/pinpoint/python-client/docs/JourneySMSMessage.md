# JourneySMSMessage

Specifies the sender ID and message type for an SMS message that's sent to participants in a journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_type** | [**MessageType**](MessageType.md) |  | [optional] 
**origination_number** | **str** |  | [optional] 
**sender_id** | **str** |  | [optional] 
**entity_id** | **str** |  | [optional] 
**template_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.journey_sms_message import JourneySMSMessage

# TODO update the JSON string below
json = "{}"
# create an instance of JourneySMSMessage from a JSON string
journey_sms_message_instance = JourneySMSMessage.from_json(json)
# print the JSON string representation of the object
print(JourneySMSMessage.to_json())

# convert the object into a dict
journey_sms_message_dict = journey_sms_message_instance.to_dict()
# create an instance of JourneySMSMessage from a dict
journey_sms_message_from_dict = JourneySMSMessage.from_dict(journey_sms_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


