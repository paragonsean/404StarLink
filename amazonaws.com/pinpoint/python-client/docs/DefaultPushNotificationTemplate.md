# DefaultPushNotificationTemplate

Specifies the default settings and content for a message template that can be used in messages that are sent through a push notification channel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**Action**](Action.md) |  | [optional] 
**body** | **str** |  | [optional] 
**sound** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.default_push_notification_template import DefaultPushNotificationTemplate

# TODO update the JSON string below
json = "{}"
# create an instance of DefaultPushNotificationTemplate from a JSON string
default_push_notification_template_instance = DefaultPushNotificationTemplate.from_json(json)
# print the JSON string representation of the object
print(DefaultPushNotificationTemplate.to_json())

# convert the object into a dict
default_push_notification_template_dict = default_push_notification_template_instance.to_dict()
# create an instance of DefaultPushNotificationTemplate from a dict
default_push_notification_template_from_dict = DefaultPushNotificationTemplate.from_dict(default_push_notification_template_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


