# HlsEncryptionSettings

Settings for HLS encryption

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**constant_initialization_vector** | **str** |  | [optional] 
**encryption_method** | [**HlsEncryptionType**](HlsEncryptionType.md) |  | [optional] 
**initialization_vector_in_manifest** | [**HlsInitializationVectorInManifest**](HlsInitializationVectorInManifest.md) |  | [optional] 
**offline_encrypted** | [**HlsOfflineEncrypted**](HlsOfflineEncrypted.md) |  | [optional] 
**speke_key_provider** | [**DashIsoEncryptionSettingsSpekeKeyProvider**](DashIsoEncryptionSettingsSpekeKeyProvider.md) |  | [optional] 
**static_key_provider** | [**CmafEncryptionSettingsStaticKeyProvider**](CmafEncryptionSettingsStaticKeyProvider.md) |  | [optional] 
**type** | [**HlsKeyProviderType**](HlsKeyProviderType.md) |  | [optional] 

## Example

```python
from openapi_client.models.hls_encryption_settings import HlsEncryptionSettings

# TODO update the JSON string below
json = "{}"
# create an instance of HlsEncryptionSettings from a JSON string
hls_encryption_settings_instance = HlsEncryptionSettings.from_json(json)
# print the JSON string representation of the object
print(HlsEncryptionSettings.to_json())

# convert the object into a dict
hls_encryption_settings_dict = hls_encryption_settings_instance.to_dict()
# create an instance of HlsEncryptionSettings from a dict
hls_encryption_settings_from_dict = HlsEncryptionSettings.from_dict(hls_encryption_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


