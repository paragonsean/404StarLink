# ListGithubEnterpriseConfigsResponse

RPC response object returned by ListGithubEnterpriseConfigs RPC method.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configs** | [**List[GitHubEnterpriseConfig]**](GitHubEnterpriseConfig.md) | A list of GitHubEnterpriseConfigs | [optional] 

## Example

```python
from openapi_client.models.list_github_enterprise_configs_response import ListGithubEnterpriseConfigsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListGithubEnterpriseConfigsResponse from a JSON string
list_github_enterprise_configs_response_instance = ListGithubEnterpriseConfigsResponse.from_json(json)
# print the JSON string representation of the object
print(ListGithubEnterpriseConfigsResponse.to_json())

# convert the object into a dict
list_github_enterprise_configs_response_dict = list_github_enterprise_configs_response_instance.to_dict()
# create an instance of ListGithubEnterpriseConfigsResponse from a dict
list_github_enterprise_configs_response_from_dict = ListGithubEnterpriseConfigsResponse.from_dict(list_github_enterprise_configs_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


