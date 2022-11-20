# AnalyzeDocumentResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_metadata** | [**AnalyzeDocumentResponseDocumentMetadata**](AnalyzeDocumentResponseDocumentMetadata.md) |  | [optional] 
**blocks** | **List** |  | [optional] 
**human_loop_activation_output** | [**AnalyzeDocumentResponseHumanLoopActivationOutput**](AnalyzeDocumentResponseHumanLoopActivationOutput.md) |  | [optional] 
**analyze_document_model_version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.analyze_document_response import AnalyzeDocumentResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AnalyzeDocumentResponse from a JSON string
analyze_document_response_instance = AnalyzeDocumentResponse.from_json(json)
# print the JSON string representation of the object
print(AnalyzeDocumentResponse.to_json())

# convert the object into a dict
analyze_document_response_dict = analyze_document_response_instance.to_dict()
# create an instance of AnalyzeDocumentResponse from a dict
analyze_document_response_from_dict = AnalyzeDocumentResponse.from_dict(analyze_document_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


