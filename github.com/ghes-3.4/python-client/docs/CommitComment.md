# CommitComment

Commit Comment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author_association** | [**AuthorAssociation**](AuthorAssociation.md) |  | 
**body** | **str** |  | 
**commit_id** | **str** |  | 
**created_at** | **datetime** |  | 
**html_url** | **str** |  | 
**id** | **int** |  | 
**line** | **int** |  | 
**node_id** | **str** |  | 
**path** | **str** |  | 
**position** | **int** |  | 
**reactions** | [**ReactionRollup**](ReactionRollup.md) |  | [optional] 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 
**user** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 

## Example

```python
from openapi_client.models.commit_comment import CommitComment

# TODO update the JSON string below
json = "{}"
# create an instance of CommitComment from a JSON string
commit_comment_instance = CommitComment.from_json(json)
# print the JSON string representation of the object
print(CommitComment.to_json())

# convert the object into a dict
commit_comment_dict = commit_comment_instance.to_dict()
# create an instance of CommitComment from a dict
commit_comment_from_dict = CommitComment.from_dict(commit_comment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


