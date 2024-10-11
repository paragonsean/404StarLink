# MessageConfigurationSMSMessage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **str** |  | [optional] 
**message_type** | [**MessageType**](MessageType.md) |  | [optional] 
**origination_number** | **str** |  | [optional] 
**sender_id** | **str** |  | [optional] 
**entity_id** | **str** |  | [optional] 
**template_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.message_configuration_sms_message import MessageConfigurationSMSMessage

# TODO update the JSON string below
json = "{}"
# create an instance of MessageConfigurationSMSMessage from a JSON string
message_configuration_sms_message_instance = MessageConfigurationSMSMessage.from_json(json)
# print the JSON string representation of the object
print(MessageConfigurationSMSMessage.to_json())

# convert the object into a dict
message_configuration_sms_message_dict = message_configuration_sms_message_instance.to_dict()
# create an instance of MessageConfigurationSMSMessage from a dict
message_configuration_sms_message_from_dict = MessageConfigurationSMSMessage.from_dict(message_configuration_sms_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


