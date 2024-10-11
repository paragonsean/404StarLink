# CommitSearchResultItem

Commit Search Result Item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 
**comments_url** | **str** |  | 
**commit** | [**CommitSearchResultItemCommit**](CommitSearchResultItemCommit.md) |  | 
**committer** | [**NullableGitUser**](NullableGitUser.md) |  | 
**html_url** | **str** |  | 
**node_id** | **str** |  | 
**parents** | [**List[CommitSearchResultItemParentsInner]**](CommitSearchResultItemParentsInner.md) |  | 
**repository** | [**MinimalRepository**](MinimalRepository.md) |  | 
**score** | **float** |  | 
**sha** | **str** |  | 
**text_matches** | [**List[SearchResultTextMatchesInner]**](SearchResultTextMatchesInner.md) |  | [optional] 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.commit_search_result_item import CommitSearchResultItem

# TODO update the JSON string below
json = "{}"
# create an instance of CommitSearchResultItem from a JSON string
commit_search_result_item_instance = CommitSearchResultItem.from_json(json)
# print the JSON string representation of the object
print(CommitSearchResultItem.to_json())

# convert the object into a dict
commit_search_result_item_dict = commit_search_result_item_instance.to_dict()
# create an instance of CommitSearchResultItem from a dict
commit_search_result_item_from_dict = CommitSearchResultItem.from_dict(commit_search_result_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


