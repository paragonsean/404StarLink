# EventSession


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration** | **int** |  | [optional] 
**id** | **str** |  | 
**start_timestamp** | **str** |  | 
**stop_timestamp** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.event_session import EventSession

# TODO update the JSON string below
json = "{}"
# create an instance of EventSession from a JSON string
event_session_instance = EventSession.from_json(json)
# print the JSON string representation of the object
print(EventSession.to_json())

# convert the object into a dict
event_session_dict = event_session_instance.to_dict()
# create an instance of EventSession from a dict
event_session_from_dict = EventSession.from_dict(event_session_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


