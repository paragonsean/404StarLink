# InAppMessageButtonDefaultConfig


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**background_color** | **str** |  | [optional] 
**border_radius** | **int** |  | [optional] 
**button_action** | [**ButtonAction**](ButtonAction.md) |  | 
**link** | **str** |  | [optional] 
**text** | **str** |  | 
**text_color** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.in_app_message_button_default_config import InAppMessageButtonDefaultConfig

# TODO update the JSON string below
json = "{}"
# create an instance of InAppMessageButtonDefaultConfig from a JSON string
in_app_message_button_default_config_instance = InAppMessageButtonDefaultConfig.from_json(json)
# print the JSON string representation of the object
print(InAppMessageButtonDefaultConfig.to_json())

# convert the object into a dict
in_app_message_button_default_config_dict = in_app_message_button_default_config_instance.to_dict()
# create an instance of InAppMessageButtonDefaultConfig from a dict
in_app_message_button_default_config_from_dict = InAppMessageButtonDefaultConfig.from_dict(in_app_message_button_default_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


