# RedshiftDestinationDescription

Describes a destination in Amazon Redshift.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | 
**cluster_jdbcurl** | **str** |  | 
**copy_command** | [**RedshiftDestinationConfigurationCopyCommand**](RedshiftDestinationConfigurationCopyCommand.md) |  | 
**username** | **str** |  | 
**retry_options** | [**RedshiftDestinationConfigurationRetryOptions**](RedshiftDestinationConfigurationRetryOptions.md) |  | [optional] 
**s3_destination_description** | [**RedshiftDestinationDescriptionS3DestinationDescription**](RedshiftDestinationDescriptionS3DestinationDescription.md) |  | 
**processing_configuration** | [**ExtendedS3DestinationConfigurationProcessingConfiguration**](ExtendedS3DestinationConfigurationProcessingConfiguration.md) |  | [optional] 
**s3_backup_mode** | [**RedshiftS3BackupMode**](RedshiftS3BackupMode.md) |  | [optional] 
**s3_backup_description** | [**ExtendedS3DestinationDescriptionS3BackupDescription**](ExtendedS3DestinationDescriptionS3BackupDescription.md) |  | [optional] 
**cloud_watch_logging_options** | [**S3DestinationDescriptionCloudWatchLoggingOptions**](S3DestinationDescriptionCloudWatchLoggingOptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.redshift_destination_description import RedshiftDestinationDescription

# TODO update the JSON string below
json = "{}"
# create an instance of RedshiftDestinationDescription from a JSON string
redshift_destination_description_instance = RedshiftDestinationDescription.from_json(json)
# print the JSON string representation of the object
print(RedshiftDestinationDescription.to_json())

# convert the object into a dict
redshift_destination_description_dict = redshift_destination_description_instance.to_dict()
# create an instance of RedshiftDestinationDescription from a dict
redshift_destination_description_from_dict = RedshiftDestinationDescription.from_dict(redshift_destination_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


