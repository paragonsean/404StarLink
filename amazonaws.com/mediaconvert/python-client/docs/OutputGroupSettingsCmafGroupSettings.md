# OutputGroupSettingsCmafGroupSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additional_manifests** | **List** |  | [optional] 
**base_url** | **str** |  | [optional] 
**client_cache** | [**CmafClientCache**](CmafClientCache.md) |  | [optional] 
**codec_specification** | [**CmafCodecSpecification**](CmafCodecSpecification.md) |  | [optional] 
**dash_manifest_style** | [**DashManifestStyle**](DashManifestStyle.md) |  | [optional] 
**destination** | **str** |  | [optional] 
**destination_settings** | [**CmafGroupSettingsDestinationSettings**](CmafGroupSettingsDestinationSettings.md) |  | [optional] 
**encryption** | [**CmafGroupSettingsEncryption**](CmafGroupSettingsEncryption.md) |  | [optional] 
**fragment_length** | **int** |  | [optional] 
**image_based_trick_play** | [**CmafImageBasedTrickPlay**](CmafImageBasedTrickPlay.md) |  | [optional] 
**image_based_trick_play_settings** | [**CmafGroupSettingsImageBasedTrickPlaySettings**](CmafGroupSettingsImageBasedTrickPlaySettings.md) |  | [optional] 
**manifest_compression** | [**CmafManifestCompression**](CmafManifestCompression.md) |  | [optional] 
**manifest_duration_format** | [**CmafManifestDurationFormat**](CmafManifestDurationFormat.md) |  | [optional] 
**min_buffer_time** | **int** |  | [optional] 
**min_final_segment_length** | **float** |  | [optional] 
**mpd_manifest_bandwidth_type** | [**CmafMpdManifestBandwidthType**](CmafMpdManifestBandwidthType.md) |  | [optional] 
**mpd_profile** | [**CmafMpdProfile**](CmafMpdProfile.md) |  | [optional] 
**pts_offset_handling_for_b_frames** | [**CmafPtsOffsetHandlingForBFrames**](CmafPtsOffsetHandlingForBFrames.md) |  | [optional] 
**segment_control** | [**CmafSegmentControl**](CmafSegmentControl.md) |  | [optional] 
**segment_length** | **int** |  | [optional] 
**segment_length_control** | [**CmafSegmentLengthControl**](CmafSegmentLengthControl.md) |  | [optional] 
**stream_inf_resolution** | [**CmafStreamInfResolution**](CmafStreamInfResolution.md) |  | [optional] 
**target_duration_compatibility_mode** | [**CmafTargetDurationCompatibilityMode**](CmafTargetDurationCompatibilityMode.md) |  | [optional] 
**video_composition_offsets** | [**CmafVideoCompositionOffsets**](CmafVideoCompositionOffsets.md) |  | [optional] 
**write_dash_manifest** | [**CmafWriteDASHManifest**](CmafWriteDASHManifest.md) |  | [optional] 
**write_hls_manifest** | [**CmafWriteHLSManifest**](CmafWriteHLSManifest.md) |  | [optional] 
**write_segment_timeline_in_representation** | [**CmafWriteSegmentTimelineInRepresentation**](CmafWriteSegmentTimelineInRepresentation.md) |  | [optional] 

## Example

```python
from openapi_client.models.output_group_settings_cmaf_group_settings import OutputGroupSettingsCmafGroupSettings

# TODO update the JSON string below
json = "{}"
# create an instance of OutputGroupSettingsCmafGroupSettings from a JSON string
output_group_settings_cmaf_group_settings_instance = OutputGroupSettingsCmafGroupSettings.from_json(json)
# print the JSON string representation of the object
print(OutputGroupSettingsCmafGroupSettings.to_json())

# convert the object into a dict
output_group_settings_cmaf_group_settings_dict = output_group_settings_cmaf_group_settings_instance.to_dict()
# create an instance of OutputGroupSettingsCmafGroupSettings from a dict
output_group_settings_cmaf_group_settings_from_dict = OutputGroupSettingsCmafGroupSettings.from_dict(output_group_settings_cmaf_group_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


