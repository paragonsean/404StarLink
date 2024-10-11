# UpdateWirelessGatewayTaskEntryLoRaWAN


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**current_version** | [**LoRaWANUpdateGatewayTaskCreateCurrentVersion**](LoRaWANUpdateGatewayTaskCreateCurrentVersion.md) |  | [optional] 
**update_version** | [**LoRaWANUpdateGatewayTaskCreateUpdateVersion**](LoRaWANUpdateGatewayTaskCreateUpdateVersion.md) |  | [optional] 

## Example

```python
from openapi_client.models.update_wireless_gateway_task_entry_lo_ra_wan import UpdateWirelessGatewayTaskEntryLoRaWAN

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateWirelessGatewayTaskEntryLoRaWAN from a JSON string
update_wireless_gateway_task_entry_lo_ra_wan_instance = UpdateWirelessGatewayTaskEntryLoRaWAN.from_json(json)
# print the JSON string representation of the object
print(UpdateWirelessGatewayTaskEntryLoRaWAN.to_json())

# convert the object into a dict
update_wireless_gateway_task_entry_lo_ra_wan_dict = update_wireless_gateway_task_entry_lo_ra_wan_instance.to_dict()
# create an instance of UpdateWirelessGatewayTaskEntryLoRaWAN from a dict
update_wireless_gateway_task_entry_lo_ra_wan_from_dict = UpdateWirelessGatewayTaskEntryLoRaWAN.from_dict(update_wireless_gateway_task_entry_lo_ra_wan_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


