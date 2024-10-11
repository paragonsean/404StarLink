# OutputGroupSettingsDashIsoGroupSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additional_manifests** | **List** |  | [optional] 
**audio_channel_config_scheme_id_uri** | [**DashIsoGroupAudioChannelConfigSchemeIdUri**](DashIsoGroupAudioChannelConfigSchemeIdUri.md) |  | [optional] 
**base_url** | **str** |  | [optional] 
**dash_manifest_style** | [**DashManifestStyle**](DashManifestStyle.md) |  | [optional] 
**destination** | **str** |  | [optional] 
**destination_settings** | [**CmafGroupSettingsDestinationSettings**](CmafGroupSettingsDestinationSettings.md) |  | [optional] 
**encryption** | [**DashIsoGroupSettingsEncryption**](DashIsoGroupSettingsEncryption.md) |  | [optional] 
**fragment_length** | **int** |  | [optional] 
**hbbtv_compliance** | [**DashIsoHbbtvCompliance**](DashIsoHbbtvCompliance.md) |  | [optional] 
**image_based_trick_play** | [**DashIsoImageBasedTrickPlay**](DashIsoImageBasedTrickPlay.md) |  | [optional] 
**image_based_trick_play_settings** | [**DashIsoGroupSettingsImageBasedTrickPlaySettings**](DashIsoGroupSettingsImageBasedTrickPlaySettings.md) |  | [optional] 
**min_buffer_time** | **int** |  | [optional] 
**min_final_segment_length** | **float** |  | [optional] 
**mpd_manifest_bandwidth_type** | [**DashIsoMpdManifestBandwidthType**](DashIsoMpdManifestBandwidthType.md) |  | [optional] 
**mpd_profile** | [**DashIsoMpdProfile**](DashIsoMpdProfile.md) |  | [optional] 
**pts_offset_handling_for_b_frames** | [**DashIsoPtsOffsetHandlingForBFrames**](DashIsoPtsOffsetHandlingForBFrames.md) |  | [optional] 
**segment_control** | [**DashIsoSegmentControl**](DashIsoSegmentControl.md) |  | [optional] 
**segment_length** | **int** |  | [optional] 
**segment_length_control** | [**DashIsoSegmentLengthControl**](DashIsoSegmentLengthControl.md) |  | [optional] 
**video_composition_offsets** | [**DashIsoVideoCompositionOffsets**](DashIsoVideoCompositionOffsets.md) |  | [optional] 
**write_segment_timeline_in_representation** | [**DashIsoWriteSegmentTimelineInRepresentation**](DashIsoWriteSegmentTimelineInRepresentation.md) |  | [optional] 

## Example

```python
from openapi_client.models.output_group_settings_dash_iso_group_settings import OutputGroupSettingsDashIsoGroupSettings

# TODO update the JSON string below
json = "{}"
# create an instance of OutputGroupSettingsDashIsoGroupSettings from a JSON string
output_group_settings_dash_iso_group_settings_instance = OutputGroupSettingsDashIsoGroupSettings.from_json(json)
# print the JSON string representation of the object
print(OutputGroupSettingsDashIsoGroupSettings.to_json())

# convert the object into a dict
output_group_settings_dash_iso_group_settings_dict = output_group_settings_dash_iso_group_settings_instance.to_dict()
# create an instance of OutputGroupSettingsDashIsoGroupSettings from a dict
output_group_settings_dash_iso_group_settings_from_dict = OutputGroupSettingsDashIsoGroupSettings.from_dict(output_group_settings_dash_iso_group_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


