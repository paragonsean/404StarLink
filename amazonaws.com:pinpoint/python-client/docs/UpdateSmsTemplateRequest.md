# UpdateSmsTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sms_template_request** | [**UpdateSmsTemplateRequestSMSTemplateRequest**](UpdateSmsTemplateRequestSMSTemplateRequest.md) |  | 

## Example

```python
from openapi_client.models.update_sms_template_request import UpdateSmsTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateSmsTemplateRequest from a JSON string
update_sms_template_request_instance = UpdateSmsTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateSmsTemplateRequest.to_json())

# convert the object into a dict
update_sms_template_request_dict = update_sms_template_request_instance.to_dict()
# create an instance of UpdateSmsTemplateRequest from a dict
update_sms_template_request_from_dict = UpdateSmsTemplateRequest.from_dict(update_sms_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


