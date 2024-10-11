# CaptionDescriptionPreset

Caption Description for preset

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**custom_language_code** | **str** |  | [optional] 
**destination_settings** | [**CaptionDescriptionDestinationSettings**](CaptionDescriptionDestinationSettings.md) |  | [optional] 
**language_code** | [**LanguageCode**](LanguageCode.md) |  | [optional] 
**language_description** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.caption_description_preset import CaptionDescriptionPreset

# TODO update the JSON string below
json = "{}"
# create an instance of CaptionDescriptionPreset from a JSON string
caption_description_preset_instance = CaptionDescriptionPreset.from_json(json)
# print the JSON string representation of the object
print(CaptionDescriptionPreset.to_json())

# convert the object into a dict
caption_description_preset_dict = caption_description_preset_instance.to_dict()
# create an instance of CaptionDescriptionPreset from a dict
caption_description_preset_from_dict = CaptionDescriptionPreset.from_dict(caption_description_preset_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


