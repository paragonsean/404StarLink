# ListBitbucketServerConfigsResponse

RPC response object returned by ListBitbucketServerConfigs RPC method.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bitbucket_server_configs** | [**List[BitbucketServerConfig]**](BitbucketServerConfig.md) | A list of BitbucketServerConfigs | [optional] 
**next_page_token** | **str** | A token that can be sent as &#x60;page_token&#x60; to retrieve the next page. If this field is omitted, there are no subsequent pages. | [optional] 

## Example

```python
from openapi_client.models.list_bitbucket_server_configs_response import ListBitbucketServerConfigsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListBitbucketServerConfigsResponse from a JSON string
list_bitbucket_server_configs_response_instance = ListBitbucketServerConfigsResponse.from_json(json)
# print the JSON string representation of the object
print(ListBitbucketServerConfigsResponse.to_json())

# convert the object into a dict
list_bitbucket_server_configs_response_dict = list_bitbucket_server_configs_response_instance.to_dict()
# create an instance of ListBitbucketServerConfigsResponse from a dict
list_bitbucket_server_configs_response_from_dict = ListBitbucketServerConfigsResponse.from_dict(list_bitbucket_server_configs_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


