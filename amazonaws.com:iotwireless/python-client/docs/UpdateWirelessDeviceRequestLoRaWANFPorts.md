# UpdateWirelessDeviceRequestLoRaWANFPorts


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**positioning** | [**UpdateFPortsPositioning**](UpdateFPortsPositioning.md) |  | [optional] 
**applications** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.update_wireless_device_request_lo_ra_wanf_ports import UpdateWirelessDeviceRequestLoRaWANFPorts

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateWirelessDeviceRequestLoRaWANFPorts from a JSON string
update_wireless_device_request_lo_ra_wanf_ports_instance = UpdateWirelessDeviceRequestLoRaWANFPorts.from_json(json)
# print the JSON string representation of the object
print(UpdateWirelessDeviceRequestLoRaWANFPorts.to_json())

# convert the object into a dict
update_wireless_device_request_lo_ra_wanf_ports_dict = update_wireless_device_request_lo_ra_wanf_ports_instance.to_dict()
# create an instance of UpdateWirelessDeviceRequestLoRaWANFPorts from a dict
update_wireless_device_request_lo_ra_wanf_ports_from_dict = UpdateWirelessDeviceRequestLoRaWANFPorts.from_dict(update_wireless_device_request_lo_ra_wanf_ports_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


