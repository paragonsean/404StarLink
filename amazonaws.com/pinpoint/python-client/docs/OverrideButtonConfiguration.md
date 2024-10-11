# OverrideButtonConfiguration

Override button configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**button_action** | [**ButtonAction**](ButtonAction.md) |  | 
**link** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.override_button_configuration import OverrideButtonConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of OverrideButtonConfiguration from a JSON string
override_button_configuration_instance = OverrideButtonConfiguration.from_json(json)
# print the JSON string representation of the object
print(OverrideButtonConfiguration.to_json())

# convert the object into a dict
override_button_configuration_dict = override_button_configuration_instance.to_dict()
# create an instance of OverrideButtonConfiguration from a dict
override_button_configuration_from_dict = OverrideButtonConfiguration.from_dict(override_button_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


