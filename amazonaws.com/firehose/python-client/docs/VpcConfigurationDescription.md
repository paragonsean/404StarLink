# VpcConfigurationDescription

The details of the VPC of the Amazon ES destination.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subnet_ids** | **List** |  | 
**role_arn** | **str** |  | 
**security_group_ids** | **List** |  | 
**vpc_id** | **str** |  | 

## Example

```python
from openapi_client.models.vpc_configuration_description import VpcConfigurationDescription

# TODO update the JSON string below
json = "{}"
# create an instance of VpcConfigurationDescription from a JSON string
vpc_configuration_description_instance = VpcConfigurationDescription.from_json(json)
# print the JSON string representation of the object
print(VpcConfigurationDescription.to_json())

# convert the object into a dict
vpc_configuration_description_dict = vpc_configuration_description_instance.to_dict()
# create an instance of VpcConfigurationDescription from a dict
vpc_configuration_description_from_dict = VpcConfigurationDescription.from_dict(vpc_configuration_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


