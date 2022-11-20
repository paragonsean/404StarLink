# DetectDocumentTextRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document** | [**DetectDocumentTextRequestDocument**](DetectDocumentTextRequestDocument.md) |  | 

## Example

```python
from openapi_client.models.detect_document_text_request import DetectDocumentTextRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DetectDocumentTextRequest from a JSON string
detect_document_text_request_instance = DetectDocumentTextRequest.from_json(json)
# print the JSON string representation of the object
print(DetectDocumentTextRequest.to_json())

# convert the object into a dict
detect_document_text_request_dict = detect_document_text_request_instance.to_dict()
# create an instance of DetectDocumentTextRequest from a dict
detect_document_text_request_from_dict = DetectDocumentTextRequest.from_dict(detect_document_text_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


