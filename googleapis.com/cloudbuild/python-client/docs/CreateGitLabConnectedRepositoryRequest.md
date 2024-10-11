# CreateGitLabConnectedRepositoryRequest

Request to connect a repository from a connected GitLab host.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gitlab_connected_repository** | [**GitLabConnectedRepository**](GitLabConnectedRepository.md) |  | [optional] 
**parent** | **str** | Required. The name of the &#x60;GitLabConfig&#x60; that adds connected repository. Format: &#x60;projects/{project}/locations/{location}/gitLabConfigs/{config}&#x60; | [optional] 

## Example

```python
from openapi_client.models.create_git_lab_connected_repository_request import CreateGitLabConnectedRepositoryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateGitLabConnectedRepositoryRequest from a JSON string
create_git_lab_connected_repository_request_instance = CreateGitLabConnectedRepositoryRequest.from_json(json)
# print the JSON string representation of the object
print(CreateGitLabConnectedRepositoryRequest.to_json())

# convert the object into a dict
create_git_lab_connected_repository_request_dict = create_git_lab_connected_repository_request_instance.to_dict()
# create an instance of CreateGitLabConnectedRepositoryRequest from a dict
create_git_lab_connected_repository_request_from_dict = CreateGitLabConnectedRepositoryRequest.from_dict(create_git_lab_connected_repository_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


