# BitbucketServerConfig

BitbucketServerConfig represents the configuration for a Bitbucket Server.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**api_key** | **str** | Required. Immutable. API Key that will be attached to webhook. Once this field has been set, it cannot be changed. If you need to change it, please create another BitbucketServerConfig. | [optional] 
**connected_repositories** | [**List[BitbucketServerRepositoryId]**](BitbucketServerRepositoryId.md) | Output only. Connected Bitbucket Server repositories for this config. | [optional] [readonly] 
**create_time** | **str** | Time when the config was created. | [optional] 
**host_uri** | **str** | Required. Immutable. The URI of the Bitbucket Server host. Once this field has been set, it cannot be changed. If you need to change it, please create another BitbucketServerConfig. | [optional] 
**name** | **str** | The resource name for the config. | [optional] 
**peered_network** | **str** | Optional. The network to be used when reaching out to the Bitbucket Server instance. The VPC network must be enabled for private service connection. This should be set if the Bitbucket Server instance is hosted on-premises and not reachable by public internet. If this field is left empty, no network peering will occur and calls to the Bitbucket Server instance will be made over the public internet. Must be in the format &#x60;projects/{project}/global/networks/{network}&#x60;, where {project} is a project number or id and {network} is the name of a VPC network in the project. | [optional] 
**secrets** | [**BitbucketServerSecrets**](BitbucketServerSecrets.md) |  | [optional] 
**ssl_ca** | **str** | Optional. SSL certificate to use for requests to Bitbucket Server. The format should be PEM format but the extension can be one of .pem, .cer, or .crt. | [optional] 
**username** | **str** | Username of the account Cloud Build will use on Bitbucket Server. | [optional] 
**webhook_key** | **str** | Output only. UUID included in webhook requests. The UUID is used to look up the corresponding config. | [optional] [readonly] 

## Example

```python
from openapi_client.models.bitbucket_server_config import BitbucketServerConfig

# TODO update the JSON string below
json = "{}"
# create an instance of BitbucketServerConfig from a JSON string
bitbucket_server_config_instance = BitbucketServerConfig.from_json(json)
# print the JSON string representation of the object
print(BitbucketServerConfig.to_json())

# convert the object into a dict
bitbucket_server_config_dict = bitbucket_server_config_instance.to_dict()
# create an instance of BitbucketServerConfig from a dict
bitbucket_server_config_from_dict = BitbucketServerConfig.from_dict(bitbucket_server_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


