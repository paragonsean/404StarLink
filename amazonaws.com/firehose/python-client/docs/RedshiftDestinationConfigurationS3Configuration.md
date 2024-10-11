# RedshiftDestinationConfigurationS3Configuration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | 
**bucket_arn** | **str** |  | 
**prefix** | **str** |  | [optional] 
**error_output_prefix** | **str** |  | [optional] 
**buffering_hints** | [**S3DestinationConfigurationBufferingHints**](S3DestinationConfigurationBufferingHints.md) |  | [optional] 
**compression_format** | [**CompressionFormat**](CompressionFormat.md) |  | [optional] 
**encryption_configuration** | [**S3DestinationConfigurationEncryptionConfiguration**](S3DestinationConfigurationEncryptionConfiguration.md) |  | [optional] 
**cloud_watch_logging_options** | [**S3DestinationConfigurationCloudWatchLoggingOptions**](S3DestinationConfigurationCloudWatchLoggingOptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.redshift_destination_configuration_s3_configuration import RedshiftDestinationConfigurationS3Configuration

# TODO update the JSON string below
json = "{}"
# create an instance of RedshiftDestinationConfigurationS3Configuration from a JSON string
redshift_destination_configuration_s3_configuration_instance = RedshiftDestinationConfigurationS3Configuration.from_json(json)
# print the JSON string representation of the object
print(RedshiftDestinationConfigurationS3Configuration.to_json())

# convert the object into a dict
redshift_destination_configuration_s3_configuration_dict = redshift_destination_configuration_s3_configuration_instance.to_dict()
# create an instance of RedshiftDestinationConfigurationS3Configuration from a dict
redshift_destination_configuration_s3_configuration_from_dict = RedshiftDestinationConfigurationS3Configuration.from_dict(redshift_destination_configuration_s3_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


