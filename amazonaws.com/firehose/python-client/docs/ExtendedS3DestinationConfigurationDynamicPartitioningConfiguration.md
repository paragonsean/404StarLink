# ExtendedS3DestinationConfigurationDynamicPartitioningConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**retry_options** | [**DynamicPartitioningConfigurationRetryOptions**](DynamicPartitioningConfigurationRetryOptions.md) |  | [optional] 
**enabled** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.extended_s3_destination_configuration_dynamic_partitioning_configuration import ExtendedS3DestinationConfigurationDynamicPartitioningConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of ExtendedS3DestinationConfigurationDynamicPartitioningConfiguration from a JSON string
extended_s3_destination_configuration_dynamic_partitioning_configuration_instance = ExtendedS3DestinationConfigurationDynamicPartitioningConfiguration.from_json(json)
# print the JSON string representation of the object
print(ExtendedS3DestinationConfigurationDynamicPartitioningConfiguration.to_json())

# convert the object into a dict
extended_s3_destination_configuration_dynamic_partitioning_configuration_dict = extended_s3_destination_configuration_dynamic_partitioning_configuration_instance.to_dict()
# create an instance of ExtendedS3DestinationConfigurationDynamicPartitioningConfiguration from a dict
extended_s3_destination_configuration_dynamic_partitioning_configuration_from_dict = ExtendedS3DestinationConfigurationDynamicPartitioningConfiguration.from_dict(extended_s3_destination_configuration_dynamic_partitioning_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


