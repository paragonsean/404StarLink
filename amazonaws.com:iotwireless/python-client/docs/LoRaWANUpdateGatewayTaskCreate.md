# LoRaWANUpdateGatewayTaskCreate

LoRaWANUpdateGatewayTaskCreate object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**update_signature** | **str** |  | [optional] 
**sig_key_crc** | **int** |  | [optional] 
**current_version** | [**LoRaWANUpdateGatewayTaskCreateCurrentVersion**](LoRaWANUpdateGatewayTaskCreateCurrentVersion.md) |  | [optional] 
**update_version** | [**LoRaWANUpdateGatewayTaskCreateUpdateVersion**](LoRaWANUpdateGatewayTaskCreateUpdateVersion.md) |  | [optional] 

## Example

```python
from openapi_client.models.lo_ra_wan_update_gateway_task_create import LoRaWANUpdateGatewayTaskCreate

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANUpdateGatewayTaskCreate from a JSON string
lo_ra_wan_update_gateway_task_create_instance = LoRaWANUpdateGatewayTaskCreate.from_json(json)
# print the JSON string representation of the object
print(LoRaWANUpdateGatewayTaskCreate.to_json())

# convert the object into a dict
lo_ra_wan_update_gateway_task_create_dict = lo_ra_wan_update_gateway_task_create_instance.to_dict()
# create an instance of LoRaWANUpdateGatewayTaskCreate from a dict
lo_ra_wan_update_gateway_task_create_from_dict = LoRaWANUpdateGatewayTaskCreate.from_dict(lo_ra_wan_update_gateway_task_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


