# UpdateWirelessGatewayTaskCreate

UpdateWirelessGatewayTaskCreate object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**update_data_source** | **str** |  | [optional] 
**update_data_role** | **str** |  | [optional] 
**lo_ra_wan** | [**CreateWirelessGatewayTaskDefinitionRequestUpdateLoRaWAN**](CreateWirelessGatewayTaskDefinitionRequestUpdateLoRaWAN.md) |  | [optional] 

## Example

```python
from openapi_client.models.update_wireless_gateway_task_create import UpdateWirelessGatewayTaskCreate

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateWirelessGatewayTaskCreate from a JSON string
update_wireless_gateway_task_create_instance = UpdateWirelessGatewayTaskCreate.from_json(json)
# print the JSON string representation of the object
print(UpdateWirelessGatewayTaskCreate.to_json())

# convert the object into a dict
update_wireless_gateway_task_create_dict = update_wireless_gateway_task_create_instance.to_dict()
# create an instance of UpdateWirelessGatewayTaskCreate from a dict
update_wireless_gateway_task_create_from_dict = UpdateWirelessGatewayTaskCreate.from_dict(update_wireless_gateway_task_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


