# GitLabConfig

GitLabConfig represents the configuration for a GitLab integration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connected_repositories** | [**List[GitLabRepositoryId]**](GitLabRepositoryId.md) | Connected GitLab.com or GitLabEnterprise repositories for this config. | [optional] 
**create_time** | **str** | Output only. Time when the config was created. | [optional] [readonly] 
**enterprise_config** | [**GitLabEnterpriseConfig**](GitLabEnterpriseConfig.md) |  | [optional] 
**name** | **str** | The resource name for the config. | [optional] 
**secrets** | [**GitLabSecrets**](GitLabSecrets.md) |  | [optional] 
**username** | **str** | Username of the GitLab.com or GitLab Enterprise account Cloud Build will use. | [optional] 
**webhook_key** | **str** | Output only. UUID included in webhook requests. The UUID is used to look up the corresponding config. | [optional] [readonly] 

## Example

```python
from openapi_client.models.git_lab_config import GitLabConfig

# TODO update the JSON string below
json = "{}"
# create an instance of GitLabConfig from a JSON string
git_lab_config_instance = GitLabConfig.from_json(json)
# print the JSON string representation of the object
print(GitLabConfig.to_json())

# convert the object into a dict
git_lab_config_dict = git_lab_config_instance.to_dict()
# create an instance of GitLabConfig from a dict
git_lab_config_from_dict = GitLabConfig.from_dict(git_lab_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


