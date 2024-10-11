# Invoice


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **float** | Monetary amount | [optional] 
**base_amount** | **float** | Monetary amount | [optional] 
**base_currency** | **str** |  | [optional] [default to 'usd']
**billing** | [**BillingAddress**](BillingAddress.md) |  | [optional] 
**currency** | **str** |  | [optional] [default to 'usd']
**id** | **int** |  | [optional] 
**invoice_no** | **int** |  | [optional] 
**invoiced_at** | **datetime** | the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z | [optional] 
**links** | [**InvoiceLinks**](InvoiceLinks.md) |  | [optional] 
**status** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.invoice import Invoice

# TODO update the JSON string below
json = "{}"
# create an instance of Invoice from a JSON string
invoice_instance = Invoice.from_json(json)
# print the JSON string representation of the object
print(Invoice.to_json())

# convert the object into a dict
invoice_dict = invoice_instance.to_dict()
# create an instance of Invoice from a dict
invoice_from_dict = Invoice.from_dict(invoice_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


