# BranchRestrictionPolicyAppsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**events** | **List[str]** |  | [optional] 
**external_url** | **str** |  | [optional] 
**html_url** | **str** |  | [optional] 
**id** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**node_id** | **str** |  | [optional] 
**owner** | [**BranchRestrictionPolicyAppsInnerOwner**](BranchRestrictionPolicyAppsInnerOwner.md) |  | [optional] 
**permissions** | [**BranchRestrictionPolicyAppsInnerPermissions**](BranchRestrictionPolicyAppsInnerPermissions.md) |  | [optional] 
**slug** | **str** |  | [optional] 
**updated_at** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.branch_restriction_policy_apps_inner import BranchRestrictionPolicyAppsInner

# TODO update the JSON string below
json = "{}"
# create an instance of BranchRestrictionPolicyAppsInner from a JSON string
branch_restriction_policy_apps_inner_instance = BranchRestrictionPolicyAppsInner.from_json(json)
# print the JSON string representation of the object
print(BranchRestrictionPolicyAppsInner.to_json())

# convert the object into a dict
branch_restriction_policy_apps_inner_dict = branch_restriction_policy_apps_inner_instance.to_dict()
# create an instance of BranchRestrictionPolicyAppsInner from a dict
branch_restriction_policy_apps_inner_from_dict = BranchRestrictionPolicyAppsInner.from_dict(branch_restriction_policy_apps_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


