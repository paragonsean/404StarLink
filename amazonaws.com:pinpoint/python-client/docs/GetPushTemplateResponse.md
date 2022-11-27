# GetPushTemplateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**push_notification_template_response** | [**PushNotificationTemplateResponse**](PushNotificationTemplateResponse.md) |  | 

## Example

```python
from openapi_client.models.get_push_template_response import GetPushTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetPushTemplateResponse from a JSON string
get_push_template_response_instance = GetPushTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(GetPushTemplateResponse.to_json())

# convert the object into a dict
get_push_template_response_dict = get_push_template_response_instance.to_dict()
# create an instance of GetPushTemplateResponse from a dict
get_push_template_response_from_dict = GetPushTemplateResponse.from_dict(get_push_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


