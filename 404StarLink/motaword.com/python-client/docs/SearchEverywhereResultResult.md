# SearchEverywhereResultResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documents** | [**List[DocumentInSearch]**](DocumentInSearch.md) |  | [optional] 
**projects** | [**List[ProjectInSearch]**](ProjectInSearch.md) |  | [optional] 
**strings** | [**List[StringInSearch]**](StringInSearch.md) |  | [optional] 

## Example

```python
from openapi_client.models.search_everywhere_result_result import SearchEverywhereResultResult

# TODO update the JSON string below
json = "{}"
# create an instance of SearchEverywhereResultResult from a JSON string
search_everywhere_result_result_instance = SearchEverywhereResultResult.from_json(json)
# print the JSON string representation of the object
print(SearchEverywhereResultResult.to_json())

# convert the object into a dict
search_everywhere_result_result_dict = search_everywhere_result_result_instance.to_dict()
# create an instance of SearchEverywhereResultResult from a dict
search_everywhere_result_result_from_dict = SearchEverywhereResultResult.from_dict(search_everywhere_result_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


