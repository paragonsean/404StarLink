# ContinuousProjectInvoices


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invoices** | [**List[Invoice]**](Invoice.md) |  | [optional] 

## Example

```python
from openapi_client.models.continuous_project_invoices import ContinuousProjectInvoices

# TODO update the JSON string below
json = "{}"
# create an instance of ContinuousProjectInvoices from a JSON string
continuous_project_invoices_instance = ContinuousProjectInvoices.from_json(json)
# print the JSON string representation of the object
print(ContinuousProjectInvoices.to_json())

# convert the object into a dict
continuous_project_invoices_dict = continuous_project_invoices_instance.to_dict()
# create an instance of ContinuousProjectInvoices from a dict
continuous_project_invoices_from_dict = ContinuousProjectInvoices.from_dict(continuous_project_invoices_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


