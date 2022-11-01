# ProtectedBranchPullRequestReview

Protected Branch Pull Request Review

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bypass_pull_request_allowances** | [**ProtectedBranchPullRequestReviewBypassPullRequestAllowances**](ProtectedBranchPullRequestReviewBypassPullRequestAllowances.md) |  | [optional] 
**dismiss_stale_reviews** | **bool** |  | 
**dismissal_restrictions** | [**ProtectedBranchPullRequestReviewDismissalRestrictions**](ProtectedBranchPullRequestReviewDismissalRestrictions.md) |  | [optional] 
**require_code_owner_reviews** | **bool** |  | 
**required_approving_review_count** | **int** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.protected_branch_pull_request_review import ProtectedBranchPullRequestReview

# TODO update the JSON string below
json = "{}"
# create an instance of ProtectedBranchPullRequestReview from a JSON string
protected_branch_pull_request_review_instance = ProtectedBranchPullRequestReview.from_json(json)
# print the JSON string representation of the object
print(ProtectedBranchPullRequestReview.to_json())

# convert the object into a dict
protected_branch_pull_request_review_dict = protected_branch_pull_request_review_instance.to_dict()
# create an instance of ProtectedBranchPullRequestReview from a dict
protected_branch_pull_request_review_from_dict = ProtectedBranchPullRequestReview.from_dict(protected_branch_pull_request_review_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


