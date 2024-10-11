# UpdateWirelessDeviceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination_name** | **str** | The name of the new destination for the device. | [optional] 
**name** | **str** | The new name of the resource. | [optional] 
**description** | **str** | The description of the new resource. | [optional] 
**lo_ra_wan** | [**UpdateWirelessDeviceRequestLoRaWAN**](UpdateWirelessDeviceRequestLoRaWAN.md) |  | [optional] 
**positioning** | **str** | FPort values for the GNSS, stream, and ClockSync functions of the positioning information. | [optional] 

## Example

```python
from openapi_client.models.update_wireless_device_request import UpdateWirelessDeviceRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateWirelessDeviceRequest from a JSON string
update_wireless_device_request_instance = UpdateWirelessDeviceRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateWirelessDeviceRequest.to_json())

# convert the object into a dict
update_wireless_device_request_dict = update_wireless_device_request_instance.to_dict()
# create an instance of UpdateWirelessDeviceRequest from a dict
update_wireless_device_request_from_dict = UpdateWirelessDeviceRequest.from_dict(update_wireless_device_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


