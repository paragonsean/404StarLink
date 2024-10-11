# SMSMessage

Specifies the default settings for a one-time SMS message that's sent directly to an endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **str** |  | [optional] 
**keyword** | **str** |  | [optional] 
**media_url** | **str** |  | [optional] 
**message_type** | [**MessageType**](MessageType.md) |  | [optional] 
**origination_number** | **str** |  | [optional] 
**sender_id** | **str** |  | [optional] 
**substitutions** | **Dict** |  | [optional] 
**entity_id** | **str** |  | [optional] 
**template_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.sms_message import SMSMessage

# TODO update the JSON string below
json = "{}"
# create an instance of SMSMessage from a JSON string
sms_message_instance = SMSMessage.from_json(json)
# print the JSON string representation of the object
print(SMSMessage.to_json())

# convert the object into a dict
sms_message_dict = sms_message_instance.to_dict()
# create an instance of SMSMessage from a dict
sms_message_from_dict = SMSMessage.from_dict(sms_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


