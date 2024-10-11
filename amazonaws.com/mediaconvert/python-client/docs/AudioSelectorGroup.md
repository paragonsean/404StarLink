# AudioSelectorGroup

Use audio selector groups to combine multiple sidecar audio inputs so that you can assign them to a single output audio tab (AudioDescription). Note that, if you're working with embedded audio, it's simpler to assign multiple input tracks into a single audio selector rather than use an audio selector group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audio_selector_names** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.audio_selector_group import AudioSelectorGroup

# TODO update the JSON string below
json = "{}"
# create an instance of AudioSelectorGroup from a JSON string
audio_selector_group_instance = AudioSelectorGroup.from_json(json)
# print the JSON string representation of the object
print(AudioSelectorGroup.to_json())

# convert the object into a dict
audio_selector_group_dict = audio_selector_group_instance.to_dict()
# create an instance of AudioSelectorGroup from a dict
audio_selector_group_from_dict = AudioSelectorGroup.from_dict(audio_selector_group_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


