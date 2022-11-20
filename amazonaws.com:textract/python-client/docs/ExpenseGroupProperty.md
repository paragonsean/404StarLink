# ExpenseGroupProperty

Shows the group that a certain key belongs to. This helps differentiate between names and addresses for different organizations, that can be hard to determine via JSON response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**types** | **List** |  | [optional] 
**id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.expense_group_property import ExpenseGroupProperty

# TODO update the JSON string below
json = "{}"
# create an instance of ExpenseGroupProperty from a JSON string
expense_group_property_instance = ExpenseGroupProperty.from_json(json)
# print the JSON string representation of the object
print(ExpenseGroupProperty.to_json())

# convert the object into a dict
expense_group_property_dict = expense_group_property_instance.to_dict()
# create an instance of ExpenseGroupProperty from a dict
expense_group_property_from_dict = ExpenseGroupProperty.from_dict(expense_group_property_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


