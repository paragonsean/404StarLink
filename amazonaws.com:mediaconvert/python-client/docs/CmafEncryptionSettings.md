# CmafEncryptionSettings

Settings for CMAF encryption

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**constant_initialization_vector** | **str** |  | [optional] 
**encryption_method** | [**CmafEncryptionType**](CmafEncryptionType.md) |  | [optional] 
**initialization_vector_in_manifest** | [**CmafInitializationVectorInManifest**](CmafInitializationVectorInManifest.md) |  | [optional] 
**speke_key_provider** | [**CmafEncryptionSettingsSpekeKeyProvider**](CmafEncryptionSettingsSpekeKeyProvider.md) |  | [optional] 
**static_key_provider** | [**CmafEncryptionSettingsStaticKeyProvider**](CmafEncryptionSettingsStaticKeyProvider.md) |  | [optional] 
**type** | [**CmafKeyProviderType**](CmafKeyProviderType.md) |  | [optional] 

## Example

```python
from openapi_client.models.cmaf_encryption_settings import CmafEncryptionSettings

# TODO update the JSON string below
json = "{}"
# create an instance of CmafEncryptionSettings from a JSON string
cmaf_encryption_settings_instance = CmafEncryptionSettings.from_json(json)
# print the JSON string representation of the object
print(CmafEncryptionSettings.to_json())

# convert the object into a dict
cmaf_encryption_settings_dict = cmaf_encryption_settings_instance.to_dict()
# create an instance of CmafEncryptionSettings from a dict
cmaf_encryption_settings_from_dict = CmafEncryptionSettings.from_dict(cmaf_encryption_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


