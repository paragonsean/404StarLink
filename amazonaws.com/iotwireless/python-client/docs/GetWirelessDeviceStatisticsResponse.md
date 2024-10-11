# GetWirelessDeviceStatisticsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wireless_device_id** | **str** |  | [optional] 
**last_uplink_received_at** | **str** |  | [optional] 
**lo_ra_wan** | [**GetWirelessDeviceStatisticsResponseLoRaWAN**](GetWirelessDeviceStatisticsResponseLoRaWAN.md) |  | [optional] 
**sidewalk** | [**GetWirelessDeviceStatisticsResponseSidewalk**](GetWirelessDeviceStatisticsResponseSidewalk.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_wireless_device_statistics_response import GetWirelessDeviceStatisticsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetWirelessDeviceStatisticsResponse from a JSON string
get_wireless_device_statistics_response_instance = GetWirelessDeviceStatisticsResponse.from_json(json)
# print the JSON string representation of the object
print(GetWirelessDeviceStatisticsResponse.to_json())

# convert the object into a dict
get_wireless_device_statistics_response_dict = get_wireless_device_statistics_response_instance.to_dict()
# create an instance of GetWirelessDeviceStatisticsResponse from a dict
get_wireless_device_statistics_response_from_dict = GetWirelessDeviceStatisticsResponse.from_dict(get_wireless_device_statistics_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


