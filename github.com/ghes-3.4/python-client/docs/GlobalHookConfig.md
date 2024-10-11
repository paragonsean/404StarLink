# GlobalHookConfig


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_type** | **str** |  | [optional] 
**insecure_ssl** | **str** |  | [optional] 
**secret** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.global_hook_config import GlobalHookConfig

# TODO update the JSON string below
json = "{}"
# create an instance of GlobalHookConfig from a JSON string
global_hook_config_instance = GlobalHookConfig.from_json(json)
# print the JSON string representation of the object
print(GlobalHookConfig.to_json())

# convert the object into a dict
global_hook_config_dict = global_hook_config_instance.to_dict()
# create an instance of GlobalHookConfig from a dict
global_hook_config_from_dict = GlobalHookConfig.from_dict(global_hook_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


