# CmafEncryptionSettingsStaticKeyProvider


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key_format** | **str** |  | [optional] 
**key_format_versions** | **str** |  | [optional] 
**static_key_value** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.cmaf_encryption_settings_static_key_provider import CmafEncryptionSettingsStaticKeyProvider

# TODO update the JSON string below
json = "{}"
# create an instance of CmafEncryptionSettingsStaticKeyProvider from a JSON string
cmaf_encryption_settings_static_key_provider_instance = CmafEncryptionSettingsStaticKeyProvider.from_json(json)
# print the JSON string representation of the object
print(CmafEncryptionSettingsStaticKeyProvider.to_json())

# convert the object into a dict
cmaf_encryption_settings_static_key_provider_dict = cmaf_encryption_settings_static_key_provider_instance.to_dict()
# create an instance of CmafEncryptionSettingsStaticKeyProvider from a dict
cmaf_encryption_settings_static_key_provider_from_dict = CmafEncryptionSettingsStaticKeyProvider.from_dict(cmaf_encryption_settings_static_key_provider_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


