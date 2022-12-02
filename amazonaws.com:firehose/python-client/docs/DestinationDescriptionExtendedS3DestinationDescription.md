# DestinationDescriptionExtendedS3DestinationDescription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | 
**bucket_arn** | **str** |  | 
**prefix** | **str** |  | [optional] 
**error_output_prefix** | **str** |  | [optional] 
**buffering_hints** | [**ExtendedS3DestinationConfigurationBufferingHints**](ExtendedS3DestinationConfigurationBufferingHints.md) |  | 
**compression_format** | [**CompressionFormat**](CompressionFormat.md) |  | 
**encryption_configuration** | [**S3DestinationConfigurationEncryptionConfiguration**](S3DestinationConfigurationEncryptionConfiguration.md) |  | 
**cloud_watch_logging_options** | [**S3DestinationDescriptionCloudWatchLoggingOptions**](S3DestinationDescriptionCloudWatchLoggingOptions.md) |  | [optional] 
**processing_configuration** | [**ExtendedS3DestinationConfigurationProcessingConfiguration**](ExtendedS3DestinationConfigurationProcessingConfiguration.md) |  | [optional] 
**s3_backup_mode** | [**S3BackupMode**](S3BackupMode.md) |  | [optional] 
**s3_backup_description** | [**ExtendedS3DestinationDescriptionS3BackupDescription**](ExtendedS3DestinationDescriptionS3BackupDescription.md) |  | [optional] 
**data_format_conversion_configuration** | [**ExtendedS3DestinationConfigurationDataFormatConversionConfiguration**](ExtendedS3DestinationConfigurationDataFormatConversionConfiguration.md) |  | [optional] 
**dynamic_partitioning_configuration** | [**ExtendedS3DestinationConfigurationDynamicPartitioningConfiguration**](ExtendedS3DestinationConfigurationDynamicPartitioningConfiguration.md) |  | [optional] 

## Example

```python
from openapi_client.models.destination_description_extended_s3_destination_description import DestinationDescriptionExtendedS3DestinationDescription

# TODO update the JSON string below
json = "{}"
# create an instance of DestinationDescriptionExtendedS3DestinationDescription from a JSON string
destination_description_extended_s3_destination_description_instance = DestinationDescriptionExtendedS3DestinationDescription.from_json(json)
# print the JSON string representation of the object
print(DestinationDescriptionExtendedS3DestinationDescription.to_json())

# convert the object into a dict
destination_description_extended_s3_destination_description_dict = destination_description_extended_s3_destination_description_instance.to_dict()
# create an instance of DestinationDescriptionExtendedS3DestinationDescription from a dict
destination_description_extended_s3_destination_description_from_dict = DestinationDescriptionExtendedS3DestinationDescription.from_dict(destination_description_extended_s3_destination_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


