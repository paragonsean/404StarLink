# CreateWirelessGatewayTaskDefinitionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_create_tasks** | **bool** | Whether to automatically create tasks using this task definition for all gateways with the specified current version. If &lt;code&gt;false&lt;/code&gt;, the task must me created by calling &lt;code&gt;CreateWirelessGatewayTask&lt;/code&gt;. | 
**name** | **str** | The name of the new resource. | [optional] 
**update** | [**CreateWirelessGatewayTaskDefinitionRequestUpdate**](CreateWirelessGatewayTaskDefinitionRequestUpdate.md) |  | [optional] 
**client_request_token** | **str** | Each resource must have a unique client request token. If you try to create a new resource with the same token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate a unique client request. | [optional] 
**tags** | [**List[Tag]**](Tag.md) | The tag to attach to the specified resource. Tags are metadata that you can use to manage a resource. | [optional] 

## Example

```python
from openapi_client.models.create_wireless_gateway_task_definition_request import CreateWirelessGatewayTaskDefinitionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateWirelessGatewayTaskDefinitionRequest from a JSON string
create_wireless_gateway_task_definition_request_instance = CreateWirelessGatewayTaskDefinitionRequest.from_json(json)
# print the JSON string representation of the object
print(CreateWirelessGatewayTaskDefinitionRequest.to_json())

# convert the object into a dict
create_wireless_gateway_task_definition_request_dict = create_wireless_gateway_task_definition_request_instance.to_dict()
# create an instance of CreateWirelessGatewayTaskDefinitionRequest from a dict
create_wireless_gateway_task_definition_request_from_dict = CreateWirelessGatewayTaskDefinitionRequest.from_dict(create_wireless_gateway_task_definition_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


