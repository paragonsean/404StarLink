# UpdateSmsTemplateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_body** | [**MessageBody**](MessageBody.md) |  | 

## Example

```python
from openapi_client.models.update_sms_template_response import UpdateSmsTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateSmsTemplateResponse from a JSON string
update_sms_template_response_instance = UpdateSmsTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(UpdateSmsTemplateResponse.to_json())

# convert the object into a dict
update_sms_template_response_dict = update_sms_template_response_instance.to_dict()
# create an instance of UpdateSmsTemplateResponse from a dict
update_sms_template_response_from_dict = UpdateSmsTemplateResponse.from_dict(update_sms_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


