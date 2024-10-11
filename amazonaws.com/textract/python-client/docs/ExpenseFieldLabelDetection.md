# ExpenseFieldLabelDetection


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **str** |  | [optional] 
**geometry** | [**Geometry**](Geometry.md) |  | [optional] 
**confidence** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.expense_field_label_detection import ExpenseFieldLabelDetection

# TODO update the JSON string below
json = "{}"
# create an instance of ExpenseFieldLabelDetection from a JSON string
expense_field_label_detection_instance = ExpenseFieldLabelDetection.from_json(json)
# print the JSON string representation of the object
print(ExpenseFieldLabelDetection.to_json())

# convert the object into a dict
expense_field_label_detection_dict = expense_field_label_detection_instance.to_dict()
# create an instance of ExpenseFieldLabelDetection from a dict
expense_field_label_detection_from_dict = ExpenseFieldLabelDetection.from_dict(expense_field_label_detection_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


