# DeprecatedStringTranslationContent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contents** | **List[str]** |  | [optional] 
**source_language** | **str** |  | [optional] 
**target_languages** | **List[str]** |  | [optional] 

## Example

```python
from openapi_client.models.deprecated_string_translation_content import DeprecatedStringTranslationContent

# TODO update the JSON string below
json = "{}"
# create an instance of DeprecatedStringTranslationContent from a JSON string
deprecated_string_translation_content_instance = DeprecatedStringTranslationContent.from_json(json)
# print the JSON string representation of the object
print(DeprecatedStringTranslationContent.to_json())

# convert the object into a dict
deprecated_string_translation_content_dict = deprecated_string_translation_content_instance.to_dict()
# create an instance of DeprecatedStringTranslationContent from a dict
deprecated_string_translation_content_from_dict = DeprecatedStringTranslationContent.from_dict(deprecated_string_translation_content_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


