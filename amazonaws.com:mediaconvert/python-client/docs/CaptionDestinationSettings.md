# CaptionDestinationSettings

Settings related to one captions tab on the MediaConvert console. In your job JSON, an instance of captions DestinationSettings is equivalent to one captions tab in the console. Usually, one captions tab corresponds to one output captions track. Depending on your output captions format, one tab might correspond to a set of output captions tracks. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/including-captions.html.

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
from openapi_client.models.caption_destination_settings import CaptionDestinationSettings

# TODO update the JSON string below
json = "{}"
# create an instance of CaptionDestinationSettings from a JSON string
caption_destination_settings_instance = CaptionDestinationSettings.from_json(json)
# print the JSON string representation of the object
print(CaptionDestinationSettings.to_json())

# convert the object into a dict
caption_destination_settings_dict = caption_destination_settings_instance.to_dict()
# create an instance of CaptionDestinationSettings from a dict
caption_destination_settings_from_dict = CaptionDestinationSettings.from_dict(caption_destination_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


