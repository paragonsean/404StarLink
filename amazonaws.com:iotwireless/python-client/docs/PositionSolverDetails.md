# PositionSolverDetails

The wrapper for position solver details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**semtech_gnss** | [**PositionSolverDetailsSemtechGnss**](PositionSolverDetailsSemtechGnss.md) |  | [optional] 

## Example

```python
from openapi_client.models.position_solver_details import PositionSolverDetails

# TODO update the JSON string below
json = "{}"
# create an instance of PositionSolverDetails from a JSON string
position_solver_details_instance = PositionSolverDetails.from_json(json)
# print the JSON string representation of the object
print(PositionSolverDetails.to_json())

# convert the object into a dict
position_solver_details_dict = position_solver_details_instance.to_dict()
# create an instance of PositionSolverDetails from a dict
position_solver_details_from_dict = PositionSolverDetails.from_dict(position_solver_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


