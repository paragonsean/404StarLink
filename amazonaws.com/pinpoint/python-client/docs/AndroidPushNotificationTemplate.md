# AndroidPushNotificationTemplate

Specifies channel-specific content and settings for a message template that can be used in push notifications that are sent through the ADM (Amazon Device Messaging), Baidu (Baidu Cloud Push), or GCM (Firebase Cloud Messaging, formerly Google Cloud Messaging) channel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**Action**](Action.md) |  | [optional] 
**body** | **str** |  | [optional] 
**image_icon_url** | **str** |  | [optional] 
**image_url** | **str** |  | [optional] 
**raw_content** | **str** |  | [optional] 
**small_image_icon_url** | **str** |  | [optional] 
**sound** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.android_push_notification_template import AndroidPushNotificationTemplate

# TODO update the JSON string below
json = "{}"
# create an instance of AndroidPushNotificationTemplate from a JSON string
android_push_notification_template_instance = AndroidPushNotificationTemplate.from_json(json)
# print the JSON string representation of the object
print(AndroidPushNotificationTemplate.to_json())

# convert the object into a dict
android_push_notification_template_dict = android_push_notification_template_instance.to_dict()
# create an instance of AndroidPushNotificationTemplate from a dict
android_push_notification_template_from_dict = AndroidPushNotificationTemplate.from_dict(android_push_notification_template_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


