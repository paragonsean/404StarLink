# GitHubEnterpriseConfig

GitHubEnterpriseConfig represents a configuration for a GitHub Enterprise server.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_id** | **str** | Required. The GitHub app id of the Cloud Build app on the GitHub Enterprise server. | [optional] 
**create_time** | **str** | Output only. Time when the installation was associated with the project. | [optional] [readonly] 
**display_name** | **str** | Name to display for this config. | [optional] 
**host_url** | **str** | The URL of the github enterprise host the configuration is for. | [optional] 
**name** | **str** | Optional. The full resource name for the GitHubEnterpriseConfig For example: \&quot;projects/{$project_id}/locations/{$location_id}/githubEnterpriseConfigs/{$config_id}\&quot; | [optional] 
**peered_network** | **str** | Optional. The network to be used when reaching out to the GitHub Enterprise server. The VPC network must be enabled for private service connection. This should be set if the GitHub Enterprise server is hosted on-premises and not reachable by public internet. If this field is left empty, no network peering will occur and calls to the GitHub Enterprise server will be made over the public internet. Must be in the format &#x60;projects/{project}/global/networks/{network}&#x60;, where {project} is a project number or id and {network} is the name of a VPC network in the project. | [optional] 
**secrets** | [**GitHubEnterpriseSecrets**](GitHubEnterpriseSecrets.md) |  | [optional] 
**ssl_ca** | **str** | Optional. SSL certificate to use for requests to GitHub Enterprise. | [optional] 
**webhook_key** | **str** | The key that should be attached to webhook calls to the ReceiveWebhook endpoint. | [optional] 

## Example

```python
from openapi_client.models.git_hub_enterprise_config import GitHubEnterpriseConfig

# TODO update the JSON string below
json = "{}"
# create an instance of GitHubEnterpriseConfig from a JSON string
git_hub_enterprise_config_instance = GitHubEnterpriseConfig.from_json(json)
# print the JSON string representation of the object
print(GitHubEnterpriseConfig.to_json())

# convert the object into a dict
git_hub_enterprise_config_dict = git_hub_enterprise_config_instance.to_dict()
# create an instance of GitHubEnterpriseConfig from a dict
git_hub_enterprise_config_from_dict = GitHubEnterpriseConfig.from_dict(git_hub_enterprise_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


