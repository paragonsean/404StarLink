# GitLabEventsConfig

GitLabEventsConfig describes the configuration of a trigger that creates a build whenever a GitLab event is received.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gitlab_config** | [**GitLabConfig**](GitLabConfig.md) |  | [optional] 
**gitlab_config_resource** | **str** | The GitLab config resource that this trigger config maps to. | [optional] 
**project_namespace** | **str** | Namespace of the GitLab project. | [optional] 
**pull_request** | [**PullRequestFilter**](PullRequestFilter.md) |  | [optional] 
**push** | [**PushFilter**](PushFilter.md) |  | [optional] 

## Example

```python
from openapi_client.models.git_lab_events_config import GitLabEventsConfig

# TODO update the JSON string below
json = "{}"
# create an instance of GitLabEventsConfig from a JSON string
git_lab_events_config_instance = GitLabEventsConfig.from_json(json)
# print the JSON string representation of the object
print(GitLabEventsConfig.to_json())

# convert the object into a dict
git_lab_events_config_dict = git_lab_events_config_instance.to_dict()
# create an instance of GitLabEventsConfig from a dict
git_lab_events_config_from_dict = GitLabEventsConfig.from_dict(git_lab_events_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


