# EnvironmentProtectionRulesInnerAnyOf1ReviewersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reviewer** | [**EnvironmentProtectionRulesInnerAnyOf1ReviewersInnerReviewer**](EnvironmentProtectionRulesInnerAnyOf1ReviewersInnerReviewer.md) |  | [optional] 
**type** | [**DeploymentReviewerType**](DeploymentReviewerType.md) |  | [optional] 

## Example

```python
from openapi_client.models.environment_protection_rules_inner_any_of1_reviewers_inner import EnvironmentProtectionRulesInnerAnyOf1ReviewersInner

# TODO update the JSON string below
json = "{}"
# create an instance of EnvironmentProtectionRulesInnerAnyOf1ReviewersInner from a JSON string
environment_protection_rules_inner_any_of1_reviewers_inner_instance = EnvironmentProtectionRulesInnerAnyOf1ReviewersInner.from_json(json)
# print the JSON string representation of the object
print(EnvironmentProtectionRulesInnerAnyOf1ReviewersInner.to_json())

# convert the object into a dict
environment_protection_rules_inner_any_of1_reviewers_inner_dict = environment_protection_rules_inner_any_of1_reviewers_inner_instance.to_dict()
# create an instance of EnvironmentProtectionRulesInnerAnyOf1ReviewersInner from a dict
environment_protection_rules_inner_any_of1_reviewers_inner_from_dict = EnvironmentProtectionRulesInnerAnyOf1ReviewersInner.from_dict(environment_protection_rules_inner_any_of1_reviewers_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


