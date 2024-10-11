# PreReceiveHookEnvironment


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **str** |  | [optional] 
**default_environment** | **bool** |  | [optional] 
**download** | [**PreReceiveEnvironmentDownload**](PreReceiveEnvironmentDownload.md) |  | [optional] 
**hooks_count** | **int** |  | [optional] 
**html_url** | **str** |  | [optional] 
**id** | **int** |  | [optional] 
**image_url** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.pre_receive_hook_environment import PreReceiveHookEnvironment

# TODO update the JSON string below
json = "{}"
# create an instance of PreReceiveHookEnvironment from a JSON string
pre_receive_hook_environment_instance = PreReceiveHookEnvironment.from_json(json)
# print the JSON string representation of the object
print(PreReceiveHookEnvironment.to_json())

# convert the object into a dict
pre_receive_hook_environment_dict = pre_receive_hook_environment_instance.to_dict()
# create an instance of PreReceiveHookEnvironment from a dict
pre_receive_hook_environment_from_dict = PreReceiveHookEnvironment.from_dict(pre_receive_hook_environment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


