# ProtectedBranchRequiredPullRequestReviews


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bypass_pull_request_allowances** | [**ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances**](ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances.md) |  | [optional] 
**dismiss_stale_reviews** | **bool** |  | [optional] 
**dismissal_restrictions** | [**ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions**](ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions.md) |  | [optional] 
**require_code_owner_reviews** | **bool** |  | [optional] 
**required_approving_review_count** | **int** |  | [optional] 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.protected_branch_required_pull_request_reviews import ProtectedBranchRequiredPullRequestReviews

# TODO update the JSON string below
json = "{}"
# create an instance of ProtectedBranchRequiredPullRequestReviews from a JSON string
protected_branch_required_pull_request_reviews_instance = ProtectedBranchRequiredPullRequestReviews.from_json(json)
# print the JSON string representation of the object
print(ProtectedBranchRequiredPullRequestReviews.to_json())

# convert the object into a dict
protected_branch_required_pull_request_reviews_dict = protected_branch_required_pull_request_reviews_instance.to_dict()
# create an instance of ProtectedBranchRequiredPullRequestReviews from a dict
protected_branch_required_pull_request_reviews_from_dict = ProtectedBranchRequiredPullRequestReviews.from_dict(protected_branch_required_pull_request_reviews_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


