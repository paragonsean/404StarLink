# MultiConditionalBranch

Specifies a condition to evaluate for an activity path in a journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**condition** | [**MultiConditionalBranchCondition**](MultiConditionalBranchCondition.md) |  | [optional] 
**next_activity** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.multi_conditional_branch import MultiConditionalBranch

# TODO update the JSON string below
json = "{}"
# create an instance of MultiConditionalBranch from a JSON string
multi_conditional_branch_instance = MultiConditionalBranch.from_json(json)
# print the JSON string representation of the object
print(MultiConditionalBranch.to_json())

# convert the object into a dict
multi_conditional_branch_dict = multi_conditional_branch_instance.to_dict()
# create an instance of MultiConditionalBranch from a dict
multi_conditional_branch_from_dict = MultiConditionalBranch.from_dict(multi_conditional_branch_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


