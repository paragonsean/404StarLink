# GetWirelessGatewayTaskDefinitionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_create_tasks** | **bool** |  | [optional] 
**name** | **str** |  | [optional] 
**update** | [**GetWirelessGatewayTaskDefinitionResponseUpdate**](GetWirelessGatewayTaskDefinitionResponseUpdate.md) |  | [optional] 
**arn** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.get_wireless_gateway_task_definition_response import GetWirelessGatewayTaskDefinitionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetWirelessGatewayTaskDefinitionResponse from a JSON string
get_wireless_gateway_task_definition_response_instance = GetWirelessGatewayTaskDefinitionResponse.from_json(json)
# print the JSON string representation of the object
print(GetWirelessGatewayTaskDefinitionResponse.to_json())

# convert the object into a dict
get_wireless_gateway_task_definition_response_dict = get_wireless_gateway_task_definition_response_instance.to_dict()
# create an instance of GetWirelessGatewayTaskDefinitionResponse from a dict
get_wireless_gateway_task_definition_response_from_dict = GetWirelessGatewayTaskDefinitionResponse.from_dict(get_wireless_gateway_task_definition_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


