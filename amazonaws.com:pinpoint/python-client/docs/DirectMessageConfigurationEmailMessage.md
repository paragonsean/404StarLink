# DirectMessageConfigurationEmailMessage


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
from openapi_client.models.direct_message_configuration_email_message import DirectMessageConfigurationEmailMessage

# TODO update the JSON string below
json = "{}"
# create an instance of DirectMessageConfigurationEmailMessage from a JSON string
direct_message_configuration_email_message_instance = DirectMessageConfigurationEmailMessage.from_json(json)
# print the JSON string representation of the object
print(DirectMessageConfigurationEmailMessage.to_json())

# convert the object into a dict
direct_message_configuration_email_message_dict = direct_message_configuration_email_message_instance.to_dict()
# create an instance of DirectMessageConfigurationEmailMessage from a dict
direct_message_configuration_email_message_from_dict = DirectMessageConfigurationEmailMessage.from_dict(direct_message_configuration_email_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


