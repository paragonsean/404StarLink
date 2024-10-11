# DetectDocumentTextResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_metadata** | [**DetectDocumentTextResponseDocumentMetadata**](DetectDocumentTextResponseDocumentMetadata.md) |  | [optional] 
**blocks** | **List** |  | [optional] 
**detect_document_text_model_version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.detect_document_text_response import DetectDocumentTextResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DetectDocumentTextResponse from a JSON string
detect_document_text_response_instance = DetectDocumentTextResponse.from_json(json)
# print the JSON string representation of the object
print(DetectDocumentTextResponse.to_json())

# convert the object into a dict
detect_document_text_response_dict = detect_document_text_response_instance.to_dict()
# create an instance of DetectDocumentTextResponse from a dict
detect_document_text_response_from_dict = DetectDocumentTextResponse.from_dict(detect_document_text_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


