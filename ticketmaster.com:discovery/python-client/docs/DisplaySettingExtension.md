# DisplaySettingExtension

Event's display settings extension

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**soft_landing** | **bool** | True the landing is Soft otherwise it&#39;s Comingled | [optional] [default to False]

## Example

```python
from openapi_client.models.display_setting_extension import DisplaySettingExtension

# TODO update the JSON string below
json = "{}"
# create an instance of DisplaySettingExtension from a JSON string
display_setting_extension_instance = DisplaySettingExtension.from_json(json)
# print the JSON string representation of the object
print(DisplaySettingExtension.to_json())

# convert the object into a dict
display_setting_extension_dict = display_setting_extension_instance.to_dict()
# create an instance of DisplaySettingExtension from a dict
display_setting_extension_from_dict = DisplaySettingExtension.from_dict(display_setting_extension_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


