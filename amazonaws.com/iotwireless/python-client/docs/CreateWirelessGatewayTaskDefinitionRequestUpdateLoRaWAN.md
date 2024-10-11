# CreateWirelessGatewayTaskDefinitionRequestUpdateLoRaWAN


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**update_signature** | **str** |  | [optional] 
**sig_key_crc** | **int** |  | [optional] 
**current_version** | [**LoRaWANUpdateGatewayTaskCreateCurrentVersion**](LoRaWANUpdateGatewayTaskCreateCurrentVersion.md) |  | [optional] 
**update_version** | [**LoRaWANUpdateGatewayTaskCreateUpdateVersion**](LoRaWANUpdateGatewayTaskCreateUpdateVersion.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_wireless_gateway_task_definition_request_update_lo_ra_wan import CreateWirelessGatewayTaskDefinitionRequestUpdateLoRaWAN

# TODO update the JSON string below
json = "{}"
# create an instance of CreateWirelessGatewayTaskDefinitionRequestUpdateLoRaWAN from a JSON string
create_wireless_gateway_task_definition_request_update_lo_ra_wan_instance = CreateWirelessGatewayTaskDefinitionRequestUpdateLoRaWAN.from_json(json)
# print the JSON string representation of the object
print(CreateWirelessGatewayTaskDefinitionRequestUpdateLoRaWAN.to_json())

# convert the object into a dict
create_wireless_gateway_task_definition_request_update_lo_ra_wan_dict = create_wireless_gateway_task_definition_request_update_lo_ra_wan_instance.to_dict()
# create an instance of CreateWirelessGatewayTaskDefinitionRequestUpdateLoRaWAN from a dict
create_wireless_gateway_task_definition_request_update_lo_ra_wan_from_dict = CreateWirelessGatewayTaskDefinitionRequestUpdateLoRaWAN.from_dict(create_wireless_gateway_task_definition_request_update_lo_ra_wan_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


