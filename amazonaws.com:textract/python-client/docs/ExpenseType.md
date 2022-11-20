# ExpenseType

An object used to store information about the Type detected by Amazon Textract.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **str** |  | [optional] 
**confidence** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.expense_type import ExpenseType

# TODO update the JSON string below
json = "{}"
# create an instance of ExpenseType from a JSON string
expense_type_instance = ExpenseType.from_json(json)
# print the JSON string representation of the object
print(ExpenseType.to_json())

# convert the object into a dict
expense_type_dict = expense_type_instance.to_dict()
# create an instance of ExpenseType from a dict
expense_type_from_dict = ExpenseType.from_dict(expense_type_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


