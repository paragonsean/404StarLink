# CaptionSourceSettingsWebvttHlsSourceSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rendition_group_id** | **str** |  | [optional] 
**rendition_language_code** | [**LanguageCode**](LanguageCode.md) |  | [optional] 
**rendition_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.caption_source_settings_webvtt_hls_source_settings import CaptionSourceSettingsWebvttHlsSourceSettings

# TODO update the JSON string below
json = "{}"
# create an instance of CaptionSourceSettingsWebvttHlsSourceSettings from a JSON string
caption_source_settings_webvtt_hls_source_settings_instance = CaptionSourceSettingsWebvttHlsSourceSettings.from_json(json)
# print the JSON string representation of the object
print(CaptionSourceSettingsWebvttHlsSourceSettings.to_json())

# convert the object into a dict
caption_source_settings_webvtt_hls_source_settings_dict = caption_source_settings_webvtt_hls_source_settings_instance.to_dict()
# create an instance of CaptionSourceSettingsWebvttHlsSourceSettings from a dict
caption_source_settings_webvtt_hls_source_settings_from_dict = CaptionSourceSettingsWebvttHlsSourceSettings.from_dict(caption_source_settings_webvtt_hls_source_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


