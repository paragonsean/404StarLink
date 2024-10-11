# ActionsListRepoSecrets200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**secrets** | [**List[ActionsSecret]**](ActionsSecret.md) |  | 
**total_count** | **int** |  | 

## Example

```python
from openapi_client.models.actions_list_repo_secrets200_response import ActionsListRepoSecrets200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ActionsListRepoSecrets200Response from a JSON string
actions_list_repo_secrets200_response_instance = ActionsListRepoSecrets200Response.from_json(json)
# print the JSON string representation of the object
print(ActionsListRepoSecrets200Response.to_json())

# convert the object into a dict
actions_list_repo_secrets200_response_dict = actions_list_repo_secrets200_response_instance.to_dict()
# create an instance of ActionsListRepoSecrets200Response from a dict
actions_list_repo_secrets200_response_from_dict = ActionsListRepoSecrets200Response.from_dict(actions_list_repo_secrets200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


