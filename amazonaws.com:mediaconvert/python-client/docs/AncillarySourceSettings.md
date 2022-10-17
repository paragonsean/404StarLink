# AncillarySourceSettings

Settings for ancillary captions source.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**convert608_to708** | [**AncillaryConvert608To708**](AncillaryConvert608To708.md) |  | [optional] 
**source_ancillary_channel_number** | **int** |  | [optional] 
**terminate_captions** | [**AncillaryTerminateCaptions**](AncillaryTerminateCaptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.ancillary_source_settings import AncillarySourceSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AncillarySourceSettings from a JSON string
ancillary_source_settings_instance = AncillarySourceSettings.from_json(json)
# print the JSON string representation of the object
print(AncillarySourceSettings.to_json())

# convert the object into a dict
ancillary_source_settings_dict = ancillary_source_settings_instance.to_dict()
# create an instance of AncillarySourceSettings from a dict
ancillary_source_settings_from_dict = AncillarySourceSettings.from_dict(ancillary_source_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


