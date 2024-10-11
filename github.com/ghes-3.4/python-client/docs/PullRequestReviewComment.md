# PullRequestReviewComment

Pull Request Review Comments are comments on a portion of the Pull Request's diff.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**PullRequestReviewCommentLinks**](PullRequestReviewCommentLinks.md) |  | 
**author_association** | [**AuthorAssociation**](AuthorAssociation.md) |  | 
**body** | **str** | The text of the comment. | 
**body_html** | **str** |  | [optional] 
**body_text** | **str** |  | [optional] 
**commit_id** | **str** | The SHA of the commit to which the comment applies. | 
**created_at** | **datetime** |  | 
**diff_hunk** | **str** | The diff of the line that the comment refers to. | 
**html_url** | **str** | HTML URL for the pull request review comment. | 
**id** | **int** | The ID of the pull request review comment. | 
**in_reply_to_id** | **int** | The comment ID to reply to. | [optional] 
**line** | **int** | The line of the blob to which the comment applies. The last line of the range for a multi-line comment | [optional] 
**node_id** | **str** | The node ID of the pull request review comment. | 
**original_commit_id** | **str** | The SHA of the original commit to which the comment applies. | 
**original_line** | **int** | The line of the blob to which the comment applies. The last line of the range for a multi-line comment | [optional] 
**original_position** | **int** | The index of the original line in the diff to which the comment applies. This field is deprecated; use &#x60;original_line&#x60; instead. | 
**original_start_line** | **int** | The first line of the range for a multi-line comment. | [optional] 
**path** | **str** | The relative path of the file to which the comment applies. | 
**position** | **int** | The line index in the diff to which the comment applies. This field is deprecated; use &#x60;line&#x60; instead. | 
**pull_request_review_id** | **int** | The ID of the pull request review to which the comment belongs. | 
**pull_request_url** | **str** | URL for the pull request that the review comment belongs to. | 
**reactions** | [**ReactionRollup**](ReactionRollup.md) |  | [optional] 
**side** | **str** | The side of the diff to which the comment applies. The side of the last line of the range for a multi-line comment | [optional] [default to 'RIGHT']
**start_line** | **int** | The first line of the range for a multi-line comment. | [optional] 
**start_side** | **str** | The side of the first line of the range for a multi-line comment. | [optional] [default to 'RIGHT']
**updated_at** | **datetime** |  | 
**url** | **str** | URL for the pull request review comment | 
**user** | [**SimpleUser**](SimpleUser.md) |  | 

## Example

```python
from openapi_client.models.pull_request_review_comment import PullRequestReviewComment

# TODO update the JSON string below
json = "{}"
# create an instance of PullRequestReviewComment from a JSON string
pull_request_review_comment_instance = PullRequestReviewComment.from_json(json)
# print the JSON string representation of the object
print(PullRequestReviewComment.to_json())

# convert the object into a dict
pull_request_review_comment_dict = pull_request_review_comment_instance.to_dict()
# create an instance of PullRequestReviewComment from a dict
pull_request_review_comment_from_dict = PullRequestReviewComment.from_dict(pull_request_review_comment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


