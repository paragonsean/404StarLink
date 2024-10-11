# PushNotificationTemplateResponseGCM


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
from openapi_client.models.push_notification_template_response_gcm import PushNotificationTemplateResponseGCM

# TODO update the JSON string below
json = "{}"
# create an instance of PushNotificationTemplateResponseGCM from a JSON string
push_notification_template_response_gcm_instance = PushNotificationTemplateResponseGCM.from_json(json)
# print the JSON string representation of the object
print(PushNotificationTemplateResponseGCM.to_json())

# convert the object into a dict
push_notification_template_response_gcm_dict = push_notification_template_response_gcm_instance.to_dict()
# create an instance of PushNotificationTemplateResponseGCM from a dict
push_notification_template_response_gcm_from_dict = PushNotificationTemplateResponseGCM.from_dict(push_notification_template_response_gcm_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


