# MxfSettingsXavcProfileSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration_mode** | [**MxfXavcDurationMode**](MxfXavcDurationMode.md) |  | [optional] 
**max_anc_data_size** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.mxf_settings_xavc_profile_settings import MxfSettingsXavcProfileSettings

# TODO update the JSON string below
json = "{}"
# create an instance of MxfSettingsXavcProfileSettings from a JSON string
mxf_settings_xavc_profile_settings_instance = MxfSettingsXavcProfileSettings.from_json(json)
# print the JSON string representation of the object
print(MxfSettingsXavcProfileSettings.to_json())

# convert the object into a dict
mxf_settings_xavc_profile_settings_dict = mxf_settings_xavc_profile_settings_instance.to_dict()
# create an instance of MxfSettingsXavcProfileSettings from a dict
mxf_settings_xavc_profile_settings_from_dict = MxfSettingsXavcProfileSettings.from_dict(mxf_settings_xavc_profile_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


