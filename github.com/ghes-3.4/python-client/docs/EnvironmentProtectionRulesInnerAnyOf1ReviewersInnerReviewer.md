# EnvironmentProtectionRulesInnerAnyOf1ReviewersInnerReviewer


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatar_url** | **str** |  | 
**email** | **str** |  | [optional] 
**events_url** | **str** |  | 
**followers_url** | **str** |  | 
**following_url** | **str** |  | 
**gists_url** | **str** |  | 
**gravatar_id** | **str** |  | 
**html_url** | **str** |  | 
**id** | **int** |  | 
**login** | **str** |  | 
**name** | **str** |  | 
**node_id** | **str** |  | 
**organizations_url** | **str** |  | 
**received_events_url** | **str** |  | 
**repos_url** | **str** |  | 
**site_admin** | **bool** |  | 
**starred_at** | **str** |  | [optional] 
**starred_url** | **str** |  | 
**subscriptions_url** | **str** |  | 
**type** | **str** |  | 
**url** | **str** |  | 
**description** | **str** |  | 
**members_url** | **str** |  | 
**parent** | [**NullableTeamSimple**](NullableTeamSimple.md) |  | 
**permission** | **str** |  | 
**permissions** | [**TeamPermissions**](TeamPermissions.md) |  | [optional] 
**privacy** | **str** |  | [optional] 
**repositories_url** | **str** |  | 
**slug** | **str** |  | 

## Example

```python
from openapi_client.models.environment_protection_rules_inner_any_of1_reviewers_inner_reviewer import EnvironmentProtectionRulesInnerAnyOf1ReviewersInnerReviewer

# TODO update the JSON string below
json = "{}"
# create an instance of EnvironmentProtectionRulesInnerAnyOf1ReviewersInnerReviewer from a JSON string
environment_protection_rules_inner_any_of1_reviewers_inner_reviewer_instance = EnvironmentProtectionRulesInnerAnyOf1ReviewersInnerReviewer.from_json(json)
# print the JSON string representation of the object
print(EnvironmentProtectionRulesInnerAnyOf1ReviewersInnerReviewer.to_json())

# convert the object into a dict
environment_protection_rules_inner_any_of1_reviewers_inner_reviewer_dict = environment_protection_rules_inner_any_of1_reviewers_inner_reviewer_instance.to_dict()
# create an instance of EnvironmentProtectionRulesInnerAnyOf1ReviewersInnerReviewer from a dict
environment_protection_rules_inner_any_of1_reviewers_inner_reviewer_from_dict = EnvironmentProtectionRulesInnerAnyOf1ReviewersInnerReviewer.from_dict(environment_protection_rules_inner_any_of1_reviewers_inner_reviewer_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


