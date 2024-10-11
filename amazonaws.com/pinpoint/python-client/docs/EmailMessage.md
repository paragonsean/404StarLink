# EmailMessage

Specifies the default settings and content for a one-time email message that's sent directly to an endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **str** |  | [optional] 
**feedback_forwarding_address** | **str** |  | [optional] 
**from_address** | **str** |  | [optional] 
**raw_email** | [**EmailMessageRawEmail**](EmailMessageRawEmail.md) |  | [optional] 
**reply_to_addresses** | **List** |  | [optional] 
**simple_email** | [**EmailMessageSimpleEmail**](EmailMessageSimpleEmail.md) |  | [optional] 
**substitutions** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.email_message import EmailMessage

# TODO update the JSON string below
json = "{}"
# create an instance of EmailMessage from a JSON string
email_message_instance = EmailMessage.from_json(json)
# print the JSON string representation of the object
print(EmailMessage.to_json())

# convert the object into a dict
email_message_dict = email_message_instance.to_dict()
# create an instance of EmailMessage from a dict
email_message_from_dict = EmailMessage.from_dict(email_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


