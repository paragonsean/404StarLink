# GetWirelessGatewayStatisticsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wireless_gateway_id** | **str** |  | [optional] 
**last_uplink_received_at** | **str** |  | [optional] 
**connection_status** | [**ConnectionStatus**](ConnectionStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_wireless_gateway_statistics_response import GetWirelessGatewayStatisticsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetWirelessGatewayStatisticsResponse from a JSON string
get_wireless_gateway_statistics_response_instance = GetWirelessGatewayStatisticsResponse.from_json(json)
# print the JSON string representation of the object
print(GetWirelessGatewayStatisticsResponse.to_json())

# convert the object into a dict
get_wireless_gateway_statistics_response_dict = get_wireless_gateway_statistics_response_instance.to_dict()
# create an instance of GetWirelessGatewayStatisticsResponse from a dict
get_wireless_gateway_statistics_response_from_dict = GetWirelessGatewayStatisticsResponse.from_dict(get_wireless_gateway_statistics_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


