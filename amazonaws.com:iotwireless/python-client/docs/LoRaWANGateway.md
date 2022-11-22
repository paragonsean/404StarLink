# LoRaWANGateway

LoRaWANGateway object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gateway_eui** | **str** |  | [optional] 
**rf_region** | **str** |  | [optional] 
**join_eui_filters** | **List[List[str]]** | A list of JoinEuiRange used by LoRa gateways to filter LoRa frames. | [optional] 
**net_id_filters** | **List[str]** | A list of NetId values that are used by LoRa gateways to filter the uplink frames. | [optional] 
**sub_bands** | **List[int]** | A list of integer indicating which sub bands are supported by LoRa gateway. | [optional] 
**beaconing** | [**CreateWirelessGatewayRequestLoRaWANBeaconing**](CreateWirelessGatewayRequestLoRaWANBeaconing.md) |  | [optional] 
**max_eirp** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.lo_ra_wan_gateway import LoRaWANGateway

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANGateway from a JSON string
lo_ra_wan_gateway_instance = LoRaWANGateway.from_json(json)
# print the JSON string representation of the object
print(LoRaWANGateway.to_json())

# convert the object into a dict
lo_ra_wan_gateway_dict = lo_ra_wan_gateway_instance.to_dict()
# create an instance of LoRaWANGateway from a dict
lo_ra_wan_gateway_from_dict = LoRaWANGateway.from_dict(lo_ra_wan_gateway_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


