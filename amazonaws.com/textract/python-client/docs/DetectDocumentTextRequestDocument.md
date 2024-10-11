# DetectDocumentTextRequestDocument


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bytes** | **str** |  | [optional] 
**s3_object** | [**DocumentS3Object**](DocumentS3Object.md) |  | [optional] 

## Example

```python
from openapi_client.models.detect_document_text_request_document import DetectDocumentTextRequestDocument

# TODO update the JSON string below
json = "{}"
# create an instance of DetectDocumentTextRequestDocument from a JSON string
detect_document_text_request_document_instance = DetectDocumentTextRequestDocument.from_json(json)
# print the JSON string representation of the object
print(DetectDocumentTextRequestDocument.to_json())

# convert the object into a dict
detect_document_text_request_document_dict = detect_document_text_request_document_instance.to_dict()
# create an instance of DetectDocumentTextRequestDocument from a dict
detect_document_text_request_document_from_dict = DetectDocumentTextRequestDocument.from_dict(detect_document_text_request_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


