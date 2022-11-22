# LoRaWANSendDataToDeviceParticipatingGateways


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**downlink_mode** | [**DownlinkMode**](DownlinkMode.md) |  | 
**gateway_list** | **List** |  | 
**transmission_interval** | **int** |  | 

## Example

```python
from openapi_client.models.lo_ra_wan_send_data_to_device_participating_gateways import LoRaWANSendDataToDeviceParticipatingGateways

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANSendDataToDeviceParticipatingGateways from a JSON string
lo_ra_wan_send_data_to_device_participating_gateways_instance = LoRaWANSendDataToDeviceParticipatingGateways.from_json(json)
# print the JSON string representation of the object
print(LoRaWANSendDataToDeviceParticipatingGateways.to_json())

# convert the object into a dict
lo_ra_wan_send_data_to_device_participating_gateways_dict = lo_ra_wan_send_data_to_device_participating_gateways_instance.to_dict()
# create an instance of LoRaWANSendDataToDeviceParticipatingGateways from a dict
lo_ra_wan_send_data_to_device_participating_gateways_from_dict = LoRaWANSendDataToDeviceParticipatingGateways.from_dict(lo_ra_wan_send_data_to_device_participating_gateways_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


