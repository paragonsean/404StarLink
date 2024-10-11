# StartCondition

Specifies the conditions for the first activity in a journey. This activity and its conditions determine which users are participants in a journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**event_start_condition** | [**EventStartCondition**](EventStartCondition.md) |  | [optional] 
**segment_start_condition** | [**StartConditionSegmentStartCondition**](StartConditionSegmentStartCondition.md) |  | [optional] 

## Example

```python
from openapi_client.models.start_condition import StartCondition

# TODO update the JSON string below
json = "{}"
# create an instance of StartCondition from a JSON string
start_condition_instance = StartCondition.from_json(json)
# print the JSON string representation of the object
print(StartCondition.to_json())

# convert the object into a dict
start_condition_dict = start_condition_instance.to_dict()
# create an instance of StartCondition from a dict
start_condition_from_dict = StartCondition.from_dict(start_condition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


