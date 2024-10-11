# InstantContentsTranslationResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | **Dict[str, str]** | a map of source string &gt; translated string. | [optional] 

## Example

```python
from openapi_client.models.instant_contents_translation_result import InstantContentsTranslationResult

# TODO update the JSON string below
json = "{}"
# create an instance of InstantContentsTranslationResult from a JSON string
instant_contents_translation_result_instance = InstantContentsTranslationResult.from_json(json)
# print the JSON string representation of the object
print(InstantContentsTranslationResult.to_json())

# convert the object into a dict
instant_contents_translation_result_dict = instant_contents_translation_result_instance.to_dict()
# create an instance of InstantContentsTranslationResult from a dict
instant_contents_translation_result_from_dict = InstantContentsTranslationResult.from_dict(instant_contents_translation_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


