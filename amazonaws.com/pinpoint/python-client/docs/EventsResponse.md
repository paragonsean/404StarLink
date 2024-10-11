# EventsResponse

Provides information about endpoints and the events that they're associated with.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.events_response import EventsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of EventsResponse from a JSON string
events_response_instance = EventsResponse.from_json(json)
# print the JSON string representation of the object
print(EventsResponse.to_json())

# convert the object into a dict
events_response_dict = events_response_instance.to_dict()
# create an instance of EventsResponse from a dict
events_response_from_dict = EventsResponse.from_dict(events_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


