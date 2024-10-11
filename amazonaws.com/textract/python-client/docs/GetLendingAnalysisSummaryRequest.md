# GetLendingAnalysisSummaryRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job_id** | **str** |  | 

## Example

```python
from openapi_client.models.get_lending_analysis_summary_request import GetLendingAnalysisSummaryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetLendingAnalysisSummaryRequest from a JSON string
get_lending_analysis_summary_request_instance = GetLendingAnalysisSummaryRequest.from_json(json)
# print the JSON string representation of the object
print(GetLendingAnalysisSummaryRequest.to_json())

# convert the object into a dict
get_lending_analysis_summary_request_dict = get_lending_analysis_summary_request_instance.to_dict()
# create an instance of GetLendingAnalysisSummaryRequest from a dict
get_lending_analysis_summary_request_from_dict = GetLendingAnalysisSummaryRequest.from_dict(get_lending_analysis_summary_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


