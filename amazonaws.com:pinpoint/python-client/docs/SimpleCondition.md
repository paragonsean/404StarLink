# SimpleCondition

Specifies a condition to evaluate for an activity in a journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_condition** | [**SimpleConditionEventCondition**](SimpleConditionEventCondition.md) |  | [optional] 
**segment_condition** | [**SimpleConditionSegmentCondition**](SimpleConditionSegmentCondition.md) |  | [optional] 
**segment_dimensions** | [**SimpleConditionSegmentDimensions**](SimpleConditionSegmentDimensions.md) |  | [optional] 

## Example

```python
from openapi_client.models.simple_condition import SimpleCondition

# TODO update the JSON string below
json = "{}"
# create an instance of SimpleCondition from a JSON string
simple_condition_instance = SimpleCondition.from_json(json)
# print the JSON string representation of the object
print(SimpleCondition.to_json())

# convert the object into a dict
simple_condition_dict = simple_condition_instance.to_dict()
# create an instance of SimpleCondition from a dict
simple_condition_from_dict = SimpleCondition.from_dict(simple_condition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


