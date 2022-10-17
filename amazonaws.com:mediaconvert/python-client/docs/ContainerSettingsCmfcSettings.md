# ContainerSettingsCmfcSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audio_duration** | [**CmfcAudioDuration**](CmfcAudioDuration.md) |  | [optional] 
**audio_group_id** | **str** |  | [optional] 
**audio_rendition_sets** | **str** |  | [optional] 
**audio_track_type** | [**CmfcAudioTrackType**](CmfcAudioTrackType.md) |  | [optional] 
**descriptive_video_service_flag** | [**CmfcDescriptiveVideoServiceFlag**](CmfcDescriptiveVideoServiceFlag.md) |  | [optional] 
**i_frame_only_manifest** | [**CmfcIFrameOnlyManifest**](CmfcIFrameOnlyManifest.md) |  | [optional] 
**klv_metadata** | [**CmfcKlvMetadata**](CmfcKlvMetadata.md) |  | [optional] 
**manifest_metadata_signaling** | [**CmfcManifestMetadataSignaling**](CmfcManifestMetadataSignaling.md) |  | [optional] 
**scte35_esam** | [**CmfcScte35Esam**](CmfcScte35Esam.md) |  | [optional] 
**scte35_source** | [**CmfcScte35Source**](CmfcScte35Source.md) |  | [optional] 
**timed_metadata** | [**CmfcTimedMetadata**](CmfcTimedMetadata.md) |  | [optional] 
**timed_metadata_box_version** | [**CmfcTimedMetadataBoxVersion**](CmfcTimedMetadataBoxVersion.md) |  | [optional] 
**timed_metadata_scheme_id_uri** | **str** |  | [optional] 
**timed_metadata_value** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.container_settings_cmfc_settings import ContainerSettingsCmfcSettings

# TODO update the JSON string below
json = "{}"
# create an instance of ContainerSettingsCmfcSettings from a JSON string
container_settings_cmfc_settings_instance = ContainerSettingsCmfcSettings.from_json(json)
# print the JSON string representation of the object
print(ContainerSettingsCmfcSettings.to_json())

# convert the object into a dict
container_settings_cmfc_settings_dict = container_settings_cmfc_settings_instance.to_dict()
# create an instance of ContainerSettingsCmfcSettings from a dict
container_settings_cmfc_settings_from_dict = ContainerSettingsCmfcSettings.from_dict(container_settings_cmfc_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


