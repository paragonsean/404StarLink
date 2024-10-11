# DefaultButtonConfiguration

Default button configuration.

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
from openapi_client.models.default_button_configuration import DefaultButtonConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of DefaultButtonConfiguration from a JSON string
default_button_configuration_instance = DefaultButtonConfiguration.from_json(json)
# print the JSON string representation of the object
print(DefaultButtonConfiguration.to_json())

# convert the object into a dict
default_button_configuration_dict = default_button_configuration_instance.to_dict()
# create an instance of DefaultButtonConfiguration from a dict
default_button_configuration_from_dict = DefaultButtonConfiguration.from_dict(default_button_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


