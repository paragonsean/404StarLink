# CaptionSourceSettingsAncillarySourceSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**convert608_to708** | [**AncillaryConvert608To708**](AncillaryConvert608To708.md) |  | [optional] 
**source_ancillary_channel_number** | **int** |  | [optional] 
**terminate_captions** | [**AncillaryTerminateCaptions**](AncillaryTerminateCaptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.caption_source_settings_ancillary_source_settings import CaptionSourceSettingsAncillarySourceSettings

# TODO update the JSON string below
json = "{}"
# create an instance of CaptionSourceSettingsAncillarySourceSettings from a JSON string
caption_source_settings_ancillary_source_settings_instance = CaptionSourceSettingsAncillarySourceSettings.from_json(json)
# print the JSON string representation of the object
print(CaptionSourceSettingsAncillarySourceSettings.to_json())

# convert the object into a dict
caption_source_settings_ancillary_source_settings_dict = caption_source_settings_ancillary_source_settings_instance.to_dict()
# create an instance of CaptionSourceSettingsAncillarySourceSettings from a dict
caption_source_settings_ancillary_source_settings_from_dict = CaptionSourceSettingsAncillarySourceSettings.from_dict(caption_source_settings_ancillary_source_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


