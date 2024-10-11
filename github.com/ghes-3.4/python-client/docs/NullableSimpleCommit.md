# NullableSimpleCommit

A commit.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | [**NullableSimpleCommitAuthor**](NullableSimpleCommitAuthor.md) |  | 
**committer** | [**NullableSimpleCommitAuthor**](NullableSimpleCommitAuthor.md) |  | 
**id** | **str** |  | 
**message** | **str** |  | 
**timestamp** | **datetime** |  | 
**tree_id** | **str** |  | 

## Example

```python
from openapi_client.models.nullable_simple_commit import NullableSimpleCommit

# TODO update the JSON string below
json = "{}"
# create an instance of NullableSimpleCommit from a JSON string
nullable_simple_commit_instance = NullableSimpleCommit.from_json(json)
# print the JSON string representation of the object
print(NullableSimpleCommit.to_json())

# convert the object into a dict
nullable_simple_commit_dict = nullable_simple_commit_instance.to_dict()
# create an instance of NullableSimpleCommit from a dict
nullable_simple_commit_from_dict = NullableSimpleCommit.from_dict(nullable_simple_commit_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


