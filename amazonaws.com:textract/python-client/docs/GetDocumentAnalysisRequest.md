# GetDocumentAnalysisRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job_id** | **str** |  | 
**max_results** | **int** |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.get_document_analysis_request import GetDocumentAnalysisRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetDocumentAnalysisRequest from a JSON string
get_document_analysis_request_instance = GetDocumentAnalysisRequest.from_json(json)
# print the JSON string representation of the object
print(GetDocumentAnalysisRequest.to_json())

# convert the object into a dict
get_document_analysis_request_dict = get_document_analysis_request_instance.to_dict()
# create an instance of GetDocumentAnalysisRequest from a dict
get_document_analysis_request_from_dict = GetDocumentAnalysisRequest.from_dict(get_document_analysis_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


