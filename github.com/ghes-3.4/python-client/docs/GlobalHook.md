# GlobalHook


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **bool** |  | [optional] 
**config** | [**GlobalHookConfig**](GlobalHookConfig.md) |  | [optional] 
**created_at** | **str** |  | [optional] 
**events** | **List[str]** |  | [optional] 
**id** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**ping_url** | **str** |  | [optional] 
**type** | **str** |  | [optional] 
**updated_at** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.global_hook import GlobalHook

# TODO update the JSON string below
json = "{}"
# create an instance of GlobalHook from a JSON string
global_hook_instance = GlobalHook.from_json(json)
# print the JSON string representation of the object
print(GlobalHook.to_json())

# convert the object into a dict
global_hook_dict = global_hook_instance.to_dict()
# create an instance of GlobalHook from a dict
global_hook_from_dict = GlobalHook.from_dict(global_hook_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


