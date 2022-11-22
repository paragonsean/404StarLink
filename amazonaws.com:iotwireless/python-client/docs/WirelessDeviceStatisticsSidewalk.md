# WirelessDeviceStatisticsSidewalk


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amazon_id** | **str** |  | [optional] 
**sidewalk_id** | **str** |  | [optional] 
**sidewalk_manufacturing_sn** | **str** |  | [optional] 
**device_certificates** | **List** |  | [optional] 
**device_profile_id** | **str** |  | [optional] 
**status** | [**WirelessDeviceSidewalkStatus**](WirelessDeviceSidewalkStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.wireless_device_statistics_sidewalk import WirelessDeviceStatisticsSidewalk

# TODO update the JSON string below
json = "{}"
# create an instance of WirelessDeviceStatisticsSidewalk from a JSON string
wireless_device_statistics_sidewalk_instance = WirelessDeviceStatisticsSidewalk.from_json(json)
# print the JSON string representation of the object
print(WirelessDeviceStatisticsSidewalk.to_json())

# convert the object into a dict
wireless_device_statistics_sidewalk_dict = wireless_device_statistics_sidewalk_instance.to_dict()
# create an instance of WirelessDeviceStatisticsSidewalk from a dict
wireless_device_statistics_sidewalk_from_dict = WirelessDeviceStatisticsSidewalk.from_dict(wireless_device_statistics_sidewalk_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


