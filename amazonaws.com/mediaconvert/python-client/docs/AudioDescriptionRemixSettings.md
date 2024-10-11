# AudioDescriptionRemixSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channel_mapping** | [**RemixSettingsChannelMapping**](RemixSettingsChannelMapping.md) |  | [optional] 
**channels_in** | **int** |  | [optional] 
**channels_out** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.audio_description_remix_settings import AudioDescriptionRemixSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AudioDescriptionRemixSettings from a JSON string
audio_description_remix_settings_instance = AudioDescriptionRemixSettings.from_json(json)
# print the JSON string representation of the object
print(AudioDescriptionRemixSettings.to_json())

# convert the object into a dict
audio_description_remix_settings_dict = audio_description_remix_settings_instance.to_dict()
# create an instance of AudioDescriptionRemixSettings from a dict
audio_description_remix_settings_from_dict = AudioDescriptionRemixSettings.from_dict(audio_description_remix_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


