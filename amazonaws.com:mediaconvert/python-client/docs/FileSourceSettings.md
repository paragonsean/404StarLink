# FileSourceSettings

If your input captions are SCC, SMI, SRT, STL, TTML, WebVTT, or IMSC 1.1 in an xml file, specify the URI of the input caption source file. If your caption source is IMSC in an IMF package, use TrackSourceSettings instead of FileSoureSettings.

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
from openapi_client.models.file_source_settings import FileSourceSettings

# TODO update the JSON string below
json = "{}"
# create an instance of FileSourceSettings from a JSON string
file_source_settings_instance = FileSourceSettings.from_json(json)
# print the JSON string representation of the object
print(FileSourceSettings.to_json())

# convert the object into a dict
file_source_settings_dict = file_source_settings_instance.to_dict()
# create an instance of FileSourceSettings from a dict
file_source_settings_from_dict = FileSourceSettings.from_dict(file_source_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


