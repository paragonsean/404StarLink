# ElasticsearchDestinationUpdate

Describes an update for a destination in Amazon ES.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | [optional] 
**domain_arn** | **str** |  | [optional] 
**cluster_endpoint** | **str** |  | [optional] 
**index_name** | **str** |  | [optional] 
**type_name** | **str** |  | [optional] 
**index_rotation_period** | [**ElasticsearchIndexRotationPeriod**](ElasticsearchIndexRotationPeriod.md) |  | [optional] 
**buffering_hints** | [**ElasticsearchDestinationUpdateBufferingHints**](ElasticsearchDestinationUpdateBufferingHints.md) |  | [optional] 
**retry_options** | [**ElasticsearchDestinationConfigurationRetryOptions**](ElasticsearchDestinationConfigurationRetryOptions.md) |  | [optional] 
**s3_update** | [**ElasticsearchDestinationUpdateS3Update**](ElasticsearchDestinationUpdateS3Update.md) |  | [optional] 
**processing_configuration** | [**ExtendedS3DestinationConfigurationProcessingConfiguration**](ExtendedS3DestinationConfigurationProcessingConfiguration.md) |  | [optional] 
**cloud_watch_logging_options** | [**S3DestinationConfigurationCloudWatchLoggingOptions**](S3DestinationConfigurationCloudWatchLoggingOptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.elasticsearch_destination_update import ElasticsearchDestinationUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of ElasticsearchDestinationUpdate from a JSON string
elasticsearch_destination_update_instance = ElasticsearchDestinationUpdate.from_json(json)
# print the JSON string representation of the object
print(ElasticsearchDestinationUpdate.to_json())

# convert the object into a dict
elasticsearch_destination_update_dict = elasticsearch_destination_update_instance.to_dict()
# create an instance of ElasticsearchDestinationUpdate from a dict
elasticsearch_destination_update_from_dict = ElasticsearchDestinationUpdate.from_dict(elasticsearch_destination_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


