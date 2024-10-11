# DynamicPartitioningConfiguration

The configuration of the dynamic partitioning mechanism that creates smaller data sets from the streaming data by partitioning it based on partition keys. Currently, dynamic partitioning is only supported for Amazon S3 destinations. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**retry_options** | [**DynamicPartitioningConfigurationRetryOptions**](DynamicPartitioningConfigurationRetryOptions.md) |  | [optional] 
**enabled** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.dynamic_partitioning_configuration import DynamicPartitioningConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of DynamicPartitioningConfiguration from a JSON string
dynamic_partitioning_configuration_instance = DynamicPartitioningConfiguration.from_json(json)
# print the JSON string representation of the object
print(DynamicPartitioningConfiguration.to_json())

# convert the object into a dict
dynamic_partitioning_configuration_dict = dynamic_partitioning_configuration_instance.to_dict()
# create an instance of DynamicPartitioningConfiguration from a dict
dynamic_partitioning_configuration_from_dict = DynamicPartitioningConfiguration.from_dict(dynamic_partitioning_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


