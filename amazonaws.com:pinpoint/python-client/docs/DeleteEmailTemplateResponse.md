# DeleteEmailTemplateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_body** | [**MessageBody**](MessageBody.md) |  | 

## Example

```python
from openapi_client.models.delete_email_template_response import DeleteEmailTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteEmailTemplateResponse from a JSON string
delete_email_template_response_instance = DeleteEmailTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteEmailTemplateResponse.to_json())

# convert the object into a dict
delete_email_template_response_dict = delete_email_template_response_instance.to_dict()
# create an instance of DeleteEmailTemplateResponse from a dict
delete_email_template_response_from_dict = DeleteEmailTemplateResponse.from_dict(delete_email_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


