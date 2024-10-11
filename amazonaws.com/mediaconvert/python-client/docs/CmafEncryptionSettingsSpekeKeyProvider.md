# CmafEncryptionSettingsSpekeKeyProvider


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate_arn** | **str** |  | [optional] 
**dash_signaled_system_ids** | **List** |  | [optional] 
**hls_signaled_system_ids** | **List** |  | [optional] 
**resource_id** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.cmaf_encryption_settings_speke_key_provider import CmafEncryptionSettingsSpekeKeyProvider

# TODO update the JSON string below
json = "{}"
# create an instance of CmafEncryptionSettingsSpekeKeyProvider from a JSON string
cmaf_encryption_settings_speke_key_provider_instance = CmafEncryptionSettingsSpekeKeyProvider.from_json(json)
# print the JSON string representation of the object
print(CmafEncryptionSettingsSpekeKeyProvider.to_json())

# convert the object into a dict
cmaf_encryption_settings_speke_key_provider_dict = cmaf_encryption_settings_speke_key_provider_instance.to_dict()
# create an instance of CmafEncryptionSettingsSpekeKeyProvider from a dict
cmaf_encryption_settings_speke_key_provider_from_dict = CmafEncryptionSettingsSpekeKeyProvider.from_dict(cmaf_encryption_settings_speke_key_provider_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


