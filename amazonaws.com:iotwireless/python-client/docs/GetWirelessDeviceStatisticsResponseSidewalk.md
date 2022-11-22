# GetWirelessDeviceStatisticsResponseSidewalk


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rssi** | **int** |  | [optional] 
**battery_level** | [**BatteryLevel**](BatteryLevel.md) |  | [optional] 
**event** | [**Event**](Event.md) |  | [optional] 
**device_state** | [**DeviceState**](DeviceState.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_wireless_device_statistics_response_sidewalk import GetWirelessDeviceStatisticsResponseSidewalk

# TODO update the JSON string below
json = "{}"
# create an instance of GetWirelessDeviceStatisticsResponseSidewalk from a JSON string
get_wireless_device_statistics_response_sidewalk_instance = GetWirelessDeviceStatisticsResponseSidewalk.from_json(json)
# print the JSON string representation of the object
print(GetWirelessDeviceStatisticsResponseSidewalk.to_json())

# convert the object into a dict
get_wireless_device_statistics_response_sidewalk_dict = get_wireless_device_statistics_response_sidewalk_instance.to_dict()
# create an instance of GetWirelessDeviceStatisticsResponseSidewalk from a dict
get_wireless_device_statistics_response_sidewalk_from_dict = GetWirelessDeviceStatisticsResponseSidewalk.from_dict(get_wireless_device_statistics_response_sidewalk_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


