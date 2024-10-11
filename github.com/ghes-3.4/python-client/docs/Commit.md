# Commit

Commit

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 
**comments_url** | **str** |  | 
**commit** | [**CommitCommit**](CommitCommit.md) |  | 
**committer** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 
**files** | [**List[DiffEntry]**](DiffEntry.md) |  | [optional] 
**html_url** | **str** |  | 
**node_id** | **str** |  | 
**parents** | [**List[CommitParentsInner]**](CommitParentsInner.md) |  | 
**sha** | **str** |  | 
**stats** | [**CommitStats**](CommitStats.md) |  | [optional] 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.commit import Commit

# TODO update the JSON string below
json = "{}"
# create an instance of Commit from a JSON string
commit_instance = Commit.from_json(json)
# print the JSON string representation of the object
print(Commit.to_json())

# convert the object into a dict
commit_dict = commit_instance.to_dict()
# create an instance of Commit from a dict
commit_from_dict = Commit.from_dict(commit_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


