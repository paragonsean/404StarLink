# GetWirelessGatewayTaskResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wireless_gateway_id** | **str** |  | [optional] 
**wireless_gateway_task_definition_id** | **str** |  | [optional] 
**last_uplink_received_at** | **str** |  | [optional] 
**task_created_at** | **str** |  | [optional] 
**status** | [**WirelessGatewayTaskStatus**](WirelessGatewayTaskStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_wireless_gateway_task_response import GetWirelessGatewayTaskResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetWirelessGatewayTaskResponse from a JSON string
get_wireless_gateway_task_response_instance = GetWirelessGatewayTaskResponse.from_json(json)
# print the JSON string representation of the object
print(GetWirelessGatewayTaskResponse.to_json())

# convert the object into a dict
get_wireless_gateway_task_response_dict = get_wireless_gateway_task_response_instance.to_dict()
# create an instance of GetWirelessGatewayTaskResponse from a dict
get_wireless_gateway_task_response_from_dict = GetWirelessGatewayTaskResponse.from_dict(get_wireless_gateway_task_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


