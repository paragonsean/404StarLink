# DestinationDescriptionHttpEndpointDestinationDescription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endpoint_configuration** | [**HttpEndpointDestinationDescriptionEndpointConfiguration**](HttpEndpointDestinationDescriptionEndpointConfiguration.md) |  | [optional] 
**buffering_hints** | [**HttpEndpointDestinationDescriptionBufferingHints**](HttpEndpointDestinationDescriptionBufferingHints.md) |  | [optional] 
**cloud_watch_logging_options** | [**CloudWatchLoggingOptions**](CloudWatchLoggingOptions.md) |  | [optional] 
**request_configuration** | [**HttpEndpointDestinationDescriptionRequestConfiguration**](HttpEndpointDestinationDescriptionRequestConfiguration.md) |  | [optional] 
**processing_configuration** | [**ProcessingConfiguration**](ProcessingConfiguration.md) |  | [optional] 
**role_arn** | **str** |  | [optional] 
**retry_options** | [**HttpEndpointDestinationConfigurationRetryOptions**](HttpEndpointDestinationConfigurationRetryOptions.md) |  | [optional] 
**s3_backup_mode** | [**HttpEndpointS3BackupMode**](HttpEndpointS3BackupMode.md) |  | [optional] 
**s3_destination_description** | [**S3DestinationDescription**](S3DestinationDescription.md) |  | [optional] 

## Example

```python
from openapi_client.models.destination_description_http_endpoint_destination_description import DestinationDescriptionHttpEndpointDestinationDescription

# TODO update the JSON string below
json = "{}"
# create an instance of DestinationDescriptionHttpEndpointDestinationDescription from a JSON string
destination_description_http_endpoint_destination_description_instance = DestinationDescriptionHttpEndpointDestinationDescription.from_json(json)
# print the JSON string representation of the object
print(DestinationDescriptionHttpEndpointDestinationDescription.to_json())

# convert the object into a dict
destination_description_http_endpoint_destination_description_dict = destination_description_http_endpoint_destination_description_instance.to_dict()
# create an instance of DestinationDescriptionHttpEndpointDestinationDescription from a dict
destination_description_http_endpoint_destination_description_from_dict = DestinationDescriptionHttpEndpointDestinationDescription.from_dict(destination_description_http_endpoint_destination_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


