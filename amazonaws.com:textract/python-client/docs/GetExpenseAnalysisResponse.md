# GetExpenseAnalysisResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_metadata** | [**GetExpenseAnalysisResponseDocumentMetadata**](GetExpenseAnalysisResponseDocumentMetadata.md) |  | [optional] 
**job_status** | [**JobStatus**](JobStatus.md) |  | [optional] 
**next_token** | **str** |  | [optional] 
**expense_documents** | **List** |  | [optional] 
**warnings** | **List** |  | [optional] 
**status_message** | **str** |  | [optional] 
**analyze_expense_model_version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.get_expense_analysis_response import GetExpenseAnalysisResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetExpenseAnalysisResponse from a JSON string
get_expense_analysis_response_instance = GetExpenseAnalysisResponse.from_json(json)
# print the JSON string representation of the object
print(GetExpenseAnalysisResponse.to_json())

# convert the object into a dict
get_expense_analysis_response_dict = get_expense_analysis_response_instance.to_dict()
# create an instance of GetExpenseAnalysisResponse from a dict
get_expense_analysis_response_from_dict = GetExpenseAnalysisResponse.from_dict(get_expense_analysis_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


