# AcceptTermsOfServiceResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accepted_by** | **str** | The unique identifier of the user that accepted the Terms of Service. | [optional] 
**id** | **str** | The unique identifier of the Terms of Service acceptance. | [optional] 
**ip_address** | **str** | The IP address of the user that accepted the Terms of Service. | [optional] 
**language** | **str** | The language used for the Terms of Service document, specified by the two letter [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code. For example, **nl** for Dutch. | [optional] 
**terms_of_service_document_id** | **str** | The unique identifier of the Terms of Service document. | [optional] 
**type** | **str** | The type of Terms of Service. | [optional] 

## Example

```python
from openapi_client.models.accept_terms_of_service_response import AcceptTermsOfServiceResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AcceptTermsOfServiceResponse from a JSON string
accept_terms_of_service_response_instance = AcceptTermsOfServiceResponse.from_json(json)
# print the JSON string representation of the object
print(AcceptTermsOfServiceResponse.to_json())

# convert the object into a dict
accept_terms_of_service_response_dict = accept_terms_of_service_response_instance.to_dict()
# create an instance of AcceptTermsOfServiceResponse from a dict
accept_terms_of_service_response_from_dict = AcceptTermsOfServiceResponse.from_dict(accept_terms_of_service_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


