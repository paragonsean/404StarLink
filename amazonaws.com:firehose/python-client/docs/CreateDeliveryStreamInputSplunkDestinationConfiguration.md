# CreateDeliveryStreamInputSplunkDestinationConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hec_endpoint** | **str** |  | 
**hec_endpoint_type** | [**HECEndpointType**](HECEndpointType.md) |  | 
**hec_token** | **str** |  | 
**hec_acknowledgment_timeout_in_seconds** | **int** |  | [optional] 
**retry_options** | [**SplunkDestinationConfigurationRetryOptions**](SplunkDestinationConfigurationRetryOptions.md) |  | [optional] 
**s3_backup_mode** | [**SplunkS3BackupMode**](SplunkS3BackupMode.md) |  | [optional] 
**s3_configuration** | [**ElasticsearchDestinationConfigurationS3Configuration**](ElasticsearchDestinationConfigurationS3Configuration.md) |  | 
**processing_configuration** | [**ExtendedS3DestinationConfigurationProcessingConfiguration**](ExtendedS3DestinationConfigurationProcessingConfiguration.md) |  | [optional] 
**cloud_watch_logging_options** | [**S3DestinationDescriptionCloudWatchLoggingOptions**](S3DestinationDescriptionCloudWatchLoggingOptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_delivery_stream_input_splunk_destination_configuration import CreateDeliveryStreamInputSplunkDestinationConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of CreateDeliveryStreamInputSplunkDestinationConfiguration from a JSON string
create_delivery_stream_input_splunk_destination_configuration_instance = CreateDeliveryStreamInputSplunkDestinationConfiguration.from_json(json)
# print the JSON string representation of the object
print(CreateDeliveryStreamInputSplunkDestinationConfiguration.to_json())

# convert the object into a dict
create_delivery_stream_input_splunk_destination_configuration_dict = create_delivery_stream_input_splunk_destination_configuration_instance.to_dict()
# create an instance of CreateDeliveryStreamInputSplunkDestinationConfiguration from a dict
create_delivery_stream_input_splunk_destination_configuration_from_dict = CreateDeliveryStreamInputSplunkDestinationConfiguration.from_dict(create_delivery_stream_input_splunk_destination_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


