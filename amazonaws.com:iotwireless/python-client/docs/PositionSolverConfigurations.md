# PositionSolverConfigurations

The wrapper for position solver configurations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**semtech_gnss** | [**PutPositionConfigurationRequestSolversSemtechGnss**](PutPositionConfigurationRequestSolversSemtechGnss.md) |  | [optional] 

## Example

```python
from openapi_client.models.position_solver_configurations import PositionSolverConfigurations

# TODO update the JSON string below
json = "{}"
# create an instance of PositionSolverConfigurations from a JSON string
position_solver_configurations_instance = PositionSolverConfigurations.from_json(json)
# print the JSON string representation of the object
print(PositionSolverConfigurations.to_json())

# convert the object into a dict
position_solver_configurations_dict = position_solver_configurations_instance.to_dict()
# create an instance of PositionSolverConfigurations from a dict
position_solver_configurations_from_dict = PositionSolverConfigurations.from_dict(position_solver_configurations_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


