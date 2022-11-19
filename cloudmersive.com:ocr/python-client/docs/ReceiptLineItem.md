# ReceiptLineItem

Receipt line item, comprised of a product or item and a price (if available)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_description** | **str** | Description of the item | [optional] 
**item_price** | **float** | Price of the item if available | [optional] 

## Example

```python
from openapi_client.models.receipt_line_item import ReceiptLineItem

# TODO update the JSON string below
json = "{}"
# create an instance of ReceiptLineItem from a JSON string
receipt_line_item_instance = ReceiptLineItem.from_json(json)
# print the JSON string representation of the object
print(ReceiptLineItem.to_json())

# convert the object into a dict
receipt_line_item_dict = receipt_line_item_instance.to_dict()
# create an instance of ReceiptLineItem from a dict
receipt_line_item_from_dict = ReceiptLineItem.from_dict(receipt_line_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


