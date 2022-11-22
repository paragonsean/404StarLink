# GetPositionConfigurationResponseSolvers


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**semtech_gnss** | [**PositionSolverDetailsSemtechGnss**](PositionSolverDetailsSemtechGnss.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_position_configuration_response_solvers import GetPositionConfigurationResponseSolvers

# TODO update the JSON string below
json = "{}"
# create an instance of GetPositionConfigurationResponseSolvers from a JSON string
get_position_configuration_response_solvers_instance = GetPositionConfigurationResponseSolvers.from_json(json)
# print the JSON string representation of the object
print(GetPositionConfigurationResponseSolvers.to_json())

# convert the object into a dict
get_position_configuration_response_solvers_dict = get_position_configuration_response_solvers_instance.to_dict()
# create an instance of GetPositionConfigurationResponseSolvers from a dict
get_position_configuration_response_solvers_from_dict = GetPositionConfigurationResponseSolvers.from_dict(get_position_configuration_response_solvers_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


