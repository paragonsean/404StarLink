# FileGroupSettings

Settings related to your File output group. MediaConvert uses this group of settings to generate a single standalone file, rather than a streaming package. When you work directly in your JSON job specification, include this object and any required children when you set Type, under OutputGroupSettings, to FILE_GROUP_SETTINGS.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination** | **str** |  | [optional] 
**destination_settings** | [**CmafGroupSettingsDestinationSettings**](CmafGroupSettingsDestinationSettings.md) |  | [optional] 

## Example

```python
from openapi_client.models.file_group_settings import FileGroupSettings

# TODO update the JSON string below
json = "{}"
# create an instance of FileGroupSettings from a JSON string
file_group_settings_instance = FileGroupSettings.from_json(json)
# print the JSON string representation of the object
print(FileGroupSettings.to_json())

# convert the object into a dict
file_group_settings_dict = file_group_settings_instance.to_dict()
# create an instance of FileGroupSettings from a dict
file_group_settings_from_dict = FileGroupSettings.from_dict(file_group_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


