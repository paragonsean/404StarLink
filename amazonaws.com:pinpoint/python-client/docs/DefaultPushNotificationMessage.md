# DefaultPushNotificationMessage

Specifies the default settings and content for a push notification that's sent directly to an endpoint.

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
from openapi_client.models.default_push_notification_message import DefaultPushNotificationMessage

# TODO update the JSON string below
json = "{}"
# create an instance of DefaultPushNotificationMessage from a JSON string
default_push_notification_message_instance = DefaultPushNotificationMessage.from_json(json)
# print the JSON string representation of the object
print(DefaultPushNotificationMessage.to_json())

# convert the object into a dict
default_push_notification_message_dict = default_push_notification_message_instance.to_dict()
# create an instance of DefaultPushNotificationMessage from a dict
default_push_notification_message_from_dict = DefaultPushNotificationMessage.from_dict(default_push_notification_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


