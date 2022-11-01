# DeploymentBranchPolicy

Details of a deployment branch policy.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The unique identifier of the branch policy. | [optional] 
**name** | **str** | The name pattern that branches must match in order to deploy to the environment. | [optional] 
**node_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.deployment_branch_policy import DeploymentBranchPolicy

# TODO update the JSON string below
json = "{}"
# create an instance of DeploymentBranchPolicy from a JSON string
deployment_branch_policy_instance = DeploymentBranchPolicy.from_json(json)
# print the JSON string representation of the object
print(DeploymentBranchPolicy.to_json())

# convert the object into a dict
deployment_branch_policy_dict = deployment_branch_policy_instance.to_dict()
# create an instance of DeploymentBranchPolicy from a dict
deployment_branch_policy_from_dict = DeploymentBranchPolicy.from_dict(deployment_branch_policy_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


