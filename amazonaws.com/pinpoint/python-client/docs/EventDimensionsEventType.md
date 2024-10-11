# EventDimensionsEventType


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dimension_type** | [**DimensionType**](DimensionType.md) |  | [optional] 
**values** | **List** |  | 

## Example

```python
from openapi_client.models.event_dimensions_event_type import EventDimensionsEventType

# TODO update the JSON string below
json = "{}"
# create an instance of EventDimensionsEventType from a JSON string
event_dimensions_event_type_instance = EventDimensionsEventType.from_json(json)
# print the JSON string representation of the object
print(EventDimensionsEventType.to_json())

# convert the object into a dict
event_dimensions_event_type_dict = event_dimensions_event_type_instance.to_dict()
# create an instance of EventDimensionsEventType from a dict
event_dimensions_event_type_from_dict = EventDimensionsEventType.from_dict(event_dimensions_event_type_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


