# OutputGroupOutputGroupSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cmaf_group_settings** | [**OutputGroupSettingsCmafGroupSettings**](OutputGroupSettingsCmafGroupSettings.md) |  | [optional] 
**dash_iso_group_settings** | [**OutputGroupSettingsDashIsoGroupSettings**](OutputGroupSettingsDashIsoGroupSettings.md) |  | [optional] 
**file_group_settings** | [**OutputGroupSettingsFileGroupSettings**](OutputGroupSettingsFileGroupSettings.md) |  | [optional] 
**hls_group_settings** | [**OutputGroupSettingsHlsGroupSettings**](OutputGroupSettingsHlsGroupSettings.md) |  | [optional] 
**ms_smooth_group_settings** | [**OutputGroupSettingsMsSmoothGroupSettings**](OutputGroupSettingsMsSmoothGroupSettings.md) |  | [optional] 
**type** | [**OutputGroupType**](OutputGroupType.md) |  | [optional] 

## Example

```python
from openapi_client.models.output_group_output_group_settings import OutputGroupOutputGroupSettings

# TODO update the JSON string below
json = "{}"
# create an instance of OutputGroupOutputGroupSettings from a JSON string
output_group_output_group_settings_instance = OutputGroupOutputGroupSettings.from_json(json)
# print the JSON string representation of the object
print(OutputGroupOutputGroupSettings.to_json())

# convert the object into a dict
output_group_output_group_settings_dict = output_group_output_group_settings_instance.to_dict()
# create an instance of OutputGroupOutputGroupSettings from a dict
output_group_output_group_settings_from_dict = OutputGroupOutputGroupSettings.from_dict(output_group_output_group_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


