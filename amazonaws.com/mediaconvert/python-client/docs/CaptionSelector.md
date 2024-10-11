# CaptionSelector

Use captions selectors to specify the captions data from your input that you use in your outputs. You can use up to 20 captions selectors per input.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**custom_language_code** | **str** |  | [optional] 
**language_code** | [**LanguageCode**](LanguageCode.md) |  | [optional] 
**source_settings** | [**CaptionSelectorSourceSettings**](CaptionSelectorSourceSettings.md) |  | [optional] 

## Example

```python
from openapi_client.models.caption_selector import CaptionSelector

# TODO update the JSON string below
json = "{}"
# create an instance of CaptionSelector from a JSON string
caption_selector_instance = CaptionSelector.from_json(json)
# print the JSON string representation of the object
print(CaptionSelector.to_json())

# convert the object into a dict
caption_selector_dict = caption_selector_instance.to_dict()
# create an instance of CaptionSelector from a dict
caption_selector_from_dict = CaptionSelector.from_dict(caption_selector_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


