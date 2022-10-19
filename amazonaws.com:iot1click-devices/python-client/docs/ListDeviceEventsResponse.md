# ListDeviceEventsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events** | **List** |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_device_events_response import ListDeviceEventsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListDeviceEventsResponse from a JSON string
list_device_events_response_instance = ListDeviceEventsResponse.from_json(json)
# print the JSON string representation of the object
print(ListDeviceEventsResponse.to_json())

# convert the object into a dict
list_device_events_response_dict = list_device_events_response_instance.to_dict()
# create an instance of ListDeviceEventsResponse from a dict
list_device_events_response_from_dict = ListDeviceEventsResponse.from_dict(list_device_events_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


