# AcceptTermsOfServiceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accepted_by** | **str** | The unique identifier of the user accepting the Terms of Service. | [optional] 
**ip_address** | **str** | The IP address of the user accepting the Terms of Service. | [optional] 

## Example

```python
from openapi_client.models.accept_terms_of_service_request import AcceptTermsOfServiceRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AcceptTermsOfServiceRequest from a JSON string
accept_terms_of_service_request_instance = AcceptTermsOfServiceRequest.from_json(json)
# print the JSON string representation of the object
print(AcceptTermsOfServiceRequest.to_json())

# convert the object into a dict
accept_terms_of_service_request_dict = accept_terms_of_service_request_instance.to_dict()
# create an instance of AcceptTermsOfServiceRequest from a dict
accept_terms_of_service_request_from_dict = AcceptTermsOfServiceRequest.from_dict(accept_terms_of_service_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


