# UpdatePushTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**push_notification_template_request** | [**UpdatePushTemplateRequestPushNotificationTemplateRequest**](UpdatePushTemplateRequestPushNotificationTemplateRequest.md) |  | 

## Example

```python
from openapi_client.models.update_push_template_request import UpdatePushTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePushTemplateRequest from a JSON string
update_push_template_request_instance = UpdatePushTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(UpdatePushTemplateRequest.to_json())

# convert the object into a dict
update_push_template_request_dict = update_push_template_request_instance.to_dict()
# create an instance of UpdatePushTemplateRequest from a dict
update_push_template_request_from_dict = UpdatePushTemplateRequest.from_dict(update_push_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


