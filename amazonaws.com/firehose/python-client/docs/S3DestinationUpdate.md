# S3DestinationUpdate

Describes an update for a destination in Amazon S3.

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
from openapi_client.models.s3_destination_update import S3DestinationUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of S3DestinationUpdate from a JSON string
s3_destination_update_instance = S3DestinationUpdate.from_json(json)
# print the JSON string representation of the object
print(S3DestinationUpdate.to_json())

# convert the object into a dict
s3_destination_update_dict = s3_destination_update_instance.to_dict()
# create an instance of S3DestinationUpdate from a dict
s3_destination_update_from_dict = S3DestinationUpdate.from_dict(s3_destination_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


