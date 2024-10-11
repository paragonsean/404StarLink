# VpcConfiguration

The details of the VPC of the Amazon ES destination.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subnet_ids** | **List** |  | 
**role_arn** | **str** |  | 
**security_group_ids** | **List** |  | 

## Example

```python
from openapi_client.models.vpc_configuration import VpcConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of VpcConfiguration from a JSON string
vpc_configuration_instance = VpcConfiguration.from_json(json)
# print the JSON string representation of the object
print(VpcConfiguration.to_json())

# convert the object into a dict
vpc_configuration_dict = vpc_configuration_instance.to_dict()
# create an instance of VpcConfiguration from a dict
vpc_configuration_from_dict = VpcConfiguration.from_dict(vpc_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


