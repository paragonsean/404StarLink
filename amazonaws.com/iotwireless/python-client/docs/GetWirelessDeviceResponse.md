# GetWirelessDeviceResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**WirelessDeviceType**](WirelessDeviceType.md) |  | [optional] 
**name** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**destination_name** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**arn** | **str** |  | [optional] 
**thing_name** | **str** |  | [optional] 
**thing_arn** | **str** |  | [optional] 
**lo_ra_wan** | [**GetWirelessDeviceResponseLoRaWAN**](GetWirelessDeviceResponseLoRaWAN.md) |  | [optional] 
**sidewalk** | [**GetWirelessDeviceResponseSidewalk**](GetWirelessDeviceResponseSidewalk.md) |  | [optional] 
**positioning** | [**PositioningConfigStatus**](PositioningConfigStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_wireless_device_response import GetWirelessDeviceResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetWirelessDeviceResponse from a JSON string
get_wireless_device_response_instance = GetWirelessDeviceResponse.from_json(json)
# print the JSON string representation of the object
print(GetWirelessDeviceResponse.to_json())

# convert the object into a dict
get_wireless_device_response_dict = get_wireless_device_response_instance.to_dict()
# create an instance of GetWirelessDeviceResponse from a dict
get_wireless_device_response_from_dict = GetWirelessDeviceResponse.from_dict(get_wireless_device_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


