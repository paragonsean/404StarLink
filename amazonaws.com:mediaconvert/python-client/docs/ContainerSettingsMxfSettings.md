# ContainerSettingsMxfSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**afd_signaling** | [**MxfAfdSignaling**](MxfAfdSignaling.md) |  | [optional] 
**profile** | [**MxfProfile**](MxfProfile.md) |  | [optional] 
**xavc_profile_settings** | [**MxfSettingsXavcProfileSettings**](MxfSettingsXavcProfileSettings.md) |  | [optional] 

## Example

```python
from openapi_client.models.container_settings_mxf_settings import ContainerSettingsMxfSettings

# TODO update the JSON string below
json = "{}"
# create an instance of ContainerSettingsMxfSettings from a JSON string
container_settings_mxf_settings_instance = ContainerSettingsMxfSettings.from_json(json)
# print the JSON string representation of the object
print(ContainerSettingsMxfSettings.to_json())

# convert the object into a dict
container_settings_mxf_settings_dict = container_settings_mxf_settings_instance.to_dict()
# create an instance of ContainerSettingsMxfSettings from a dict
container_settings_mxf_settings_from_dict = ContainerSettingsMxfSettings.from_dict(container_settings_mxf_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


