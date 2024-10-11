# RemoveGitLabConnectedRepositoryRequest

RPC request object accepted by RemoveGitLabConnectedRepository RPC method.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connected_repository** | [**GitLabRepositoryId**](GitLabRepositoryId.md) |  | [optional] 

## Example

```python
from openapi_client.models.remove_git_lab_connected_repository_request import RemoveGitLabConnectedRepositoryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RemoveGitLabConnectedRepositoryRequest from a JSON string
remove_git_lab_connected_repository_request_instance = RemoveGitLabConnectedRepositoryRequest.from_json(json)
# print the JSON string representation of the object
print(RemoveGitLabConnectedRepositoryRequest.to_json())

# convert the object into a dict
remove_git_lab_connected_repository_request_dict = remove_git_lab_connected_repository_request_instance.to_dict()
# create an instance of RemoveGitLabConnectedRepositoryRequest from a dict
remove_git_lab_connected_repository_request_from_dict = RemoveGitLabConnectedRepositoryRequest.from_dict(remove_git_lab_connected_repository_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


