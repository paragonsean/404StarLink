# GlobalHook2Config


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_type** | **str** |  | [optional] 
**insecure_ssl** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.global_hook2_config import GlobalHook2Config

# TODO update the JSON string below
json = "{}"
# create an instance of GlobalHook2Config from a JSON string
global_hook2_config_instance = GlobalHook2Config.from_json(json)
# print the JSON string representation of the object
print(GlobalHook2Config.to_json())

# convert the object into a dict
global_hook2_config_dict = global_hook2_config_instance.to_dict()
# create an instance of GlobalHook2Config from a dict
global_hook2_config_from_dict = GlobalHook2Config.from_dict(global_hook2_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


