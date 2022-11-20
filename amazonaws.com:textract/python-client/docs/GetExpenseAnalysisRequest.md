# GetExpenseAnalysisRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job_id** | **str** |  | 
**max_results** | **int** |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.get_expense_analysis_request import GetExpenseAnalysisRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetExpenseAnalysisRequest from a JSON string
get_expense_analysis_request_instance = GetExpenseAnalysisRequest.from_json(json)
# print the JSON string representation of the object
print(GetExpenseAnalysisRequest.to_json())

# convert the object into a dict
get_expense_analysis_request_dict = get_expense_analysis_request_instance.to_dict()
# create an instance of GetExpenseAnalysisRequest from a dict
get_expense_analysis_request_from_dict = GetExpenseAnalysisRequest.from_dict(get_expense_analysis_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


