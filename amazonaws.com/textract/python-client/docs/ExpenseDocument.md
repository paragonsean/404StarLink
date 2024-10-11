# ExpenseDocument

The structure holding all the information returned by AnalyzeExpense

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expense_index** | **int** |  | [optional] 
**summary_fields** | **List** |  | [optional] 
**line_item_groups** | **List** |  | [optional] 
**blocks** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.expense_document import ExpenseDocument

# TODO update the JSON string below
json = "{}"
# create an instance of ExpenseDocument from a JSON string
expense_document_instance = ExpenseDocument.from_json(json)
# print the JSON string representation of the object
print(ExpenseDocument.to_json())

# convert the object into a dict
expense_document_dict = expense_document_instance.to_dict()
# create an instance of ExpenseDocument from a dict
expense_document_from_dict = ExpenseDocument.from_dict(expense_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


