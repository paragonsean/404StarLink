# AmazonopensearchserviceDestinationUpdate

Describes an update for a destination in Amazon OpenSearch Service.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | [optional] 
**domain_arn** | **str** |  | [optional] 
**cluster_endpoint** | **str** |  | [optional] 
**index_name** | **str** |  | [optional] 
**type_name** | **str** |  | [optional] 
**index_rotation_period** | [**AmazonopensearchserviceIndexRotationPeriod**](AmazonopensearchserviceIndexRotationPeriod.md) |  | [optional] 
**buffering_hints** | [**AmazonopensearchserviceDestinationUpdateBufferingHints**](AmazonopensearchserviceDestinationUpdateBufferingHints.md) |  | [optional] 
**retry_options** | [**AmazonopensearchserviceDestinationConfigurationRetryOptions**](AmazonopensearchserviceDestinationConfigurationRetryOptions.md) |  | [optional] 
**s3_update** | [**S3DestinationUpdate**](S3DestinationUpdate.md) |  | [optional] 
**processing_configuration** | [**ProcessingConfiguration**](ProcessingConfiguration.md) |  | [optional] 
**cloud_watch_logging_options** | [**CloudWatchLoggingOptions**](CloudWatchLoggingOptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.amazonopensearchservice_destination_update import AmazonopensearchserviceDestinationUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of AmazonopensearchserviceDestinationUpdate from a JSON string
amazonopensearchservice_destination_update_instance = AmazonopensearchserviceDestinationUpdate.from_json(json)
# print the JSON string representation of the object
print(AmazonopensearchserviceDestinationUpdate.to_json())

# convert the object into a dict
amazonopensearchservice_destination_update_dict = amazonopensearchservice_destination_update_instance.to_dict()
# create an instance of AmazonopensearchserviceDestinationUpdate from a dict
amazonopensearchservice_destination_update_from_dict = AmazonopensearchserviceDestinationUpdate.from_dict(amazonopensearchservice_destination_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


