# UpdateDestinationInputRedshiftDestinationUpdate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | [optional] 
**cluster_jdbcurl** | **str** |  | [optional] 
**copy_command** | [**RedshiftDestinationConfigurationCopyCommand**](RedshiftDestinationConfigurationCopyCommand.md) |  | [optional] 
**username** | **str** |  | [optional] 
**password** | **str** |  | [optional] 
**retry_options** | [**RedshiftDestinationConfigurationRetryOptions**](RedshiftDestinationConfigurationRetryOptions.md) |  | [optional] 
**s3_update** | [**RedshiftDestinationUpdateS3Update**](RedshiftDestinationUpdateS3Update.md) |  | [optional] 
**processing_configuration** | [**ExtendedS3DestinationConfigurationProcessingConfiguration**](ExtendedS3DestinationConfigurationProcessingConfiguration.md) |  | [optional] 
**s3_backup_mode** | [**RedshiftS3BackupMode**](RedshiftS3BackupMode.md) |  | [optional] 
**s3_backup_update** | [**ExtendedS3DestinationUpdateS3BackupUpdate**](ExtendedS3DestinationUpdateS3BackupUpdate.md) |  | [optional] 
**cloud_watch_logging_options** | [**S3DestinationDescriptionCloudWatchLoggingOptions**](S3DestinationDescriptionCloudWatchLoggingOptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.update_destination_input_redshift_destination_update import UpdateDestinationInputRedshiftDestinationUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateDestinationInputRedshiftDestinationUpdate from a JSON string
update_destination_input_redshift_destination_update_instance = UpdateDestinationInputRedshiftDestinationUpdate.from_json(json)
# print the JSON string representation of the object
print(UpdateDestinationInputRedshiftDestinationUpdate.to_json())

# convert the object into a dict
update_destination_input_redshift_destination_update_dict = update_destination_input_redshift_destination_update_instance.to_dict()
# create an instance of UpdateDestinationInputRedshiftDestinationUpdate from a dict
update_destination_input_redshift_destination_update_from_dict = UpdateDestinationInputRedshiftDestinationUpdate.from_dict(update_destination_input_redshift_destination_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


