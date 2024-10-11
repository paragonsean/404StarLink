# BranchRestrictionPolicyUsersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatar_url** | **str** |  | [optional] 
**events_url** | **str** |  | [optional] 
**followers_url** | **str** |  | [optional] 
**following_url** | **str** |  | [optional] 
**gists_url** | **str** |  | [optional] 
**gravatar_id** | **str** |  | [optional] 
**html_url** | **str** |  | [optional] 
**id** | **int** |  | [optional] 
**login** | **str** |  | [optional] 
**node_id** | **str** |  | [optional] 
**organizations_url** | **str** |  | [optional] 
**received_events_url** | **str** |  | [optional] 
**repos_url** | **str** |  | [optional] 
**site_admin** | **bool** |  | [optional] 
**starred_url** | **str** |  | [optional] 
**subscriptions_url** | **str** |  | [optional] 
**type** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.branch_restriction_policy_users_inner import BranchRestrictionPolicyUsersInner

# TODO update the JSON string below
json = "{}"
# create an instance of BranchRestrictionPolicyUsersInner from a JSON string
branch_restriction_policy_users_inner_instance = BranchRestrictionPolicyUsersInner.from_json(json)
# print the JSON string representation of the object
print(BranchRestrictionPolicyUsersInner.to_json())

# convert the object into a dict
branch_restriction_policy_users_inner_dict = branch_restriction_policy_users_inner_instance.to_dict()
# create an instance of BranchRestrictionPolicyUsersInner from a dict
branch_restriction_policy_users_inner_from_dict = BranchRestrictionPolicyUsersInner.from_dict(branch_restriction_policy_users_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


