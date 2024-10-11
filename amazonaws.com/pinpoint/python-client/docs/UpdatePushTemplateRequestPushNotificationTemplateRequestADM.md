# UpdatePushTemplateRequestPushNotificationTemplateRequestADM


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
from openapi_client.models.update_push_template_request_push_notification_template_request_adm import UpdatePushTemplateRequestPushNotificationTemplateRequestADM

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePushTemplateRequestPushNotificationTemplateRequestADM from a JSON string
update_push_template_request_push_notification_template_request_adm_instance = UpdatePushTemplateRequestPushNotificationTemplateRequestADM.from_json(json)
# print the JSON string representation of the object
print(UpdatePushTemplateRequestPushNotificationTemplateRequestADM.to_json())

# convert the object into a dict
update_push_template_request_push_notification_template_request_adm_dict = update_push_template_request_push_notification_template_request_adm_instance.to_dict()
# create an instance of UpdatePushTemplateRequestPushNotificationTemplateRequestADM from a dict
update_push_template_request_push_notification_template_request_adm_from_dict = UpdatePushTemplateRequestPushNotificationTemplateRequestADM.from_dict(update_push_template_request_push_notification_template_request_adm_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


