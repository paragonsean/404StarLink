# DestinationDescriptionAmazonopensearchserviceDestinationDescription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | [optional] 
**domain_arn** | **str** |  | [optional] 
**cluster_endpoint** | **str** |  | [optional] 
**index_name** | **str** |  | [optional] 
**type_name** | **str** |  | [optional] 
**index_rotation_period** | [**AmazonopensearchserviceIndexRotationPeriod**](AmazonopensearchserviceIndexRotationPeriod.md) |  | [optional] 
**buffering_hints** | [**AmazonopensearchserviceDestinationDescriptionBufferingHints**](AmazonopensearchserviceDestinationDescriptionBufferingHints.md) |  | [optional] 
**retry_options** | [**AmazonopensearchserviceDestinationDescriptionRetryOptions**](AmazonopensearchserviceDestinationDescriptionRetryOptions.md) |  | [optional] 
**s3_backup_mode** | [**AmazonopensearchserviceS3BackupMode**](AmazonopensearchserviceS3BackupMode.md) |  | [optional] 
**s3_destination_description** | [**S3DestinationDescription**](S3DestinationDescription.md) |  | [optional] 
**processing_configuration** | [**ProcessingConfiguration**](ProcessingConfiguration.md) |  | [optional] 
**cloud_watch_logging_options** | [**CloudWatchLoggingOptions**](CloudWatchLoggingOptions.md) |  | [optional] 
**vpc_configuration_description** | [**VpcConfigurationDescription**](VpcConfigurationDescription.md) |  | [optional] 

## Example

```python
from openapi_client.models.destination_description_amazonopensearchservice_destination_description import DestinationDescriptionAmazonopensearchserviceDestinationDescription

# TODO update the JSON string below
json = "{}"
# create an instance of DestinationDescriptionAmazonopensearchserviceDestinationDescription from a JSON string
destination_description_amazonopensearchservice_destination_description_instance = DestinationDescriptionAmazonopensearchserviceDestinationDescription.from_json(json)
# print the JSON string representation of the object
print(DestinationDescriptionAmazonopensearchserviceDestinationDescription.to_json())

# convert the object into a dict
destination_description_amazonopensearchservice_destination_description_dict = destination_description_amazonopensearchservice_destination_description_instance.to_dict()
# create an instance of DestinationDescriptionAmazonopensearchserviceDestinationDescription from a dict
destination_description_amazonopensearchservice_destination_description_from_dict = DestinationDescriptionAmazonopensearchserviceDestinationDescription.from_dict(destination_description_amazonopensearchservice_destination_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


