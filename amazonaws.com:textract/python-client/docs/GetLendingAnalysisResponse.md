# GetLendingAnalysisResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_metadata** | [**DocumentMetadata**](DocumentMetadata.md) |  | [optional] 
**job_status** | [**JobStatus**](JobStatus.md) |  | [optional] 
**next_token** | **str** |  | [optional] 
**results** | **List** |  | [optional] 
**warnings** | **List** |  | [optional] 
**status_message** | **str** |  | [optional] 
**analyze_lending_model_version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.get_lending_analysis_response import GetLendingAnalysisResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetLendingAnalysisResponse from a JSON string
get_lending_analysis_response_instance = GetLendingAnalysisResponse.from_json(json)
# print the JSON string representation of the object
print(GetLendingAnalysisResponse.to_json())

# convert the object into a dict
get_lending_analysis_response_dict = get_lending_analysis_response_instance.to_dict()
# create an instance of GetLendingAnalysisResponse from a dict
get_lending_analysis_response_from_dict = GetLendingAnalysisResponse.from_dict(get_lending_analysis_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


