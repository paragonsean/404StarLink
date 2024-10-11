# AnalyzeExpenseResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_metadata** | [**DocumentMetadata**](DocumentMetadata.md) |  | [optional] 
**expense_documents** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.analyze_expense_response import AnalyzeExpenseResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AnalyzeExpenseResponse from a JSON string
analyze_expense_response_instance = AnalyzeExpenseResponse.from_json(json)
# print the JSON string representation of the object
print(AnalyzeExpenseResponse.to_json())

# convert the object into a dict
analyze_expense_response_dict = analyze_expense_response_instance.to_dict()
# create an instance of AnalyzeExpenseResponse from a dict
analyze_expense_response_from_dict = AnalyzeExpenseResponse.from_dict(analyze_expense_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


