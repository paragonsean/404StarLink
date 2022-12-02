# S3DestinationDescription

Describes a destination in Amazon S3.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | 
**bucket_arn** | **str** |  | 
**prefix** | **str** |  | [optional] 
**error_output_prefix** | **str** |  | [optional] 
**buffering_hints** | [**S3DestinationConfigurationBufferingHints**](S3DestinationConfigurationBufferingHints.md) |  | 
**compression_format** | [**CompressionFormat**](CompressionFormat.md) |  | 
**encryption_configuration** | [**S3DestinationConfigurationEncryptionConfiguration**](S3DestinationConfigurationEncryptionConfiguration.md) |  | 
**cloud_watch_logging_options** | [**S3DestinationDescriptionCloudWatchLoggingOptions**](S3DestinationDescriptionCloudWatchLoggingOptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.s3_destination_description import S3DestinationDescription

# TODO update the JSON string below
json = "{}"
# create an instance of S3DestinationDescription from a JSON string
s3_destination_description_instance = S3DestinationDescription.from_json(json)
# print the JSON string representation of the object
print(S3DestinationDescription.to_json())

# convert the object into a dict
s3_destination_description_dict = s3_destination_description_instance.to_dict()
# create an instance of S3DestinationDescription from a dict
s3_destination_description_from_dict = S3DestinationDescription.from_dict(s3_destination_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


