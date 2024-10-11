# UpdateWirelessGatewayTaskEntry

UpdateWirelessGatewayTaskEntry object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**lo_ra_wan** | [**UpdateWirelessGatewayTaskEntryLoRaWAN**](UpdateWirelessGatewayTaskEntryLoRaWAN.md) |  | [optional] 
**arn** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.update_wireless_gateway_task_entry import UpdateWirelessGatewayTaskEntry

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateWirelessGatewayTaskEntry from a JSON string
update_wireless_gateway_task_entry_instance = UpdateWirelessGatewayTaskEntry.from_json(json)
# print the JSON string representation of the object
print(UpdateWirelessGatewayTaskEntry.to_json())

# convert the object into a dict
update_wireless_gateway_task_entry_dict = update_wireless_gateway_task_entry_instance.to_dict()
# create an instance of UpdateWirelessGatewayTaskEntry from a dict
update_wireless_gateway_task_entry_from_dict = UpdateWirelessGatewayTaskEntry.from_dict(update_wireless_gateway_task_entry_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


