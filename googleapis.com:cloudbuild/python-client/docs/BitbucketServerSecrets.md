# BitbucketServerSecrets

BitbucketServerSecrets represents the secrets in Secret Manager for a Bitbucket Server.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**admin_access_token_version_name** | **str** | Required. The resource name for the admin access token&#39;s secret version. | [optional] 
**read_access_token_version_name** | **str** | Required. The resource name for the read access token&#39;s secret version. | [optional] 
**webhook_secret_version_name** | **str** | Required. Immutable. The resource name for the webhook secret&#39;s secret version. Once this field has been set, it cannot be changed. If you need to change it, please create another BitbucketServerConfig. | [optional] 

## Example

```python
from openapi_client.models.bitbucket_server_secrets import BitbucketServerSecrets

# TODO update the JSON string below
json = "{}"
# create an instance of BitbucketServerSecrets from a JSON string
bitbucket_server_secrets_instance = BitbucketServerSecrets.from_json(json)
# print the JSON string representation of the object
print(BitbucketServerSecrets.to_json())

# convert the object into a dict
bitbucket_server_secrets_dict = bitbucket_server_secrets_instance.to_dict()
# create an instance of BitbucketServerSecrets from a dict
bitbucket_server_secrets_from_dict = BitbucketServerSecrets.from_dict(bitbucket_server_secrets_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


