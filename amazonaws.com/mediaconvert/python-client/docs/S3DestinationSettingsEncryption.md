# S3DestinationSettingsEncryption


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encryption_type** | [**S3ServerSideEncryptionType**](S3ServerSideEncryptionType.md) |  | [optional] 
**kms_encryption_context** | **str** |  | [optional] 
**kms_key_arn** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.s3_destination_settings_encryption import S3DestinationSettingsEncryption

# TODO update the JSON string below
json = "{}"
# create an instance of S3DestinationSettingsEncryption from a JSON string
s3_destination_settings_encryption_instance = S3DestinationSettingsEncryption.from_json(json)
# print the JSON string representation of the object
print(S3DestinationSettingsEncryption.to_json())

# convert the object into a dict
s3_destination_settings_encryption_dict = s3_destination_settings_encryption_instance.to_dict()
# create an instance of S3DestinationSettingsEncryption from a dict
s3_destination_settings_encryption_from_dict = S3DestinationSettingsEncryption.from_dict(s3_destination_settings_encryption_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


