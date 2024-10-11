# PresetSettings

Settings for preset

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audio_descriptions** | **List** |  | [optional] 
**caption_descriptions** | **List** |  | [optional] 
**container_settings** | [**CreatePresetRequestSettingsContainerSettings**](CreatePresetRequestSettingsContainerSettings.md) |  | [optional] 
**video_description** | [**CreatePresetRequestSettingsVideoDescription**](CreatePresetRequestSettingsVideoDescription.md) |  | [optional] 

## Example

```python
from openapi_client.models.preset_settings import PresetSettings

# TODO update the JSON string below
json = "{}"
# create an instance of PresetSettings from a JSON string
preset_settings_instance = PresetSettings.from_json(json)
# print the JSON string representation of the object
print(PresetSettings.to_json())

# convert the object into a dict
preset_settings_dict = preset_settings_instance.to_dict()
# create an instance of PresetSettings from a dict
preset_settings_from_dict = PresetSettings.from_dict(preset_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


