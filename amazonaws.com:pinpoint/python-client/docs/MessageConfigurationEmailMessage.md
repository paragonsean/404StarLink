# MessageConfigurationEmailMessage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **str** |  | [optional] 
**from_address** | **str** |  | [optional] 
**html_body** | **str** |  | [optional] 
**title** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.message_configuration_email_message import MessageConfigurationEmailMessage

# TODO update the JSON string below
json = "{}"
# create an instance of MessageConfigurationEmailMessage from a JSON string
message_configuration_email_message_instance = MessageConfigurationEmailMessage.from_json(json)
# print the JSON string representation of the object
print(MessageConfigurationEmailMessage.to_json())

# convert the object into a dict
message_configuration_email_message_dict = message_configuration_email_message_instance.to_dict()
# create an instance of MessageConfigurationEmailMessage from a dict
message_configuration_email_message_from_dict = MessageConfigurationEmailMessage.from_dict(message_configuration_email_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


