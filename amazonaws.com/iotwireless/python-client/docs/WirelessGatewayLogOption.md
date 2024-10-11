# WirelessGatewayLogOption

The log options for wireless gateways and can be used to set log levels for a specific type of wireless gateway.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**WirelessGatewayType**](WirelessGatewayType.md) |  | 
**log_level** | [**LogLevel**](LogLevel.md) |  | 
**events** | [**List[WirelessGatewayEventLogOption]**](WirelessGatewayEventLogOption.md) | The list of wireless gateway event log options. | [optional] 

## Example

```python
from openapi_client.models.wireless_gateway_log_option import WirelessGatewayLogOption

# TODO update the JSON string below
json = "{}"
# create an instance of WirelessGatewayLogOption from a JSON string
wireless_gateway_log_option_instance = WirelessGatewayLogOption.from_json(json)
# print the JSON string representation of the object
print(WirelessGatewayLogOption.to_json())

# convert the object into a dict
wireless_gateway_log_option_dict = wireless_gateway_log_option_instance.to_dict()
# create an instance of WirelessGatewayLogOption from a dict
wireless_gateway_log_option_from_dict = WirelessGatewayLogOption.from_dict(wireless_gateway_log_option_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


