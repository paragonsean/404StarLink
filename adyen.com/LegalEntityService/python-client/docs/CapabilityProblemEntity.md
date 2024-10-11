# CapabilityProblemEntity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documents** | **List[str]** |  | [optional] 
**id** | **str** |  | [optional] 
**owner** | [**CapabilityProblemEntityRecursive**](CapabilityProblemEntityRecursive.md) |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.capability_problem_entity import CapabilityProblemEntity

# TODO update the JSON string below
json = "{}"
# create an instance of CapabilityProblemEntity from a JSON string
capability_problem_entity_instance = CapabilityProblemEntity.from_json(json)
# print the JSON string representation of the object
print(CapabilityProblemEntity.to_json())

# convert the object into a dict
capability_problem_entity_dict = capability_problem_entity_instance.to_dict()
# create an instance of CapabilityProblemEntity from a dict
capability_problem_entity_from_dict = CapabilityProblemEntity.from_dict(capability_problem_entity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


