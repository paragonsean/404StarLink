# BatchCreateGitLabConnectedRepositoriesRequest

RPC request object accepted by BatchCreateGitLabConnectedRepositories RPC method.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**List[CreateGitLabConnectedRepositoryRequest]**](CreateGitLabConnectedRepositoryRequest.md) | Required. Requests to connect GitLab repositories. | [optional] 

## Example

```python
from openapi_client.models.batch_create_git_lab_connected_repositories_request import BatchCreateGitLabConnectedRepositoriesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BatchCreateGitLabConnectedRepositoriesRequest from a JSON string
batch_create_git_lab_connected_repositories_request_instance = BatchCreateGitLabConnectedRepositoriesRequest.from_json(json)
# print the JSON string representation of the object
print(BatchCreateGitLabConnectedRepositoriesRequest.to_json())

# convert the object into a dict
batch_create_git_lab_connected_repositories_request_dict = batch_create_git_lab_connected_repositories_request_instance.to_dict()
# create an instance of BatchCreateGitLabConnectedRepositoriesRequest from a dict
batch_create_git_lab_connected_repositories_request_from_dict = BatchCreateGitLabConnectedRepositoriesRequest.from_dict(batch_create_git_lab_connected_repositories_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


