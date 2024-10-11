# UpdateDeviceStateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **bool** | If true, the device is enabled. If false, the device is  disabled. | [optional] 

## Example

```python
from openapi_client.models.update_device_state_request import UpdateDeviceStateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateDeviceStateRequest from a JSON string
update_device_state_request_instance = UpdateDeviceStateRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateDeviceStateRequest.to_json())

# convert the object into a dict
update_device_state_request_dict = update_device_state_request_instance.to_dict()
# create an instance of UpdateDeviceStateRequest from a dict
update_device_state_request_from_dict = UpdateDeviceStateRequest.from_dict(update_device_state_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


