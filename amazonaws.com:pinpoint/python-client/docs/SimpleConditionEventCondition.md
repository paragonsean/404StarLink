# SimpleConditionEventCondition


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dimensions** | [**EventConditionDimensions**](EventConditionDimensions.md) |  | [optional] 
**message_activity** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.simple_condition_event_condition import SimpleConditionEventCondition

# TODO update the JSON string below
json = "{}"
# create an instance of SimpleConditionEventCondition from a JSON string
simple_condition_event_condition_instance = SimpleConditionEventCondition.from_json(json)
# print the JSON string representation of the object
print(SimpleConditionEventCondition.to_json())

# convert the object into a dict
simple_condition_event_condition_dict = simple_condition_event_condition_instance.to_dict()
# create an instance of SimpleConditionEventCondition from a dict
simple_condition_event_condition_from_dict = SimpleConditionEventCondition.from_dict(simple_condition_event_condition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


