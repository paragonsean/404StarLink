# SsmExternalParameter

AWS Systems Manager Document external parameter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dynamic_path** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.ssm_external_parameter import SsmExternalParameter

# TODO update the JSON string below
json = "{}"
# create an instance of SsmExternalParameter from a JSON string
ssm_external_parameter_instance = SsmExternalParameter.from_json(json)
# print the JSON string representation of the object
print(SsmExternalParameter.to_json())

# convert the object into a dict
ssm_external_parameter_dict = ssm_external_parameter_instance.to_dict()
# create an instance of SsmExternalParameter from a dict
ssm_external_parameter_from_dict = SsmExternalParameter.from_dict(ssm_external_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


