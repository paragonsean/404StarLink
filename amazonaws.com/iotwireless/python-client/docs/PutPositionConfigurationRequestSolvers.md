# PutPositionConfigurationRequestSolvers


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**semtech_gnss** | [**PutPositionConfigurationRequestSolversSemtechGnss**](PutPositionConfigurationRequestSolversSemtechGnss.md) |  | [optional] 

## Example

```python
from openapi_client.models.put_position_configuration_request_solvers import PutPositionConfigurationRequestSolvers

# TODO update the JSON string below
json = "{}"
# create an instance of PutPositionConfigurationRequestSolvers from a JSON string
put_position_configuration_request_solvers_instance = PutPositionConfigurationRequestSolvers.from_json(json)
# print the JSON string representation of the object
print(PutPositionConfigurationRequestSolvers.to_json())

# convert the object into a dict
put_position_configuration_request_solvers_dict = put_position_configuration_request_solvers_instance.to_dict()
# create an instance of PutPositionConfigurationRequestSolvers from a dict
put_position_configuration_request_solvers_from_dict = PutPositionConfigurationRequestSolvers.from_dict(put_position_configuration_request_solvers_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


