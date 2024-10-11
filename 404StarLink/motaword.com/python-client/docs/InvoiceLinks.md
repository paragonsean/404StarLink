# InvoiceLinks


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_self** | [**Href**](Href.md) |  | [optional] 
**corporate** | [**Href**](Href.md) |  | [optional] 
**html** | [**Href**](Href.md) |  | [optional] 
**var_json** | [**Href**](Href.md) |  | [optional] 
**pdf** | [**Href**](Href.md) |  | [optional] 
**project** | [**Href**](Href.md) |  | [optional] 
**view** | [**Href**](Href.md) |  | [optional] 

## Example

```python
from openapi_client.models.invoice_links import InvoiceLinks

# TODO update the JSON string below
json = "{}"
# create an instance of InvoiceLinks from a JSON string
invoice_links_instance = InvoiceLinks.from_json(json)
# print the JSON string representation of the object
print(InvoiceLinks.to_json())

# convert the object into a dict
invoice_links_dict = invoice_links_instance.to_dict()
# create an instance of InvoiceLinks from a dict
invoice_links_from_dict = InvoiceLinks.from_dict(invoice_links_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


