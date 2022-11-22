# CreateWirelessGatewayTaskRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wireless_gateway_task_definition_id** | **str** | The ID of the WirelessGatewayTaskDefinition. | 

## Example

```python
from openapi_client.models.create_wireless_gateway_task_request import CreateWirelessGatewayTaskRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateWirelessGatewayTaskRequest from a JSON string
create_wireless_gateway_task_request_instance = CreateWirelessGatewayTaskRequest.from_json(json)
# print the JSON string representation of the object
print(CreateWirelessGatewayTaskRequest.to_json())

# convert the object into a dict
create_wireless_gateway_task_request_dict = create_wireless_gateway_task_request_instance.to_dict()
# create an instance of CreateWirelessGatewayTaskRequest from a dict
create_wireless_gateway_task_request_from_dict = CreateWirelessGatewayTaskRequest.from_dict(create_wireless_gateway_task_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


