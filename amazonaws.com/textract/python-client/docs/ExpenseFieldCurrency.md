# ExpenseFieldCurrency


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** |  | [optional] 
**confidence** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.expense_field_currency import ExpenseFieldCurrency

# TODO update the JSON string below
json = "{}"
# create an instance of ExpenseFieldCurrency from a JSON string
expense_field_currency_instance = ExpenseFieldCurrency.from_json(json)
# print the JSON string representation of the object
print(ExpenseFieldCurrency.to_json())

# convert the object into a dict
expense_field_currency_dict = expense_field_currency_instance.to_dict()
# create an instance of ExpenseFieldCurrency from a dict
expense_field_currency_from_dict = ExpenseFieldCurrency.from_dict(expense_field_currency_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


