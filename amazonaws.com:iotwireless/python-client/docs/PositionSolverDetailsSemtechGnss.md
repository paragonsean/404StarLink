# PositionSolverDetailsSemtechGnss


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**provider** | [**PositionSolverProvider**](PositionSolverProvider.md) |  | [optional] 
**type** | [**PositionSolverType**](PositionSolverType.md) |  | [optional] 
**status** | [**PositionConfigurationStatus**](PositionConfigurationStatus.md) |  | [optional] 
**fec** | [**PositionConfigurationFec**](PositionConfigurationFec.md) |  | [optional] 

## Example

```python
from openapi_client.models.position_solver_details_semtech_gnss import PositionSolverDetailsSemtechGnss

# TODO update the JSON string below
json = "{}"
# create an instance of PositionSolverDetailsSemtechGnss from a JSON string
position_solver_details_semtech_gnss_instance = PositionSolverDetailsSemtechGnss.from_json(json)
# print the JSON string representation of the object
print(PositionSolverDetailsSemtechGnss.to_json())

# convert the object into a dict
position_solver_details_semtech_gnss_dict = position_solver_details_semtech_gnss_instance.to_dict()
# create an instance of PositionSolverDetailsSemtechGnss from a dict
position_solver_details_semtech_gnss_from_dict = PositionSolverDetailsSemtechGnss.from_dict(position_solver_details_semtech_gnss_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


