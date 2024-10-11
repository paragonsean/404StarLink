# AmazonOpenSearchServerlessDestinationDescription

The destination description in the Serverless offering for Amazon OpenSearch Service.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | [optional] 
**collection_endpoint** | **str** |  | [optional] 
**index_name** | **str** |  | [optional] 
**buffering_hints** | [**AmazonOpenSearchServerlessDestinationDescriptionBufferingHints**](AmazonOpenSearchServerlessDestinationDescriptionBufferingHints.md) |  | [optional] 
**retry_options** | [**AmazonOpenSearchServerlessDestinationDescriptionRetryOptions**](AmazonOpenSearchServerlessDestinationDescriptionRetryOptions.md) |  | [optional] 
**s3_backup_mode** | [**AmazonOpenSearchServerlessS3BackupMode**](AmazonOpenSearchServerlessS3BackupMode.md) |  | [optional] 
**s3_destination_description** | [**S3DestinationDescription**](S3DestinationDescription.md) |  | [optional] 
**processing_configuration** | [**ProcessingConfiguration**](ProcessingConfiguration.md) |  | [optional] 
**cloud_watch_logging_options** | [**CloudWatchLoggingOptions**](CloudWatchLoggingOptions.md) |  | [optional] 
**vpc_configuration_description** | [**VpcConfigurationDescription**](VpcConfigurationDescription.md) |  | [optional] 

## Example

```python
from openapi_client.models.amazon_open_search_serverless_destination_description import AmazonOpenSearchServerlessDestinationDescription

# TODO update the JSON string below
json = "{}"
# create an instance of AmazonOpenSearchServerlessDestinationDescription from a JSON string
amazon_open_search_serverless_destination_description_instance = AmazonOpenSearchServerlessDestinationDescription.from_json(json)
# print the JSON string representation of the object
print(AmazonOpenSearchServerlessDestinationDescription.to_json())

# convert the object into a dict
amazon_open_search_serverless_destination_description_dict = amazon_open_search_serverless_destination_description_instance.to_dict()
# create an instance of AmazonOpenSearchServerlessDestinationDescription from a dict
amazon_open_search_serverless_destination_description_from_dict = AmazonOpenSearchServerlessDestinationDescription.from_dict(amazon_open_search_serverless_destination_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


