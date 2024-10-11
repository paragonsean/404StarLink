# ReviewComment

Legacy Review Comment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**ReviewCommentLinks**](ReviewCommentLinks.md) |  | 
**author_association** | [**AuthorAssociation**](AuthorAssociation.md) |  | 
**body** | **str** |  | 
**body_html** | **str** |  | [optional] 
**body_text** | **str** |  | [optional] 
**commit_id** | **str** |  | 
**created_at** | **datetime** |  | 
**diff_hunk** | **str** |  | 
**html_url** | **str** |  | 
**id** | **int** |  | 
**in_reply_to_id** | **int** |  | [optional] 
**line** | **int** | The line of the blob to which the comment applies. The last line of the range for a multi-line comment | [optional] 
**node_id** | **str** |  | 
**original_commit_id** | **str** |  | 
**original_line** | **int** | The original line of the blob to which the comment applies. The last line of the range for a multi-line comment | [optional] 
**original_position** | **int** |  | 
**original_start_line** | **int** | The original first line of the range for a multi-line comment. | [optional] 
**path** | **str** |  | 
**position** | **int** |  | 
**pull_request_review_id** | **int** |  | 
**pull_request_url** | **str** |  | 
**reactions** | [**ReactionRollup**](ReactionRollup.md) |  | [optional] 
**side** | **str** | The side of the first line of the range for a multi-line comment. | [optional] [default to 'RIGHT']
**start_line** | **int** | The first line of the range for a multi-line comment. | [optional] 
**start_side** | **str** | The side of the first line of the range for a multi-line comment. | [optional] [default to 'RIGHT']
**updated_at** | **datetime** |  | 
**url** | **str** |  | 
**user** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 

## Example

```python
from openapi_client.models.review_comment import ReviewComment

# TODO update the JSON string below
json = "{}"
# create an instance of ReviewComment from a JSON string
review_comment_instance = ReviewComment.from_json(json)
# print the JSON string representation of the object
print(ReviewComment.to_json())

# convert the object into a dict
review_comment_dict = review_comment_instance.to_dict()
# create an instance of ReviewComment from a dict
review_comment_from_dict = ReviewComment.from_dict(review_comment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


