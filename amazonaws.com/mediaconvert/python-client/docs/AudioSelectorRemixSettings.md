# AudioSelectorRemixSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channel_mapping** | [**RemixSettingsChannelMapping**](RemixSettingsChannelMapping.md) |  | [optional] 
**channels_in** | **int** |  | [optional] 
**channels_out** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.audio_selector_remix_settings import AudioSelectorRemixSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AudioSelectorRemixSettings from a JSON string
audio_selector_remix_settings_instance = AudioSelectorRemixSettings.from_json(json)
# print the JSON string representation of the object
print(AudioSelectorRemixSettings.to_json())

# convert the object into a dict
audio_selector_remix_settings_dict = audio_selector_remix_settings_instance.to_dict()
# create an instance of AudioSelectorRemixSettings from a dict
audio_selector_remix_settings_from_dict = AudioSelectorRemixSettings.from_dict(audio_selector_remix_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


