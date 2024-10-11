# GlobalHook2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **bool** |  | [optional] 
**config** | [**GlobalHook2Config**](GlobalHook2Config.md) |  | [optional] 
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
from openapi_client.models.global_hook2 import GlobalHook2

# TODO update the JSON string below
json = "{}"
# create an instance of GlobalHook2 from a JSON string
global_hook2_instance = GlobalHook2.from_json(json)
# print the JSON string representation of the object
print(GlobalHook2.to_json())

# convert the object into a dict
global_hook2_dict = global_hook2_instance.to_dict()
# create an instance of GlobalHook2 from a dict
global_hook2_from_dict = GlobalHook2.from_dict(global_hook2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


