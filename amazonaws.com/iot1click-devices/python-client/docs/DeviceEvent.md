# DeviceEvent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**device** | [**DeviceEventDevice**](DeviceEventDevice.md) |  | [optional] 
**std_event** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.device_event import DeviceEvent

# TODO update the JSON string below
json = "{}"
# create an instance of DeviceEvent from a JSON string
device_event_instance = DeviceEvent.from_json(json)
# print the JSON string representation of the object
print(DeviceEvent.to_json())

# convert the object into a dict
device_event_dict = device_event_instance.to_dict()
# create an instance of DeviceEvent from a dict
device_event_from_dict = DeviceEvent.from_dict(device_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


