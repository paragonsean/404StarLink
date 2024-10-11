# Environment

Details of a deployment environment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** | The time that the environment was created, in ISO 8601 format. | 
**deployment_branch_policy** | [**DeploymentBranchPolicySettings**](DeploymentBranchPolicySettings.md) |  | [optional] 
**html_url** | **str** |  | 
**id** | **int** | The id of the environment. | 
**name** | **str** | The name of the environment. | 
**node_id** | **str** |  | 
**protection_rules** | [**List[EnvironmentProtectionRulesInner]**](EnvironmentProtectionRulesInner.md) |  | [optional] 
**updated_at** | **datetime** | The time that the environment was last updated, in ISO 8601 format. | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.environment import Environment

# TODO update the JSON string below
json = "{}"
# create an instance of Environment from a JSON string
environment_instance = Environment.from_json(json)
# print the JSON string representation of the object
print(Environment.to_json())

# convert the object into a dict
environment_dict = environment_instance.to_dict()
# create an instance of Environment from a dict
environment_from_dict = Environment.from_dict(environment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


