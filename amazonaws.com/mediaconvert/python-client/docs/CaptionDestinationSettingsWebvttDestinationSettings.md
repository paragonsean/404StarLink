# CaptionDestinationSettingsWebvttDestinationSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessibility** | [**WebvttAccessibilitySubs**](WebvttAccessibilitySubs.md) |  | [optional] 
**style_passthrough** | [**WebvttStylePassthrough**](WebvttStylePassthrough.md) |  | [optional] 

## Example

```python
from openapi_client.models.caption_destination_settings_webvtt_destination_settings import CaptionDestinationSettingsWebvttDestinationSettings

# TODO update the JSON string below
json = "{}"
# create an instance of CaptionDestinationSettingsWebvttDestinationSettings from a JSON string
caption_destination_settings_webvtt_destination_settings_instance = CaptionDestinationSettingsWebvttDestinationSettings.from_json(json)
# print the JSON string representation of the object
print(CaptionDestinationSettingsWebvttDestinationSettings.to_json())

# convert the object into a dict
caption_destination_settings_webvtt_destination_settings_dict = caption_destination_settings_webvtt_destination_settings_instance.to_dict()
# create an instance of CaptionDestinationSettingsWebvttDestinationSettings from a dict
caption_destination_settings_webvtt_destination_settings_from_dict = CaptionDestinationSettingsWebvttDestinationSettings.from_dict(caption_destination_settings_webvtt_destination_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


