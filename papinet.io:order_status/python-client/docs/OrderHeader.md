# OrderHeader


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**number_of_line_items** | **int** |  | 
**order_number** | **str** |  | 
**order_status** | **str** |  | 

## Example

```python
from openapi_client.models.order_header import OrderHeader

# TODO update the JSON string below
json = "{}"
# create an instance of OrderHeader from a JSON string
order_header_instance = OrderHeader.from_json(json)
# print the JSON string representation of the object
print(OrderHeader.to_json())

# convert the object into a dict
order_header_dict = order_header_instance.to_dict()
# create an instance of OrderHeader from a dict
order_header_from_dict = OrderHeader.from_dict(order_header_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


