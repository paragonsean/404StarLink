# BatchCreateBitbucketServerConnectedRepositoriesRequest

RPC request object accepted by BatchCreateBitbucketServerConnectedRepositories RPC method.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**List[CreateBitbucketServerConnectedRepositoryRequest]**](CreateBitbucketServerConnectedRepositoryRequest.md) | Required. Requests to connect Bitbucket Server repositories. | [optional] 

## Example

```python
from openapi_client.models.batch_create_bitbucket_server_connected_repositories_request import BatchCreateBitbucketServerConnectedRepositoriesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BatchCreateBitbucketServerConnectedRepositoriesRequest from a JSON string
batch_create_bitbucket_server_connected_repositories_request_instance = BatchCreateBitbucketServerConnectedRepositoriesRequest.from_json(json)
# print the JSON string representation of the object
print(BatchCreateBitbucketServerConnectedRepositoriesRequest.to_json())

# convert the object into a dict
batch_create_bitbucket_server_connected_repositories_request_dict = batch_create_bitbucket_server_connected_repositories_request_instance.to_dict()
# create an instance of BatchCreateBitbucketServerConnectedRepositoriesRequest from a dict
batch_create_bitbucket_server_connected_repositories_request_from_dict = BatchCreateBitbucketServerConnectedRepositoriesRequest.from_dict(batch_create_bitbucket_server_connected_repositories_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


