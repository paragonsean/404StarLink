# UpdateDestinationInputS3DestinationUpdate


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
from openapi_client.models.update_destination_input_s3_destination_update import UpdateDestinationInputS3DestinationUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateDestinationInputS3DestinationUpdate from a JSON string
update_destination_input_s3_destination_update_instance = UpdateDestinationInputS3DestinationUpdate.from_json(json)
# print the JSON string representation of the object
print(UpdateDestinationInputS3DestinationUpdate.to_json())

# convert the object into a dict
update_destination_input_s3_destination_update_dict = update_destination_input_s3_destination_update_instance.to_dict()
# create an instance of UpdateDestinationInputS3DestinationUpdate from a dict
update_destination_input_s3_destination_update_from_dict = UpdateDestinationInputS3DestinationUpdate.from_dict(update_destination_input_s3_destination_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


