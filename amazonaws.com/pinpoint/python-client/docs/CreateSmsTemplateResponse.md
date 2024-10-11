# CreateSmsTemplateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create_template_message_body** | [**CreateTemplateMessageBody**](CreateTemplateMessageBody.md) |  | 

## Example

```python
from openapi_client.models.create_sms_template_response import CreateSmsTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateSmsTemplateResponse from a JSON string
create_sms_template_response_instance = CreateSmsTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(CreateSmsTemplateResponse.to_json())

# convert the object into a dict
create_sms_template_response_dict = create_sms_template_response_instance.to_dict()
# create an instance of CreateSmsTemplateResponse from a dict
create_sms_template_response_from_dict = CreateSmsTemplateResponse.from_dict(create_sms_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


