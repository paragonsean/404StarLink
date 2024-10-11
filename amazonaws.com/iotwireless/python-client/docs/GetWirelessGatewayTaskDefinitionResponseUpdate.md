# GetWirelessGatewayTaskDefinitionResponseUpdate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**update_data_source** | **str** |  | [optional] 
**update_data_role** | **str** |  | [optional] 
**lo_ra_wan** | [**CreateWirelessGatewayTaskDefinitionRequestUpdateLoRaWAN**](CreateWirelessGatewayTaskDefinitionRequestUpdateLoRaWAN.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_wireless_gateway_task_definition_response_update import GetWirelessGatewayTaskDefinitionResponseUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of GetWirelessGatewayTaskDefinitionResponseUpdate from a JSON string
get_wireless_gateway_task_definition_response_update_instance = GetWirelessGatewayTaskDefinitionResponseUpdate.from_json(json)
# print the JSON string representation of the object
print(GetWirelessGatewayTaskDefinitionResponseUpdate.to_json())

# convert the object into a dict
get_wireless_gateway_task_definition_response_update_dict = get_wireless_gateway_task_definition_response_update_instance.to_dict()
# create an instance of GetWirelessGatewayTaskDefinitionResponseUpdate from a dict
get_wireless_gateway_task_definition_response_update_from_dict = GetWirelessGatewayTaskDefinitionResponseUpdate.from_dict(get_wireless_gateway_task_definition_response_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


