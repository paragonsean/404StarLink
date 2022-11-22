# WirelessDeviceEventLogOption

<p>The log options for a wireless device event and can be used to set log levels for a specific wireless device event.</p> <p>For a LoRaWAN device, possible events for a log messsage are: <code>Join</code>, <code>Rejoin</code>, <code>Downlink_Data</code>, and <code>Uplink_Data</code>. For a Sidewalk device, possible events for a log message are <code>Registration</code>, <code>Downlink_Data</code>, and <code>Uplink_Data</code>.</p>

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | [**WirelessDeviceEvent**](WirelessDeviceEvent.md) |  | 
**log_level** | [**LogLevel**](LogLevel.md) |  | 

## Example

```python
from openapi_client.models.wireless_device_event_log_option import WirelessDeviceEventLogOption

# TODO update the JSON string below
json = "{}"
# create an instance of WirelessDeviceEventLogOption from a JSON string
wireless_device_event_log_option_instance = WirelessDeviceEventLogOption.from_json(json)
# print the JSON string representation of the object
print(WirelessDeviceEventLogOption.to_json())

# convert the object into a dict
wireless_device_event_log_option_dict = wireless_device_event_log_option_instance.to_dict()
# create an instance of WirelessDeviceEventLogOption from a dict
wireless_device_event_log_option_from_dict = WirelessDeviceEventLogOption.from_dict(wireless_device_event_log_option_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


