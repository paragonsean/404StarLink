# GetLendingAnalysisSummaryResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_metadata** | [**DocumentMetadata**](DocumentMetadata.md) |  | [optional] 
**job_status** | [**JobStatus**](JobStatus.md) |  | [optional] 
**summary** | [**GetLendingAnalysisSummaryResponseSummary**](GetLendingAnalysisSummaryResponseSummary.md) |  | [optional] 
**warnings** | **List** |  | [optional] 
**status_message** | **str** |  | [optional] 
**analyze_lending_model_version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.get_lending_analysis_summary_response import GetLendingAnalysisSummaryResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetLendingAnalysisSummaryResponse from a JSON string
get_lending_analysis_summary_response_instance = GetLendingAnalysisSummaryResponse.from_json(json)
# print the JSON string representation of the object
print(GetLendingAnalysisSummaryResponse.to_json())

# convert the object into a dict
get_lending_analysis_summary_response_dict = get_lending_analysis_summary_response_instance.to_dict()
# create an instance of GetLendingAnalysisSummaryResponse from a dict
get_lending_analysis_summary_response_from_dict = GetLendingAnalysisSummaryResponse.from_dict(get_lending_analysis_summary_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


