# S3DestinationConfigurationEncryptionConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**no_encryption_config** | [**NoEncryptionConfig**](NoEncryptionConfig.md) |  | [optional] 
**kms_encryption_config** | [**EncryptionConfigurationKMSEncryptionConfig**](EncryptionConfigurationKMSEncryptionConfig.md) |  | [optional] 

## Example

```python
from openapi_client.models.s3_destination_configuration_encryption_configuration import S3DestinationConfigurationEncryptionConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of S3DestinationConfigurationEncryptionConfiguration from a JSON string
s3_destination_configuration_encryption_configuration_instance = S3DestinationConfigurationEncryptionConfiguration.from_json(json)
# print the JSON string representation of the object
print(S3DestinationConfigurationEncryptionConfiguration.to_json())

# convert the object into a dict
s3_destination_configuration_encryption_configuration_dict = s3_destination_configuration_encryption_configuration_instance.to_dict()
# create an instance of S3DestinationConfigurationEncryptionConfiguration from a dict
s3_destination_configuration_encryption_configuration_from_dict = S3DestinationConfigurationEncryptionConfiguration.from_dict(s3_destination_configuration_encryption_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


