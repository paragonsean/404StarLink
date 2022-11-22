# GetWirelessDeviceResponseLoRaWAN


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
from openapi_client.models.get_wireless_device_response_lo_ra_wan import GetWirelessDeviceResponseLoRaWAN

# TODO update the JSON string below
json = "{}"
# create an instance of GetWirelessDeviceResponseLoRaWAN from a JSON string
get_wireless_device_response_lo_ra_wan_instance = GetWirelessDeviceResponseLoRaWAN.from_json(json)
# print the JSON string representation of the object
print(GetWirelessDeviceResponseLoRaWAN.to_json())

# convert the object into a dict
get_wireless_device_response_lo_ra_wan_dict = get_wireless_device_response_lo_ra_wan_instance.to_dict()
# create an instance of GetWirelessDeviceResponseLoRaWAN from a dict
get_wireless_device_response_lo_ra_wan_from_dict = GetWirelessDeviceResponseLoRaWAN.from_dict(get_wireless_device_response_lo_ra_wan_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


