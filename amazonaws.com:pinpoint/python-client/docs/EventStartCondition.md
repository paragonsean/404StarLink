# EventStartCondition

Specifies the settings for an event that causes a journey activity to start.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_filter** | [**EventFilter**](EventFilter.md) |  | [optional] 
**segment_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.event_start_condition import EventStartCondition

# TODO update the JSON string below
json = "{}"
# create an instance of EventStartCondition from a JSON string
event_start_condition_instance = EventStartCondition.from_json(json)
# print the JSON string representation of the object
print(EventStartCondition.to_json())

# convert the object into a dict
event_start_condition_dict = event_start_condition_instance.to_dict()
# create an instance of EventStartCondition from a dict
event_start_condition_from_dict = EventStartCondition.from_dict(event_start_condition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


