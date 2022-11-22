# UpdateWirelessGatewayRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The new name of the resource. | [optional] 
**description** | **str** | The description of the new resource. | [optional] 
**join_eui_filters** | **List[List[str]]** | A list of JoinEuiRange used by LoRa gateways to filter LoRa frames. | [optional] 
**net_id_filters** | **List[str]** | A list of NetId values that are used by LoRa gateways to filter the uplink frames. | [optional] 
**max_eirp** | **float** | The MaxEIRP value. | [optional] 

## Example

```python
from openapi_client.models.update_wireless_gateway_request import UpdateWirelessGatewayRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateWirelessGatewayRequest from a JSON string
update_wireless_gateway_request_instance = UpdateWirelessGatewayRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateWirelessGatewayRequest.to_json())

# convert the object into a dict
update_wireless_gateway_request_dict = update_wireless_gateway_request_instance.to_dict()
# create an instance of UpdateWirelessGatewayRequest from a dict
update_wireless_gateway_request_from_dict = UpdateWirelessGatewayRequest.from_dict(update_wireless_gateway_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


