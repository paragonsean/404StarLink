# InstantFilesTranslationResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | **Dict[str, bytearray]** | a map of source file name &gt; base64-encoded translated file. | [optional] 

## Example

```python
from openapi_client.models.instant_files_translation_result import InstantFilesTranslationResult

# TODO update the JSON string below
json = "{}"
# create an instance of InstantFilesTranslationResult from a JSON string
instant_files_translation_result_instance = InstantFilesTranslationResult.from_json(json)
# print the JSON string representation of the object
print(InstantFilesTranslationResult.to_json())

# convert the object into a dict
instant_files_translation_result_dict = instant_files_translation_result_instance.to_dict()
# create an instance of InstantFilesTranslationResult from a dict
instant_files_translation_result_from_dict = InstantFilesTranslationResult.from_dict(instant_files_translation_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


