# GetTermsOfServiceDocumentResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document** | **str** | The Terms of Service document in Base64-encoded format. | [optional] 
**id** | **str** | The unique identifier of the legal entity. | [optional] 
**language** | **str** | The language used for the Terms of Service document, specified by the two letter [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code. For example, **nl** for Dutch. | [optional] 
**terms_of_service_document_id** | **str** | The unique identifier of the Terms of Service document. | [optional] 
**type** | **str** | The type of Terms of Service. | [optional] 

## Example

```python
from openapi_client.models.get_terms_of_service_document_response import GetTermsOfServiceDocumentResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetTermsOfServiceDocumentResponse from a JSON string
get_terms_of_service_document_response_instance = GetTermsOfServiceDocumentResponse.from_json(json)
# print the JSON string representation of the object
print(GetTermsOfServiceDocumentResponse.to_json())

# convert the object into a dict
get_terms_of_service_document_response_dict = get_terms_of_service_document_response_instance.to_dict()
# create an instance of GetTermsOfServiceDocumentResponse from a dict
get_terms_of_service_document_response_from_dict = GetTermsOfServiceDocumentResponse.from_dict(get_terms_of_service_document_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


