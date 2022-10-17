# MsSmoothGroupSettings

Settings related to your Microsoft Smooth Streaming output package. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/outputs-file-ABR.html. When you work directly in your JSON job specification, include this object and any required children when you set Type, under OutputGroupSettings, to MS_SMOOTH_GROUP_SETTINGS.

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
from openapi_client.models.ms_smooth_group_settings import MsSmoothGroupSettings

# TODO update the JSON string below
json = "{}"
# create an instance of MsSmoothGroupSettings from a JSON string
ms_smooth_group_settings_instance = MsSmoothGroupSettings.from_json(json)
# print the JSON string representation of the object
print(MsSmoothGroupSettings.to_json())

# convert the object into a dict
ms_smooth_group_settings_dict = ms_smooth_group_settings_instance.to_dict()
# create an instance of MsSmoothGroupSettings from a dict
ms_smooth_group_settings_from_dict = MsSmoothGroupSettings.from_dict(ms_smooth_group_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


