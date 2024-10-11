# MultiConditionalBranchCondition


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_condition** | [**SimpleConditionEventCondition**](SimpleConditionEventCondition.md) |  | [optional] 
**segment_condition** | [**SimpleConditionSegmentCondition**](SimpleConditionSegmentCondition.md) |  | [optional] 
**segment_dimensions** | [**SimpleConditionSegmentDimensions**](SimpleConditionSegmentDimensions.md) |  | [optional] 

## Example

```python
from openapi_client.models.multi_conditional_branch_condition import MultiConditionalBranchCondition

# TODO update the JSON string below
json = "{}"
# create an instance of MultiConditionalBranchCondition from a JSON string
multi_conditional_branch_condition_instance = MultiConditionalBranchCondition.from_json(json)
# print the JSON string representation of the object
print(MultiConditionalBranchCondition.to_json())

# convert the object into a dict
multi_conditional_branch_condition_dict = multi_conditional_branch_condition_instance.to_dict()
# create an instance of MultiConditionalBranchCondition from a dict
multi_conditional_branch_condition_from_dict = MultiConditionalBranchCondition.from_dict(multi_conditional_branch_condition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


