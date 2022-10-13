# OrderLineItemQuantitiesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity_context** | **str** |  | [optional] 
**quantity_type** | **str** |  | [optional] 
**quantity_uom** | **str** |  | [optional] 
**quantity_value** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.order_line_item_quantities_inner import OrderLineItemQuantitiesInner

# TODO update the JSON string below
json = "{}"
# create an instance of OrderLineItemQuantitiesInner from a JSON string
order_line_item_quantities_inner_instance = OrderLineItemQuantitiesInner.from_json(json)
# print the JSON string representation of the object
print(OrderLineItemQuantitiesInner.to_json())

# convert the object into a dict
order_line_item_quantities_inner_dict = order_line_item_quantities_inner_instance.to_dict()
# create an instance of OrderLineItemQuantitiesInner from a dict
order_line_item_quantities_inner_from_dict = OrderLineItemQuantitiesInner.from_dict(order_line_item_quantities_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


