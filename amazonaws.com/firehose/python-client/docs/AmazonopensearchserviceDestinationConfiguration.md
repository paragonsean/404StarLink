# AmazonopensearchserviceDestinationConfiguration

Describes the configuration of a destination in Amazon OpenSearch Service

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | 
**domain_arn** | **str** |  | [optional] 
**cluster_endpoint** | **str** |  | [optional] 
**index_name** | **str** |  | 
**type_name** | **str** |  | [optional] 
**index_rotation_period** | [**AmazonopensearchserviceIndexRotationPeriod**](AmazonopensearchserviceIndexRotationPeriod.md) |  | [optional] 
**buffering_hints** | [**AmazonopensearchserviceDestinationConfigurationBufferingHints**](AmazonopensearchserviceDestinationConfigurationBufferingHints.md) |  | [optional] 
**retry_options** | [**AmazonopensearchserviceDestinationConfigurationRetryOptions**](AmazonopensearchserviceDestinationConfigurationRetryOptions.md) |  | [optional] 
**s3_backup_mode** | [**AmazonopensearchserviceS3BackupMode**](AmazonopensearchserviceS3BackupMode.md) |  | [optional] 
**s3_configuration** | [**S3DestinationConfiguration**](S3DestinationConfiguration.md) |  | 
**processing_configuration** | [**ProcessingConfiguration**](ProcessingConfiguration.md) |  | [optional] 
**cloud_watch_logging_options** | [**CloudWatchLoggingOptions**](CloudWatchLoggingOptions.md) |  | [optional] 
**vpc_configuration** | [**VpcConfiguration**](VpcConfiguration.md) |  | [optional] 

## Example

```python
from openapi_client.models.amazonopensearchservice_destination_configuration import AmazonopensearchserviceDestinationConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of AmazonopensearchserviceDestinationConfiguration from a JSON string
amazonopensearchservice_destination_configuration_instance = AmazonopensearchserviceDestinationConfiguration.from_json(json)
# print the JSON string representation of the object
print(AmazonopensearchserviceDestinationConfiguration.to_json())

# convert the object into a dict
amazonopensearchservice_destination_configuration_dict = amazonopensearchservice_destination_configuration_instance.to_dict()
# create an instance of AmazonopensearchserviceDestinationConfiguration from a dict
amazonopensearchservice_destination_configuration_from_dict = AmazonopensearchserviceDestinationConfiguration.from_dict(amazonopensearchservice_destination_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


