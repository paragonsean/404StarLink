# LoRaWANDevice

LoRaWAN object for create functions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dev_eui** | **str** |  | [optional] 
**device_profile_id** | **str** |  | [optional] 
**service_profile_id** | **str** |  | [optional] 
**otaa_v1_1** | [**CreateWirelessDeviceRequestLoRaWANOtaaV11**](CreateWirelessDeviceRequestLoRaWANOtaaV11.md) |  | [optional] 
**otaa_v1_0_x** | [**CreateWirelessDeviceRequestLoRaWANOtaaV10X**](CreateWirelessDeviceRequestLoRaWANOtaaV10X.md) |  | [optional] 
**abp_v1_1** | [**CreateWirelessDeviceRequestLoRaWANAbpV11**](CreateWirelessDeviceRequestLoRaWANAbpV11.md) |  | [optional] 
**abp_v1_0_x** | [**CreateWirelessDeviceRequestLoRaWANAbpV10X**](CreateWirelessDeviceRequestLoRaWANAbpV10X.md) |  | [optional] 
**f_ports** | [**FPorts**](FPorts.md) |  | [optional] 

## Example

```python
from openapi_client.models.lo_ra_wan_device import LoRaWANDevice

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANDevice from a JSON string
lo_ra_wan_device_instance = LoRaWANDevice.from_json(json)
# print the JSON string representation of the object
print(LoRaWANDevice.to_json())

# convert the object into a dict
lo_ra_wan_device_dict = lo_ra_wan_device_instance.to_dict()
# create an instance of LoRaWANDevice from a dict
lo_ra_wan_device_from_dict = LoRaWANDevice.from_dict(lo_ra_wan_device_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


