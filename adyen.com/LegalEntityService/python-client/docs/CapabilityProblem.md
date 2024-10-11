# CapabilityProblem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity** | [**CapabilityProblemEntity**](CapabilityProblemEntity.md) |  | [optional] 
**verification_errors** | [**List[VerificationError]**](VerificationError.md) |  | [optional] 

## Example

```python
from openapi_client.models.capability_problem import CapabilityProblem

# TODO update the JSON string below
json = "{}"
# create an instance of CapabilityProblem from a JSON string
capability_problem_instance = CapabilityProblem.from_json(json)
# print the JSON string representation of the object
print(CapabilityProblem.to_json())

# convert the object into a dict
capability_problem_dict = capability_problem_instance.to_dict()
# create an instance of CapabilityProblem from a dict
capability_problem_from_dict = CapabilityProblem.from_dict(capability_problem_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


