# LanguageStringStat


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**project_string_count** | **int** |  | [optional] 
**source_language** | **str** |  | [optional] 
**tm_string_count** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.language_string_stat import LanguageStringStat

# TODO update the JSON string below
json = "{}"
# create an instance of LanguageStringStat from a JSON string
language_string_stat_instance = LanguageStringStat.from_json(json)
# print the JSON string representation of the object
print(LanguageStringStat.to_json())

# convert the object into a dict
language_string_stat_dict = language_string_stat_instance.to_dict()
# create an instance of LanguageStringStat from a dict
language_string_stat_from_dict = LanguageStringStat.from_dict(language_string_stat_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


