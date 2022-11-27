# PushNotificationTemplateResponseBaidu


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
from openapi_client.models.push_notification_template_response_baidu import PushNotificationTemplateResponseBaidu

# TODO update the JSON string below
json = "{}"
# create an instance of PushNotificationTemplateResponseBaidu from a JSON string
push_notification_template_response_baidu_instance = PushNotificationTemplateResponseBaidu.from_json(json)
# print the JSON string representation of the object
print(PushNotificationTemplateResponseBaidu.to_json())

# convert the object into a dict
push_notification_template_response_baidu_dict = push_notification_template_response_baidu_instance.to_dict()
# create an instance of PushNotificationTemplateResponseBaidu from a dict
push_notification_template_response_baidu_from_dict = PushNotificationTemplateResponseBaidu.from_dict(push_notification_template_response_baidu_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


