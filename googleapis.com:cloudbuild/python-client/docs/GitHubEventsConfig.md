# GitHubEventsConfig

GitHubEventsConfig describes the configuration of a trigger that creates a build whenever a GitHub event is received.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enterprise_config_resource_name** | **str** | Optional. The resource name of the github enterprise config that should be applied to this installation. For example: \&quot;projects/{$project_id}/locations/{$location_id}/githubEnterpriseConfigs/{$config_id}\&quot; | [optional] 
**installation_id** | **str** | The installationID that emits the GitHub event. | [optional] 
**name** | **str** | Name of the repository. For example: The name for https://github.com/googlecloudplatform/cloud-builders is \&quot;cloud-builders\&quot;. | [optional] 
**owner** | **str** | Owner of the repository. For example: The owner for https://github.com/googlecloudplatform/cloud-builders is \&quot;googlecloudplatform\&quot;. | [optional] 
**pull_request** | [**PullRequestFilter**](PullRequestFilter.md) |  | [optional] 
**push** | [**PushFilter**](PushFilter.md) |  | [optional] 

## Example

```python
from openapi_client.models.git_hub_events_config import GitHubEventsConfig

# TODO update the JSON string below
json = "{}"
# create an instance of GitHubEventsConfig from a JSON string
git_hub_events_config_instance = GitHubEventsConfig.from_json(json)
# print the JSON string representation of the object
print(GitHubEventsConfig.to_json())

# convert the object into a dict
git_hub_events_config_dict = git_hub_events_config_instance.to_dict()
# create an instance of GitHubEventsConfig from a dict
git_hub_events_config_from_dict = GitHubEventsConfig.from_dict(git_hub_events_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


