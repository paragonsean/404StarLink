# PushNotificationTemplateResponseDefault


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
from openapi_client.models.push_notification_template_response_default import PushNotificationTemplateResponseDefault

# TODO update the JSON string below
json = "{}"
# create an instance of PushNotificationTemplateResponseDefault from a JSON string
push_notification_template_response_default_instance = PushNotificationTemplateResponseDefault.from_json(json)
# print the JSON string representation of the object
print(PushNotificationTemplateResponseDefault.to_json())

# convert the object into a dict
push_notification_template_response_default_dict = push_notification_template_response_default_instance.to_dict()
# create an instance of PushNotificationTemplateResponseDefault from a dict
push_notification_template_response_default_from_dict = PushNotificationTemplateResponseDefault.from_dict(push_notification_template_response_default_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


