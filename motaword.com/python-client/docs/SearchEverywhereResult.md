# SearchEverywhereResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meta** | [**PagingMeta**](PagingMeta.md) |  | [optional] 
**result** | [**SearchEverywhereResultResult**](SearchEverywhereResultResult.md) |  | [optional] 

## Example

```python
from openapi_client.models.search_everywhere_result import SearchEverywhereResult

# TODO update the JSON string below
json = "{}"
# create an instance of SearchEverywhereResult from a JSON string
search_everywhere_result_instance = SearchEverywhereResult.from_json(json)
# print the JSON string representation of the object
print(SearchEverywhereResult.to_json())

# convert the object into a dict
search_everywhere_result_dict = search_everywhere_result_instance.to_dict()
# create an instance of SearchEverywhereResult from a dict
search_everywhere_result_from_dict = SearchEverywhereResult.from_dict(search_everywhere_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


