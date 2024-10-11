# BitbucketServerRepository

BitbucketServerRepository represents a repository hosted on a Bitbucket Server.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**browse_uri** | **str** | Link to the browse repo page on the Bitbucket Server instance. | [optional] 
**description** | **str** | Description of the repository. | [optional] 
**display_name** | **str** | Display name of the repository. | [optional] 
**name** | **str** | The resource name of the repository. | [optional] 
**repo_id** | [**BitbucketServerRepositoryId**](BitbucketServerRepositoryId.md) |  | [optional] 

## Example

```python
from openapi_client.models.bitbucket_server_repository import BitbucketServerRepository

# TODO update the JSON string below
json = "{}"
# create an instance of BitbucketServerRepository from a JSON string
bitbucket_server_repository_instance = BitbucketServerRepository.from_json(json)
# print the JSON string representation of the object
print(BitbucketServerRepository.to_json())

# convert the object into a dict
bitbucket_server_repository_dict = bitbucket_server_repository_instance.to_dict()
# create an instance of BitbucketServerRepository from a dict
bitbucket_server_repository_from_dict = BitbucketServerRepository.from_dict(bitbucket_server_repository_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


