# Deployment

A request for a specific ref(branch,sha,tag) to be deployed

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** |  | 
**creator** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 
**description** | **str** |  | 
**environment** | **str** | Name for the target deployment environment. | 
**id** | **int** | Unique identifier of the deployment | 
**node_id** | **str** |  | 
**original_environment** | **str** |  | [optional] 
**payload** | [**DeploymentPayload**](DeploymentPayload.md) |  | 
**performed_via_github_app** | [**NullableIntegration**](NullableIntegration.md) |  | [optional] 
**production_environment** | **bool** | Specifies if the given environment is one that end-users directly interact with. Default: false. | [optional] 
**ref** | **str** | The ref to deploy. This can be a branch, tag, or sha. | 
**repository_url** | **str** |  | 
**sha** | **str** |  | 
**statuses_url** | **str** |  | 
**task** | **str** | Parameter to specify a task to execute | 
**transient_environment** | **bool** | Specifies if the given environment is will no longer exist at some point in the future. Default: false. | [optional] 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.deployment import Deployment

# TODO update the JSON string below
json = "{}"
# create an instance of Deployment from a JSON string
deployment_instance = Deployment.from_json(json)
# print the JSON string representation of the object
print(Deployment.to_json())

# convert the object into a dict
deployment_dict = deployment_instance.to_dict()
# create an instance of Deployment from a dict
deployment_from_dict = Deployment.from_dict(deployment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


