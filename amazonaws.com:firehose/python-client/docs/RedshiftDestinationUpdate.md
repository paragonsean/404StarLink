# RedshiftDestinationUpdate

Describes an update for a destination in Amazon Redshift.

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
from openapi_client.models.redshift_destination_update import RedshiftDestinationUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of RedshiftDestinationUpdate from a JSON string
redshift_destination_update_instance = RedshiftDestinationUpdate.from_json(json)
# print the JSON string representation of the object
print(RedshiftDestinationUpdate.to_json())

# convert the object into a dict
redshift_destination_update_dict = redshift_destination_update_instance.to_dict()
# create an instance of RedshiftDestinationUpdate from a dict
redshift_destination_update_from_dict = RedshiftDestinationUpdate.from_dict(redshift_destination_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


