# RemoveBitbucketServerConnectedRepositoryRequest

RPC request object accepted by RemoveBitbucketServerConnectedRepository RPC method.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connected_repository** | [**BitbucketServerRepositoryId**](BitbucketServerRepositoryId.md) |  | [optional] 

## Example

```python
from openapi_client.models.remove_bitbucket_server_connected_repository_request import RemoveBitbucketServerConnectedRepositoryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RemoveBitbucketServerConnectedRepositoryRequest from a JSON string
remove_bitbucket_server_connected_repository_request_instance = RemoveBitbucketServerConnectedRepositoryRequest.from_json(json)
# print the JSON string representation of the object
print(RemoveBitbucketServerConnectedRepositoryRequest.to_json())

# convert the object into a dict
remove_bitbucket_server_connected_repository_request_dict = remove_bitbucket_server_connected_repository_request_instance.to_dict()
# create an instance of RemoveBitbucketServerConnectedRepositoryRequest from a dict
remove_bitbucket_server_connected_repository_request_from_dict = RemoveBitbucketServerConnectedRepositoryRequest.from_dict(remove_bitbucket_server_connected_repository_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


