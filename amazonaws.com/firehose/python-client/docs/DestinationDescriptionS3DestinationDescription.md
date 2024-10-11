# DestinationDescriptionS3DestinationDescription


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
from openapi_client.models.destination_description_s3_destination_description import DestinationDescriptionS3DestinationDescription

# TODO update the JSON string below
json = "{}"
# create an instance of DestinationDescriptionS3DestinationDescription from a JSON string
destination_description_s3_destination_description_instance = DestinationDescriptionS3DestinationDescription.from_json(json)
# print the JSON string representation of the object
print(DestinationDescriptionS3DestinationDescription.to_json())

# convert the object into a dict
destination_description_s3_destination_description_dict = destination_description_s3_destination_description_instance.to_dict()
# create an instance of DestinationDescriptionS3DestinationDescription from a dict
destination_description_s3_destination_description_from_dict = DestinationDescriptionS3DestinationDescription.from_dict(destination_description_s3_destination_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


