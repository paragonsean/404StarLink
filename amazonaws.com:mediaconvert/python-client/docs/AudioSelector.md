# AudioSelector

Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use in your outputs. You can use multiple Audio selectors per input.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audio_duration_correction** | [**AudioDurationCorrection**](AudioDurationCorrection.md) |  | [optional] 
**custom_language_code** | **str** |  | [optional] 
**default_selection** | [**AudioDefaultSelection**](AudioDefaultSelection.md) |  | [optional] 
**external_audio_file_input** | **str** |  | [optional] 
**hls_rendition_group_settings** | [**AudioSelectorHlsRenditionGroupSettings**](AudioSelectorHlsRenditionGroupSettings.md) |  | [optional] 
**language_code** | [**LanguageCode**](LanguageCode.md) |  | [optional] 
**offset** | **int** |  | [optional] 
**pids** | **List** |  | [optional] 
**program_selection** | **int** |  | [optional] 
**remix_settings** | [**AudioSelectorRemixSettings**](AudioSelectorRemixSettings.md) |  | [optional] 
**selector_type** | [**AudioSelectorType**](AudioSelectorType.md) |  | [optional] 
**tracks** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.audio_selector import AudioSelector

# TODO update the JSON string below
json = "{}"
# create an instance of AudioSelector from a JSON string
audio_selector_instance = AudioSelector.from_json(json)
# print the JSON string representation of the object
print(AudioSelector.to_json())

# convert the object into a dict
audio_selector_dict = audio_selector_instance.to_dict()
# create an instance of AudioSelector from a dict
audio_selector_from_dict = AudioSelector.from_dict(audio_selector_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


