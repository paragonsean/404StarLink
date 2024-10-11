# DeploymentSimple

A deployment created as the result of an Actions check run from a workflow that references an environment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** |  | 
**description** | **str** |  | 
**environment** | **str** | Name for the target deployment environment. | 
**id** | **int** | Unique identifier of the deployment | 
**node_id** | **str** |  | 
**original_environment** | **str** |  | [optional] 
**performed_via_github_app** | [**NullableIntegration**](NullableIntegration.md) |  | [optional] 
**production_environment** | **bool** | Specifies if the given environment is one that end-users directly interact with. Default: false. | [optional] 
**repository_url** | **str** |  | 
**statuses_url** | **str** |  | 
**task** | **str** | Parameter to specify a task to execute | 
**transient_environment** | **bool** | Specifies if the given environment is will no longer exist at some point in the future. Default: false. | [optional] 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.deployment_simple import DeploymentSimple

# TODO update the JSON string below
json = "{}"
# create an instance of DeploymentSimple from a JSON string
deployment_simple_instance = DeploymentSimple.from_json(json)
# print the JSON string representation of the object
print(DeploymentSimple.to_json())

# convert the object into a dict
deployment_simple_dict = deployment_simple_instance.to_dict()
# create an instance of DeploymentSimple from a dict
deployment_simple_from_dict = DeploymentSimple.from_dict(deployment_simple_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


