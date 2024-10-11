# DeviceEventDevice


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **object** |  | [optional] 
**device_id** | **str** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.device_event_device import DeviceEventDevice

# TODO update the JSON string below
json = "{}"
# create an instance of DeviceEventDevice from a JSON string
device_event_device_instance = DeviceEventDevice.from_json(json)
# print the JSON string representation of the object
print(DeviceEventDevice.to_json())

# convert the object into a dict
device_event_device_dict = device_event_device_instance.to_dict()
# create an instance of DeviceEventDevice from a dict
device_event_device_from_dict = DeviceEventDevice.from_dict(device_event_device_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


