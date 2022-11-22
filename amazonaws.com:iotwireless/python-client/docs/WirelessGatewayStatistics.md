# WirelessGatewayStatistics

Information about a wireless gateway's operation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**lo_ra_wan** | [**WirelessGatewayStatisticsLoRaWAN**](WirelessGatewayStatisticsLoRaWAN.md) |  | [optional] 
**last_uplink_received_at** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.wireless_gateway_statistics import WirelessGatewayStatistics

# TODO update the JSON string below
json = "{}"
# create an instance of WirelessGatewayStatistics from a JSON string
wireless_gateway_statistics_instance = WirelessGatewayStatistics.from_json(json)
# print the JSON string representation of the object
print(WirelessGatewayStatistics.to_json())

# convert the object into a dict
wireless_gateway_statistics_dict = wireless_gateway_statistics_instance.to_dict()
# create an instance of WirelessGatewayStatistics from a dict
wireless_gateway_statistics_from_dict = WirelessGatewayStatistics.from_dict(wireless_gateway_statistics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


