# AutomatedAbrSettings

Use automated ABR to have MediaConvert set up the renditions in your ABR package for you automatically, based on characteristics of your input video. This feature optimizes video quality while minimizing the overall size of your ABR package.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_abr_bitrate** | **int** |  | [optional] 
**max_renditions** | **int** |  | [optional] 
**min_abr_bitrate** | **int** |  | [optional] 
**rules** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.automated_abr_settings import AutomatedAbrSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AutomatedAbrSettings from a JSON string
automated_abr_settings_instance = AutomatedAbrSettings.from_json(json)
# print the JSON string representation of the object
print(AutomatedAbrSettings.to_json())

# convert the object into a dict
automated_abr_settings_dict = automated_abr_settings_instance.to_dict()
# create an instance of AutomatedAbrSettings from a dict
automated_abr_settings_from_dict = AutomatedAbrSettings.from_dict(automated_abr_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


