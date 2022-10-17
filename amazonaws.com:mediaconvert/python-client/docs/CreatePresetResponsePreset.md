# CreatePresetResponsePreset


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**category** | **str** |  | [optional] 
**created_at** | **datetime** |  | [optional] 
**description** | **str** |  | [optional] 
**last_updated** | **datetime** |  | [optional] 
**name** | **str** |  | 
**settings** | [**CreatePresetRequestSettings**](CreatePresetRequestSettings.md) |  | 
**type** | [**Type**](Type.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_preset_response_preset import CreatePresetResponsePreset

# TODO update the JSON string below
json = "{}"
# create an instance of CreatePresetResponsePreset from a JSON string
create_preset_response_preset_instance = CreatePresetResponsePreset.from_json(json)
# print the JSON string representation of the object
print(CreatePresetResponsePreset.to_json())

# convert the object into a dict
create_preset_response_preset_dict = create_preset_response_preset_instance.to_dict()
# create an instance of CreatePresetResponsePreset from a dict
create_preset_response_preset_from_dict = CreatePresetResponsePreset.from_dict(create_preset_response_preset_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


