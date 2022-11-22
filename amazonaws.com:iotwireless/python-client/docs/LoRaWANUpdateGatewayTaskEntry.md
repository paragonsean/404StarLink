# LoRaWANUpdateGatewayTaskEntry

LoRaWANUpdateGatewayTaskEntry object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**current_version** | [**LoRaWANUpdateGatewayTaskCreateCurrentVersion**](LoRaWANUpdateGatewayTaskCreateCurrentVersion.md) |  | [optional] 
**update_version** | [**LoRaWANUpdateGatewayTaskCreateUpdateVersion**](LoRaWANUpdateGatewayTaskCreateUpdateVersion.md) |  | [optional] 

## Example

```python
from openapi_client.models.lo_ra_wan_update_gateway_task_entry import LoRaWANUpdateGatewayTaskEntry

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANUpdateGatewayTaskEntry from a JSON string
lo_ra_wan_update_gateway_task_entry_instance = LoRaWANUpdateGatewayTaskEntry.from_json(json)
# print the JSON string representation of the object
print(LoRaWANUpdateGatewayTaskEntry.to_json())

# convert the object into a dict
lo_ra_wan_update_gateway_task_entry_dict = lo_ra_wan_update_gateway_task_entry_instance.to_dict()
# create an instance of LoRaWANUpdateGatewayTaskEntry from a dict
lo_ra_wan_update_gateway_task_entry_from_dict = LoRaWANUpdateGatewayTaskEntry.from_dict(lo_ra_wan_update_gateway_task_entry_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


