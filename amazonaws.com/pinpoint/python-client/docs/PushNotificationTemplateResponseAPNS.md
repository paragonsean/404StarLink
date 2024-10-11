# PushNotificationTemplateResponseAPNS


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
from openapi_client.models.push_notification_template_response_apns import PushNotificationTemplateResponseAPNS

# TODO update the JSON string below
json = "{}"
# create an instance of PushNotificationTemplateResponseAPNS from a JSON string
push_notification_template_response_apns_instance = PushNotificationTemplateResponseAPNS.from_json(json)
# print the JSON string representation of the object
print(PushNotificationTemplateResponseAPNS.to_json())

# convert the object into a dict
push_notification_template_response_apns_dict = push_notification_template_response_apns_instance.to_dict()
# create an instance of PushNotificationTemplateResponseAPNS from a dict
push_notification_template_response_apns_from_dict = PushNotificationTemplateResponseAPNS.from_dict(push_notification_template_response_apns_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


