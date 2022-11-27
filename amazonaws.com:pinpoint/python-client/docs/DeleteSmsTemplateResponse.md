# DeleteSmsTemplateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_body** | [**MessageBody**](MessageBody.md) |  | 

## Example

```python
from openapi_client.models.delete_sms_template_response import DeleteSmsTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteSmsTemplateResponse from a JSON string
delete_sms_template_response_instance = DeleteSmsTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteSmsTemplateResponse.to_json())

# convert the object into a dict
delete_sms_template_response_dict = delete_sms_template_response_instance.to_dict()
# create an instance of DeleteSmsTemplateResponse from a dict
delete_sms_template_response_from_dict = DeleteSmsTemplateResponse.from_dict(delete_sms_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


