# AmazonOpenSearchServerlessDestinationConfiguration

Describes the configuration of a destination in the Serverless offering for Amazon OpenSearch Service.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | 
**collection_endpoint** | **str** |  | [optional] 
**index_name** | **str** |  | 
**buffering_hints** | [**AmazonOpenSearchServerlessDestinationConfigurationBufferingHints**](AmazonOpenSearchServerlessDestinationConfigurationBufferingHints.md) |  | [optional] 
**retry_options** | [**AmazonOpenSearchServerlessDestinationConfigurationRetryOptions**](AmazonOpenSearchServerlessDestinationConfigurationRetryOptions.md) |  | [optional] 
**s3_backup_mode** | [**AmazonOpenSearchServerlessS3BackupMode**](AmazonOpenSearchServerlessS3BackupMode.md) |  | [optional] 
**s3_configuration** | [**S3DestinationConfiguration**](S3DestinationConfiguration.md) |  | 
**processing_configuration** | [**ProcessingConfiguration**](ProcessingConfiguration.md) |  | [optional] 
**cloud_watch_logging_options** | [**CloudWatchLoggingOptions**](CloudWatchLoggingOptions.md) |  | [optional] 
**vpc_configuration** | [**VpcConfiguration**](VpcConfiguration.md) |  | [optional] 

## Example

```python
from openapi_client.models.amazon_open_search_serverless_destination_configuration import AmazonOpenSearchServerlessDestinationConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of AmazonOpenSearchServerlessDestinationConfiguration from a JSON string
amazon_open_search_serverless_destination_configuration_instance = AmazonOpenSearchServerlessDestinationConfiguration.from_json(json)
# print the JSON string representation of the object
print(AmazonOpenSearchServerlessDestinationConfiguration.to_json())

# convert the object into a dict
amazon_open_search_serverless_destination_configuration_dict = amazon_open_search_serverless_destination_configuration_instance.to_dict()
# create an instance of AmazonOpenSearchServerlessDestinationConfiguration from a dict
amazon_open_search_serverless_destination_configuration_from_dict = AmazonOpenSearchServerlessDestinationConfiguration.from_dict(amazon_open_search_serverless_destination_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


