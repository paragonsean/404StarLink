# EncryptionConfigurationKMSEncryptionConfig


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**awskms_key_arn** | **str** |  | 

## Example

```python
from openapi_client.models.encryption_configuration_kms_encryption_config import EncryptionConfigurationKMSEncryptionConfig

# TODO update the JSON string below
json = "{}"
# create an instance of EncryptionConfigurationKMSEncryptionConfig from a JSON string
encryption_configuration_kms_encryption_config_instance = EncryptionConfigurationKMSEncryptionConfig.from_json(json)
# print the JSON string representation of the object
print(EncryptionConfigurationKMSEncryptionConfig.to_json())

# convert the object into a dict
encryption_configuration_kms_encryption_config_dict = encryption_configuration_kms_encryption_config_instance.to_dict()
# create an instance of EncryptionConfigurationKMSEncryptionConfig from a dict
encryption_configuration_kms_encryption_config_from_dict = EncryptionConfigurationKMSEncryptionConfig.from_dict(encryption_configuration_kms_encryption_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


