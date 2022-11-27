# ActivityConditionalSplit


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**condition** | [**ConditionalSplitActivityCondition**](ConditionalSplitActivityCondition.md) |  | [optional] 
**evaluation_wait_time** | [**ConditionalSplitActivityEvaluationWaitTime**](ConditionalSplitActivityEvaluationWaitTime.md) |  | [optional] 
**false_activity** | **str** |  | [optional] 
**true_activity** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.activity_conditional_split import ActivityConditionalSplit

# TODO update the JSON string below
json = "{}"
# create an instance of ActivityConditionalSplit from a JSON string
activity_conditional_split_instance = ActivityConditionalSplit.from_json(json)
# print the JSON string representation of the object
print(ActivityConditionalSplit.to_json())

# convert the object into a dict
activity_conditional_split_dict = activity_conditional_split_instance.to_dict()
# create an instance of ActivityConditionalSplit from a dict
activity_conditional_split_from_dict = ActivityConditionalSplit.from_dict(activity_conditional_split_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


