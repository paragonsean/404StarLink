# DashIsoEncryptionSettings

Specifies DRM settings for DASH outputs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**playback_device_compatibility** | [**DashIsoPlaybackDeviceCompatibility**](DashIsoPlaybackDeviceCompatibility.md) |  | [optional] 
**speke_key_provider** | [**DashIsoEncryptionSettingsSpekeKeyProvider**](DashIsoEncryptionSettingsSpekeKeyProvider.md) |  | [optional] 

## Example

```python
from openapi_client.models.dash_iso_encryption_settings import DashIsoEncryptionSettings

# TODO update the JSON string below
json = "{}"
# create an instance of DashIsoEncryptionSettings from a JSON string
dash_iso_encryption_settings_instance = DashIsoEncryptionSettings.from_json(json)
# print the JSON string representation of the object
print(DashIsoEncryptionSettings.to_json())

# convert the object into a dict
dash_iso_encryption_settings_dict = dash_iso_encryption_settings_instance.to_dict()
# create an instance of DashIsoEncryptionSettings from a dict
dash_iso_encryption_settings_from_dict = DashIsoEncryptionSettings.from_dict(dash_iso_encryption_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


