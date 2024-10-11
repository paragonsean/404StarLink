# CreateWirelessGatewayTaskDefinitionRequestUpdate

UpdateWirelessGatewayTaskCreate object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**update_data_source** | **str** |  | [optional] 
**update_data_role** | **str** |  | [optional] 
**lo_ra_wan** | [**CreateWirelessGatewayTaskDefinitionRequestUpdateLoRaWAN**](CreateWirelessGatewayTaskDefinitionRequestUpdateLoRaWAN.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_wireless_gateway_task_definition_request_update import CreateWirelessGatewayTaskDefinitionRequestUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of CreateWirelessGatewayTaskDefinitionRequestUpdate from a JSON string
create_wireless_gateway_task_definition_request_update_instance = CreateWirelessGatewayTaskDefinitionRequestUpdate.from_json(json)
# print the JSON string representation of the object
print(CreateWirelessGatewayTaskDefinitionRequestUpdate.to_json())

# convert the object into a dict
create_wireless_gateway_task_definition_request_update_dict = create_wireless_gateway_task_definition_request_update_instance.to_dict()
# create an instance of CreateWirelessGatewayTaskDefinitionRequestUpdate from a dict
create_wireless_gateway_task_definition_request_update_from_dict = CreateWirelessGatewayTaskDefinitionRequestUpdate.from_dict(create_wireless_gateway_task_definition_request_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


