# HlsGroupSettings

Settings related to your HLS output package. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/outputs-file-ABR.html. When you work directly in your JSON job specification, include this object and any required children when you set Type, under OutputGroupSettings, to HLS_GROUP_SETTINGS.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_markers** | **List** |  | [optional] 
**additional_manifests** | **List** |  | [optional] 
**audio_only_header** | [**HlsAudioOnlyHeader**](HlsAudioOnlyHeader.md) |  | [optional] 
**base_url** | **str** |  | [optional] 
**caption_language_mappings** | **List** |  | [optional] 
**caption_language_setting** | [**HlsCaptionLanguageSetting**](HlsCaptionLanguageSetting.md) |  | [optional] 
**caption_segment_length_control** | [**HlsCaptionSegmentLengthControl**](HlsCaptionSegmentLengthControl.md) |  | [optional] 
**client_cache** | [**HlsClientCache**](HlsClientCache.md) |  | [optional] 
**codec_specification** | [**HlsCodecSpecification**](HlsCodecSpecification.md) |  | [optional] 
**destination** | **str** |  | [optional] 
**destination_settings** | [**CmafGroupSettingsDestinationSettings**](CmafGroupSettingsDestinationSettings.md) |  | [optional] 
**directory_structure** | [**HlsDirectoryStructure**](HlsDirectoryStructure.md) |  | [optional] 
**encryption** | [**HlsGroupSettingsEncryption**](HlsGroupSettingsEncryption.md) |  | [optional] 
**image_based_trick_play** | [**HlsImageBasedTrickPlay**](HlsImageBasedTrickPlay.md) |  | [optional] 
**image_based_trick_play_settings** | [**HlsGroupSettingsImageBasedTrickPlaySettings**](HlsGroupSettingsImageBasedTrickPlaySettings.md) |  | [optional] 
**manifest_compression** | [**HlsManifestCompression**](HlsManifestCompression.md) |  | [optional] 
**manifest_duration_format** | [**HlsManifestDurationFormat**](HlsManifestDurationFormat.md) |  | [optional] 
**min_final_segment_length** | **float** |  | [optional] 
**min_segment_length** | **int** |  | [optional] 
**output_selection** | [**HlsOutputSelection**](HlsOutputSelection.md) |  | [optional] 
**program_date_time** | [**HlsProgramDateTime**](HlsProgramDateTime.md) |  | [optional] 
**program_date_time_period** | **int** |  | [optional] 
**segment_control** | [**HlsSegmentControl**](HlsSegmentControl.md) |  | [optional] 
**segment_length** | **int** |  | [optional] 
**segment_length_control** | [**HlsSegmentLengthControl**](HlsSegmentLengthControl.md) |  | [optional] 
**segments_per_subdirectory** | **int** |  | [optional] 
**stream_inf_resolution** | [**HlsStreamInfResolution**](HlsStreamInfResolution.md) |  | [optional] 
**target_duration_compatibility_mode** | [**HlsTargetDurationCompatibilityMode**](HlsTargetDurationCompatibilityMode.md) |  | [optional] 
**timed_metadata_id3_frame** | [**HlsTimedMetadataId3Frame**](HlsTimedMetadataId3Frame.md) |  | [optional] 
**timed_metadata_id3_period** | **int** |  | [optional] 
**timestamp_delta_milliseconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.hls_group_settings import HlsGroupSettings

# TODO update the JSON string below
json = "{}"
# create an instance of HlsGroupSettings from a JSON string
hls_group_settings_instance = HlsGroupSettings.from_json(json)
# print the JSON string representation of the object
print(HlsGroupSettings.to_json())

# convert the object into a dict
hls_group_settings_dict = hls_group_settings_instance.to_dict()
# create an instance of HlsGroupSettings from a dict
hls_group_settings_from_dict = HlsGroupSettings.from_dict(hls_group_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


