# GetWirelessDeviceStatisticsResponseLoRaWAN


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dev_eui** | **str** |  | [optional] 
**f_port** | **int** |  | [optional] 
**data_rate** | **int** |  | [optional] 
**frequency** | **int** |  | [optional] 
**timestamp** | **str** |  | [optional] 
**gateways** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.get_wireless_device_statistics_response_lo_ra_wan import GetWirelessDeviceStatisticsResponseLoRaWAN

# TODO update the JSON string below
json = "{}"
# create an instance of GetWirelessDeviceStatisticsResponseLoRaWAN from a JSON string
get_wireless_device_statistics_response_lo_ra_wan_instance = GetWirelessDeviceStatisticsResponseLoRaWAN.from_json(json)
# print the JSON string representation of the object
print(GetWirelessDeviceStatisticsResponseLoRaWAN.to_json())

# convert the object into a dict
get_wireless_device_statistics_response_lo_ra_wan_dict = get_wireless_device_statistics_response_lo_ra_wan_instance.to_dict()
# create an instance of GetWirelessDeviceStatisticsResponseLoRaWAN from a dict
get_wireless_device_statistics_response_lo_ra_wan_from_dict = GetWirelessDeviceStatisticsResponseLoRaWAN.from_dict(get_wireless_device_statistics_response_lo_ra_wan_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


