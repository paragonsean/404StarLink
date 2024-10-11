# OutputGroupAutomatedEncodingSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**abr_settings** | [**AutomatedEncodingSettingsAbrSettings**](AutomatedEncodingSettingsAbrSettings.md) |  | [optional] 

## Example

```python
from openapi_client.models.output_group_automated_encoding_settings import OutputGroupAutomatedEncodingSettings

# TODO update the JSON string below
json = "{}"
# create an instance of OutputGroupAutomatedEncodingSettings from a JSON string
output_group_automated_encoding_settings_instance = OutputGroupAutomatedEncodingSettings.from_json(json)
# print the JSON string representation of the object
print(OutputGroupAutomatedEncodingSettings.to_json())

# convert the object into a dict
output_group_automated_encoding_settings_dict = output_group_automated_encoding_settings_instance.to_dict()
# create an instance of OutputGroupAutomatedEncodingSettings from a dict
output_group_automated_encoding_settings_from_dict = OutputGroupAutomatedEncodingSettings.from_dict(output_group_automated_encoding_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


