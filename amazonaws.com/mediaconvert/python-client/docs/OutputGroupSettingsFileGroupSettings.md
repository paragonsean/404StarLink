# OutputGroupSettingsFileGroupSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination** | **str** |  | [optional] 
**destination_settings** | [**CmafGroupSettingsDestinationSettings**](CmafGroupSettingsDestinationSettings.md) |  | [optional] 

## Example

```python
from openapi_client.models.output_group_settings_file_group_settings import OutputGroupSettingsFileGroupSettings

# TODO update the JSON string below
json = "{}"
# create an instance of OutputGroupSettingsFileGroupSettings from a JSON string
output_group_settings_file_group_settings_instance = OutputGroupSettingsFileGroupSettings.from_json(json)
# print the JSON string representation of the object
print(OutputGroupSettingsFileGroupSettings.to_json())

# convert the object into a dict
output_group_settings_file_group_settings_dict = output_group_settings_file_group_settings_instance.to_dict()
# create an instance of OutputGroupSettingsFileGroupSettings from a dict
output_group_settings_file_group_settings_from_dict = OutputGroupSettingsFileGroupSettings.from_dict(output_group_settings_file_group_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


