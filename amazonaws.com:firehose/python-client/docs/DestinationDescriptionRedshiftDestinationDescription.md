# DestinationDescriptionRedshiftDestinationDescription


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
from openapi_client.models.destination_description_redshift_destination_description import DestinationDescriptionRedshiftDestinationDescription

# TODO update the JSON string below
json = "{}"
# create an instance of DestinationDescriptionRedshiftDestinationDescription from a JSON string
destination_description_redshift_destination_description_instance = DestinationDescriptionRedshiftDestinationDescription.from_json(json)
# print the JSON string representation of the object
print(DestinationDescriptionRedshiftDestinationDescription.to_json())

# convert the object into a dict
destination_description_redshift_destination_description_dict = destination_description_redshift_destination_description_instance.to_dict()
# create an instance of DestinationDescriptionRedshiftDestinationDescription from a dict
destination_description_redshift_destination_description_from_dict = DestinationDescriptionRedshiftDestinationDescription.from_dict(destination_description_redshift_destination_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


