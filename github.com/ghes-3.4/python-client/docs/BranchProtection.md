# BranchProtection

Branch Protection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_deletions** | [**BranchProtectionAllowDeletions**](BranchProtectionAllowDeletions.md) |  | [optional] 
**allow_force_pushes** | [**BranchProtectionAllowDeletions**](BranchProtectionAllowDeletions.md) |  | [optional] 
**block_creations** | [**BranchProtectionAllowDeletions**](BranchProtectionAllowDeletions.md) |  | [optional] 
**enabled** | **bool** |  | [optional] 
**enforce_admins** | [**ProtectedBranchAdminEnforced**](ProtectedBranchAdminEnforced.md) |  | [optional] 
**name** | **str** |  | [optional] 
**protection_url** | **str** |  | [optional] 
**required_conversation_resolution** | [**BranchProtectionAllowDeletions**](BranchProtectionAllowDeletions.md) |  | [optional] 
**required_linear_history** | [**BranchProtectionAllowDeletions**](BranchProtectionAllowDeletions.md) |  | [optional] 
**required_pull_request_reviews** | [**ProtectedBranchPullRequestReview**](ProtectedBranchPullRequestReview.md) |  | [optional] 
**required_signatures** | [**BranchProtectionRequiredSignatures**](BranchProtectionRequiredSignatures.md) |  | [optional] 
**required_status_checks** | [**ProtectedBranchRequiredStatusCheck**](ProtectedBranchRequiredStatusCheck.md) |  | [optional] 
**restrictions** | [**BranchRestrictionPolicy**](BranchRestrictionPolicy.md) |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.branch_protection import BranchProtection

# TODO update the JSON string below
json = "{}"
# create an instance of BranchProtection from a JSON string
branch_protection_instance = BranchProtection.from_json(json)
# print the JSON string representation of the object
print(BranchProtection.to_json())

# convert the object into a dict
branch_protection_dict = branch_protection_instance.to_dict()
# create an instance of BranchProtection from a dict
branch_protection_from_dict = BranchProtection.from_dict(branch_protection_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


