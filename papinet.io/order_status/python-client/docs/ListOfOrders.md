# ListOfOrders


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**PaginationLinks**](PaginationLinks.md) |  | [optional] 
**orders** | [**List[OrderHeader]**](OrderHeader.md) |  | [optional] 

## Example

```python
from openapi_client.models.list_of_orders import ListOfOrders

# TODO update the JSON string below
json = "{}"
# create an instance of ListOfOrders from a JSON string
list_of_orders_instance = ListOfOrders.from_json(json)
# print the JSON string representation of the object
print(ListOfOrders.to_json())

# convert the object into a dict
list_of_orders_dict = list_of_orders_instance.to_dict()
# create an instance of ListOfOrders from a dict
list_of_orders_from_dict = ListOfOrders.from_dict(list_of_orders_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


