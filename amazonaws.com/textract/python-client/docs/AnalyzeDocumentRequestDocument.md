# AnalyzeDocumentRequestDocument


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bytes** | **str** |  | [optional] 
**s3_object** | [**DocumentS3Object**](DocumentS3Object.md) |  | [optional] 

## Example

```python
from openapi_client.models.analyze_document_request_document import AnalyzeDocumentRequestDocument

# TODO update the JSON string below
json = "{}"
# create an instance of AnalyzeDocumentRequestDocument from a JSON string
analyze_document_request_document_instance = AnalyzeDocumentRequestDocument.from_json(json)
# print the JSON string representation of the object
print(AnalyzeDocumentRequestDocument.to_json())

# convert the object into a dict
analyze_document_request_document_dict = analyze_document_request_document_instance.to_dict()
# create an instance of AnalyzeDocumentRequestDocument from a dict
analyze_document_request_document_from_dict = AnalyzeDocumentRequestDocument.from_dict(analyze_document_request_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


