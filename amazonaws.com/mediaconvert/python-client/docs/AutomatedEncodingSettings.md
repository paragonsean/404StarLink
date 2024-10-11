# AutomatedEncodingSettings

Use automated encoding to have MediaConvert choose your encoding settings for you, based on characteristics of your input video.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**abr_settings** | [**AutomatedEncodingSettingsAbrSettings**](AutomatedEncodingSettingsAbrSettings.md) |  | [optional] 

## Example

```python
from openapi_client.models.automated_encoding_settings import AutomatedEncodingSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AutomatedEncodingSettings from a JSON string
automated_encoding_settings_instance = AutomatedEncodingSettings.from_json(json)
# print the JSON string representation of the object
print(AutomatedEncodingSettings.to_json())

# convert the object into a dict
automated_encoding_settings_dict = automated_encoding_settings_instance.to_dict()
# create an instance of AutomatedEncodingSettings from a dict
automated_encoding_settings_from_dict = AutomatedEncodingSettings.from_dict(automated_encoding_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


