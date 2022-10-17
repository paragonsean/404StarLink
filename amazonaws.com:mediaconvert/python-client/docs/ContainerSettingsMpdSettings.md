# ContainerSettingsMpdSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessibility_caption_hints** | [**MpdAccessibilityCaptionHints**](MpdAccessibilityCaptionHints.md) |  | [optional] 
**audio_duration** | [**MpdAudioDuration**](MpdAudioDuration.md) |  | [optional] 
**caption_container_type** | [**MpdCaptionContainerType**](MpdCaptionContainerType.md) |  | [optional] 
**klv_metadata** | [**MpdKlvMetadata**](MpdKlvMetadata.md) |  | [optional] 
**manifest_metadata_signaling** | [**MpdManifestMetadataSignaling**](MpdManifestMetadataSignaling.md) |  | [optional] 
**scte35_esam** | [**MpdScte35Esam**](MpdScte35Esam.md) |  | [optional] 
**scte35_source** | [**MpdScte35Source**](MpdScte35Source.md) |  | [optional] 
**timed_metadata** | [**MpdTimedMetadata**](MpdTimedMetadata.md) |  | [optional] 
**timed_metadata_box_version** | [**MpdTimedMetadataBoxVersion**](MpdTimedMetadataBoxVersion.md) |  | [optional] 
**timed_metadata_scheme_id_uri** | **str** |  | [optional] 
**timed_metadata_value** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.container_settings_mpd_settings import ContainerSettingsMpdSettings

# TODO update the JSON string below
json = "{}"
# create an instance of ContainerSettingsMpdSettings from a JSON string
container_settings_mpd_settings_instance = ContainerSettingsMpdSettings.from_json(json)
# print the JSON string representation of the object
print(ContainerSettingsMpdSettings.to_json())

# convert the object into a dict
container_settings_mpd_settings_dict = container_settings_mpd_settings_instance.to_dict()
# create an instance of ContainerSettingsMpdSettings from a dict
container_settings_mpd_settings_from_dict = ContainerSettingsMpdSettings.from_dict(container_settings_mpd_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


