# GatewayListItem

Gateway list item object that specifies the frequency and list of gateways for which the downlink message should be sent.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gateway_id** | **str** |  | 
**downlink_frequency** | **int** |  | 

## Example

```python
from openapi_client.models.gateway_list_item import GatewayListItem

# TODO update the JSON string below
json = "{}"
# create an instance of GatewayListItem from a JSON string
gateway_list_item_instance = GatewayListItem.from_json(json)
# print the JSON string representation of the object
print(GatewayListItem.to_json())

# convert the object into a dict
gateway_list_item_dict = gateway_list_item_instance.to_dict()
# create an instance of GatewayListItem from a dict
gateway_list_item_from_dict = GatewayListItem.from_dict(gateway_list_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


