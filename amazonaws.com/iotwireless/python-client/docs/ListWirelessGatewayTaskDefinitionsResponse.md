# ListWirelessGatewayTaskDefinitionsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_token** | **str** |  | [optional] 
**task_definitions** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.list_wireless_gateway_task_definitions_response import ListWirelessGatewayTaskDefinitionsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListWirelessGatewayTaskDefinitionsResponse from a JSON string
list_wireless_gateway_task_definitions_response_instance = ListWirelessGatewayTaskDefinitionsResponse.from_json(json)
# print the JSON string representation of the object
print(ListWirelessGatewayTaskDefinitionsResponse.to_json())

# convert the object into a dict
list_wireless_gateway_task_definitions_response_dict = list_wireless_gateway_task_definitions_response_instance.to_dict()
# create an instance of ListWirelessGatewayTaskDefinitionsResponse from a dict
list_wireless_gateway_task_definitions_response_from_dict = ListWirelessGatewayTaskDefinitionsResponse.from_dict(list_wireless_gateway_task_definitions_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


