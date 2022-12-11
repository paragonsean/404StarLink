# ContinuousProjectCache

Continuous project cache for translations per target language.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meta** | [**PagingMeta**](PagingMeta.md) |  | [optional] 
**translations** | [**Dict[str, ContinuousProjectLanguageCache]**](ContinuousProjectLanguageCache.md) |  | [optional] 

## Example

```python
from openapi_client.models.continuous_project_cache import ContinuousProjectCache

# TODO update the JSON string below
json = "{}"
# create an instance of ContinuousProjectCache from a JSON string
continuous_project_cache_instance = ContinuousProjectCache.from_json(json)
# print the JSON string representation of the object
print(ContinuousProjectCache.to_json())

# convert the object into a dict
continuous_project_cache_dict = continuous_project_cache_instance.to_dict()
# create an instance of ContinuousProjectCache from a dict
continuous_project_cache_from_dict = ContinuousProjectCache.from_dict(continuous_project_cache_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


