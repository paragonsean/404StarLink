# CreatePresetRequestSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audio_descriptions** | **List** |  | [optional] 
**caption_descriptions** | **List** |  | [optional] 
**container_settings** | [**CreatePresetRequestSettingsContainerSettings**](CreatePresetRequestSettingsContainerSettings.md) |  | [optional] 
**video_description** | [**CreatePresetRequestSettingsVideoDescription**](CreatePresetRequestSettingsVideoDescription.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_preset_request_settings import CreatePresetRequestSettings

# TODO update the JSON string below
json = "{}"
# create an instance of CreatePresetRequestSettings from a JSON string
create_preset_request_settings_instance = CreatePresetRequestSettings.from_json(json)
# print the JSON string representation of the object
print(CreatePresetRequestSettings.to_json())

# convert the object into a dict
create_preset_request_settings_dict = create_preset_request_settings_instance.to_dict()
# create an instance of CreatePresetRequestSettings from a dict
create_preset_request_settings_from_dict = CreatePresetRequestSettings.from_dict(create_preset_request_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


