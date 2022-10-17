# GetPresetResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**preset** | [**CreatePresetResponsePreset**](CreatePresetResponsePreset.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_preset_response import GetPresetResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetPresetResponse from a JSON string
get_preset_response_instance = GetPresetResponse.from_json(json)
# print the JSON string representation of the object
print(GetPresetResponse.to_json())

# convert the object into a dict
get_preset_response_dict = get_preset_response_instance.to_dict()
# create an instance of GetPresetResponse from a dict
get_preset_response_from_dict = GetPresetResponse.from_dict(get_preset_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


