# H265SettingsQvbrSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_average_bitrate** | **int** |  | [optional] 
**qvbr_quality_level** | **int** |  | [optional] 
**qvbr_quality_level_fine_tune** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.h265_settings_qvbr_settings import H265SettingsQvbrSettings

# TODO update the JSON string below
json = "{}"
# create an instance of H265SettingsQvbrSettings from a JSON string
h265_settings_qvbr_settings_instance = H265SettingsQvbrSettings.from_json(json)
# print the JSON string representation of the object
print(H265SettingsQvbrSettings.to_json())

# convert the object into a dict
h265_settings_qvbr_settings_dict = h265_settings_qvbr_settings_instance.to_dict()
# create an instance of H265SettingsQvbrSettings from a dict
h265_settings_qvbr_settings_from_dict = H265SettingsQvbrSettings.from_dict(h265_settings_qvbr_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


