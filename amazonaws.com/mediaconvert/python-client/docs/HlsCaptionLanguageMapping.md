# HlsCaptionLanguageMapping

Caption Language Mapping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**caption_channel** | **int** |  | [optional] 
**custom_language_code** | **str** |  | [optional] 
**language_code** | [**LanguageCode**](LanguageCode.md) |  | [optional] 
**language_description** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.hls_caption_language_mapping import HlsCaptionLanguageMapping

# TODO update the JSON string below
json = "{}"
# create an instance of HlsCaptionLanguageMapping from a JSON string
hls_caption_language_mapping_instance = HlsCaptionLanguageMapping.from_json(json)
# print the JSON string representation of the object
print(HlsCaptionLanguageMapping.to_json())

# convert the object into a dict
hls_caption_language_mapping_dict = hls_caption_language_mapping_instance.to_dict()
# create an instance of HlsCaptionLanguageMapping from a dict
hls_caption_language_mapping_from_dict = HlsCaptionLanguageMapping.from_dict(hls_caption_language_mapping_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


