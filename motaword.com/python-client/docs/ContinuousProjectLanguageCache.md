# ContinuousProjectLanguageCache

TM, MT and Nonparsed cache list for translations

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mt** | **Dict[str, str]** | source &gt; target map of strings for translations | [optional] 
**nonparsed** | **Dict[str, str]** | source &gt; target map of strings for translations | [optional] 
**tm** | **Dict[str, str]** | source &gt; target map of strings for translations | [optional] 

## Example

```python
from openapi_client.models.continuous_project_language_cache import ContinuousProjectLanguageCache

# TODO update the JSON string below
json = "{}"
# create an instance of ContinuousProjectLanguageCache from a JSON string
continuous_project_language_cache_instance = ContinuousProjectLanguageCache.from_json(json)
# print the JSON string representation of the object
print(ContinuousProjectLanguageCache.to_json())

# convert the object into a dict
continuous_project_language_cache_dict = continuous_project_language_cache_instance.to_dict()
# create an instance of ContinuousProjectLanguageCache from a dict
continuous_project_language_cache_from_dict = ContinuousProjectLanguageCache.from_dict(continuous_project_language_cache_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


