# AnalyzeDocumentRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document** | [**AnalyzeDocumentRequestDocument**](AnalyzeDocumentRequestDocument.md) |  | 
**feature_types** | **List** |  | 
**human_loop_config** | [**AnalyzeDocumentRequestHumanLoopConfig**](AnalyzeDocumentRequestHumanLoopConfig.md) |  | [optional] 
**queries_config** | [**AnalyzeDocumentRequestQueriesConfig**](AnalyzeDocumentRequestQueriesConfig.md) |  | [optional] 

## Example

```python
from openapi_client.models.analyze_document_request import AnalyzeDocumentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AnalyzeDocumentRequest from a JSON string
analyze_document_request_instance = AnalyzeDocumentRequest.from_json(json)
# print the JSON string representation of the object
print(AnalyzeDocumentRequest.to_json())

# convert the object into a dict
analyze_document_request_dict = analyze_document_request_instance.to_dict()
# create an instance of AnalyzeDocumentRequest from a dict
analyze_document_request_from_dict = AnalyzeDocumentRequest.from_dict(analyze_document_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


