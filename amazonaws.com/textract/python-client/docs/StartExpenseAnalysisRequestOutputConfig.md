# StartExpenseAnalysisRequestOutputConfig


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**s3_bucket** | **str** |  | 
**s3_prefix** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.start_expense_analysis_request_output_config import StartExpenseAnalysisRequestOutputConfig

# TODO update the JSON string below
json = "{}"
# create an instance of StartExpenseAnalysisRequestOutputConfig from a JSON string
start_expense_analysis_request_output_config_instance = StartExpenseAnalysisRequestOutputConfig.from_json(json)
# print the JSON string representation of the object
print(StartExpenseAnalysisRequestOutputConfig.to_json())

# convert the object into a dict
start_expense_analysis_request_output_config_dict = start_expense_analysis_request_output_config_instance.to_dict()
# create an instance of StartExpenseAnalysisRequestOutputConfig from a dict
start_expense_analysis_request_output_config_from_dict = StartExpenseAnalysisRequestOutputConfig.from_dict(start_expense_analysis_request_output_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


