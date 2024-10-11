# RepositoryEventConfig

The configuration of a trigger that creates a build whenever an event from Repo API is received.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pull_request** | [**PullRequestFilter**](PullRequestFilter.md) |  | [optional] 
**push** | [**PushFilter**](PushFilter.md) |  | [optional] 
**repository** | **str** | The resource name of the Repo API resource. | [optional] 
**repository_type** | **str** | Output only. The type of the SCM vendor the repository points to. | [optional] [readonly] 

## Example

```python
from openapi_client.models.repository_event_config import RepositoryEventConfig

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryEventConfig from a JSON string
repository_event_config_instance = RepositoryEventConfig.from_json(json)
# print the JSON string representation of the object
print(RepositoryEventConfig.to_json())

# convert the object into a dict
repository_event_config_dict = repository_event_config_instance.to_dict()
# create an instance of RepositoryEventConfig from a dict
repository_event_config_from_dict = RepositoryEventConfig.from_dict(repository_event_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


