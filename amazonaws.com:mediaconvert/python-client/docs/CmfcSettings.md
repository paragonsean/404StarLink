# CmfcSettings

These settings relate to the fragmented MP4 container for the segments in your CMAF outputs.

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
from openapi_client.models.cmfc_settings import CmfcSettings

# TODO update the JSON string below
json = "{}"
# create an instance of CmfcSettings from a JSON string
cmfc_settings_instance = CmfcSettings.from_json(json)
# print the JSON string representation of the object
print(CmfcSettings.to_json())

# convert the object into a dict
cmfc_settings_dict = cmfc_settings_instance.to_dict()
# create an instance of CmfcSettings from a dict
cmfc_settings_from_dict = CmfcSettings.from_dict(cmfc_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


