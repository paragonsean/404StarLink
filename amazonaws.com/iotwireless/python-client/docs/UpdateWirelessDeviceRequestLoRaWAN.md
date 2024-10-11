# UpdateWirelessDeviceRequestLoRaWAN


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
from openapi_client.models.update_wireless_device_request_lo_ra_wan import UpdateWirelessDeviceRequestLoRaWAN

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateWirelessDeviceRequestLoRaWAN from a JSON string
update_wireless_device_request_lo_ra_wan_instance = UpdateWirelessDeviceRequestLoRaWAN.from_json(json)
# print the JSON string representation of the object
print(UpdateWirelessDeviceRequestLoRaWAN.to_json())

# convert the object into a dict
update_wireless_device_request_lo_ra_wan_dict = update_wireless_device_request_lo_ra_wan_instance.to_dict()
# create an instance of UpdateWirelessDeviceRequestLoRaWAN from a dict
update_wireless_device_request_lo_ra_wan_from_dict = UpdateWirelessDeviceRequestLoRaWAN.from_dict(update_wireless_device_request_lo_ra_wan_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


