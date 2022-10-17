# CaptionSourceSettings

If your input captions are SCC, TTML, STL, SMI, SRT, or IMSC in an xml file, specify the URI of the input captions source file. If your input captions are IMSC in an IMF package, use TrackSourceSettings instead of FileSoureSettings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ancillary_source_settings** | [**CaptionSourceSettingsAncillarySourceSettings**](CaptionSourceSettingsAncillarySourceSettings.md) |  | [optional] 
**dvb_sub_source_settings** | [**CaptionSourceSettingsDvbSubSourceSettings**](CaptionSourceSettingsDvbSubSourceSettings.md) |  | [optional] 
**embedded_source_settings** | [**CaptionSourceSettingsEmbeddedSourceSettings**](CaptionSourceSettingsEmbeddedSourceSettings.md) |  | [optional] 
**file_source_settings** | [**CaptionSourceSettingsFileSourceSettings**](CaptionSourceSettingsFileSourceSettings.md) |  | [optional] 
**source_type** | [**CaptionSourceType**](CaptionSourceType.md) |  | [optional] 
**teletext_source_settings** | [**CaptionSourceSettingsTeletextSourceSettings**](CaptionSourceSettingsTeletextSourceSettings.md) |  | [optional] 
**track_source_settings** | [**CaptionSourceSettingsTrackSourceSettings**](CaptionSourceSettingsTrackSourceSettings.md) |  | [optional] 
**webvtt_hls_source_settings** | [**CaptionSourceSettingsWebvttHlsSourceSettings**](CaptionSourceSettingsWebvttHlsSourceSettings.md) |  | [optional] 

## Example

```python
from openapi_client.models.caption_source_settings import CaptionSourceSettings

# TODO update the JSON string below
json = "{}"
# create an instance of CaptionSourceSettings from a JSON string
caption_source_settings_instance = CaptionSourceSettings.from_json(json)
# print the JSON string representation of the object
print(CaptionSourceSettings.to_json())

# convert the object into a dict
caption_source_settings_dict = caption_source_settings_instance.to_dict()
# create an instance of CaptionSourceSettings from a dict
caption_source_settings_from_dict = CaptionSourceSettings.from_dict(caption_source_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


