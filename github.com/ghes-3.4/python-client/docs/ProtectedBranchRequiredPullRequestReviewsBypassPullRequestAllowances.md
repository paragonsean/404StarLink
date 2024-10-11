# ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apps** | [**List[Integration]**](Integration.md) |  | [optional] 
**teams** | [**List[Team]**](Team.md) |  | 
**users** | [**List[SimpleUser]**](SimpleUser.md) |  | 

## Example

```python
from openapi_client.models.protected_branch_required_pull_request_reviews_bypass_pull_request_allowances import ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances

# TODO update the JSON string below
json = "{}"
# create an instance of ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances from a JSON string
protected_branch_required_pull_request_reviews_bypass_pull_request_allowances_instance = ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances.from_json(json)
# print the JSON string representation of the object
print(ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances.to_json())

# convert the object into a dict
protected_branch_required_pull_request_reviews_bypass_pull_request_allowances_dict = protected_branch_required_pull_request_reviews_bypass_pull_request_allowances_instance.to_dict()
# create an instance of ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances from a dict
protected_branch_required_pull_request_reviews_bypass_pull_request_allowances_from_dict = ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances.from_dict(protected_branch_required_pull_request_reviews_bypass_pull_request_allowances_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


