# UpdatePresetResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**preset** | [**CreatePresetResponsePreset**](CreatePresetResponsePreset.md) |  | [optional] 

## Example

```python
from openapi_client.models.update_preset_response import UpdatePresetResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePresetResponse from a JSON string
update_preset_response_instance = UpdatePresetResponse.from_json(json)
# print the JSON string representation of the object
print(UpdatePresetResponse.to_json())

# convert the object into a dict
update_preset_response_dict = update_preset_response_instance.to_dict()
# create an instance of UpdatePresetResponse from a dict
update_preset_response_from_dict = UpdatePresetResponse.from_dict(update_preset_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


