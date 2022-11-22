# GetWirelessDeviceResponseSidewalk


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amazon_id** | **str** | The Sidewalk Amazon ID. | [optional] 
**sidewalk_id** | **str** |  | [optional] 
**sidewalk_manufacturing_sn** | **str** |  | [optional] 
**device_certificates** | **List** |  | [optional] 
**private_keys** | **List** |  | [optional] 
**device_profile_id** | **str** |  | [optional] 
**certificate_id** | **str** |  | [optional] 
**status** | [**WirelessDeviceSidewalkStatus**](WirelessDeviceSidewalkStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_wireless_device_response_sidewalk import GetWirelessDeviceResponseSidewalk

# TODO update the JSON string below
json = "{}"
# create an instance of GetWirelessDeviceResponseSidewalk from a JSON string
get_wireless_device_response_sidewalk_instance = GetWirelessDeviceResponseSidewalk.from_json(json)
# print the JSON string representation of the object
print(GetWirelessDeviceResponseSidewalk.to_json())

# convert the object into a dict
get_wireless_device_response_sidewalk_dict = get_wireless_device_response_sidewalk_instance.to_dict()
# create an instance of GetWirelessDeviceResponseSidewalk from a dict
get_wireless_device_response_sidewalk_from_dict = GetWirelessDeviceResponseSidewalk.from_dict(get_wireless_device_response_sidewalk_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


