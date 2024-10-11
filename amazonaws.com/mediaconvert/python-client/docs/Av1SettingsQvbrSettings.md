# Av1SettingsQvbrSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**qvbr_quality_level** | **int** |  | [optional] 
**qvbr_quality_level_fine_tune** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.av1_settings_qvbr_settings import Av1SettingsQvbrSettings

# TODO update the JSON string below
json = "{}"
# create an instance of Av1SettingsQvbrSettings from a JSON string
av1_settings_qvbr_settings_instance = Av1SettingsQvbrSettings.from_json(json)
# print the JSON string representation of the object
print(Av1SettingsQvbrSettings.to_json())

# convert the object into a dict
av1_settings_qvbr_settings_dict = av1_settings_qvbr_settings_instance.to_dict()
# create an instance of Av1SettingsQvbrSettings from a dict
av1_settings_qvbr_settings_from_dict = Av1SettingsQvbrSettings.from_dict(av1_settings_qvbr_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


