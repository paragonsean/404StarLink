# ExpenseDetection

An object used to store information about the Value or Label detected by Amazon Textract.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **str** |  | [optional] 
**geometry** | [**Geometry**](Geometry.md) |  | [optional] 
**confidence** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.expense_detection import ExpenseDetection

# TODO update the JSON string below
json = "{}"
# create an instance of ExpenseDetection from a JSON string
expense_detection_instance = ExpenseDetection.from_json(json)
# print the JSON string representation of the object
print(ExpenseDetection.to_json())

# convert the object into a dict
expense_detection_dict = expense_detection_instance.to_dict()
# create an instance of ExpenseDetection from a dict
expense_detection_from_dict = ExpenseDetection.from_dict(expense_detection_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


