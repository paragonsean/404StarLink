# CreateEmailTemplateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create_template_message_body** | [**CreateTemplateMessageBody**](CreateTemplateMessageBody.md) |  | 

## Example

```python
from openapi_client.models.create_email_template_response import CreateEmailTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateEmailTemplateResponse from a JSON string
create_email_template_response_instance = CreateEmailTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(CreateEmailTemplateResponse.to_json())

# convert the object into a dict
create_email_template_response_dict = create_email_template_response_instance.to_dict()
# create an instance of CreateEmailTemplateResponse from a dict
create_email_template_response_from_dict = CreateEmailTemplateResponse.from_dict(create_email_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


