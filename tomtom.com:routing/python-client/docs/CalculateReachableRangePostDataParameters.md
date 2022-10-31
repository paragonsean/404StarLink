# CalculateReachableRangePostDataParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_vignette** | **List[str]** |  | [optional] 
**avoid_areas** | [**CalculateReachableRangePostDataParametersAvoidAreas**](CalculateReachableRangePostDataParametersAvoidAreas.md) |  | [optional] 
**avoid_vignette** | **List[str]** |  | [optional] 

## Example

```python
from openapi_client.models.calculate_reachable_range_post_data_parameters import CalculateReachableRangePostDataParameters

# TODO update the JSON string below
json = "{}"
# create an instance of CalculateReachableRangePostDataParameters from a JSON string
calculate_reachable_range_post_data_parameters_instance = CalculateReachableRangePostDataParameters.from_json(json)
# print the JSON string representation of the object
print(CalculateReachableRangePostDataParameters.to_json())

# convert the object into a dict
calculate_reachable_range_post_data_parameters_dict = calculate_reachable_range_post_data_parameters_instance.to_dict()
# create an instance of CalculateReachableRangePostDataParameters from a dict
calculate_reachable_range_post_data_parameters_from_dict = CalculateReachableRangePostDataParameters.from_dict(calculate_reachable_range_post_data_parameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


