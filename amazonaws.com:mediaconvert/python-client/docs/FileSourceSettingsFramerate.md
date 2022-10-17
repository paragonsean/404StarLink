# FileSourceSettingsFramerate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**framerate_denominator** | **int** |  | [optional] 
**framerate_numerator** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.file_source_settings_framerate import FileSourceSettingsFramerate

# TODO update the JSON string below
json = "{}"
# create an instance of FileSourceSettingsFramerate from a JSON string
file_source_settings_framerate_instance = FileSourceSettingsFramerate.from_json(json)
# print the JSON string representation of the object
print(FileSourceSettingsFramerate.to_json())

# convert the object into a dict
file_source_settings_framerate_dict = file_source_settings_framerate_instance.to_dict()
# create an instance of FileSourceSettingsFramerate from a dict
file_source_settings_framerate_from_dict = FileSourceSettingsFramerate.from_dict(file_source_settings_framerate_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


