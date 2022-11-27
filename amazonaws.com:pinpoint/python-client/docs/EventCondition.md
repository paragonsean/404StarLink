# EventCondition

Specifies the conditions to evaluate for an event that applies to an activity in a journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dimensions** | [**EventConditionDimensions**](EventConditionDimensions.md) |  | [optional] 
**message_activity** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.event_condition import EventCondition

# TODO update the JSON string below
json = "{}"
# create an instance of EventCondition from a JSON string
event_condition_instance = EventCondition.from_json(json)
# print the JSON string representation of the object
print(EventCondition.to_json())

# convert the object into a dict
event_condition_dict = event_condition_instance.to_dict()
# create an instance of EventCondition from a dict
event_condition_from_dict = EventCondition.from_dict(event_condition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


