# RepositoryPreReceiveHook


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configuration_url** | **str** |  | [optional] 
**enforcement** | **str** |  | [optional] 
**id** | **int** |  | [optional] 
**name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.repository_pre_receive_hook import RepositoryPreReceiveHook

# TODO update the JSON string below
json = "{}"
# create an instance of RepositoryPreReceiveHook from a JSON string
repository_pre_receive_hook_instance = RepositoryPreReceiveHook.from_json(json)
# print the JSON string representation of the object
print(RepositoryPreReceiveHook.to_json())

# convert the object into a dict
repository_pre_receive_hook_dict = repository_pre_receive_hook_instance.to_dict()
# create an instance of RepositoryPreReceiveHook from a dict
repository_pre_receive_hook_from_dict = RepositoryPreReceiveHook.from_dict(repository_pre_receive_hook_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


