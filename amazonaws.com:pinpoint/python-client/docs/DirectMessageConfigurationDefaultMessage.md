# DirectMessageConfigurationDefaultMessage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **str** |  | [optional] 
**substitutions** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.direct_message_configuration_default_message import DirectMessageConfigurationDefaultMessage

# TODO update the JSON string below
json = "{}"
# create an instance of DirectMessageConfigurationDefaultMessage from a JSON string
direct_message_configuration_default_message_instance = DirectMessageConfigurationDefaultMessage.from_json(json)
# print the JSON string representation of the object
print(DirectMessageConfigurationDefaultMessage.to_json())

# convert the object into a dict
direct_message_configuration_default_message_dict = direct_message_configuration_default_message_instance.to_dict()
# create an instance of DirectMessageConfigurationDefaultMessage from a dict
direct_message_configuration_default_message_from_dict = DirectMessageConfigurationDefaultMessage.from_dict(direct_message_configuration_default_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


