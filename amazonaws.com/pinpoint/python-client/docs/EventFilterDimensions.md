# EventFilterDimensions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **Dict** |  | [optional] 
**event_type** | [**EventDimensionsEventType**](EventDimensionsEventType.md) |  | [optional] 
**metrics** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.event_filter_dimensions import EventFilterDimensions

# TODO update the JSON string below
json = "{}"
# create an instance of EventFilterDimensions from a JSON string
event_filter_dimensions_instance = EventFilterDimensions.from_json(json)
# print the JSON string representation of the object
print(EventFilterDimensions.to_json())

# convert the object into a dict
event_filter_dimensions_dict = event_filter_dimensions_instance.to_dict()
# create an instance of EventFilterDimensions from a dict
event_filter_dimensions_from_dict = EventFilterDimensions.from_dict(event_filter_dimensions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


