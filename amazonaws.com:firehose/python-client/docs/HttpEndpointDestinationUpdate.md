# HttpEndpointDestinationUpdate

Updates the specified HTTP endpoint destination.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endpoint_configuration** | [**HttpEndpointDestinationUpdateEndpointConfiguration**](HttpEndpointDestinationUpdateEndpointConfiguration.md) |  | [optional] 
**buffering_hints** | [**HttpEndpointDestinationDescriptionBufferingHints**](HttpEndpointDestinationDescriptionBufferingHints.md) |  | [optional] 
**cloud_watch_logging_options** | [**CloudWatchLoggingOptions**](CloudWatchLoggingOptions.md) |  | [optional] 
**request_configuration** | [**HttpEndpointDestinationUpdateRequestConfiguration**](HttpEndpointDestinationUpdateRequestConfiguration.md) |  | [optional] 
**processing_configuration** | [**ProcessingConfiguration**](ProcessingConfiguration.md) |  | [optional] 
**role_arn** | **str** |  | [optional] 
**retry_options** | [**HttpEndpointDestinationConfigurationRetryOptions**](HttpEndpointDestinationConfigurationRetryOptions.md) |  | [optional] 
**s3_backup_mode** | [**HttpEndpointS3BackupMode**](HttpEndpointS3BackupMode.md) |  | [optional] 
**s3_update** | [**S3DestinationUpdate**](S3DestinationUpdate.md) |  | [optional] 

## Example

```python
from openapi_client.models.http_endpoint_destination_update import HttpEndpointDestinationUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of HttpEndpointDestinationUpdate from a JSON string
http_endpoint_destination_update_instance = HttpEndpointDestinationUpdate.from_json(json)
# print the JSON string representation of the object
print(HttpEndpointDestinationUpdate.to_json())

# convert the object into a dict
http_endpoint_destination_update_dict = http_endpoint_destination_update_instance.to_dict()
# create an instance of HttpEndpointDestinationUpdate from a dict
http_endpoint_destination_update_from_dict = HttpEndpointDestinationUpdate.from_dict(http_endpoint_destination_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


