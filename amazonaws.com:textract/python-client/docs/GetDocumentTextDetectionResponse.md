# GetDocumentTextDetectionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_metadata** | [**GetDocumentAnalysisResponseDocumentMetadata**](GetDocumentAnalysisResponseDocumentMetadata.md) |  | [optional] 
**job_status** | [**JobStatus**](JobStatus.md) |  | [optional] 
**next_token** | **str** |  | [optional] 
**blocks** | **List** |  | [optional] 
**warnings** | **List** |  | [optional] 
**status_message** | **str** |  | [optional] 
**detect_document_text_model_version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.get_document_text_detection_response import GetDocumentTextDetectionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetDocumentTextDetectionResponse from a JSON string
get_document_text_detection_response_instance = GetDocumentTextDetectionResponse.from_json(json)
# print the JSON string representation of the object
print(GetDocumentTextDetectionResponse.to_json())

# convert the object into a dict
get_document_text_detection_response_dict = get_document_text_detection_response_instance.to_dict()
# create an instance of GetDocumentTextDetectionResponse from a dict
get_document_text_detection_response_from_dict = GetDocumentTextDetectionResponse.from_dict(get_document_text_detection_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


