# GetWirelessGatewayResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**lo_ra_wan** | [**GetWirelessGatewayResponseLoRaWAN**](GetWirelessGatewayResponseLoRaWAN.md) |  | [optional] 
**arn** | **str** |  | [optional] 
**thing_name** | **str** |  | [optional] 
**thing_arn** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.get_wireless_gateway_response import GetWirelessGatewayResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetWirelessGatewayResponse from a JSON string
get_wireless_gateway_response_instance = GetWirelessGatewayResponse.from_json(json)
# print the JSON string representation of the object
print(GetWirelessGatewayResponse.to_json())

# convert the object into a dict
get_wireless_gateway_response_dict = get_wireless_gateway_response_instance.to_dict()
# create an instance of GetWirelessGatewayResponse from a dict
get_wireless_gateway_response_from_dict = GetWirelessGatewayResponse.from_dict(get_wireless_gateway_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


