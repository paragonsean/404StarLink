# SplunkDestinationDescription

Describes a destination in Splunk.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hec_endpoint** | **str** |  | [optional] 
**hec_endpoint_type** | [**HECEndpointType**](HECEndpointType.md) |  | [optional] 
**hec_token** | **str** |  | [optional] 
**hec_acknowledgment_timeout_in_seconds** | **int** |  | [optional] 
**retry_options** | [**SplunkDestinationDescriptionRetryOptions**](SplunkDestinationDescriptionRetryOptions.md) |  | [optional] 
**s3_backup_mode** | [**SplunkS3BackupMode**](SplunkS3BackupMode.md) |  | [optional] 
**s3_destination_description** | [**SplunkDestinationDescriptionS3DestinationDescription**](SplunkDestinationDescriptionS3DestinationDescription.md) |  | [optional] 
**processing_configuration** | [**ExtendedS3DestinationConfigurationProcessingConfiguration**](ExtendedS3DestinationConfigurationProcessingConfiguration.md) |  | [optional] 
**cloud_watch_logging_options** | [**S3DestinationDescriptionCloudWatchLoggingOptions**](S3DestinationDescriptionCloudWatchLoggingOptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.splunk_destination_description import SplunkDestinationDescription

# TODO update the JSON string below
json = "{}"
# create an instance of SplunkDestinationDescription from a JSON string
splunk_destination_description_instance = SplunkDestinationDescription.from_json(json)
# print the JSON string representation of the object
print(SplunkDestinationDescription.to_json())

# convert the object into a dict
splunk_destination_description_dict = splunk_destination_description_instance.to_dict()
# create an instance of SplunkDestinationDescription from a dict
splunk_destination_description_from_dict = SplunkDestinationDescription.from_dict(splunk_destination_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


