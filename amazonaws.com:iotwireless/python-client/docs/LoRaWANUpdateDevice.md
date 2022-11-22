# LoRaWANUpdateDevice

LoRaWAN object for update functions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**device_profile_id** | **str** |  | [optional] 
**service_profile_id** | **str** |  | [optional] 
**abp_v1_1** | [**UpdateWirelessDeviceRequestLoRaWANAbpV11**](UpdateWirelessDeviceRequestLoRaWANAbpV11.md) |  | [optional] 
**abp_v1_0_x** | [**UpdateWirelessDeviceRequestLoRaWANAbpV10X**](UpdateWirelessDeviceRequestLoRaWANAbpV10X.md) |  | [optional] 
**f_ports** | [**UpdateWirelessDeviceRequestLoRaWANFPorts**](UpdateWirelessDeviceRequestLoRaWANFPorts.md) |  | [optional] 

## Example

```python
from openapi_client.models.lo_ra_wan_update_device import LoRaWANUpdateDevice

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANUpdateDevice from a JSON string
lo_ra_wan_update_device_instance = LoRaWANUpdateDevice.from_json(json)
# print the JSON string representation of the object
print(LoRaWANUpdateDevice.to_json())

# convert the object into a dict
lo_ra_wan_update_device_dict = lo_ra_wan_update_device_instance.to_dict()
# create an instance of LoRaWANUpdateDevice from a dict
lo_ra_wan_update_device_from_dict = LoRaWANUpdateDevice.from_dict(lo_ra_wan_update_device_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


