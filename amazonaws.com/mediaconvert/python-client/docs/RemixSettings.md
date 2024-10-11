# RemixSettings

Use Manual audio remixing (RemixSettings) to adjust audio levels for each audio channel in each output of your job. With audio remixing, you can output more or fewer audio channels than your input audio source provides.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channel_mapping** | [**RemixSettingsChannelMapping**](RemixSettingsChannelMapping.md) |  | [optional] 
**channels_in** | **int** |  | [optional] 
**channels_out** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.remix_settings import RemixSettings

# TODO update the JSON string below
json = "{}"
# create an instance of RemixSettings from a JSON string
remix_settings_instance = RemixSettings.from_json(json)
# print the JSON string representation of the object
print(RemixSettings.to_json())

# convert the object into a dict
remix_settings_dict = remix_settings_instance.to_dict()
# create an instance of RemixSettings from a dict
remix_settings_from_dict = RemixSettings.from_dict(remix_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


