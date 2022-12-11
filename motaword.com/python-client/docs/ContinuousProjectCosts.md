# ContinuousProjectCosts


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mt** | [**Monetary**](Monetary.md) |  | [optional] 
**post_edit** | [**Monetary**](Monetary.md) |  | [optional] 
**saved** | [**Monetary**](Monetary.md) |  | [optional] 
**total** | [**Monetary**](Monetary.md) |  | [optional] 

## Example

```python
from openapi_client.models.continuous_project_costs import ContinuousProjectCosts

# TODO update the JSON string below
json = "{}"
# create an instance of ContinuousProjectCosts from a JSON string
continuous_project_costs_instance = ContinuousProjectCosts.from_json(json)
# print the JSON string representation of the object
print(ContinuousProjectCosts.to_json())

# convert the object into a dict
continuous_project_costs_dict = continuous_project_costs_instance.to_dict()
# create an instance of ContinuousProjectCosts from a dict
continuous_project_costs_from_dict = ContinuousProjectCosts.from_dict(continuous_project_costs_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


