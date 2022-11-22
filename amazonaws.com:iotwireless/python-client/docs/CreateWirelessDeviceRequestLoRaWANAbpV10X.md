# CreateWirelessDeviceRequestLoRaWANAbpV10X


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dev_addr** | **str** |  | [optional] 
**session_keys** | [**AbpV10XSessionKeys**](AbpV10XSessionKeys.md) |  | [optional] 
**f_cnt_start** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.create_wireless_device_request_lo_ra_wan_abp_v10_x import CreateWirelessDeviceRequestLoRaWANAbpV10X

# TODO update the JSON string below
json = "{}"
# create an instance of CreateWirelessDeviceRequestLoRaWANAbpV10X from a JSON string
create_wireless_device_request_lo_ra_wan_abp_v10_x_instance = CreateWirelessDeviceRequestLoRaWANAbpV10X.from_json(json)
# print the JSON string representation of the object
print(CreateWirelessDeviceRequestLoRaWANAbpV10X.to_json())

# convert the object into a dict
create_wireless_device_request_lo_ra_wan_abp_v10_x_dict = create_wireless_device_request_lo_ra_wan_abp_v10_x_instance.to_dict()
# create an instance of CreateWirelessDeviceRequestLoRaWANAbpV10X from a dict
create_wireless_device_request_lo_ra_wan_abp_v10_x_from_dict = CreateWirelessDeviceRequestLoRaWANAbpV10X.from_dict(create_wireless_device_request_lo_ra_wan_abp_v10_x_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


