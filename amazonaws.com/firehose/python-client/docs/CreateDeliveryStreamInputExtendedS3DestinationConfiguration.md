# CreateDeliveryStreamInputExtendedS3DestinationConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | 
**bucket_arn** | **str** |  | 
**prefix** | **str** |  | [optional] 
**error_output_prefix** | **str** |  | [optional] 
**buffering_hints** | [**ExtendedS3DestinationConfigurationBufferingHints**](ExtendedS3DestinationConfigurationBufferingHints.md) |  | [optional] 
**compression_format** | [**CompressionFormat**](CompressionFormat.md) |  | [optional] 
**encryption_configuration** | [**S3DestinationConfigurationEncryptionConfiguration**](S3DestinationConfigurationEncryptionConfiguration.md) |  | [optional] 
**cloud_watch_logging_options** | [**S3DestinationDescriptionCloudWatchLoggingOptions**](S3DestinationDescriptionCloudWatchLoggingOptions.md) |  | [optional] 
**processing_configuration** | [**ExtendedS3DestinationConfigurationProcessingConfiguration**](ExtendedS3DestinationConfigurationProcessingConfiguration.md) |  | [optional] 
**s3_backup_mode** | [**S3BackupMode**](S3BackupMode.md) |  | [optional] 
**s3_backup_configuration** | [**ExtendedS3DestinationConfigurationS3BackupConfiguration**](ExtendedS3DestinationConfigurationS3BackupConfiguration.md) |  | [optional] 
**data_format_conversion_configuration** | [**ExtendedS3DestinationConfigurationDataFormatConversionConfiguration**](ExtendedS3DestinationConfigurationDataFormatConversionConfiguration.md) |  | [optional] 
**dynamic_partitioning_configuration** | [**ExtendedS3DestinationConfigurationDynamicPartitioningConfiguration**](ExtendedS3DestinationConfigurationDynamicPartitioningConfiguration.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_delivery_stream_input_extended_s3_destination_configuration import CreateDeliveryStreamInputExtendedS3DestinationConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of CreateDeliveryStreamInputExtendedS3DestinationConfiguration from a JSON string
create_delivery_stream_input_extended_s3_destination_configuration_instance = CreateDeliveryStreamInputExtendedS3DestinationConfiguration.from_json(json)
# print the JSON string representation of the object
print(CreateDeliveryStreamInputExtendedS3DestinationConfiguration.to_json())

# convert the object into a dict
create_delivery_stream_input_extended_s3_destination_configuration_dict = create_delivery_stream_input_extended_s3_destination_configuration_instance.to_dict()
# create an instance of CreateDeliveryStreamInputExtendedS3DestinationConfiguration from a dict
create_delivery_stream_input_extended_s3_destination_configuration_from_dict = CreateDeliveryStreamInputExtendedS3DestinationConfiguration.from_dict(create_delivery_stream_input_extended_s3_destination_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


