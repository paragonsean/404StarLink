# CaptionDescription

This object holds groups of settings related to captions for one output. For each output that has captions, include one instance of CaptionDescriptions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**caption_selector_name** | **str** |  | [optional] 
**custom_language_code** | **str** |  | [optional] 
**destination_settings** | [**CaptionDescriptionDestinationSettings**](CaptionDescriptionDestinationSettings.md) |  | [optional] 
**language_code** | [**LanguageCode**](LanguageCode.md) |  | [optional] 
**language_description** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.caption_description import CaptionDescription

# TODO update the JSON string below
json = "{}"
# create an instance of CaptionDescription from a JSON string
caption_description_instance = CaptionDescription.from_json(json)
# print the JSON string representation of the object
print(CaptionDescription.to_json())

# convert the object into a dict
caption_description_dict = caption_description_instance.to_dict()
# create an instance of CaptionDescription from a dict
caption_description_from_dict = CaptionDescription.from_dict(caption_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


