# EmailMessageSimpleEmail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**html_part** | [**SimpleEmailHtmlPart**](SimpleEmailHtmlPart.md) |  | [optional] 
**subject** | [**SimpleEmailSubject**](SimpleEmailSubject.md) |  | [optional] 
**text_part** | [**SimpleEmailTextPart**](SimpleEmailTextPart.md) |  | [optional] 

## Example

```python
from openapi_client.models.email_message_simple_email import EmailMessageSimpleEmail

# TODO update the JSON string below
json = "{}"
# create an instance of EmailMessageSimpleEmail from a JSON string
email_message_simple_email_instance = EmailMessageSimpleEmail.from_json(json)
# print the JSON string representation of the object
print(EmailMessageSimpleEmail.to_json())

# convert the object into a dict
email_message_simple_email_dict = email_message_simple_email_instance.to_dict()
# create an instance of EmailMessageSimpleEmail from a dict
email_message_simple_email_from_dict = EmailMessageSimpleEmail.from_dict(email_message_simple_email_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


