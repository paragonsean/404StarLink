# CreatePresetResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**preset** | [**CreatePresetResponsePreset**](CreatePresetResponsePreset.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_preset_response import CreatePresetResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreatePresetResponse from a JSON string
create_preset_response_instance = CreatePresetResponse.from_json(json)
# print the JSON string representation of the object
print(CreatePresetResponse.to_json())

# convert the object into a dict
create_preset_response_dict = create_preset_response_instance.to_dict()
# create an instance of CreatePresetResponse from a dict
create_preset_response_from_dict = CreatePresetResponse.from_dict(create_preset_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


