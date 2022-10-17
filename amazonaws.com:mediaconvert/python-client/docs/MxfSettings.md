# MxfSettings

These settings relate to your MXF output container.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**afd_signaling** | [**MxfAfdSignaling**](MxfAfdSignaling.md) |  | [optional] 
**profile** | [**MxfProfile**](MxfProfile.md) |  | [optional] 
**xavc_profile_settings** | [**MxfSettingsXavcProfileSettings**](MxfSettingsXavcProfileSettings.md) |  | [optional] 

## Example

```python
from openapi_client.models.mxf_settings import MxfSettings

# TODO update the JSON string below
json = "{}"
# create an instance of MxfSettings from a JSON string
mxf_settings_instance = MxfSettings.from_json(json)
# print the JSON string representation of the object
print(MxfSettings.to_json())

# convert the object into a dict
mxf_settings_dict = mxf_settings_instance.to_dict()
# create an instance of MxfSettings from a dict
mxf_settings_from_dict = MxfSettings.from_dict(mxf_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


