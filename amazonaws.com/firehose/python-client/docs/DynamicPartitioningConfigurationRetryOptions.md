# DynamicPartitioningConfigurationRetryOptions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration_in_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.dynamic_partitioning_configuration_retry_options import DynamicPartitioningConfigurationRetryOptions

# TODO update the JSON string below
json = "{}"
# create an instance of DynamicPartitioningConfigurationRetryOptions from a JSON string
dynamic_partitioning_configuration_retry_options_instance = DynamicPartitioningConfigurationRetryOptions.from_json(json)
# print the JSON string representation of the object
print(DynamicPartitioningConfigurationRetryOptions.to_json())

# convert the object into a dict
dynamic_partitioning_configuration_retry_options_dict = dynamic_partitioning_configuration_retry_options_instance.to_dict()
# create an instance of DynamicPartitioningConfigurationRetryOptions from a dict
dynamic_partitioning_configuration_retry_options_from_dict = DynamicPartitioningConfigurationRetryOptions.from_dict(dynamic_partitioning_configuration_retry_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


