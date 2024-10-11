# HlsSettings

Settings for HLS output groups

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audio_group_id** | **str** |  | [optional] 
**audio_only_container** | [**HlsAudioOnlyContainer**](HlsAudioOnlyContainer.md) |  | [optional] 
**audio_rendition_sets** | **str** |  | [optional] 
**audio_track_type** | [**HlsAudioTrackType**](HlsAudioTrackType.md) |  | [optional] 
**descriptive_video_service_flag** | [**HlsDescriptiveVideoServiceFlag**](HlsDescriptiveVideoServiceFlag.md) |  | [optional] 
**i_frame_only_manifest** | [**HlsIFrameOnlyManifest**](HlsIFrameOnlyManifest.md) |  | [optional] 
**segment_modifier** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.hls_settings import HlsSettings

# TODO update the JSON string below
json = "{}"
# create an instance of HlsSettings from a JSON string
hls_settings_instance = HlsSettings.from_json(json)
# print the JSON string representation of the object
print(HlsSettings.to_json())

# convert the object into a dict
hls_settings_dict = hls_settings_instance.to_dict()
# create an instance of HlsSettings from a dict
hls_settings_from_dict = HlsSettings.from_dict(hls_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


