# DEPRECATEDDocumentRequest

This can be any pure JSON document.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_field** | **str** | This can be any JSON document field. | [optional] 

## Example

```python
from openapi_client.models.deprecated_document_request import DEPRECATEDDocumentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DEPRECATEDDocumentRequest from a JSON string
deprecated_document_request_instance = DEPRECATEDDocumentRequest.from_json(json)
# print the JSON string representation of the object
print(DEPRECATEDDocumentRequest.to_json())

# convert the object into a dict
deprecated_document_request_dict = deprecated_document_request_instance.to_dict()
# create an instance of DEPRECATEDDocumentRequest from a dict
deprecated_document_request_from_dict = DEPRECATEDDocumentRequest.from_dict(deprecated_document_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


