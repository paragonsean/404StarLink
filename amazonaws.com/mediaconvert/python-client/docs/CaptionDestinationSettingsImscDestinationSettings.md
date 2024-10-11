# CaptionDestinationSettingsImscDestinationSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessibility** | [**ImscAccessibilitySubs**](ImscAccessibilitySubs.md) |  | [optional] 
**style_passthrough** | [**ImscStylePassthrough**](ImscStylePassthrough.md) |  | [optional] 

## Example

```python
from openapi_client.models.caption_destination_settings_imsc_destination_settings import CaptionDestinationSettingsImscDestinationSettings

# TODO update the JSON string below
json = "{}"
# create an instance of CaptionDestinationSettingsImscDestinationSettings from a JSON string
caption_destination_settings_imsc_destination_settings_instance = CaptionDestinationSettingsImscDestinationSettings.from_json(json)
# print the JSON string representation of the object
print(CaptionDestinationSettingsImscDestinationSettings.to_json())

# convert the object into a dict
caption_destination_settings_imsc_destination_settings_dict = caption_destination_settings_imsc_destination_settings_instance.to_dict()
# create an instance of CaptionDestinationSettingsImscDestinationSettings from a dict
caption_destination_settings_imsc_destination_settings_from_dict = CaptionDestinationSettingsImscDestinationSettings.from_dict(caption_destination_settings_imsc_destination_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


