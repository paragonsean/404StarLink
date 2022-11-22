# LoRaWANSendDataToDevice

LoRaWAN router info.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**f_port** | **int** | The Fport value. | [optional] 
**participating_gateways** | [**LoRaWANSendDataToDeviceParticipatingGateways**](LoRaWANSendDataToDeviceParticipatingGateways.md) |  | [optional] 

## Example

```python
from openapi_client.models.lo_ra_wan_send_data_to_device import LoRaWANSendDataToDevice

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANSendDataToDevice from a JSON string
lo_ra_wan_send_data_to_device_instance = LoRaWANSendDataToDevice.from_json(json)
# print the JSON string representation of the object
print(LoRaWANSendDataToDevice.to_json())

# convert the object into a dict
lo_ra_wan_send_data_to_device_dict = lo_ra_wan_send_data_to_device_instance.to_dict()
# create an instance of LoRaWANSendDataToDevice from a dict
lo_ra_wan_send_data_to_device_from_dict = LoRaWANSendDataToDevice.from_dict(lo_ra_wan_send_data_to_device_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


