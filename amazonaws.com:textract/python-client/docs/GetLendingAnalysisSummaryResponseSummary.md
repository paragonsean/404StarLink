# GetLendingAnalysisSummaryResponseSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_groups** | **List** |  | [optional] 
**undetected_document_types** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.get_lending_analysis_summary_response_summary import GetLendingAnalysisSummaryResponseSummary

# TODO update the JSON string below
json = "{}"
# create an instance of GetLendingAnalysisSummaryResponseSummary from a JSON string
get_lending_analysis_summary_response_summary_instance = GetLendingAnalysisSummaryResponseSummary.from_json(json)
# print the JSON string representation of the object
print(GetLendingAnalysisSummaryResponseSummary.to_json())

# convert the object into a dict
get_lending_analysis_summary_response_summary_dict = get_lending_analysis_summary_response_summary_instance.to_dict()
# create an instance of GetLendingAnalysisSummaryResponseSummary from a dict
get_lending_analysis_summary_response_summary_from_dict = GetLendingAnalysisSummaryResponseSummary.from_dict(get_lending_analysis_summary_response_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


