# UpdateEmailTemplateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_body** | [**MessageBody**](MessageBody.md) |  | 

## Example

```python
from openapi_client.models.update_email_template_response import UpdateEmailTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateEmailTemplateResponse from a JSON string
update_email_template_response_instance = UpdateEmailTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(UpdateEmailTemplateResponse.to_json())

# convert the object into a dict
update_email_template_response_dict = update_email_template_response_instance.to_dict()
# create an instance of UpdateEmailTemplateResponse from a dict
update_email_template_response_from_dict = UpdateEmailTemplateResponse.from_dict(update_email_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


