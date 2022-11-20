# ExpenseCurrency

Returns the kind of currency detected.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** |  | [optional] 
**confidence** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.expense_currency import ExpenseCurrency

# TODO update the JSON string below
json = "{}"
# create an instance of ExpenseCurrency from a JSON string
expense_currency_instance = ExpenseCurrency.from_json(json)
# print the JSON string representation of the object
print(ExpenseCurrency.to_json())

# convert the object into a dict
expense_currency_dict = expense_currency_instance.to_dict()
# create an instance of ExpenseCurrency from a dict
expense_currency_from_dict = ExpenseCurrency.from_dict(expense_currency_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


