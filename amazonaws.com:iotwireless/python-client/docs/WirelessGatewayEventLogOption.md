# WirelessGatewayEventLogOption

<p>The log options for a wireless gateway event and can be used to set log levels for a specific wireless gateway event.</p> <p>For a LoRaWAN gateway, possible events for a log message are <code>CUPS_Request</code> and <code>Certificate</code>.</p>

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | [**WirelessGatewayEvent**](WirelessGatewayEvent.md) |  | 
**log_level** | [**LogLevel**](LogLevel.md) |  | 

## Example

```python
from openapi_client.models.wireless_gateway_event_log_option import WirelessGatewayEventLogOption

# TODO update the JSON string below
json = "{}"
# create an instance of WirelessGatewayEventLogOption from a JSON string
wireless_gateway_event_log_option_instance = WirelessGatewayEventLogOption.from_json(json)
# print the JSON string representation of the object
print(WirelessGatewayEventLogOption.to_json())

# convert the object into a dict
wireless_gateway_event_log_option_dict = wireless_gateway_event_log_option_instance.to_dict()
# create an instance of WirelessGatewayEventLogOption from a dict
wireless_gateway_event_log_option_from_dict = WirelessGatewayEventLogOption.from_dict(wireless_gateway_event_log_option_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


