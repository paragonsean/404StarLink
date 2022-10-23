# ListGitLabConfigsResponse

RPC response object returned by ListGitLabConfigs RPC method.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gitlab_configs** | [**List[GitLabConfig]**](GitLabConfig.md) | A list of GitLabConfigs | [optional] 
**next_page_token** | **str** | A token that can be sent as &#x60;page_token&#x60; to retrieve the next page If this field is omitted, there are no subsequent pages. | [optional] 

## Example

```python
from openapi_client.models.list_git_lab_configs_response import ListGitLabConfigsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListGitLabConfigsResponse from a JSON string
list_git_lab_configs_response_instance = ListGitLabConfigsResponse.from_json(json)
# print the JSON string representation of the object
print(ListGitLabConfigsResponse.to_json())

# convert the object into a dict
list_git_lab_configs_response_dict = list_git_lab_configs_response_instance.to_dict()
# create an instance of ListGitLabConfigsResponse from a dict
list_git_lab_configs_response_from_dict = ListGitLabConfigsResponse.from_dict(list_git_lab_configs_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


