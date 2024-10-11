# ExpenseField

Breakdown of detected information, seperated into the catagories Type, LabelDetection, and ValueDetection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**ExpenseFieldType**](ExpenseFieldType.md) |  | [optional] 
**label_detection** | [**ExpenseFieldLabelDetection**](ExpenseFieldLabelDetection.md) |  | [optional] 
**value_detection** | [**ExpenseFieldValueDetection**](ExpenseFieldValueDetection.md) |  | [optional] 
**page_number** | **int** |  | [optional] 
**currency** | [**ExpenseFieldCurrency**](ExpenseFieldCurrency.md) |  | [optional] 
**group_properties** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.expense_field import ExpenseField

# TODO update the JSON string below
json = "{}"
# create an instance of ExpenseField from a JSON string
expense_field_instance = ExpenseField.from_json(json)
# print the JSON string representation of the object
print(ExpenseField.to_json())

# convert the object into a dict
expense_field_dict = expense_field_instance.to_dict()
# create an instance of ExpenseField from a dict
expense_field_from_dict = ExpenseField.from_dict(expense_field_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


