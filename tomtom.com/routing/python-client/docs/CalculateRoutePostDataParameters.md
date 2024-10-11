# CalculateRoutePostDataParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_vignette** | **List[str]** |  | [optional] 
**avoid_areas** | [**CalculateReachableRangePostDataParametersAvoidAreas**](CalculateReachableRangePostDataParametersAvoidAreas.md) |  | [optional] 
**avoid_vignette** | **List[str]** |  | [optional] 
**supporting_points** | [**List[CalculateRoutePostDataParametersSupportingPointsInner]**](CalculateRoutePostDataParametersSupportingPointsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.calculate_route_post_data_parameters import CalculateRoutePostDataParameters

# TODO update the JSON string below
json = "{}"
# create an instance of CalculateRoutePostDataParameters from a JSON string
calculate_route_post_data_parameters_instance = CalculateRoutePostDataParameters.from_json(json)
# print the JSON string representation of the object
print(CalculateRoutePostDataParameters.to_json())

# convert the object into a dict
calculate_route_post_data_parameters_dict = calculate_route_post_data_parameters_instance.to_dict()
# create an instance of CalculateRoutePostDataParameters from a dict
calculate_route_post_data_parameters_from_dict = CalculateRoutePostDataParameters.from_dict(calculate_route_post_data_parameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


