# GitLabSecrets

GitLabSecrets represents the secrets in Secret Manager for a GitLab integration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**api_access_token_version** | **str** | Required. The resource name for the api access token’s secret version | [optional] 
**api_key_version** | **str** | Required. Immutable. API Key that will be attached to webhook requests from GitLab to Cloud Build. | [optional] 
**read_access_token_version** | **str** | Required. The resource name for the read access token’s secret version | [optional] 
**webhook_secret_version** | **str** | Required. Immutable. The resource name for the webhook secret’s secret version. Once this field has been set, it cannot be changed. If you need to change it, please create another GitLabConfig. | [optional] 

## Example

```python
from openapi_client.models.git_lab_secrets import GitLabSecrets

# TODO update the JSON string below
json = "{}"
# create an instance of GitLabSecrets from a JSON string
git_lab_secrets_instance = GitLabSecrets.from_json(json)
# print the JSON string representation of the object
print(GitLabSecrets.to_json())

# convert the object into a dict
git_lab_secrets_dict = git_lab_secrets_instance.to_dict()
# create an instance of GitLabSecrets from a dict
git_lab_secrets_from_dict = GitLabSecrets.from_dict(git_lab_secrets_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


