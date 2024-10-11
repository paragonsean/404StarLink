# openapi_client.IdentificationApi

All URIs are relative to *https://dev.ndhm.gov.in/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v05_patients_find_post**](IdentificationApi.md#v05_patients_find_post) | **POST** /v0.5/patients/find | Identify a patient by her consent-manager user-id
[**v05_patients_on_find_post**](IdentificationApi.md#v05_patients_on_find_post) | **POST** /v0.5/patients/on-find | Identification result for a consent-manager user-id


# **v05_patients_find_post**
> v05_patients_find_post(authorization, x_cm_id, patient_identification_request)

Identify a patient by her consent-manager user-id

This API is meant for identify to patient given her consent-manager-user-id 

### Example


```python
import openapi_client
from openapi_client.models.patient_identification_request import PatientIdentificationRequest
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
    api_instance = openapi_client.IdentificationApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_cm_id = 'x_cm_id_example' # str | Suffix of the consent manager to which the request was intended.
    patient_identification_request = openapi_client.PatientIdentificationRequest() # PatientIdentificationRequest | 

    try:
        # Identify a patient by her consent-manager user-id
        api_instance.v05_patients_find_post(authorization, x_cm_id, patient_identification_request)
    except Exception as e:
        print("Exception when calling IdentificationApi->v05_patients_find_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Access token which was issued after successful login with gateway auth server. | 
 **x_cm_id** | **str**| Suffix of the consent manager to which the request was intended. | 
 **patient_identification_request** | [**PatientIdentificationRequest**](PatientIdentificationRequest.md)|  | 

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
**202** | Request Accepted |  -  |
**400** | Invalid request, required attributes not provided  |  -  |
**401** | **Causes:**   * Unauthorized request  |  -  |
**500** | **Causes:**   * Downstream system(s) is down.   * Unhandled exceptions.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v05_patients_on_find_post**
> v05_patients_on_find_post(authorization, patient_identification_response)

Identification result for a consent-manager user-id

If a patient is found then patient.name contains the patients name.  Otherwise, patient is not provided, and possibly error is raised for invalid requests Note in addition to the \"Authorization\" header, one of the following headers must be specified 1. specify **X-HIU-ID** if the requester is HIU (identified from /find requester.id) 2. specify **X-HIP-ID** if the requester is HIP (identified from /find requester.id) 

### Example


```python
import openapi_client
from openapi_client.models.patient_identification_response import PatientIdentificationResponse
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
    api_instance = openapi_client.IdentificationApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    patient_identification_response = openapi_client.PatientIdentificationResponse() # PatientIdentificationResponse | 

    try:
        # Identification result for a consent-manager user-id
        api_instance.v05_patients_on_find_post(authorization, patient_identification_response)
    except Exception as e:
        print("Exception when calling IdentificationApi->v05_patients_on_find_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Access token which was issued after successful login with gateway auth server. | 
 **patient_identification_response** | [**PatientIdentificationResponse**](PatientIdentificationResponse.md)|  | 

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
**202** | Request Accepted |  -  |
**400** | Invalid request, required attributes not provided  |  -  |
**401** | **Causes:**   * Unauthorized request  |  -  |
**500** | **Causes:**   * Downstream system(s) is down.   * Unhandled exceptions.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

