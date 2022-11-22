# GetPositionConfigurationResponse

This operation is no longer supported.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**solvers** | [**GetPositionConfigurationResponseSolvers**](GetPositionConfigurationResponseSolvers.md) |  | [optional] 
**destination** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.get_position_configuration_response import GetPositionConfigurationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetPositionConfigurationResponse from a JSON string
get_position_configuration_response_instance = GetPositionConfigurationResponse.from_json(json)
# print the JSON string representation of the object
print(GetPositionConfigurationResponse.to_json())

# convert the object into a dict
get_position_configuration_response_dict = get_position_configuration_response_instance.to_dict()
# create an instance of GetPositionConfigurationResponse from a dict
get_position_configuration_response_from_dict = GetPositionConfigurationResponse.from_dict(get_position_configuration_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


