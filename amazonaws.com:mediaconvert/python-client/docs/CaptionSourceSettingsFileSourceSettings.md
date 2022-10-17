# CaptionSourceSettingsFileSourceSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**convert608_to708** | [**FileSourceConvert608To708**](FileSourceConvert608To708.md) |  | [optional] 
**framerate** | [**FileSourceSettingsFramerate**](FileSourceSettingsFramerate.md) |  | [optional] 
**source_file** | **str** |  | [optional] 
**time_delta** | **int** |  | [optional] 
**time_delta_units** | [**FileSourceTimeDeltaUnits**](FileSourceTimeDeltaUnits.md) |  | [optional] 

## Example

```python
from openapi_client.models.caption_source_settings_file_source_settings import CaptionSourceSettingsFileSourceSettings

# TODO update the JSON string below
json = "{}"
# create an instance of CaptionSourceSettingsFileSourceSettings from a JSON string
caption_source_settings_file_source_settings_instance = CaptionSourceSettingsFileSourceSettings.from_json(json)
# print the JSON string representation of the object
print(CaptionSourceSettingsFileSourceSettings.to_json())

# convert the object into a dict
caption_source_settings_file_source_settings_dict = caption_source_settings_file_source_settings_instance.to_dict()
# create an instance of CaptionSourceSettingsFileSourceSettings from a dict
caption_source_settings_file_source_settings_from_dict = CaptionSourceSettingsFileSourceSettings.from_dict(caption_source_settings_file_source_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


