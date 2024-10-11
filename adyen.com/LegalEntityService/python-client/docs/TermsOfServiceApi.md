# openapi_client.TermsOfServiceApi

All URIs are relative to *https://kyc-test.adyen.com/lem/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_legal_entities_id_terms_of_service_acceptance_infos**](TermsOfServiceApi.md#get_legal_entities_id_terms_of_service_acceptance_infos) | **GET** /legalEntities/{id}/termsOfServiceAcceptanceInfos | Get Terms of Service information for a legal entity
[**patch_legal_entities_id_terms_of_service_termsofservicedocumentid**](TermsOfServiceApi.md#patch_legal_entities_id_terms_of_service_termsofservicedocumentid) | **PATCH** /legalEntities/{id}/termsOfService/{termsofservicedocumentid} | Accept Terms of Service
[**post_legal_entities_id_terms_of_service**](TermsOfServiceApi.md#post_legal_entities_id_terms_of_service) | **POST** /legalEntities/{id}/termsOfService | Get Terms of Service document


# **get_legal_entities_id_terms_of_service_acceptance_infos**
> GetTermsOfServiceAcceptanceInfosResponse get_legal_entities_id_terms_of_service_acceptance_infos(id)

Get Terms of Service information for a legal entity

Returns Terms of Service information for a legal entity.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.get_terms_of_service_acceptance_infos_response import GetTermsOfServiceAcceptanceInfosResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://kyc-test.adyen.com/lem/v3
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://kyc-test.adyen.com/lem/v3"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TermsOfServiceApi(api_client)
    id = 'id_example' # str | The unique identifier of the legal entity.

    try:
        # Get Terms of Service information for a legal entity
        api_response = api_instance.get_legal_entities_id_terms_of_service_acceptance_infos(id)
        print("The response of TermsOfServiceApi->get_legal_entities_id_terms_of_service_acceptance_infos:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TermsOfServiceApi->get_legal_entities_id_terms_of_service_acceptance_infos: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The unique identifier of the legal entity. | 

### Return type

[**GetTermsOfServiceAcceptanceInfosResponse**](GetTermsOfServiceAcceptanceInfosResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK - the request has succeeded. |  -  |
**400** | Bad Request - a problem reading or understanding the request. |  -  |
**401** | Unauthorized - authentication required. |  -  |
**403** | Forbidden - insufficient permissions to process the request. |  -  |
**422** | Unprocessable Entity - a request validation error. |  -  |
**500** | Internal Server Error - the server could not process the request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_legal_entities_id_terms_of_service_termsofservicedocumentid**
> AcceptTermsOfServiceResponse patch_legal_entities_id_terms_of_service_termsofservicedocumentid(id, termsofservicedocumentid, accept_terms_of_service_request=accept_terms_of_service_request)

Accept Terms of Service

Accepts Terms of Service.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.accept_terms_of_service_request import AcceptTermsOfServiceRequest
from openapi_client.models.accept_terms_of_service_response import AcceptTermsOfServiceResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://kyc-test.adyen.com/lem/v3
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://kyc-test.adyen.com/lem/v3"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TermsOfServiceApi(api_client)
    id = 'id_example' # str | The unique identifier of the legal entity.
    termsofservicedocumentid = 'termsofservicedocumentid_example' # str | The unique identifier of the Terms of Service document.
    accept_terms_of_service_request = openapi_client.AcceptTermsOfServiceRequest() # AcceptTermsOfServiceRequest |  (optional)

    try:
        # Accept Terms of Service
        api_response = api_instance.patch_legal_entities_id_terms_of_service_termsofservicedocumentid(id, termsofservicedocumentid, accept_terms_of_service_request=accept_terms_of_service_request)
        print("The response of TermsOfServiceApi->patch_legal_entities_id_terms_of_service_termsofservicedocumentid:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TermsOfServiceApi->patch_legal_entities_id_terms_of_service_termsofservicedocumentid: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The unique identifier of the legal entity. | 
 **termsofservicedocumentid** | **str**| The unique identifier of the Terms of Service document. | 
 **accept_terms_of_service_request** | [**AcceptTermsOfServiceRequest**](AcceptTermsOfServiceRequest.md)|  | [optional] 

### Return type

[**AcceptTermsOfServiceResponse**](AcceptTermsOfServiceResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK - the request has succeeded. |  -  |
**400** | Bad Request - a problem reading or understanding the request. |  -  |
**401** | Unauthorized - authentication required. |  -  |
**403** | Forbidden - insufficient permissions to process the request. |  -  |
**422** | Unprocessable Entity - a request validation error. |  -  |
**500** | Internal Server Error - the server could not process the request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_legal_entities_id_terms_of_service**
> GetTermsOfServiceDocumentResponse post_legal_entities_id_terms_of_service(id, get_terms_of_service_document_request=get_terms_of_service_document_request)

Get Terms of Service document

Returns the Terms of Service document for a legal entity.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.get_terms_of_service_document_request import GetTermsOfServiceDocumentRequest
from openapi_client.models.get_terms_of_service_document_response import GetTermsOfServiceDocumentResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://kyc-test.adyen.com/lem/v3
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://kyc-test.adyen.com/lem/v3"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TermsOfServiceApi(api_client)
    id = 'id_example' # str | The unique identifier of the legal entity.
    get_terms_of_service_document_request = openapi_client.GetTermsOfServiceDocumentRequest() # GetTermsOfServiceDocumentRequest |  (optional)

    try:
        # Get Terms of Service document
        api_response = api_instance.post_legal_entities_id_terms_of_service(id, get_terms_of_service_document_request=get_terms_of_service_document_request)
        print("The response of TermsOfServiceApi->post_legal_entities_id_terms_of_service:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TermsOfServiceApi->post_legal_entities_id_terms_of_service: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The unique identifier of the legal entity. | 
 **get_terms_of_service_document_request** | [**GetTermsOfServiceDocumentRequest**](GetTermsOfServiceDocumentRequest.md)|  | [optional] 

### Return type

[**GetTermsOfServiceDocumentResponse**](GetTermsOfServiceDocumentResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK - the request has succeeded. |  -  |
**400** | Bad Request - a problem reading or understanding the request. |  -  |
**401** | Unauthorized - authentication required. |  -  |
**403** | Forbidden - insufficient permissions to process the request. |  -  |
**422** | Unprocessable Entity - a request validation error. |  -  |
**500** | Internal Server Error - the server could not process the request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

