# GetTermsOfServiceDocumentRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**language** | **str** | The language to be used for the Terms of Service document, specified by the two letter [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code. For example, **nl** for Dutch. | [optional] 
**type** | **str** | The type of Terms of Service. | [optional] 

## Example

```python
from openapi_client.models.get_terms_of_service_document_request import GetTermsOfServiceDocumentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetTermsOfServiceDocumentRequest from a JSON string
get_terms_of_service_document_request_instance = GetTermsOfServiceDocumentRequest.from_json(json)
# print the JSON string representation of the object
print(GetTermsOfServiceDocumentRequest.to_json())

# convert the object into a dict
get_terms_of_service_document_request_dict = get_terms_of_service_document_request_instance.to_dict()
# create an instance of GetTermsOfServiceDocumentRequest from a dict
get_terms_of_service_document_request_from_dict = GetTermsOfServiceDocumentRequest.from_dict(get_terms_of_service_document_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


