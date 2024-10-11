# CreatePresetRequestSettingsContainerSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cmfc_settings** | [**ContainerSettingsCmfcSettings**](ContainerSettingsCmfcSettings.md) |  | [optional] 
**container** | [**ContainerType**](ContainerType.md) |  | [optional] 
**f4v_settings** | [**ContainerSettingsF4vSettings**](ContainerSettingsF4vSettings.md) |  | [optional] 
**m2ts_settings** | [**ContainerSettingsM2tsSettings**](ContainerSettingsM2tsSettings.md) |  | [optional] 
**m3u8_settings** | [**ContainerSettingsM3u8Settings**](ContainerSettingsM3u8Settings.md) |  | [optional] 
**mov_settings** | [**ContainerSettingsMovSettings**](ContainerSettingsMovSettings.md) |  | [optional] 
**mp4_settings** | [**ContainerSettingsMp4Settings**](ContainerSettingsMp4Settings.md) |  | [optional] 
**mpd_settings** | [**ContainerSettingsMpdSettings**](ContainerSettingsMpdSettings.md) |  | [optional] 
**mxf_settings** | [**ContainerSettingsMxfSettings**](ContainerSettingsMxfSettings.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_preset_request_settings_container_settings import CreatePresetRequestSettingsContainerSettings

# TODO update the JSON string below
json = "{}"
# create an instance of CreatePresetRequestSettingsContainerSettings from a JSON string
create_preset_request_settings_container_settings_instance = CreatePresetRequestSettingsContainerSettings.from_json(json)
# print the JSON string representation of the object
print(CreatePresetRequestSettingsContainerSettings.to_json())

# convert the object into a dict
create_preset_request_settings_container_settings_dict = create_preset_request_settings_container_settings_instance.to_dict()
# create an instance of CreatePresetRequestSettingsContainerSettings from a dict
create_preset_request_settings_container_settings_from_dict = CreatePresetRequestSettingsContainerSettings.from_dict(create_preset_request_settings_container_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


