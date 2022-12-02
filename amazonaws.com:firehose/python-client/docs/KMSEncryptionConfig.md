# KMSEncryptionConfig

Describes an encryption key for a destination in Amazon S3.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**awskms_key_arn** | **str** |  | 

## Example

```python
from openapi_client.models.kms_encryption_config import KMSEncryptionConfig

# TODO update the JSON string below
json = "{}"
# create an instance of KMSEncryptionConfig from a JSON string
kms_encryption_config_instance = KMSEncryptionConfig.from_json(json)
# print the JSON string representation of the object
print(KMSEncryptionConfig.to_json())

# convert the object into a dict
kms_encryption_config_dict = kms_encryption_config_instance.to_dict()
# create an instance of KMSEncryptionConfig from a dict
kms_encryption_config_from_dict = KMSEncryptionConfig.from_dict(kms_encryption_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


