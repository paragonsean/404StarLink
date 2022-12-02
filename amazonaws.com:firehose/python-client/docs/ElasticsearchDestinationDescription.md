# ElasticsearchDestinationDescription

The destination description in Amazon ES.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | [optional] 
**domain_arn** | **str** |  | [optional] 
**cluster_endpoint** | **str** |  | [optional] 
**index_name** | **str** |  | [optional] 
**type_name** | **str** |  | [optional] 
**index_rotation_period** | [**ElasticsearchIndexRotationPeriod**](ElasticsearchIndexRotationPeriod.md) |  | [optional] 
**buffering_hints** | [**ElasticsearchDestinationDescriptionBufferingHints**](ElasticsearchDestinationDescriptionBufferingHints.md) |  | [optional] 
**retry_options** | [**ElasticsearchDestinationDescriptionRetryOptions**](ElasticsearchDestinationDescriptionRetryOptions.md) |  | [optional] 
**s3_backup_mode** | [**ElasticsearchS3BackupMode**](ElasticsearchS3BackupMode.md) |  | [optional] 
**s3_destination_description** | [**RedshiftDestinationDescriptionS3DestinationDescription**](RedshiftDestinationDescriptionS3DestinationDescription.md) |  | [optional] 
**processing_configuration** | [**ExtendedS3DestinationConfigurationProcessingConfiguration**](ExtendedS3DestinationConfigurationProcessingConfiguration.md) |  | [optional] 
**cloud_watch_logging_options** | [**ElasticsearchDestinationDescriptionCloudWatchLoggingOptions**](ElasticsearchDestinationDescriptionCloudWatchLoggingOptions.md) |  | [optional] 
**vpc_configuration_description** | [**ElasticsearchDestinationDescriptionVpcConfigurationDescription**](ElasticsearchDestinationDescriptionVpcConfigurationDescription.md) |  | [optional] 

## Example

```python
from openapi_client.models.elasticsearch_destination_description import ElasticsearchDestinationDescription

# TODO update the JSON string below
json = "{}"
# create an instance of ElasticsearchDestinationDescription from a JSON string
elasticsearch_destination_description_instance = ElasticsearchDestinationDescription.from_json(json)
# print the JSON string representation of the object
print(ElasticsearchDestinationDescription.to_json())

# convert the object into a dict
elasticsearch_destination_description_dict = elasticsearch_destination_description_instance.to_dict()
# create an instance of ElasticsearchDestinationDescription from a dict
elasticsearch_destination_description_from_dict = ElasticsearchDestinationDescription.from_dict(elasticsearch_destination_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


