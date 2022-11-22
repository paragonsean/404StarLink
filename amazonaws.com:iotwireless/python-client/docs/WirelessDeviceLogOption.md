# WirelessDeviceLogOption

The log options for wireless devices and can be used to set log levels for a specific type of wireless device.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**WirelessDeviceType**](WirelessDeviceType.md) |  | 
**log_level** | [**LogLevel**](LogLevel.md) |  | 
**events** | [**List[WirelessDeviceEventLogOption]**](WirelessDeviceEventLogOption.md) | The list of wireless device event log options. | [optional] 

## Example

```python
from openapi_client.models.wireless_device_log_option import WirelessDeviceLogOption

# TODO update the JSON string below
json = "{}"
# create an instance of WirelessDeviceLogOption from a JSON string
wireless_device_log_option_instance = WirelessDeviceLogOption.from_json(json)
# print the JSON string representation of the object
print(WirelessDeviceLogOption.to_json())

# convert the object into a dict
wireless_device_log_option_dict = wireless_device_log_option_instance.to_dict()
# create an instance of WirelessDeviceLogOption from a dict
wireless_device_log_option_from_dict = WirelessDeviceLogOption.from_dict(wireless_device_log_option_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


