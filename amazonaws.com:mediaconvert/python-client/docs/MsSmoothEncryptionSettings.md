# MsSmoothEncryptionSettings

If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to specify the value SpekeKeyProvider.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**speke_key_provider** | [**DashIsoEncryptionSettingsSpekeKeyProvider**](DashIsoEncryptionSettingsSpekeKeyProvider.md) |  | [optional] 

## Example

```python
from openapi_client.models.ms_smooth_encryption_settings import MsSmoothEncryptionSettings

# TODO update the JSON string below
json = "{}"
# create an instance of MsSmoothEncryptionSettings from a JSON string
ms_smooth_encryption_settings_instance = MsSmoothEncryptionSettings.from_json(json)
# print the JSON string representation of the object
print(MsSmoothEncryptionSettings.to_json())

# convert the object into a dict
ms_smooth_encryption_settings_dict = ms_smooth_encryption_settings_instance.to_dict()
# create an instance of MsSmoothEncryptionSettings from a dict
ms_smooth_encryption_settings_from_dict = MsSmoothEncryptionSettings.from_dict(ms_smooth_encryption_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


