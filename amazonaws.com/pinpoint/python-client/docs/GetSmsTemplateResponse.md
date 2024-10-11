# GetSmsTemplateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sms_template_response** | [**SMSTemplateResponse**](SMSTemplateResponse.md) |  | 

## Example

```python
from openapi_client.models.get_sms_template_response import GetSmsTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetSmsTemplateResponse from a JSON string
get_sms_template_response_instance = GetSmsTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(GetSmsTemplateResponse.to_json())

# convert the object into a dict
get_sms_template_response_dict = get_sms_template_response_instance.to_dict()
# create an instance of GetSmsTemplateResponse from a dict
get_sms_template_response_from_dict = GetSmsTemplateResponse.from_dict(get_sms_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


