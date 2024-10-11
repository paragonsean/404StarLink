# PushNotificationTemplateRequest

Specifies the content and settings for a message template that can be used in messages that are sent through a push notification channel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adm** | [**UpdatePushTemplateRequestPushNotificationTemplateRequestADM**](UpdatePushTemplateRequestPushNotificationTemplateRequestADM.md) |  | [optional] 
**apns** | [**UpdatePushTemplateRequestPushNotificationTemplateRequestAPNS**](UpdatePushTemplateRequestPushNotificationTemplateRequestAPNS.md) |  | [optional] 
**baidu** | [**UpdatePushTemplateRequestPushNotificationTemplateRequestBaidu**](UpdatePushTemplateRequestPushNotificationTemplateRequestBaidu.md) |  | [optional] 
**default** | [**UpdatePushTemplateRequestPushNotificationTemplateRequestDefault**](UpdatePushTemplateRequestPushNotificationTemplateRequestDefault.md) |  | [optional] 
**default_substitutions** | **str** |  | [optional] 
**gcm** | [**UpdatePushTemplateRequestPushNotificationTemplateRequestGCM**](UpdatePushTemplateRequestPushNotificationTemplateRequestGCM.md) |  | [optional] 
**recommender_id** | **str** |  | [optional] 
**tags** | **Dict** |  | [optional] 
**template_description** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.push_notification_template_request import PushNotificationTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PushNotificationTemplateRequest from a JSON string
push_notification_template_request_instance = PushNotificationTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(PushNotificationTemplateRequest.to_json())

# convert the object into a dict
push_notification_template_request_dict = push_notification_template_request_instance.to_dict()
# create an instance of PushNotificationTemplateRequest from a dict
push_notification_template_request_from_dict = PushNotificationTemplateRequest.from_dict(push_notification_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


