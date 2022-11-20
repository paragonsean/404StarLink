# ExpenseFieldType


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **str** |  | [optional] 
**confidence** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.expense_field_type import ExpenseFieldType

# TODO update the JSON string below
json = "{}"
# create an instance of ExpenseFieldType from a JSON string
expense_field_type_instance = ExpenseFieldType.from_json(json)
# print the JSON string representation of the object
print(ExpenseFieldType.to_json())

# convert the object into a dict
expense_field_type_dict = expense_field_type_instance.to_dict()
# create an instance of ExpenseFieldType from a dict
expense_field_type_from_dict = ExpenseFieldType.from_dict(expense_field_type_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


