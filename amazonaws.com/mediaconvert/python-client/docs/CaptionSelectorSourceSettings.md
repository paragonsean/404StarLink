# CaptionSelectorSourceSettings


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
from openapi_client.models.caption_selector_source_settings import CaptionSelectorSourceSettings

# TODO update the JSON string below
json = "{}"
# create an instance of CaptionSelectorSourceSettings from a JSON string
caption_selector_source_settings_instance = CaptionSelectorSourceSettings.from_json(json)
# print the JSON string representation of the object
print(CaptionSelectorSourceSettings.to_json())

# convert the object into a dict
caption_selector_source_settings_dict = caption_selector_source_settings_instance.to_dict()
# create an instance of CaptionSelectorSourceSettings from a dict
caption_selector_source_settings_from_dict = CaptionSelectorSourceSettings.from_dict(caption_selector_source_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


