# SsmParameterStoreParameter

AWS Systems Manager Parameter Store parameter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameter_name** | **str** |  | 
**parameter_type** | [**SsmParameterStoreParameterType**](SsmParameterStoreParameterType.md) |  | 

## Example

```python
from openapi_client.models.ssm_parameter_store_parameter import SsmParameterStoreParameter

# TODO update the JSON string below
json = "{}"
# create an instance of SsmParameterStoreParameter from a JSON string
ssm_parameter_store_parameter_instance = SsmParameterStoreParameter.from_json(json)
# print the JSON string representation of the object
print(SsmParameterStoreParameter.to_json())

# convert the object into a dict
ssm_parameter_store_parameter_dict = ssm_parameter_store_parameter_instance.to_dict()
# create an instance of SsmParameterStoreParameter from a dict
ssm_parameter_store_parameter_from_dict = SsmParameterStoreParameter.from_dict(ssm_parameter_store_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


