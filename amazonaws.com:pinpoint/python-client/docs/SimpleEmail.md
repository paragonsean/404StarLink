# SimpleEmail

Specifies the contents of an email message, composed of a subject, a text part, and an HTML part.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**html_part** | [**SimpleEmailHtmlPart**](SimpleEmailHtmlPart.md) |  | [optional] 
**subject** | [**SimpleEmailSubject**](SimpleEmailSubject.md) |  | [optional] 
**text_part** | [**SimpleEmailTextPart**](SimpleEmailTextPart.md) |  | [optional] 

## Example

```python
from openapi_client.models.simple_email import SimpleEmail

# TODO update the JSON string below
json = "{}"
# create an instance of SimpleEmail from a JSON string
simple_email_instance = SimpleEmail.from_json(json)
# print the JSON string representation of the object
print(SimpleEmail.to_json())

# convert the object into a dict
simple_email_dict = simple_email_instance.to_dict()
# create an instance of SimpleEmail from a dict
simple_email_from_dict = SimpleEmail.from_dict(simple_email_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


