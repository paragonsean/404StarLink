# WirelessDeviceStatistics

Information about a wireless device's operation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**type** | [**WirelessDeviceType**](WirelessDeviceType.md) |  | [optional] 
**name** | **str** |  | [optional] 
**destination_name** | **str** |  | [optional] 
**last_uplink_received_at** | **str** |  | [optional] 
**lo_ra_wan** | [**WirelessDeviceStatisticsLoRaWAN**](WirelessDeviceStatisticsLoRaWAN.md) |  | [optional] 
**sidewalk** | [**WirelessDeviceStatisticsSidewalk**](WirelessDeviceStatisticsSidewalk.md) |  | [optional] 
**fuota_device_status** | [**FuotaDeviceStatus**](FuotaDeviceStatus.md) |  | [optional] 
**multicast_device_status** | **str** |  | [optional] 
**mc_group_id** | **int** | Id of the multicast group. | [optional] 

## Example

```python
from openapi_client.models.wireless_device_statistics import WirelessDeviceStatistics

# TODO update the JSON string below
json = "{}"
# create an instance of WirelessDeviceStatistics from a JSON string
wireless_device_statistics_instance = WirelessDeviceStatistics.from_json(json)
# print the JSON string representation of the object
print(WirelessDeviceStatistics.to_json())

# convert the object into a dict
wireless_device_statistics_dict = wireless_device_statistics_instance.to_dict()
# create an instance of WirelessDeviceStatistics from a dict
wireless_device_statistics_from_dict = WirelessDeviceStatistics.from_dict(wireless_device_statistics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


