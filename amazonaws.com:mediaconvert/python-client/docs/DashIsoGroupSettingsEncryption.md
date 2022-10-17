# DashIsoGroupSettingsEncryption


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**playback_device_compatibility** | [**DashIsoPlaybackDeviceCompatibility**](DashIsoPlaybackDeviceCompatibility.md) |  | [optional] 
**speke_key_provider** | [**DashIsoEncryptionSettingsSpekeKeyProvider**](DashIsoEncryptionSettingsSpekeKeyProvider.md) |  | [optional] 

## Example

```python
from openapi_client.models.dash_iso_group_settings_encryption import DashIsoGroupSettingsEncryption

# TODO update the JSON string below
json = "{}"
# create an instance of DashIsoGroupSettingsEncryption from a JSON string
dash_iso_group_settings_encryption_instance = DashIsoGroupSettingsEncryption.from_json(json)
# print the JSON string representation of the object
print(DashIsoGroupSettingsEncryption.to_json())

# convert the object into a dict
dash_iso_group_settings_encryption_dict = dash_iso_group_settings_encryption_instance.to_dict()
# create an instance of DashIsoGroupSettingsEncryption from a dict
dash_iso_group_settings_encryption_from_dict = DashIsoGroupSettingsEncryption.from_dict(dash_iso_group_settings_encryption_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


