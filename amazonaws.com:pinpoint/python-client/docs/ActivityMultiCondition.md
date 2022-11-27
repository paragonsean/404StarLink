# ActivityMultiCondition


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branches** | **List** |  | [optional] 
**default_activity** | **str** |  | [optional] 
**evaluation_wait_time** | [**MultiConditionalSplitActivityEvaluationWaitTime**](MultiConditionalSplitActivityEvaluationWaitTime.md) |  | [optional] 

## Example

```python
from openapi_client.models.activity_multi_condition import ActivityMultiCondition

# TODO update the JSON string below
json = "{}"
# create an instance of ActivityMultiCondition from a JSON string
activity_multi_condition_instance = ActivityMultiCondition.from_json(json)
# print the JSON string representation of the object
print(ActivityMultiCondition.to_json())

# convert the object into a dict
activity_multi_condition_dict = activity_multi_condition_instance.to_dict()
# create an instance of ActivityMultiCondition from a dict
activity_multi_condition_from_dict = ActivityMultiCondition.from_dict(activity_multi_condition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


