# PushNotificationTemplateResponse

Provides information about the content and settings for a message template that can be used in messages that are sent through a push notification channel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adm** | [**PushNotificationTemplateResponseADM**](PushNotificationTemplateResponseADM.md) |  | [optional] 
**apns** | [**PushNotificationTemplateResponseAPNS**](PushNotificationTemplateResponseAPNS.md) |  | [optional] 
**arn** | **str** |  | [optional] 
**baidu** | [**PushNotificationTemplateResponseBaidu**](PushNotificationTemplateResponseBaidu.md) |  | [optional] 
**creation_date** | **str** |  | 
**default** | [**PushNotificationTemplateResponseDefault**](PushNotificationTemplateResponseDefault.md) |  | [optional] 
**default_substitutions** | **str** |  | [optional] 
**gcm** | [**PushNotificationTemplateResponseGCM**](PushNotificationTemplateResponseGCM.md) |  | [optional] 
**last_modified_date** | **str** |  | 
**recommender_id** | **str** |  | [optional] 
**tags** | **Dict** |  | [optional] 
**template_description** | **str** |  | [optional] 
**template_name** | **str** |  | 
**template_type** | [**TemplateType**](TemplateType.md) |  | 
**version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.push_notification_template_response import PushNotificationTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of PushNotificationTemplateResponse from a JSON string
push_notification_template_response_instance = PushNotificationTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(PushNotificationTemplateResponse.to_json())

# convert the object into a dict
push_notification_template_response_dict = push_notification_template_response_instance.to_dict()
# create an instance of PushNotificationTemplateResponse from a dict
push_notification_template_response_from_dict = PushNotificationTemplateResponse.from_dict(push_notification_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


