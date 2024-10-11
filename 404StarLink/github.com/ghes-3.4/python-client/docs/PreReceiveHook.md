# PreReceiveHook


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_downstream_configuration** | **bool** |  | [optional] 
**enforcement** | **str** |  | [optional] 
**environment** | [**PreReceiveHookEnvironment**](PreReceiveHookEnvironment.md) |  | [optional] 
**id** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**script** | **str** |  | [optional] 
**script_repository** | [**PreReceiveHookScriptRepository**](PreReceiveHookScriptRepository.md) |  | [optional] 

## Example

```python
from openapi_client.models.pre_receive_hook import PreReceiveHook

# TODO update the JSON string below
json = "{}"
# create an instance of PreReceiveHook from a JSON string
pre_receive_hook_instance = PreReceiveHook.from_json(json)
# print the JSON string representation of the object
print(PreReceiveHook.to_json())

# convert the object into a dict
pre_receive_hook_dict = pre_receive_hook_instance.to_dict()
# create an instance of PreReceiveHook from a dict
pre_receive_hook_from_dict = PreReceiveHook.from_dict(pre_receive_hook_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


