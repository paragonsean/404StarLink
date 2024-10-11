# UpdateEmailTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email_template_request** | [**UpdateEmailTemplateRequestEmailTemplateRequest**](UpdateEmailTemplateRequestEmailTemplateRequest.md) |  | 

## Example

```python
from openapi_client.models.update_email_template_request import UpdateEmailTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateEmailTemplateRequest from a JSON string
update_email_template_request_instance = UpdateEmailTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateEmailTemplateRequest.to_json())

# convert the object into a dict
update_email_template_request_dict = update_email_template_request_instance.to_dict()
# create an instance of UpdateEmailTemplateRequest from a dict
update_email_template_request_from_dict = UpdateEmailTemplateRequest.from_dict(update_email_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


