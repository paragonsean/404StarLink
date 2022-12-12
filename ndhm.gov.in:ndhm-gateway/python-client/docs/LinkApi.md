# openapi_client.LinkApi

All URIs are relative to *https://dev.ndhm.gov.in/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v05_links_link_add_contexts_post**](LinkApi.md#v05_links_link_add_contexts_post) | **POST** /v0.5/links/link/add-contexts | API for HIP initiated care-context linking for patient
[**v05_links_link_confirm_post**](LinkApi.md#v05_links_link_confirm_post) | **POST** /v0.5/links/link/confirm | Token submission by Consent Manager for link confirmation
[**v05_links_link_init_post**](LinkApi.md#v05_links_link_init_post) | **POST** /v0.5/links/link/init | Link patient&#39;s care contexts
[**v05_links_link_on_add_contexts_post**](LinkApi.md#v05_links_link_on_add_contexts_post) | **POST** /v0.5/links/link/on-add-contexts | callback API for HIP initiated patient linking /link/add-context
[**v05_links_link_on_confirm_post**](LinkApi.md#v05_links_link_on_confirm_post) | **POST** /v0.5/links/link/on-confirm | Token authenticated by HIP, indicating completion of linkage of care-contexts
[**v05_links_link_on_init_post**](LinkApi.md#v05_links_link_on_init_post) | **POST** /v0.5/links/link/on-init | Response to patient&#39;s care context link request


# **v05_links_link_add_contexts_post**
> v05_links_link_add_contexts_post(authorization, x_cm_id, patient_care_context_link_request)

API for HIP initiated care-context linking for patient

API to submit care-context to CM for HIP initiated linking. The API must accompany the \"accessToken\" fetched in the users/auth process.     1. subsequent usage for accessToken may be invalid if it was meant for one-time usage or if it expired 

### Example


```python
import openapi_client
from openapi_client.models.patient_care_context_link_request import PatientCareContextLinkRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://dev.ndhm.gov.in/gateway
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://dev.ndhm.gov.in/gateway"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.LinkApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_cm_id = 'x_cm_id_example' # str | Suffix of the consent manager to which the request was intended.
    patient_care_context_link_request = openapi_client.PatientCareContextLinkRequest() # PatientCareContextLinkRequest | 

    try:
        # API for HIP initiated care-context linking for patient
        api_instance.v05_links_link_add_contexts_post(authorization, x_cm_id, patient_care_context_link_request)
    except Exception as e:
        print("Exception when calling LinkApi->v05_links_link_add_contexts_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Access token which was issued after successful login with gateway auth server. | 
 **x_cm_id** | **str**| Suffix of the consent manager to which the request was intended. | 
 **patient_care_context_link_request** | [**PatientCareContextLinkRequest**](PatientCareContextLinkRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | accepted |  -  |
**400** | **Causes:**   * required information not provided  |  -  |
**401** | **Causes:**   * Unauthorized request  |  -  |
**500** | **Causes:**   * Downstream system(s) is down.   * Unhandled exceptions.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v05_links_link_confirm_post**
> v05_links_link_confirm_post(authorization, x_hip_id, link_confirmation_request)

Token submission by Consent Manager for link confirmation

API to submit the token that was sent by HIP during the link request.  

### Example


```python
import openapi_client
from openapi_client.models.link_confirmation_request import LinkConfirmationRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://dev.ndhm.gov.in/gateway
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://dev.ndhm.gov.in/gateway"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.LinkApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_hip_id = 'x_hip_id_example' # str | Identifier of the health information provider to which the request was intended.
    link_confirmation_request = openapi_client.LinkConfirmationRequest() # LinkConfirmationRequest | 

    try:
        # Token submission by Consent Manager for link confirmation
        api_instance.v05_links_link_confirm_post(authorization, x_hip_id, link_confirmation_request)
    except Exception as e:
        print("Exception when calling LinkApi->v05_links_link_confirm_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Access token which was issued after successful login with gateway auth server. | 
 **x_hip_id** | **str**| Identifier of the health information provider to which the request was intended. | 
 **link_confirmation_request** | [**LinkConfirmationRequest**](LinkConfirmationRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | accepted |  -  |
**400** | **Causes:**   * Token is not provided  |  -  |
**401** | **Causes:**   * Unauthorized request  |  -  |
**500** | **Causes:**   * Downstream system(s) is down.   * Unhandled exceptions.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v05_links_link_init_post**
> v05_links_link_init_post(authorization, x_hip_id, patient_link_reference_request)

Link patient's care contexts

Request from CM to links care contexts associated with only one patient   1. **Validate account reference number and care context reference number**   2. **Validate transactionId in the request with discovery request entry to check whether there was a discovery       and were these care contexts discovered or not for a given patient**   3. **Before eventual link confirmation, HIP needs to authenticate the request with the patient(eg: OTP verification)**   4. **HIP should communicate the mode of authentication of a successful request to Consent Manager** 

### Example


```python
import openapi_client
from openapi_client.models.patient_link_reference_request import PatientLinkReferenceRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://dev.ndhm.gov.in/gateway
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://dev.ndhm.gov.in/gateway"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.LinkApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_hip_id = 'x_hip_id_example' # str | Identifier of the health information provider to which the request was intended.
    patient_link_reference_request = openapi_client.PatientLinkReferenceRequest() # PatientLinkReferenceRequest | 

    try:
        # Link patient's care contexts
        api_instance.v05_links_link_init_post(authorization, x_hip_id, patient_link_reference_request)
    except Exception as e:
        print("Exception when calling LinkApi->v05_links_link_init_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Access token which was issued after successful login with gateway auth server. | 
 **x_hip_id** | **str**| Identifier of the health information provider to which the request was intended. | 
 **patient_link_reference_request** | [**PatientLinkReferenceRequest**](PatientLinkReferenceRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Request accepted |  -  |
**400** | **Causes:**   * Consent manager user id is not provided   * Patient reference number is not provided   * Care context references are not provided  |  -  |
**401** | **Causes:**   * Unauthorized request  |  -  |
**500** | **Causes:**   * Downstream system(s) is down.   * Unhandled exceptions.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v05_links_link_on_add_contexts_post**
> v05_links_link_on_add_contexts_post(authorization, x_hip_id, patient_care_context_link_response)

callback API for HIP initiated patient linking /link/add-context

If the accessToken is valid for purpose of linking, and specified details provided, CM will send \"acknoweldgement.status\" as SUCCESS. If any error occcurred, for example invalid token, or other required patient or care-context information not provided, then \"error\" attribute conveys so.    1. **accessToken must be valid and must be for the purpose of linking** 

### Example


```python
import openapi_client
from openapi_client.models.patient_care_context_link_response import PatientCareContextLinkResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://dev.ndhm.gov.in/gateway
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://dev.ndhm.gov.in/gateway"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.LinkApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_hip_id = 'x_hip_id_example' # str | Identifier of the health information provider to which the request was intended.
    patient_care_context_link_response = openapi_client.PatientCareContextLinkResponse() # PatientCareContextLinkResponse | 

    try:
        # callback API for HIP initiated patient linking /link/add-context
        api_instance.v05_links_link_on_add_contexts_post(authorization, x_hip_id, patient_care_context_link_response)
    except Exception as e:
        print("Exception when calling LinkApi->v05_links_link_on_add_contexts_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Access token which was issued after successful login with gateway auth server. | 
 **x_hip_id** | **str**| Identifier of the health information provider to which the request was intended. | 
 **patient_care_context_link_response** | [**PatientCareContextLinkResponse**](PatientCareContextLinkResponse.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | accepted |  -  |
**400** | **Causes:**   * resp not specified   * atleast acknowledgement or error should be specified  |  -  |
**401** | **Causes:**   * Unauthorized request  |  -  |
**500** | **Causes:**   * Downstream system(s) is down.   * Unhandled exceptions.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v05_links_link_on_confirm_post**
> v05_links_link_on_confirm_post(authorization, x_cm_id, patient_link_result)

Token authenticated by HIP, indicating completion of linkage of care-contexts

Returns a list of linked care contexts with patient reference number.   1. **Validated and linked account reference number**   2. **Validated that the token sent from Consent Manager is same as the one generated by HIP**   3. **Verified that same Consent Manager which made the link request is sending the token**   4. **Results of unmasked linked care contexts with patient reference number** 

### Example


```python
import openapi_client
from openapi_client.models.patient_link_result import PatientLinkResult
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://dev.ndhm.gov.in/gateway
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://dev.ndhm.gov.in/gateway"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.LinkApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_cm_id = 'x_cm_id_example' # str | Suffix of the consent manager to which the request was intended.
    patient_link_result = openapi_client.PatientLinkResult() # PatientLinkResult | 

    try:
        # Token authenticated by HIP, indicating completion of linkage of care-contexts
        api_instance.v05_links_link_on_confirm_post(authorization, x_cm_id, patient_link_result)
    except Exception as e:
        print("Exception when calling LinkApi->v05_links_link_on_confirm_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Access token which was issued after successful login with gateway auth server. | 
 **x_cm_id** | **str**| Suffix of the consent manager to which the request was intended. | 
 **patient_link_result** | [**PatientLinkResult**](PatientLinkResult.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | accepted |  -  |
**400** | **Causes:**   * resp not specified   * atleast patient or error should be specified  |  -  |
**401** | **Causes:**   * Unauthorized request  |  -  |
**500** | **Causes:**   * Downstream system(s) is down.   * Unhandled exceptions.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v05_links_link_on_init_post**
> v05_links_link_on_init_post(authorization, x_cm_id, patient_link_reference_result)

Response to patient's care context link request

Result of patient care-context link request from HIP end. This happens in context of previous discovery of patient found at HIP end, therefore the link requests ought to be in reference to the patient reference and care-context references previously returned by the HIP. The correlation of discovery and link request is maintained through the transactionId. HIP should have   1. **Validated transactionId in the request to check whether there was a discovery done previously, and the link request corresponds to returned patient care care context references**   2. **Before returning the response, HIP should have sent an authentication request to the patient(eg: OTP verification)**   3. **HIP should communicate the mode of authentication of a successful request**   4. **HIP subsequently should expect the token passed via /link/confirm against the link.referenceNumber passed in this call**                        The error section in the body, represents the potential errors that may have occurred. Possible reasons:   1. **Patient reference number is invalid**   2. **Care context reference numbers are invalid** 

### Example


```python
import openapi_client
from openapi_client.models.patient_link_reference_result import PatientLinkReferenceResult
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://dev.ndhm.gov.in/gateway
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://dev.ndhm.gov.in/gateway"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.LinkApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_cm_id = 'x_cm_id_example' # str | Suffix of the consent manager to which the request was intended.
    patient_link_reference_result = openapi_client.PatientLinkReferenceResult() # PatientLinkReferenceResult | 

    try:
        # Response to patient's care context link request
        api_instance.v05_links_link_on_init_post(authorization, x_cm_id, patient_link_reference_result)
    except Exception as e:
        print("Exception when calling LinkApi->v05_links_link_on_init_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Access token which was issued after successful login with gateway auth server. | 
 **x_cm_id** | **str**| Suffix of the consent manager to which the request was intended. | 
 **patient_link_reference_result** | [**PatientLinkReferenceResult**](PatientLinkReferenceResult.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Request accepted |  -  |
**400** | **Causes:**   * Format mismatch of any of attributes.  |  -  |
**401** | **Causes:**   * Unauthorized request  |  -  |
**500** | **Causes:**   * Downstream system(s) is down.   * Unhandled exceptions.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

