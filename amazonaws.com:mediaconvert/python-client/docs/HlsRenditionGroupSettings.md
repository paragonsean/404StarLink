# HlsRenditionGroupSettings

Settings specific to audio sources in an HLS alternate rendition group. Specify the properties (renditionGroupId, renditionName or renditionLanguageCode) to identify the unique audio track among the alternative rendition groups present in the HLS manifest. If no unique track is found, or multiple tracks match the properties provided, the job fails. If no properties in hlsRenditionGroupSettings are specified, the default audio track within the video segment is chosen. If there is no audio within video segment, the alternative audio with DEFAULT=YES is chosen instead.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rendition_group_id** | **str** |  | [optional] 
**rendition_language_code** | [**LanguageCode**](LanguageCode.md) |  | [optional] 
**rendition_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.hls_rendition_group_settings import HlsRenditionGroupSettings

# TODO update the JSON string below
json = "{}"
# create an instance of HlsRenditionGroupSettings from a JSON string
hls_rendition_group_settings_instance = HlsRenditionGroupSettings.from_json(json)
# print the JSON string representation of the object
print(HlsRenditionGroupSettings.to_json())

# convert the object into a dict
hls_rendition_group_settings_dict = hls_rendition_group_settings_instance.to_dict()
# create an instance of HlsRenditionGroupSettings from a dict
hls_rendition_group_settings_from_dict = HlsRenditionGroupSettings.from_dict(hls_rendition_group_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


