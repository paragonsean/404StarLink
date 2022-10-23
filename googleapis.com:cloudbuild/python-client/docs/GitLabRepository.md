# GitLabRepository

Proto Representing a GitLabRepository

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**browse_uri** | **str** | Link to the browse repo page on the GitLab instance | [optional] 
**description** | **str** | Description of the repository | [optional] 
**display_name** | **str** | Display name of the repository | [optional] 
**name** | **str** | The resource name of the repository | [optional] 
**repository_id** | [**GitLabRepositoryId**](GitLabRepositoryId.md) |  | [optional] 

## Example

```python
from openapi_client.models.git_lab_repository import GitLabRepository

# TODO update the JSON string below
json = "{}"
# create an instance of GitLabRepository from a JSON string
git_lab_repository_instance = GitLabRepository.from_json(json)
# print the JSON string representation of the object
print(GitLabRepository.to_json())

# convert the object into a dict
git_lab_repository_dict = git_lab_repository_instance.to_dict()
# create an instance of GitLabRepository from a dict
git_lab_repository_from_dict = GitLabRepository.from_dict(git_lab_repository_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


