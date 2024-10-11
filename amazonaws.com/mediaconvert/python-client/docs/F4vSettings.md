# F4vSettings

Settings for F4v container

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**moov_placement** | [**F4vMoovPlacement**](F4vMoovPlacement.md) |  | [optional] 

## Example

```python
from openapi_client.models.f4v_settings import F4vSettings

# TODO update the JSON string below
json = "{}"
# create an instance of F4vSettings from a JSON string
f4v_settings_instance = F4vSettings.from_json(json)
# print the JSON string representation of the object
print(F4vSettings.to_json())

# convert the object into a dict
f4v_settings_dict = f4v_settings_instance.to_dict()
# create an instance of F4vSettings from a dict
f4v_settings_from_dict = F4vSettings.from_dict(f4v_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


