# SearchCommits200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**incomplete_results** | **bool** |  | 
**items** | [**List[CommitSearchResultItem]**](CommitSearchResultItem.md) |  | 
**total_count** | **int** |  | 

## Example

```python
from openapi_client.models.search_commits200_response import SearchCommits200Response

# TODO update the JSON string below
json = "{}"
# create an instance of SearchCommits200Response from a JSON string
search_commits200_response_instance = SearchCommits200Response.from_json(json)
# print the JSON string representation of the object
print(SearchCommits200Response.to_json())

# convert the object into a dict
search_commits200_response_dict = search_commits200_response_instance.to_dict()
# create an instance of SearchCommits200Response from a dict
search_commits200_response_from_dict = SearchCommits200Response.from_dict(search_commits200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


