# ListBitbucketServerRepositoriesResponse

RPC response object returned by the ListBitbucketServerRepositories RPC method.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bitbucket_server_repositories** | [**List[BitbucketServerRepository]**](BitbucketServerRepository.md) | List of Bitbucket Server repositories. | [optional] 
**next_page_token** | **str** | A token that can be sent as &#x60;page_token&#x60; to retrieve the next page. If this field is omitted, there are no subsequent pages. | [optional] 

## Example

```python
from openapi_client.models.list_bitbucket_server_repositories_response import ListBitbucketServerRepositoriesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListBitbucketServerRepositoriesResponse from a JSON string
list_bitbucket_server_repositories_response_instance = ListBitbucketServerRepositoriesResponse.from_json(json)
# print the JSON string representation of the object
print(ListBitbucketServerRepositoriesResponse.to_json())

# convert the object into a dict
list_bitbucket_server_repositories_response_dict = list_bitbucket_server_repositories_response_instance.to_dict()
# create an instance of ListBitbucketServerRepositoriesResponse from a dict
list_bitbucket_server_repositories_response_from_dict = ListBitbucketServerRepositoriesResponse.from_dict(list_bitbucket_server_repositories_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


