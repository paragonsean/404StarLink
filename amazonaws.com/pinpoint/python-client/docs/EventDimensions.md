# EventDimensions

Specifies the dimensions for an event filter that determines when a campaign is sent or a journey activity is performed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **Dict** |  | [optional] 
**event_type** | [**EventDimensionsEventType**](EventDimensionsEventType.md) |  | [optional] 
**metrics** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.event_dimensions import EventDimensions

# TODO update the JSON string below
json = "{}"
# create an instance of EventDimensions from a JSON string
event_dimensions_instance = EventDimensions.from_json(json)
# print the JSON string representation of the object
print(EventDimensions.to_json())

# convert the object into a dict
event_dimensions_dict = event_dimensions_instance.to_dict()
# create an instance of EventDimensions from a dict
event_dimensions_from_dict = EventDimensions.from_dict(event_dimensions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


