# MsSmoothGroupSettingsEncryption


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**speke_key_provider** | [**DashIsoEncryptionSettingsSpekeKeyProvider**](DashIsoEncryptionSettingsSpekeKeyProvider.md) |  | [optional] 

## Example

```python
from openapi_client.models.ms_smooth_group_settings_encryption import MsSmoothGroupSettingsEncryption

# TODO update the JSON string below
json = "{}"
# create an instance of MsSmoothGroupSettingsEncryption from a JSON string
ms_smooth_group_settings_encryption_instance = MsSmoothGroupSettingsEncryption.from_json(json)
# print the JSON string representation of the object
print(MsSmoothGroupSettingsEncryption.to_json())

# convert the object into a dict
ms_smooth_group_settings_encryption_dict = ms_smooth_group_settings_encryption_instance.to_dict()
# create an instance of MsSmoothGroupSettingsEncryption from a dict
ms_smooth_group_settings_encryption_from_dict = MsSmoothGroupSettingsEncryption.from_dict(ms_smooth_group_settings_encryption_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


