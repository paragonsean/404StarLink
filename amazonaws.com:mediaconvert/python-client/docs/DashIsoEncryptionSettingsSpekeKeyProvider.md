# DashIsoEncryptionSettingsSpekeKeyProvider


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate_arn** | **str** |  | [optional] 
**resource_id** | **str** |  | [optional] 
**system_ids** | **List** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.dash_iso_encryption_settings_speke_key_provider import DashIsoEncryptionSettingsSpekeKeyProvider

# TODO update the JSON string below
json = "{}"
# create an instance of DashIsoEncryptionSettingsSpekeKeyProvider from a JSON string
dash_iso_encryption_settings_speke_key_provider_instance = DashIsoEncryptionSettingsSpekeKeyProvider.from_json(json)
# print the JSON string representation of the object
print(DashIsoEncryptionSettingsSpekeKeyProvider.to_json())

# convert the object into a dict
dash_iso_encryption_settings_speke_key_provider_dict = dash_iso_encryption_settings_speke_key_provider_instance.to_dict()
# create an instance of DashIsoEncryptionSettingsSpekeKeyProvider from a dict
dash_iso_encryption_settings_speke_key_provider_from_dict = DashIsoEncryptionSettingsSpekeKeyProvider.from_dict(dash_iso_encryption_settings_speke_key_provider_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


