# GitLabEnterpriseConfig

GitLabEnterpriseConfig represents the configuration for a GitLabEnterprise integration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**host_uri** | **str** | Immutable. The URI of the GitlabEnterprise host. | [optional] 
**service_directory_config** | [**ServiceDirectoryConfig**](ServiceDirectoryConfig.md) |  | [optional] 
**ssl_ca** | **str** | The SSL certificate to use in requests to GitLab Enterprise instances. | [optional] 

## Example

```python
from openapi_client.models.git_lab_enterprise_config import GitLabEnterpriseConfig

# TODO update the JSON string below
json = "{}"
# create an instance of GitLabEnterpriseConfig from a JSON string
git_lab_enterprise_config_instance = GitLabEnterpriseConfig.from_json(json)
# print the JSON string representation of the object
print(GitLabEnterpriseConfig.to_json())

# convert the object into a dict
git_lab_enterprise_config_dict = git_lab_enterprise_config_instance.to_dict()
# create an instance of GitLabEnterpriseConfig from a dict
git_lab_enterprise_config_from_dict = GitLabEnterpriseConfig.from_dict(git_lab_enterprise_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


