# EventConditionDimensions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **Dict** |  | [optional] 
**event_type** | [**EventDimensionsEventType**](EventDimensionsEventType.md) |  | [optional] 
**metrics** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.event_condition_dimensions import EventConditionDimensions

# TODO update the JSON string below
json = "{}"
# create an instance of EventConditionDimensions from a JSON string
event_condition_dimensions_instance = EventConditionDimensions.from_json(json)
# print the JSON string representation of the object
print(EventConditionDimensions.to_json())

# convert the object into a dict
event_condition_dimensions_dict = event_condition_dimensions_instance.to_dict()
# create an instance of EventConditionDimensions from a dict
event_condition_dimensions_from_dict = EventConditionDimensions.from_dict(event_condition_dimensions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


