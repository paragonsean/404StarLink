# EmbeddedSourceSettings

Settings for embedded captions Source

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**convert608_to708** | [**EmbeddedConvert608To708**](EmbeddedConvert608To708.md) |  | [optional] 
**source608_channel_number** | **int** |  | [optional] 
**source608_track_number** | **int** |  | [optional] 
**terminate_captions** | [**EmbeddedTerminateCaptions**](EmbeddedTerminateCaptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.embedded_source_settings import EmbeddedSourceSettings

# TODO update the JSON string below
json = "{}"
# create an instance of EmbeddedSourceSettings from a JSON string
embedded_source_settings_instance = EmbeddedSourceSettings.from_json(json)
# print the JSON string representation of the object
print(EmbeddedSourceSettings.to_json())

# convert the object into a dict
embedded_source_settings_dict = embedded_source_settings_instance.to_dict()
# create an instance of EmbeddedSourceSettings from a dict
embedded_source_settings_from_dict = EmbeddedSourceSettings.from_dict(embedded_source_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


