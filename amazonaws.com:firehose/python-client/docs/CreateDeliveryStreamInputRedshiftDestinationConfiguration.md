# CreateDeliveryStreamInputRedshiftDestinationConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | 
**cluster_jdbcurl** | **str** |  | 
**copy_command** | [**RedshiftDestinationConfigurationCopyCommand**](RedshiftDestinationConfigurationCopyCommand.md) |  | 
**username** | **str** |  | 
**password** | **str** |  | 
**retry_options** | [**RedshiftDestinationConfigurationRetryOptions**](RedshiftDestinationConfigurationRetryOptions.md) |  | [optional] 
**s3_configuration** | [**RedshiftDestinationConfigurationS3Configuration**](RedshiftDestinationConfigurationS3Configuration.md) |  | 
**processing_configuration** | [**ExtendedS3DestinationConfigurationProcessingConfiguration**](ExtendedS3DestinationConfigurationProcessingConfiguration.md) |  | [optional] 
**s3_backup_mode** | [**RedshiftS3BackupMode**](RedshiftS3BackupMode.md) |  | [optional] 
**s3_backup_configuration** | [**ExtendedS3DestinationConfigurationS3BackupConfiguration**](ExtendedS3DestinationConfigurationS3BackupConfiguration.md) |  | [optional] 
**cloud_watch_logging_options** | [**S3DestinationConfigurationCloudWatchLoggingOptions**](S3DestinationConfigurationCloudWatchLoggingOptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_delivery_stream_input_redshift_destination_configuration import CreateDeliveryStreamInputRedshiftDestinationConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of CreateDeliveryStreamInputRedshiftDestinationConfiguration from a JSON string
create_delivery_stream_input_redshift_destination_configuration_instance = CreateDeliveryStreamInputRedshiftDestinationConfiguration.from_json(json)
# print the JSON string representation of the object
print(CreateDeliveryStreamInputRedshiftDestinationConfiguration.to_json())

# convert the object into a dict
create_delivery_stream_input_redshift_destination_configuration_dict = create_delivery_stream_input_redshift_destination_configuration_instance.to_dict()
# create an instance of CreateDeliveryStreamInputRedshiftDestinationConfiguration from a dict
create_delivery_stream_input_redshift_destination_configuration_from_dict = CreateDeliveryStreamInputRedshiftDestinationConfiguration.from_dict(create_delivery_stream_input_redshift_destination_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


