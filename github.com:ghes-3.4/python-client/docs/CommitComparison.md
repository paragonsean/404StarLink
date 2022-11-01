# CommitComparison

Commit Comparison

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ahead_by** | **int** |  | 
**base_commit** | [**Commit**](Commit.md) |  | 
**behind_by** | **int** |  | 
**commits** | [**List[Commit]**](Commit.md) |  | 
**diff_url** | **str** |  | 
**files** | [**List[DiffEntry]**](DiffEntry.md) |  | [optional] 
**html_url** | **str** |  | 
**merge_base_commit** | [**Commit**](Commit.md) |  | 
**patch_url** | **str** |  | 
**permalink_url** | **str** |  | 
**status** | **str** |  | 
**total_commits** | **int** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.commit_comparison import CommitComparison

# TODO update the JSON string below
json = "{}"
# create an instance of CommitComparison from a JSON string
commit_comparison_instance = CommitComparison.from_json(json)
# print the JSON string representation of the object
print(CommitComparison.to_json())

# convert the object into a dict
commit_comparison_dict = commit_comparison_instance.to_dict()
# create an instance of CommitComparison from a dict
commit_comparison_from_dict = CommitComparison.from_dict(commit_comparison_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


