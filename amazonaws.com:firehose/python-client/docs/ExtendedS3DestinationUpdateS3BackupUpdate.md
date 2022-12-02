# ExtendedS3DestinationUpdateS3BackupUpdate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | [optional] 
**bucket_arn** | **str** |  | [optional] 
**prefix** | **str** |  | [optional] 
**error_output_prefix** | **str** |  | [optional] 
**buffering_hints** | [**S3DestinationConfigurationBufferingHints**](S3DestinationConfigurationBufferingHints.md) |  | [optional] 
**compression_format** | [**CompressionFormat**](CompressionFormat.md) |  | [optional] 
**encryption_configuration** | [**S3DestinationConfigurationEncryptionConfiguration**](S3DestinationConfigurationEncryptionConfiguration.md) |  | [optional] 
**cloud_watch_logging_options** | [**S3DestinationConfigurationCloudWatchLoggingOptions**](S3DestinationConfigurationCloudWatchLoggingOptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.extended_s3_destination_update_s3_backup_update import ExtendedS3DestinationUpdateS3BackupUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of ExtendedS3DestinationUpdateS3BackupUpdate from a JSON string
extended_s3_destination_update_s3_backup_update_instance = ExtendedS3DestinationUpdateS3BackupUpdate.from_json(json)
# print the JSON string representation of the object
print(ExtendedS3DestinationUpdateS3BackupUpdate.to_json())

# convert the object into a dict
extended_s3_destination_update_s3_backup_update_dict = extended_s3_destination_update_s3_backup_update_instance.to_dict()
# create an instance of ExtendedS3DestinationUpdateS3BackupUpdate from a dict
extended_s3_destination_update_s3_backup_update_from_dict = ExtendedS3DestinationUpdateS3BackupUpdate.from_dict(extended_s3_destination_update_s3_backup_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


