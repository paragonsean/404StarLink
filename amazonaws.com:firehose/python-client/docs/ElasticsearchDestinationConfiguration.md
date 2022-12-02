# ElasticsearchDestinationConfiguration

Describes the configuration of a destination in Amazon ES.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | 
**domain_arn** | **str** |  | [optional] 
**cluster_endpoint** | **str** |  | [optional] 
**index_name** | **str** |  | 
**type_name** | **str** |  | [optional] 
**index_rotation_period** | [**ElasticsearchIndexRotationPeriod**](ElasticsearchIndexRotationPeriod.md) |  | [optional] 
**buffering_hints** | [**ElasticsearchDestinationConfigurationBufferingHints**](ElasticsearchDestinationConfigurationBufferingHints.md) |  | [optional] 
**retry_options** | [**ElasticsearchDestinationConfigurationRetryOptions**](ElasticsearchDestinationConfigurationRetryOptions.md) |  | [optional] 
**s3_backup_mode** | [**ElasticsearchS3BackupMode**](ElasticsearchS3BackupMode.md) |  | [optional] 
**s3_configuration** | [**ElasticsearchDestinationConfigurationS3Configuration**](ElasticsearchDestinationConfigurationS3Configuration.md) |  | 
**processing_configuration** | [**ExtendedS3DestinationConfigurationProcessingConfiguration**](ExtendedS3DestinationConfigurationProcessingConfiguration.md) |  | [optional] 
**cloud_watch_logging_options** | [**S3DestinationDescriptionCloudWatchLoggingOptions**](S3DestinationDescriptionCloudWatchLoggingOptions.md) |  | [optional] 
**vpc_configuration** | [**ElasticsearchDestinationConfigurationVpcConfiguration**](ElasticsearchDestinationConfigurationVpcConfiguration.md) |  | [optional] 

## Example

```python
from openapi_client.models.elasticsearch_destination_configuration import ElasticsearchDestinationConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of ElasticsearchDestinationConfiguration from a JSON string
elasticsearch_destination_configuration_instance = ElasticsearchDestinationConfiguration.from_json(json)
# print the JSON string representation of the object
print(ElasticsearchDestinationConfiguration.to_json())

# convert the object into a dict
elasticsearch_destination_configuration_dict = elasticsearch_destination_configuration_instance.to_dict()
# create an instance of ElasticsearchDestinationConfiguration from a dict
elasticsearch_destination_configuration_from_dict = ElasticsearchDestinationConfiguration.from_dict(elasticsearch_destination_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


