# EmailMessageActivity

Specifies the settings for an email activity in a journey. This type of activity sends an email message to participants.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_config** | [**EmailMessageActivityMessageConfig**](EmailMessageActivityMessageConfig.md) |  | [optional] 
**next_activity** | **str** |  | [optional] 
**template_name** | **str** |  | [optional] 
**template_version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.email_message_activity import EmailMessageActivity

# TODO update the JSON string below
json = "{}"
# create an instance of EmailMessageActivity from a JSON string
email_message_activity_instance = EmailMessageActivity.from_json(json)
# print the JSON string representation of the object
print(EmailMessageActivity.to_json())

# convert the object into a dict
email_message_activity_dict = email_message_activity_instance.to_dict()
# create an instance of EmailMessageActivity from a dict
email_message_activity_from_dict = EmailMessageActivity.from_dict(email_message_activity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


