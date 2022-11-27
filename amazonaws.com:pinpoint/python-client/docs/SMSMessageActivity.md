# SMSMessageActivity

Specifies the settings for an SMS activity in a journey. This type of activity sends a text message to participants.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_config** | [**SMSMessageActivityMessageConfig**](SMSMessageActivityMessageConfig.md) |  | [optional] 
**next_activity** | **str** |  | [optional] 
**template_name** | **str** |  | [optional] 
**template_version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.sms_message_activity import SMSMessageActivity

# TODO update the JSON string below
json = "{}"
# create an instance of SMSMessageActivity from a JSON string
sms_message_activity_instance = SMSMessageActivity.from_json(json)
# print the JSON string representation of the object
print(SMSMessageActivity.to_json())

# convert the object into a dict
sms_message_activity_dict = sms_message_activity_instance.to_dict()
# create an instance of SMSMessageActivity from a dict
sms_message_activity_from_dict = SMSMessageActivity.from_dict(sms_message_activity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


