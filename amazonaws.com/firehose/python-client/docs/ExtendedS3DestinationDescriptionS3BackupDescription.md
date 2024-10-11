# ExtendedS3DestinationDescriptionS3BackupDescription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | 
**bucket_arn** | **str** |  | 
**prefix** | **str** |  | [optional] 
**error_output_prefix** | **str** |  | [optional] 
**buffering_hints** | [**S3DestinationConfigurationBufferingHints**](S3DestinationConfigurationBufferingHints.md) |  | 
**compression_format** | [**CompressionFormat**](CompressionFormat.md) |  | 
**encryption_configuration** | [**S3DestinationConfigurationEncryptionConfiguration**](S3DestinationConfigurationEncryptionConfiguration.md) |  | 
**cloud_watch_logging_options** | [**S3DestinationDescriptionCloudWatchLoggingOptions**](S3DestinationDescriptionCloudWatchLoggingOptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.extended_s3_destination_description_s3_backup_description import ExtendedS3DestinationDescriptionS3BackupDescription

# TODO update the JSON string below
json = "{}"
# create an instance of ExtendedS3DestinationDescriptionS3BackupDescription from a JSON string
extended_s3_destination_description_s3_backup_description_instance = ExtendedS3DestinationDescriptionS3BackupDescription.from_json(json)
# print the JSON string representation of the object
print(ExtendedS3DestinationDescriptionS3BackupDescription.to_json())

# convert the object into a dict
extended_s3_destination_description_s3_backup_description_dict = extended_s3_destination_description_s3_backup_description_instance.to_dict()
# create an instance of ExtendedS3DestinationDescriptionS3BackupDescription from a dict
extended_s3_destination_description_s3_backup_description_from_dict = ExtendedS3DestinationDescriptionS3BackupDescription.from_dict(extended_s3_destination_description_s3_backup_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


