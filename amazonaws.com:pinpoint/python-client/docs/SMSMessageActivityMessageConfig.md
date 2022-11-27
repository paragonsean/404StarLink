# SMSMessageActivityMessageConfig


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
from openapi_client.models.sms_message_activity_message_config import SMSMessageActivityMessageConfig

# TODO update the JSON string below
json = "{}"
# create an instance of SMSMessageActivityMessageConfig from a JSON string
sms_message_activity_message_config_instance = SMSMessageActivityMessageConfig.from_json(json)
# print the JSON string representation of the object
print(SMSMessageActivityMessageConfig.to_json())

# convert the object into a dict
sms_message_activity_message_config_dict = sms_message_activity_message_config_instance.to_dict()
# create an instance of SMSMessageActivityMessageConfig from a dict
sms_message_activity_message_config_from_dict = SMSMessageActivityMessageConfig.from_dict(sms_message_activity_message_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


