# InAppMessageButton

Button Config for an in-app message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**android** | [**InAppMessageButtonAndroid**](InAppMessageButtonAndroid.md) |  | [optional] 
**default_config** | [**InAppMessageButtonDefaultConfig**](InAppMessageButtonDefaultConfig.md) |  | [optional] 
**ios** | [**InAppMessageButtonAndroid**](InAppMessageButtonAndroid.md) |  | [optional] 
**web** | [**InAppMessageButtonAndroid**](InAppMessageButtonAndroid.md) |  | [optional] 

## Example

```python
from openapi_client.models.in_app_message_button import InAppMessageButton

# TODO update the JSON string below
json = "{}"
# create an instance of InAppMessageButton from a JSON string
in_app_message_button_instance = InAppMessageButton.from_json(json)
# print the JSON string representation of the object
print(InAppMessageButton.to_json())

# convert the object into a dict
in_app_message_button_dict = in_app_message_button_instance.to_dict()
# create an instance of InAppMessageButton from a dict
in_app_message_button_from_dict = InAppMessageButton.from_dict(in_app_message_button_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


