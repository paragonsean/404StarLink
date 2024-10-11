# WebvttHlsSourceSettings

Settings specific to WebVTT sources in HLS alternative rendition group. Specify the properties (renditionGroupId, renditionName or renditionLanguageCode) to identify the unique subtitle track among the alternative rendition groups present in the HLS manifest. If no unique track is found, or multiple tracks match the specified properties, the job fails. If there is only one subtitle track in the rendition group, the settings can be left empty and the default subtitle track will be chosen. If your caption source is a sidecar file, use FileSourceSettings instead of WebvttHlsSourceSettings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rendition_group_id** | **str** |  | [optional] 
**rendition_language_code** | [**LanguageCode**](LanguageCode.md) |  | [optional] 
**rendition_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.webvtt_hls_source_settings import WebvttHlsSourceSettings

# TODO update the JSON string below
json = "{}"
# create an instance of WebvttHlsSourceSettings from a JSON string
webvtt_hls_source_settings_instance = WebvttHlsSourceSettings.from_json(json)
# print the JSON string representation of the object
print(WebvttHlsSourceSettings.to_json())

# convert the object into a dict
webvtt_hls_source_settings_dict = webvtt_hls_source_settings_instance.to_dict()
# create an instance of WebvttHlsSourceSettings from a dict
webvtt_hls_source_settings_from_dict = WebvttHlsSourceSettings.from_dict(webvtt_hls_source_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


