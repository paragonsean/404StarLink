# CaptionSourceSettingsEmbeddedSourceSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**convert608_to708** | [**EmbeddedConvert608To708**](EmbeddedConvert608To708.md) |  | [optional] 
**source608_channel_number** | **int** |  | [optional] 
**source608_track_number** | **int** |  | [optional] 
**terminate_captions** | [**EmbeddedTerminateCaptions**](EmbeddedTerminateCaptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.caption_source_settings_embedded_source_settings import CaptionSourceSettingsEmbeddedSourceSettings

# TODO update the JSON string below
json = "{}"
# create an instance of CaptionSourceSettingsEmbeddedSourceSettings from a JSON string
caption_source_settings_embedded_source_settings_instance = CaptionSourceSettingsEmbeddedSourceSettings.from_json(json)
# print the JSON string representation of the object
print(CaptionSourceSettingsEmbeddedSourceSettings.to_json())

# convert the object into a dict
caption_source_settings_embedded_source_settings_dict = caption_source_settings_embedded_source_settings_instance.to_dict()
# create an instance of CaptionSourceSettingsEmbeddedSourceSettings from a dict
caption_source_settings_embedded_source_settings_from_dict = CaptionSourceSettingsEmbeddedSourceSettings.from_dict(caption_source_settings_embedded_source_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


