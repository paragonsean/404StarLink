# DirectMessageConfigurationDefaultPushNotificationMessage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**Action**](Action.md) |  | [optional] 
**body** | **str** |  | [optional] 
**data** | **Dict** |  | [optional] 
**silent_push** | **bool** |  | [optional] 
**substitutions** | **Dict** |  | [optional] 
**title** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.direct_message_configuration_default_push_notification_message import DirectMessageConfigurationDefaultPushNotificationMessage

# TODO update the JSON string below
json = "{}"
# create an instance of DirectMessageConfigurationDefaultPushNotificationMessage from a JSON string
direct_message_configuration_default_push_notification_message_instance = DirectMessageConfigurationDefaultPushNotificationMessage.from_json(json)
# print the JSON string representation of the object
print(DirectMessageConfigurationDefaultPushNotificationMessage.to_json())

# convert the object into a dict
direct_message_configuration_default_push_notification_message_dict = direct_message_configuration_default_push_notification_message_instance.to_dict()
# create an instance of DirectMessageConfigurationDefaultPushNotificationMessage from a dict
direct_message_configuration_default_push_notification_message_from_dict = DirectMessageConfigurationDefaultPushNotificationMessage.from_dict(direct_message_configuration_default_push_notification_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


