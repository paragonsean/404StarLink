# UpdatePushTemplateRequestPushNotificationTemplateRequestDefault


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
from openapi_client.models.update_push_template_request_push_notification_template_request_default import UpdatePushTemplateRequestPushNotificationTemplateRequestDefault

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePushTemplateRequestPushNotificationTemplateRequestDefault from a JSON string
update_push_template_request_push_notification_template_request_default_instance = UpdatePushTemplateRequestPushNotificationTemplateRequestDefault.from_json(json)
# print the JSON string representation of the object
print(UpdatePushTemplateRequestPushNotificationTemplateRequestDefault.to_json())

# convert the object into a dict
update_push_template_request_push_notification_template_request_default_dict = update_push_template_request_push_notification_template_request_default_instance.to_dict()
# create an instance of UpdatePushTemplateRequestPushNotificationTemplateRequestDefault from a dict
update_push_template_request_push_notification_template_request_default_from_dict = UpdatePushTemplateRequestPushNotificationTemplateRequestDefault.from_dict(update_push_template_request_push_notification_template_request_default_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


