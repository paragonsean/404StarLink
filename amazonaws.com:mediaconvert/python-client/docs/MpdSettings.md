# MpdSettings

These settings relate to the fragmented MP4 container for the segments in your DASH outputs.

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
from openapi_client.models.mpd_settings import MpdSettings

# TODO update the JSON string below
json = "{}"
# create an instance of MpdSettings from a JSON string
mpd_settings_instance = MpdSettings.from_json(json)
# print the JSON string representation of the object
print(MpdSettings.to_json())

# convert the object into a dict
mpd_settings_dict = mpd_settings_instance.to_dict()
# create an instance of MpdSettings from a dict
mpd_settings_from_dict = MpdSettings.from_dict(mpd_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


