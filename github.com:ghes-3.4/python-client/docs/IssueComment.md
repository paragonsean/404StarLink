# IssueComment

Comments provide a way for people to collaborate on an issue.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author_association** | [**AuthorAssociation**](AuthorAssociation.md) |  | 
**body** | **str** | Contents of the issue comment | [optional] 
**body_html** | **str** |  | [optional] 
**body_text** | **str** |  | [optional] 
**created_at** | **datetime** |  | 
**html_url** | **str** |  | 
**id** | **int** | Unique identifier of the issue comment | 
**issue_url** | **str** |  | 
**node_id** | **str** |  | 
**performed_via_github_app** | [**NullableIntegration**](NullableIntegration.md) |  | [optional] 
**reactions** | [**ReactionRollup**](ReactionRollup.md) |  | [optional] 
**updated_at** | **datetime** |  | 
**url** | **str** | URL for the issue comment | 
**user** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 

## Example

```python
from openapi_client.models.issue_comment import IssueComment

# TODO update the JSON string below
json = "{}"
# create an instance of IssueComment from a JSON string
issue_comment_instance = IssueComment.from_json(json)
# print the JSON string representation of the object
print(IssueComment.to_json())

# convert the object into a dict
issue_comment_dict = issue_comment_instance.to_dict()
# create an instance of IssueComment from a dict
issue_comment_from_dict = IssueComment.from_dict(issue_comment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


