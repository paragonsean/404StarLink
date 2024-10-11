# AnalyzeExpenseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document** | [**Document**](Document.md) |  | 

## Example

```python
from openapi_client.models.analyze_expense_request import AnalyzeExpenseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AnalyzeExpenseRequest from a JSON string
analyze_expense_request_instance = AnalyzeExpenseRequest.from_json(json)
# print the JSON string representation of the object
print(AnalyzeExpenseRequest.to_json())

# convert the object into a dict
analyze_expense_request_dict = analyze_expense_request_instance.to_dict()
# create an instance of AnalyzeExpenseRequest from a dict
analyze_expense_request_from_dict = AnalyzeExpenseRequest.from_dict(analyze_expense_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


