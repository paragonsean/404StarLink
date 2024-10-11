# AudioSelectorHlsRenditionGroupSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rendition_group_id** | **str** |  | [optional] 
**rendition_language_code** | [**LanguageCode**](LanguageCode.md) |  | [optional] 
**rendition_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.audio_selector_hls_rendition_group_settings import AudioSelectorHlsRenditionGroupSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AudioSelectorHlsRenditionGroupSettings from a JSON string
audio_selector_hls_rendition_group_settings_instance = AudioSelectorHlsRenditionGroupSettings.from_json(json)
# print the JSON string representation of the object
print(AudioSelectorHlsRenditionGroupSettings.to_json())

# convert the object into a dict
audio_selector_hls_rendition_group_settings_dict = audio_selector_hls_rendition_group_settings_instance.to_dict()
# create an instance of AudioSelectorHlsRenditionGroupSettings from a dict
audio_selector_hls_rendition_group_settings_from_dict = AudioSelectorHlsRenditionGroupSettings.from_dict(audio_selector_hls_rendition_group_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


