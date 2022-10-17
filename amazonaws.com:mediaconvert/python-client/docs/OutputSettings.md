# OutputSettings

Specific settings for this type of output.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hls_settings** | [**OutputSettingsHlsSettings**](OutputSettingsHlsSettings.md) |  | [optional] 

## Example

```python
from openapi_client.models.output_settings import OutputSettings

# TODO update the JSON string below
json = "{}"
# create an instance of OutputSettings from a JSON string
output_settings_instance = OutputSettings.from_json(json)
# print the JSON string representation of the object
print(OutputSettings.to_json())

# convert the object into a dict
output_settings_dict = output_settings_instance.to_dict()
# create an instance of OutputSettings from a dict
output_settings_from_dict = OutputSettings.from_dict(output_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


