# S3EncryptionSettings

Settings for how your job outputs are encrypted as they are uploaded to Amazon S3.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encryption_type** | [**S3ServerSideEncryptionType**](S3ServerSideEncryptionType.md) |  | [optional] 
**kms_encryption_context** | **str** |  | [optional] 
**kms_key_arn** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.s3_encryption_settings import S3EncryptionSettings

# TODO update the JSON string below
json = "{}"
# create an instance of S3EncryptionSettings from a JSON string
s3_encryption_settings_instance = S3EncryptionSettings.from_json(json)
# print the JSON string representation of the object
print(S3EncryptionSettings.to_json())

# convert the object into a dict
s3_encryption_settings_dict = s3_encryption_settings_instance.to_dict()
# create an instance of S3EncryptionSettings from a dict
s3_encryption_settings_from_dict = S3EncryptionSettings.from_dict(s3_encryption_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


