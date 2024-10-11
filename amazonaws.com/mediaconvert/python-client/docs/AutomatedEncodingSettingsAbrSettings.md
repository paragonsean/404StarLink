# AutomatedEncodingSettingsAbrSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_abr_bitrate** | **int** |  | [optional] 
**max_renditions** | **int** |  | [optional] 
**min_abr_bitrate** | **int** |  | [optional] 
**rules** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.automated_encoding_settings_abr_settings import AutomatedEncodingSettingsAbrSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AutomatedEncodingSettingsAbrSettings from a JSON string
automated_encoding_settings_abr_settings_instance = AutomatedEncodingSettingsAbrSettings.from_json(json)
# print the JSON string representation of the object
print(AutomatedEncodingSettingsAbrSettings.to_json())

# convert the object into a dict
automated_encoding_settings_abr_settings_dict = automated_encoding_settings_abr_settings_instance.to_dict()
# create an instance of AutomatedEncodingSettingsAbrSettings from a dict
automated_encoding_settings_abr_settings_from_dict = AutomatedEncodingSettingsAbrSettings.from_dict(automated_encoding_settings_abr_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


