# GetPositionResponse

This operation is no longer supported.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**position** | **List** |  | [optional] 
**accuracy** | [**GetPositionResponseAccuracy**](GetPositionResponseAccuracy.md) |  | [optional] 
**solver_type** | [**PositionSolverType**](PositionSolverType.md) |  | [optional] 
**solver_provider** | [**PositionSolverProvider**](PositionSolverProvider.md) |  | [optional] 
**solver_version** | **str** |  | [optional] 
**timestamp** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.get_position_response import GetPositionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetPositionResponse from a JSON string
get_position_response_instance = GetPositionResponse.from_json(json)
# print the JSON string representation of the object
print(GetPositionResponse.to_json())

# convert the object into a dict
get_position_response_dict = get_position_response_instance.to_dict()
# create an instance of GetPositionResponse from a dict
get_position_response_from_dict = GetPositionResponse.from_dict(get_position_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


