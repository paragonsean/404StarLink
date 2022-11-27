# APNSPushNotificationTemplate

Specifies channel-specific content and settings for a message template that can be used in push notifications that are sent through the APNs (Apple Push Notification service) channel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**Action**](Action.md) |  | [optional] 
**body** | **str** |  | [optional] 
**media_url** | **str** |  | [optional] 
**raw_content** | **str** |  | [optional] 
**sound** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.apns_push_notification_template import APNSPushNotificationTemplate

# TODO update the JSON string below
json = "{}"
# create an instance of APNSPushNotificationTemplate from a JSON string
apns_push_notification_template_instance = APNSPushNotificationTemplate.from_json(json)
# print the JSON string representation of the object
print(APNSPushNotificationTemplate.to_json())

# convert the object into a dict
apns_push_notification_template_dict = apns_push_notification_template_instance.to_dict()
# create an instance of APNSPushNotificationTemplate from a dict
apns_push_notification_template_from_dict = APNSPushNotificationTemplate.from_dict(apns_push_notification_template_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


