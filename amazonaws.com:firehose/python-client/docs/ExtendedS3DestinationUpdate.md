# ExtendedS3DestinationUpdate

Describes an update for a destination in Amazon S3.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | [optional] 
**bucket_arn** | **str** |  | [optional] 
**prefix** | **str** |  | [optional] 
**error_output_prefix** | **str** |  | [optional] 
**buffering_hints** | [**ExtendedS3DestinationConfigurationBufferingHints**](ExtendedS3DestinationConfigurationBufferingHints.md) |  | [optional] 
**compression_format** | [**CompressionFormat**](CompressionFormat.md) |  | [optional] 
**encryption_configuration** | [**S3DestinationConfigurationEncryptionConfiguration**](S3DestinationConfigurationEncryptionConfiguration.md) |  | [optional] 
**cloud_watch_logging_options** | [**S3DestinationDescriptionCloudWatchLoggingOptions**](S3DestinationDescriptionCloudWatchLoggingOptions.md) |  | [optional] 
**processing_configuration** | [**ExtendedS3DestinationConfigurationProcessingConfiguration**](ExtendedS3DestinationConfigurationProcessingConfiguration.md) |  | [optional] 
**s3_backup_mode** | [**S3BackupMode**](S3BackupMode.md) |  | [optional] 
**s3_backup_update** | [**ExtendedS3DestinationUpdateS3BackupUpdate**](ExtendedS3DestinationUpdateS3BackupUpdate.md) |  | [optional] 
**data_format_conversion_configuration** | [**ExtendedS3DestinationConfigurationDataFormatConversionConfiguration**](ExtendedS3DestinationConfigurationDataFormatConversionConfiguration.md) |  | [optional] 
**dynamic_partitioning_configuration** | [**ExtendedS3DestinationConfigurationDynamicPartitioningConfiguration**](ExtendedS3DestinationConfigurationDynamicPartitioningConfiguration.md) |  | [optional] 

## Example

```python
from openapi_client.models.extended_s3_destination_update import ExtendedS3DestinationUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of ExtendedS3DestinationUpdate from a JSON string
extended_s3_destination_update_instance = ExtendedS3DestinationUpdate.from_json(json)
# print the JSON string representation of the object
print(ExtendedS3DestinationUpdate.to_json())

# convert the object into a dict
extended_s3_destination_update_dict = extended_s3_destination_update_instance.to_dict()
# create an instance of ExtendedS3DestinationUpdate from a dict
extended_s3_destination_update_from_dict = ExtendedS3DestinationUpdate.from_dict(extended_s3_destination_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


