# CreatePushTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**push_notification_template_request** | [**PushNotificationTemplateRequest**](PushNotificationTemplateRequest.md) |  | 

## Example

```python
from openapi_client.models.create_push_template_request import CreatePushTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreatePushTemplateRequest from a JSON string
create_push_template_request_instance = CreatePushTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(CreatePushTemplateRequest.to_json())

# convert the object into a dict
create_push_template_request_dict = create_push_template_request_instance.to_dict()
# create an instance of CreatePushTemplateRequest from a dict
create_push_template_request_from_dict = CreatePushTemplateRequest.from_dict(create_push_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


