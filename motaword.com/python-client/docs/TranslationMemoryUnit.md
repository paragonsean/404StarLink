# TranslationMemoryUnit


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_language** | **str** |  | [optional] 
**source_text** | **str** |  | [optional] 
**target_language** | **str** |  | [optional] 
**target_text** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.translation_memory_unit import TranslationMemoryUnit

# TODO update the JSON string below
json = "{}"
# create an instance of TranslationMemoryUnit from a JSON string
translation_memory_unit_instance = TranslationMemoryUnit.from_json(json)
# print the JSON string representation of the object
print(TranslationMemoryUnit.to_json())

# convert the object into a dict
translation_memory_unit_dict = translation_memory_unit_instance.to_dict()
# create an instance of TranslationMemoryUnit from a dict
translation_memory_unit_from_dict = TranslationMemoryUnit.from_dict(translation_memory_unit_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


