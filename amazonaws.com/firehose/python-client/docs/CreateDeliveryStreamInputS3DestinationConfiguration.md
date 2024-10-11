# CreateDeliveryStreamInputS3DestinationConfiguration


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
from openapi_client.models.create_delivery_stream_input_s3_destination_configuration import CreateDeliveryStreamInputS3DestinationConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of CreateDeliveryStreamInputS3DestinationConfiguration from a JSON string
create_delivery_stream_input_s3_destination_configuration_instance = CreateDeliveryStreamInputS3DestinationConfiguration.from_json(json)
# print the JSON string representation of the object
print(CreateDeliveryStreamInputS3DestinationConfiguration.to_json())

# convert the object into a dict
create_delivery_stream_input_s3_destination_configuration_dict = create_delivery_stream_input_s3_destination_configuration_instance.to_dict()
# create an instance of CreateDeliveryStreamInputS3DestinationConfiguration from a dict
create_delivery_stream_input_s3_destination_configuration_from_dict = CreateDeliveryStreamInputS3DestinationConfiguration.from_dict(create_delivery_stream_input_s3_destination_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


