# CreateDeliveryStreamInputHttpEndpointDestinationConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endpoint_configuration** | [**HttpEndpointDestinationConfigurationEndpointConfiguration**](HttpEndpointDestinationConfigurationEndpointConfiguration.md) |  | 
**buffering_hints** | [**HttpEndpointDestinationConfigurationBufferingHints**](HttpEndpointDestinationConfigurationBufferingHints.md) |  | [optional] 
**cloud_watch_logging_options** | [**CloudWatchLoggingOptions**](CloudWatchLoggingOptions.md) |  | [optional] 
**request_configuration** | [**HttpEndpointDestinationConfigurationRequestConfiguration**](HttpEndpointDestinationConfigurationRequestConfiguration.md) |  | [optional] 
**processing_configuration** | [**ProcessingConfiguration**](ProcessingConfiguration.md) |  | [optional] 
**role_arn** | **str** |  | [optional] 
**retry_options** | [**HttpEndpointDestinationConfigurationRetryOptions**](HttpEndpointDestinationConfigurationRetryOptions.md) |  | [optional] 
**s3_backup_mode** | [**HttpEndpointS3BackupMode**](HttpEndpointS3BackupMode.md) |  | [optional] 
**s3_configuration** | [**S3DestinationConfiguration**](S3DestinationConfiguration.md) |  | 

## Example

```python
from openapi_client.models.create_delivery_stream_input_http_endpoint_destination_configuration import CreateDeliveryStreamInputHttpEndpointDestinationConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of CreateDeliveryStreamInputHttpEndpointDestinationConfiguration from a JSON string
create_delivery_stream_input_http_endpoint_destination_configuration_instance = CreateDeliveryStreamInputHttpEndpointDestinationConfiguration.from_json(json)
# print the JSON string representation of the object
print(CreateDeliveryStreamInputHttpEndpointDestinationConfiguration.to_json())

# convert the object into a dict
create_delivery_stream_input_http_endpoint_destination_configuration_dict = create_delivery_stream_input_http_endpoint_destination_configuration_instance.to_dict()
# create an instance of CreateDeliveryStreamInputHttpEndpointDestinationConfiguration from a dict
create_delivery_stream_input_http_endpoint_destination_configuration_from_dict = CreateDeliveryStreamInputHttpEndpointDestinationConfiguration.from_dict(create_delivery_stream_input_http_endpoint_destination_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


