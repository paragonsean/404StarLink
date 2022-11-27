# UpdatePushTemplateRequestPushNotificationTemplateRequestGCM


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
from openapi_client.models.update_push_template_request_push_notification_template_request_gcm import UpdatePushTemplateRequestPushNotificationTemplateRequestGCM

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePushTemplateRequestPushNotificationTemplateRequestGCM from a JSON string
update_push_template_request_push_notification_template_request_gcm_instance = UpdatePushTemplateRequestPushNotificationTemplateRequestGCM.from_json(json)
# print the JSON string representation of the object
print(UpdatePushTemplateRequestPushNotificationTemplateRequestGCM.to_json())

# convert the object into a dict
update_push_template_request_push_notification_template_request_gcm_dict = update_push_template_request_push_notification_template_request_gcm_instance.to_dict()
# create an instance of UpdatePushTemplateRequestPushNotificationTemplateRequestGCM from a dict
update_push_template_request_push_notification_template_request_gcm_from_dict = UpdatePushTemplateRequestPushNotificationTemplateRequestGCM.from_dict(update_push_template_request_push_notification_template_request_gcm_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


