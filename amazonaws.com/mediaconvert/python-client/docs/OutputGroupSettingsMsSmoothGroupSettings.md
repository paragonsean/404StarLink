# OutputGroupSettingsMsSmoothGroupSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additional_manifests** | **List** |  | [optional] 
**audio_deduplication** | [**MsSmoothAudioDeduplication**](MsSmoothAudioDeduplication.md) |  | [optional] 
**destination** | **str** |  | [optional] 
**destination_settings** | [**CmafGroupSettingsDestinationSettings**](CmafGroupSettingsDestinationSettings.md) |  | [optional] 
**encryption** | [**MsSmoothGroupSettingsEncryption**](MsSmoothGroupSettingsEncryption.md) |  | [optional] 
**fragment_length** | **int** |  | [optional] 
**fragment_length_control** | [**MsSmoothFragmentLengthControl**](MsSmoothFragmentLengthControl.md) |  | [optional] 
**manifest_encoding** | [**MsSmoothManifestEncoding**](MsSmoothManifestEncoding.md) |  | [optional] 

## Example

```python
from openapi_client.models.output_group_settings_ms_smooth_group_settings import OutputGroupSettingsMsSmoothGroupSettings

# TODO update the JSON string below
json = "{}"
# create an instance of OutputGroupSettingsMsSmoothGroupSettings from a JSON string
output_group_settings_ms_smooth_group_settings_instance = OutputGroupSettingsMsSmoothGroupSettings.from_json(json)
# print the JSON string representation of the object
print(OutputGroupSettingsMsSmoothGroupSettings.to_json())

# convert the object into a dict
output_group_settings_ms_smooth_group_settings_dict = output_group_settings_ms_smooth_group_settings_instance.to_dict()
# create an instance of OutputGroupSettingsMsSmoothGroupSettings from a dict
output_group_settings_ms_smooth_group_settings_from_dict = OutputGroupSettingsMsSmoothGroupSettings.from_dict(output_group_settings_ms_smooth_group_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


