# TeletextSourceSettings

Settings specific to Teletext caption sources, including Page number.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**page_number** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.teletext_source_settings import TeletextSourceSettings

# TODO update the JSON string below
json = "{}"
# create an instance of TeletextSourceSettings from a JSON string
teletext_source_settings_instance = TeletextSourceSettings.from_json(json)
# print the JSON string representation of the object
print(TeletextSourceSettings.to_json())

# convert the object into a dict
teletext_source_settings_dict = teletext_source_settings_instance.to_dict()
# create an instance of TeletextSourceSettings from a dict
teletext_source_settings_from_dict = TeletextSourceSettings.from_dict(teletext_source_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


