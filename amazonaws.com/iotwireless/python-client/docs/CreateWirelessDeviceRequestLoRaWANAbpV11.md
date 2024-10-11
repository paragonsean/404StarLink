# CreateWirelessDeviceRequestLoRaWANAbpV11


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dev_addr** | **str** |  | [optional] 
**session_keys** | [**AbpV11SessionKeys**](AbpV11SessionKeys.md) |  | [optional] 
**f_cnt_start** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.create_wireless_device_request_lo_ra_wan_abp_v11 import CreateWirelessDeviceRequestLoRaWANAbpV11

# TODO update the JSON string below
json = "{}"
# create an instance of CreateWirelessDeviceRequestLoRaWANAbpV11 from a JSON string
create_wireless_device_request_lo_ra_wan_abp_v11_instance = CreateWirelessDeviceRequestLoRaWANAbpV11.from_json(json)
# print the JSON string representation of the object
print(CreateWirelessDeviceRequestLoRaWANAbpV11.to_json())

# convert the object into a dict
create_wireless_device_request_lo_ra_wan_abp_v11_dict = create_wireless_device_request_lo_ra_wan_abp_v11_instance.to_dict()
# create an instance of CreateWirelessDeviceRequestLoRaWANAbpV11 from a dict
create_wireless_device_request_lo_ra_wan_abp_v11_from_dict = CreateWirelessDeviceRequestLoRaWANAbpV11.from_dict(create_wireless_device_request_lo_ra_wan_abp_v11_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


