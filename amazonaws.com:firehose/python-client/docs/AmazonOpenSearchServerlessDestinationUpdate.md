# AmazonOpenSearchServerlessDestinationUpdate

Describes an update for a destination in the Serverless offering for Amazon OpenSearch Service.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | [optional] 
**collection_endpoint** | **str** |  | [optional] 
**index_name** | **str** |  | [optional] 
**buffering_hints** | [**AmazonOpenSearchServerlessDestinationUpdateBufferingHints**](AmazonOpenSearchServerlessDestinationUpdateBufferingHints.md) |  | [optional] 
**retry_options** | [**AmazonOpenSearchServerlessDestinationConfigurationRetryOptions**](AmazonOpenSearchServerlessDestinationConfigurationRetryOptions.md) |  | [optional] 
**s3_update** | [**S3DestinationUpdate**](S3DestinationUpdate.md) |  | [optional] 
**processing_configuration** | [**ProcessingConfiguration**](ProcessingConfiguration.md) |  | [optional] 
**cloud_watch_logging_options** | [**CloudWatchLoggingOptions**](CloudWatchLoggingOptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.amazon_open_search_serverless_destination_update import AmazonOpenSearchServerlessDestinationUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of AmazonOpenSearchServerlessDestinationUpdate from a JSON string
amazon_open_search_serverless_destination_update_instance = AmazonOpenSearchServerlessDestinationUpdate.from_json(json)
# print the JSON string representation of the object
print(AmazonOpenSearchServerlessDestinationUpdate.to_json())

# convert the object into a dict
amazon_open_search_serverless_destination_update_dict = amazon_open_search_serverless_destination_update_instance.to_dict()
# create an instance of AmazonOpenSearchServerlessDestinationUpdate from a dict
amazon_open_search_serverless_destination_update_from_dict = AmazonOpenSearchServerlessDestinationUpdate.from_dict(amazon_open_search_serverless_destination_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


