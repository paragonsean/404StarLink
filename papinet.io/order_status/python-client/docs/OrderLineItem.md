# OrderLineItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changeable** | **bool** |  | [optional] 
**id** | **str** |  | 
**order_line_item_number** | **float** |  | 
**order_line_item_status** | **str** |  | 
**quantities** | [**List[OrderLineItemQuantitiesInner]**](OrderLineItemQuantitiesInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.order_line_item import OrderLineItem

# TODO update the JSON string below
json = "{}"
# create an instance of OrderLineItem from a JSON string
order_line_item_instance = OrderLineItem.from_json(json)
# print the JSON string representation of the object
print(OrderLineItem.to_json())

# convert the object into a dict
order_line_item_dict = order_line_item_instance.to_dict()
# create an instance of OrderLineItem from a dict
order_line_item_from_dict = OrderLineItem.from_dict(order_line_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


