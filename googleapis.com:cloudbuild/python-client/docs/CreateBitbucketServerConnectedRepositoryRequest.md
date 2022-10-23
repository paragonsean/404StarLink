# CreateBitbucketServerConnectedRepositoryRequest

Request to connect a repository from a connected Bitbucket Server host.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bitbucket_server_connected_repository** | [**BitbucketServerConnectedRepository**](BitbucketServerConnectedRepository.md) |  | [optional] 
**parent** | **str** | Required. The name of the &#x60;BitbucketServerConfig&#x60; that added connected repository. Format: &#x60;projects/{project}/locations/{location}/bitbucketServerConfigs/{config}&#x60; | [optional] 

## Example

```python
from openapi_client.models.create_bitbucket_server_connected_repository_request import CreateBitbucketServerConnectedRepositoryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateBitbucketServerConnectedRepositoryRequest from a JSON string
create_bitbucket_server_connected_repository_request_instance = CreateBitbucketServerConnectedRepositoryRequest.from_json(json)
# print the JSON string representation of the object
print(CreateBitbucketServerConnectedRepositoryRequest.to_json())

# convert the object into a dict
create_bitbucket_server_connected_repository_request_dict = create_bitbucket_server_connected_repository_request_instance.to_dict()
# create an instance of CreateBitbucketServerConnectedRepositoryRequest from a dict
create_bitbucket_server_connected_repository_request_from_dict = CreateBitbucketServerConnectedRepositoryRequest.from_dict(create_bitbucket_server_connected_repository_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


