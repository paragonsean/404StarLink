# ListWirelessGatewaysResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_token** | **str** |  | [optional] 
**wireless_gateway_list** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.list_wireless_gateways_response import ListWirelessGatewaysResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListWirelessGatewaysResponse from a JSON string
list_wireless_gateways_response_instance = ListWirelessGatewaysResponse.from_json(json)
# print the JSON string representation of the object
print(ListWirelessGatewaysResponse.to_json())

# convert the object into a dict
list_wireless_gateways_response_dict = list_wireless_gateways_response_instance.to_dict()
# create an instance of ListWirelessGatewaysResponse from a dict
list_wireless_gateways_response_from_dict = ListWirelessGatewaysResponse.from_dict(list_wireless_gateways_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


