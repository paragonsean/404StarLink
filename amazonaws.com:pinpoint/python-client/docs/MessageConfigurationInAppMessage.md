# MessageConfigurationInAppMessage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **str** |  | [optional] 
**content** | **List** |  | [optional] 
**custom_config** | **Dict** |  | [optional] 
**layout** | [**Layout**](Layout.md) |  | [optional] 

## Example

```python
from openapi_client.models.message_configuration_in_app_message import MessageConfigurationInAppMessage

# TODO update the JSON string below
json = "{}"
# create an instance of MessageConfigurationInAppMessage from a JSON string
message_configuration_in_app_message_instance = MessageConfigurationInAppMessage.from_json(json)
# print the JSON string representation of the object
print(MessageConfigurationInAppMessage.to_json())

# convert the object into a dict
message_configuration_in_app_message_dict = message_configuration_in_app_message_instance.to_dict()
# create an instance of MessageConfigurationInAppMessage from a dict
message_configuration_in_app_message_from_dict = MessageConfigurationInAppMessage.from_dict(message_configuration_in_app_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


