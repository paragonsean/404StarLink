# DocumentUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documents** | **bytearray** | Single file data. The name is plural to provide a consistent naming convention. | [optional] 
**schemes** | **str** | JSON string. If your documents have a scheme, as in cases of CSV files, use the same array index keys for &#x60;schemes&#x60; parameter to specify their schemes. See &#x60;Document Schemes&#x60; title in the API documentation. | [optional] 
**source_link** | [**LinkedSourceDocument**](LinkedSourceDocument.md) |  | [optional] 

## Example

```python
from openapi_client.models.document_upload_request import DocumentUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DocumentUploadRequest from a JSON string
document_upload_request_instance = DocumentUploadRequest.from_json(json)
# print the JSON string representation of the object
print(DocumentUploadRequest.to_json())

# convert the object into a dict
document_upload_request_dict = document_upload_request_instance.to_dict()
# create an instance of DocumentUploadRequest from a dict
document_upload_request_from_dict = DocumentUploadRequest.from_dict(document_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


