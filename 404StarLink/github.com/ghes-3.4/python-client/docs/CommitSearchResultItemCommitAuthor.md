# CommitSearchResultItemCommitAuthor


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_date** | **datetime** |  | 
**email** | **str** |  | 
**name** | **str** |  | 

## Example

```python
from openapi_client.models.commit_search_result_item_commit_author import CommitSearchResultItemCommitAuthor

# TODO update the JSON string below
json = "{}"
# create an instance of CommitSearchResultItemCommitAuthor from a JSON string
commit_search_result_item_commit_author_instance = CommitSearchResultItemCommitAuthor.from_json(json)
# print the JSON string representation of the object
print(CommitSearchResultItemCommitAuthor.to_json())

# convert the object into a dict
commit_search_result_item_commit_author_dict = commit_search_result_item_commit_author_instance.to_dict()
# create an instance of CommitSearchResultItemCommitAuthor from a dict
commit_search_result_item_commit_author_from_dict = CommitSearchResultItemCommitAuthor.from_dict(commit_search_result_item_commit_author_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


