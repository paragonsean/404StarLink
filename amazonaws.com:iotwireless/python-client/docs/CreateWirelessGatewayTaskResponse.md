# CreateWirelessGatewayTaskResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wireless_gateway_task_definition_id** | **str** |  | [optional] 
**status** | [**WirelessGatewayTaskStatus**](WirelessGatewayTaskStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_wireless_gateway_task_response import CreateWirelessGatewayTaskResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateWirelessGatewayTaskResponse from a JSON string
create_wireless_gateway_task_response_instance = CreateWirelessGatewayTaskResponse.from_json(json)
# print the JSON string representation of the object
print(CreateWirelessGatewayTaskResponse.to_json())

# convert the object into a dict
create_wireless_gateway_task_response_dict = create_wireless_gateway_task_response_instance.to_dict()
# create an instance of CreateWirelessGatewayTaskResponse from a dict
create_wireless_gateway_task_response_from_dict = CreateWirelessGatewayTaskResponse.from_dict(create_wireless_gateway_task_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


