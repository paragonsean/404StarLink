# EnvironmentProtectionRulesInnerAnyOf1


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | 
**node_id** | **str** |  | 
**reviewers** | [**List[EnvironmentProtectionRulesInnerAnyOf1ReviewersInner]**](EnvironmentProtectionRulesInnerAnyOf1ReviewersInner.md) | The people or teams that may approve jobs that reference the environment. You can list up to six users or teams as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed. | [optional] 
**type** | **str** |  | 

## Example

```python
from openapi_client.models.environment_protection_rules_inner_any_of1 import EnvironmentProtectionRulesInnerAnyOf1

# TODO update the JSON string below
json = "{}"
# create an instance of EnvironmentProtectionRulesInnerAnyOf1 from a JSON string
environment_protection_rules_inner_any_of1_instance = EnvironmentProtectionRulesInnerAnyOf1.from_json(json)
# print the JSON string representation of the object
print(EnvironmentProtectionRulesInnerAnyOf1.to_json())

# convert the object into a dict
environment_protection_rules_inner_any_of1_dict = environment_protection_rules_inner_any_of1_instance.to_dict()
# create an instance of EnvironmentProtectionRulesInnerAnyOf1 from a dict
environment_protection_rules_inner_any_of1_from_dict = EnvironmentProtectionRulesInnerAnyOf1.from_dict(environment_protection_rules_inner_any_of1_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


