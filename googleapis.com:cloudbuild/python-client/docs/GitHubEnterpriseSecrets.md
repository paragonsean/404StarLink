# GitHubEnterpriseSecrets

GitHubEnterpriseSecrets represents the names of all necessary secrets in Secret Manager for a GitHub Enterprise server. Format is: projects//secrets/.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**oauth_client_id_name** | **str** | The resource name for the OAuth client ID secret in Secret Manager. | [optional] 
**oauth_client_id_version_name** | **str** | The resource name for the OAuth client ID secret version in Secret Manager. | [optional] 
**oauth_secret_name** | **str** | The resource name for the OAuth secret in Secret Manager. | [optional] 
**oauth_secret_version_name** | **str** | The resource name for the OAuth secret secret version in Secret Manager. | [optional] 
**private_key_name** | **str** | The resource name for the private key secret. | [optional] 
**private_key_version_name** | **str** | The resource name for the private key secret version. | [optional] 
**webhook_secret_name** | **str** | The resource name for the webhook secret in Secret Manager. | [optional] 
**webhook_secret_version_name** | **str** | The resource name for the webhook secret secret version in Secret Manager. | [optional] 

## Example

```python
from openapi_client.models.git_hub_enterprise_secrets import GitHubEnterpriseSecrets

# TODO update the JSON string below
json = "{}"
# create an instance of GitHubEnterpriseSecrets from a JSON string
git_hub_enterprise_secrets_instance = GitHubEnterpriseSecrets.from_json(json)
# print the JSON string representation of the object
print(GitHubEnterpriseSecrets.to_json())

# convert the object into a dict
git_hub_enterprise_secrets_dict = git_hub_enterprise_secrets_instance.to_dict()
# create an instance of GitHubEnterpriseSecrets from a dict
git_hub_enterprise_secrets_from_dict = GitHubEnterpriseSecrets.from_dict(git_hub_enterprise_secrets_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


