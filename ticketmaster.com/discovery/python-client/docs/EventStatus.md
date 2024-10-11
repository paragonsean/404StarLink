# EventStatus

Event's Status

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | The event&#39;s status code | [optional] 

## Example

```python
from openapi_client.models.event_status import EventStatus

# TODO update the JSON string below
json = "{}"
# create an instance of EventStatus from a JSON string
event_status_instance = EventStatus.from_json(json)
# print the JSON string representation of the object
print(EventStatus.to_json())

# convert the object into a dict
event_status_dict = event_status_instance.to_dict()
# create an instance of EventStatus from a dict
event_status_from_dict = EventStatus.from_dict(event_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


