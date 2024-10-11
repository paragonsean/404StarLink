# openapi_client.PatientNotificationApi

All URIs are relative to *https://dev.ndhm.gov.in/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v05_patients_sms_notify_post_0**](PatientNotificationApi.md#v05_patients_sms_notify_post_0) | **POST** /v0.5/patients/sms/notify | API for HIP to send SMS notifications to patients
[**v05_patients_sms_on_notify_post_0**](PatientNotificationApi.md#v05_patients_sms_on_notify_post_0) | **POST** /v0.5/patients/sms/on-notify | Acknowledgment response for SMS notification sent to patient by HIP


# **v05_patients_sms_notify_post_0**
> v05_patients_sms_notify_post_0(authorization, x_cm_id, patient_sms_notifcation_request)

API for HIP to send SMS notifications to patients

API to send SMS notifications to patient with custom deeplink. 

### Example


```python
import openapi_client
from openapi_client.models.patient_sms_notifcation_request import PatientSMSNotifcationRequest
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
    api_instance = openapi_client.PatientNotificationApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_cm_id = 'x_cm_id_example' # str | Suffix of the consent manager to which the request was intended.
    patient_sms_notifcation_request = openapi_client.PatientSMSNotifcationRequest() # PatientSMSNotifcationRequest | 

    try:
        # API for HIP to send SMS notifications to patients
        api_instance.v05_patients_sms_notify_post_0(authorization, x_cm_id, patient_sms_notifcation_request)
    except Exception as e:
        print("Exception when calling PatientNotificationApi->v05_patients_sms_notify_post_0: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Access token which was issued after successful login with gateway auth server. | 
 **x_cm_id** | **str**| Suffix of the consent manager to which the request was intended. | 
 **patient_sms_notifcation_request** | [**PatientSMSNotifcationRequest**](PatientSMSNotifcationRequest.md)|  | 

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

# **v05_patients_sms_on_notify_post_0**
> v05_patients_sms_on_notify_post_0(authorization, x_hip_id, patient_sms_notifcation_response)

Acknowledgment response for SMS notification sent to patient by HIP

If the SMS notification is successfully sent to patient then \"status\" will be \"ACKNOWLEDGED\" with no error. If the SMS notification is failed then \"status\" will be \"ERRORED\" with error. 

### Example


```python
import openapi_client
from openapi_client.models.patient_sms_notifcation_response import PatientSMSNotifcationResponse
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
    api_instance = openapi_client.PatientNotificationApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_hip_id = 'x_hip_id_example' # str | Identifier of the health information provider to which the request was intended.
    patient_sms_notifcation_response = openapi_client.PatientSMSNotifcationResponse() # PatientSMSNotifcationResponse | 

    try:
        # Acknowledgment response for SMS notification sent to patient by HIP
        api_instance.v05_patients_sms_on_notify_post_0(authorization, x_hip_id, patient_sms_notifcation_response)
    except Exception as e:
        print("Exception when calling PatientNotificationApi->v05_patients_sms_on_notify_post_0: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Access token which was issued after successful login with gateway auth server. | 
 **x_hip_id** | **str**| Identifier of the health information provider to which the request was intended. | 
 **patient_sms_notifcation_response** | [**PatientSMSNotifcationResponse**](PatientSMSNotifcationResponse.md)|  | 

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

