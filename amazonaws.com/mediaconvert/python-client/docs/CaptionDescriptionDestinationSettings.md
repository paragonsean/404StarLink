# CaptionDescriptionDestinationSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**burnin_destination_settings** | [**CaptionDestinationSettingsBurninDestinationSettings**](CaptionDestinationSettingsBurninDestinationSettings.md) |  | [optional] 
**destination_type** | [**CaptionDestinationType**](CaptionDestinationType.md) |  | [optional] 
**dvb_sub_destination_settings** | [**CaptionDestinationSettingsDvbSubDestinationSettings**](CaptionDestinationSettingsDvbSubDestinationSettings.md) |  | [optional] 
**embedded_destination_settings** | [**CaptionDestinationSettingsEmbeddedDestinationSettings**](CaptionDestinationSettingsEmbeddedDestinationSettings.md) |  | [optional] 
**imsc_destination_settings** | [**CaptionDestinationSettingsImscDestinationSettings**](CaptionDestinationSettingsImscDestinationSettings.md) |  | [optional] 
**scc_destination_settings** | [**CaptionDestinationSettingsSccDestinationSettings**](CaptionDestinationSettingsSccDestinationSettings.md) |  | [optional] 
**srt_destination_settings** | [**CaptionDestinationSettingsSrtDestinationSettings**](CaptionDestinationSettingsSrtDestinationSettings.md) |  | [optional] 
**teletext_destination_settings** | [**CaptionDestinationSettingsTeletextDestinationSettings**](CaptionDestinationSettingsTeletextDestinationSettings.md) |  | [optional] 
**ttml_destination_settings** | [**CaptionDestinationSettingsTtmlDestinationSettings**](CaptionDestinationSettingsTtmlDestinationSettings.md) |  | [optional] 
**webvtt_destination_settings** | [**CaptionDestinationSettingsWebvttDestinationSettings**](CaptionDestinationSettingsWebvttDestinationSettings.md) |  | [optional] 

## Example

```python
from openapi_client.models.caption_description_destination_settings import CaptionDescriptionDestinationSettings

# TODO update the JSON string below
json = "{}"
# create an instance of CaptionDescriptionDestinationSettings from a JSON string
caption_description_destination_settings_instance = CaptionDescriptionDestinationSettings.from_json(json)
# print the JSON string representation of the object
print(CaptionDescriptionDestinationSettings.to_json())

# convert the object into a dict
caption_description_destination_settings_dict = caption_description_destination_settings_instance.to_dict()
# create an instance of CaptionDescriptionDestinationSettings from a dict
caption_description_destination_settings_from_dict = CaptionDescriptionDestinationSettings.from_dict(caption_description_destination_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


