# openapi_client.HipFacingApi

All URIs are relative to *https://dev.ndhm.gov.in/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v05_consents_hip_on_notify_post_0**](HipFacingApi.md#v05_consents_hip_on_notify_post_0) | **POST** /v0.5/consents/hip/on-notify | Consent notification
[**v05_health_information_hip_on_request_post_0**](HipFacingApi.md#v05_health_information_hip_on_request_post_0) | **POST** /v0.5/health-information/hip/on-request | Health information data request
[**v05_health_information_notify_post_0**](HipFacingApi.md#v05_health_information_notify_post_0) | **POST** /v0.5/health-information/notify | Notifications corresponding to events during data flow
[**v05_links_link_add_contexts_post_0**](HipFacingApi.md#v05_links_link_add_contexts_post_0) | **POST** /v0.5/links/link/add-contexts | API for HIP initiated care-context linking for patient
[**v05_links_link_on_confirm_post_0**](HipFacingApi.md#v05_links_link_on_confirm_post_0) | **POST** /v0.5/links/link/on-confirm | Token authenticated by HIP, indicating completion of linkage of care-contexts
[**v05_links_link_on_init_post_0**](HipFacingApi.md#v05_links_link_on_init_post_0) | **POST** /v0.5/links/link/on-init | Response to patient&#39;s care context link request
[**v05_patients_sms_notify_post**](HipFacingApi.md#v05_patients_sms_notify_post) | **POST** /v0.5/patients/sms/notify | API for HIP to send SMS notifications to patients
[**v05_users_auth_confirm_post_0**](HipFacingApi.md#v05_users_auth_confirm_post_0) | **POST** /v0.5/users/auth/confirm | Confirmation request sending token, otp or other authentication details from HIP/HIU for confirmation
[**v05_users_auth_fetch_modes_post_0**](HipFacingApi.md#v05_users_auth_fetch_modes_post_0) | **POST** /v0.5/users/auth/fetch-modes | Get a patient&#39;s authentication modes relevant to specified purpose
[**v05_users_auth_init_post_0**](HipFacingApi.md#v05_users_auth_init_post_0) | **POST** /v0.5/users/auth/init | Initialize authentication from HIP
[**v05_users_auth_on_notify_post_0**](HipFacingApi.md#v05_users_auth_on_notify_post_0) | **POST** /v0.5/users/auth/on-notify | callback API by HIU/HIPs as acknowledgement of auth notification


# **v05_consents_hip_on_notify_post_0**
> v05_consents_hip_on_notify_post_0(authorization, x_cm_id, hip_consent_notification_response)

Consent notification

This API is called by HIP as acknowledgement to notification of consents, in cases of consent revocation and expiration.  

### Example


```python
import openapi_client
from openapi_client.models.hip_consent_notification_response import HIPConsentNotificationResponse
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
    api_instance = openapi_client.HipFacingApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_cm_id = 'x_cm_id_example' # str | Suffix of the consent manager to which the request was intended.
    hip_consent_notification_response = openapi_client.HIPConsentNotificationResponse() # HIPConsentNotificationResponse | 

    try:
        # Consent notification
        api_instance.v05_consents_hip_on_notify_post_0(authorization, x_cm_id, hip_consent_notification_response)
    except Exception as e:
        print("Exception when calling HipFacingApi->v05_consents_hip_on_notify_post_0: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Access token which was issued after successful login with gateway auth server. | 
 **x_cm_id** | **str**| Suffix of the consent manager to which the request was intended. | 
 **hip_consent_notification_response** | [**HIPConsentNotificationResponse**](HIPConsentNotificationResponse.md)|  | 

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
**401** | **Causes:**   * Invalid/Expired/Empty token.  |  -  |
**500** | **Causes:**   * Downstream services are down  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v05_health_information_hip_on_request_post_0**
> v05_health_information_hip_on_request_post_0(authorization, x_cm_id, hip_health_information_request_acknowledgement)

Health information data request

API called by HIP to acknowledge Health information request receipt. Either the **hiRequest** or **error** must be specified. **hiRequest** element returns the same transactionId as before with a status indicating that the request is acknowledged.   

### Example


```python
import openapi_client
from openapi_client.models.hip_health_information_request_acknowledgement import HIPHealthInformationRequestAcknowledgement
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
    api_instance = openapi_client.HipFacingApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_cm_id = 'x_cm_id_example' # str | Suffix of the consent manager to which the request was intended.
    hip_health_information_request_acknowledgement = openapi_client.HIPHealthInformationRequestAcknowledgement() # HIPHealthInformationRequestAcknowledgement | 

    try:
        # Health information data request
        api_instance.v05_health_information_hip_on_request_post_0(authorization, x_cm_id, hip_health_information_request_acknowledgement)
    except Exception as e:
        print("Exception when calling HipFacingApi->v05_health_information_hip_on_request_post_0: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Access token which was issued after successful login with gateway auth server. | 
 **x_cm_id** | **str**| Suffix of the consent manager to which the request was intended. | 
 **hip_health_information_request_acknowledgement** | [**HIPHealthInformationRequestAcknowledgement**](HIPHealthInformationRequestAcknowledgement.md)|  | 

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
**202** | Request accepted. |  -  |
**400** | **Causes:**   * Bad request  |  -  |
**401** | **Causes:**   * Token is invalid or Link has expired  |  -  |
**500** | **Causes:**   * Downstream system(s) is down.   * Unhandled exceptions.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v05_health_information_notify_post_0**
> v05_health_information_notify_post_0(authorization, x_cm_id, health_information_notification)

Notifications corresponding to events during data flow

API called by HIU and HIP during data-transfer.  1. HIP on transfer of data would send **sessionStatus** - one of [TRANSFERRED, FAILED] 2. HIP would also send **hiStatus** for each *careContextReference* - on of [DELIVERED, ERRORED] 3. HIU on receipt of data would send **sessionStatus** - one of [TRANSFERRED, FAILED]. For example, FAILED when if data was not sent or if invalid data was sent 4. HIU would also send **hiStatus** for each *careContextReference* - one of [OK, ERRORED]  

### Example


```python
import openapi_client
from openapi_client.models.health_information_notification import HealthInformationNotification
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
    api_instance = openapi_client.HipFacingApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_cm_id = 'x_cm_id_example' # str | Suffix of the consent manager to which the request was intended.
    health_information_notification = openapi_client.HealthInformationNotification() # HealthInformationNotification | 

    try:
        # Notifications corresponding to events during data flow
        api_instance.v05_health_information_notify_post_0(authorization, x_cm_id, health_information_notification)
    except Exception as e:
        print("Exception when calling HipFacingApi->v05_health_information_notify_post_0: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Access token which was issued after successful login with gateway auth server. | 
 **x_cm_id** | **str**| Suffix of the consent manager to which the request was intended. | 
 **health_information_notification** | [**HealthInformationNotification**](HealthInformationNotification.md)|  | 

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
**204** | Notification is Accepted |  -  |
**400** | **Causes:**   * Invalid Request  |  -  |
**401** | **Causes:**   * Expired/Invalid token.  |  -  |
**500** | **Causes:**   * Downstream system(s) is down.   * Unhandled exceptions.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v05_links_link_add_contexts_post_0**
> v05_links_link_add_contexts_post_0(authorization, x_cm_id, patient_care_context_link_request)

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
    api_instance = openapi_client.HipFacingApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_cm_id = 'x_cm_id_example' # str | Suffix of the consent manager to which the request was intended.
    patient_care_context_link_request = openapi_client.PatientCareContextLinkRequest() # PatientCareContextLinkRequest | 

    try:
        # API for HIP initiated care-context linking for patient
        api_instance.v05_links_link_add_contexts_post_0(authorization, x_cm_id, patient_care_context_link_request)
    except Exception as e:
        print("Exception when calling HipFacingApi->v05_links_link_add_contexts_post_0: %s\n" % e)
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

# **v05_links_link_on_confirm_post_0**
> v05_links_link_on_confirm_post_0(authorization, x_cm_id, patient_link_result)

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
    api_instance = openapi_client.HipFacingApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_cm_id = 'x_cm_id_example' # str | Suffix of the consent manager to which the request was intended.
    patient_link_result = openapi_client.PatientLinkResult() # PatientLinkResult | 

    try:
        # Token authenticated by HIP, indicating completion of linkage of care-contexts
        api_instance.v05_links_link_on_confirm_post_0(authorization, x_cm_id, patient_link_result)
    except Exception as e:
        print("Exception when calling HipFacingApi->v05_links_link_on_confirm_post_0: %s\n" % e)
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

# **v05_links_link_on_init_post_0**
> v05_links_link_on_init_post_0(authorization, x_cm_id, patient_link_reference_result)

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
    api_instance = openapi_client.HipFacingApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_cm_id = 'x_cm_id_example' # str | Suffix of the consent manager to which the request was intended.
    patient_link_reference_result = openapi_client.PatientLinkReferenceResult() # PatientLinkReferenceResult | 

    try:
        # Response to patient's care context link request
        api_instance.v05_links_link_on_init_post_0(authorization, x_cm_id, patient_link_reference_result)
    except Exception as e:
        print("Exception when calling HipFacingApi->v05_links_link_on_init_post_0: %s\n" % e)
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

# **v05_patients_sms_notify_post**
> v05_patients_sms_notify_post(authorization, x_cm_id, patient_sms_notifcation_request)

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
    api_instance = openapi_client.HipFacingApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_cm_id = 'x_cm_id_example' # str | Suffix of the consent manager to which the request was intended.
    patient_sms_notifcation_request = openapi_client.PatientSMSNotifcationRequest() # PatientSMSNotifcationRequest | 

    try:
        # API for HIP to send SMS notifications to patients
        api_instance.v05_patients_sms_notify_post(authorization, x_cm_id, patient_sms_notifcation_request)
    except Exception as e:
        print("Exception when calling HipFacingApi->v05_patients_sms_notify_post: %s\n" % e)
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

# **v05_users_auth_confirm_post_0**
> v05_users_auth_confirm_post_0(authorization, x_cm_id, patient_auth_confirm_request)

Confirmation request sending token, otp or other authentication details from HIP/HIU for confirmation

This API is called by HIP/HIUs to confirm authentication of users. The transactionId returned by the previous callback API /users/auth/on-init must be sent. If Authentication is successful the callback API will send an \"access token\" for subsequent purpose specific API calls. Note only **credential.authCode** or **credential.demographic** should be sent   1. demographic details are only required for  demographic auth as of now.    2. demographic details are required only in MEDIATED cases and if the **auth.mode** so demands. e.g. if **auth.mode** is DEMOGRAPHICS. Usually for demographic authentication, the name, gender and DOB must be exactly as specified in User Account.   3. demographic.identifier is optional, however maybe required if authentication so mandates.    4. credential.authCode is required for other MEDIATED authentication like MOBILE_OTP, AADHAAR_OTP.  

### Example


```python
import openapi_client
from openapi_client.models.patient_auth_confirm_request import PatientAuthConfirmRequest
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
    api_instance = openapi_client.HipFacingApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_cm_id = 'x_cm_id_example' # str | Suffix of the consent manager to which the request was intended.
    patient_auth_confirm_request = openapi_client.PatientAuthConfirmRequest() # PatientAuthConfirmRequest | 

    try:
        # Confirmation request sending token, otp or other authentication details from HIP/HIU for confirmation
        api_instance.v05_users_auth_confirm_post_0(authorization, x_cm_id, patient_auth_confirm_request)
    except Exception as e:
        print("Exception when calling HipFacingApi->v05_users_auth_confirm_post_0: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Access token which was issued after successful login with gateway auth server. | 
 **x_cm_id** | **str**| Suffix of the consent manager to which the request was intended. | 
 **patient_auth_confirm_request** | [**PatientAuthConfirmRequest**](PatientAuthConfirmRequest.md)|  | 

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
**400** | **Causes:**   * transaction id is not provided or invalid   * token or other auth confirmation details not provided or invalid  |  -  |
**401** | **Causes:**   * Unauthorized request  |  -  |
**500** | **Causes:**   * Downstream system(s) is down.   * Unhandled exceptions.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v05_users_auth_fetch_modes_post_0**
> v05_users_auth_fetch_modes_post_0(authorization, x_cm_id, patient_auth_mode_query_request)

Get a patient's authentication modes relevant to specified purpose

This API is meant for identify supported authentication modes for a patient given a specific purpose 

### Example


```python
import openapi_client
from openapi_client.models.patient_auth_mode_query_request import PatientAuthModeQueryRequest
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
    api_instance = openapi_client.HipFacingApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_cm_id = 'x_cm_id_example' # str | Suffix of the consent manager to which the request was intended.
    patient_auth_mode_query_request = openapi_client.PatientAuthModeQueryRequest() # PatientAuthModeQueryRequest | 

    try:
        # Get a patient's authentication modes relevant to specified purpose
        api_instance.v05_users_auth_fetch_modes_post_0(authorization, x_cm_id, patient_auth_mode_query_request)
    except Exception as e:
        print("Exception when calling HipFacingApi->v05_users_auth_fetch_modes_post_0: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Access token which was issued after successful login with gateway auth server. | 
 **x_cm_id** | **str**| Suffix of the consent manager to which the request was intended. | 
 **patient_auth_mode_query_request** | [**PatientAuthModeQueryRequest**](PatientAuthModeQueryRequest.md)|  | 

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

# **v05_users_auth_init_post_0**
> v05_users_auth_init_post_0(authorization, x_cm_id, patient_auth_init_request)

Initialize authentication from HIP

This API is called by HIPs to initiate authentication of users. A transactionId is retuned by the corresponding callback API for confirmation of user auth. 

### Example


```python
import openapi_client
from openapi_client.models.patient_auth_init_request import PatientAuthInitRequest
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
    api_instance = openapi_client.HipFacingApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_cm_id = 'x_cm_id_example' # str | Suffix of the consent manager to which the request was intended.
    patient_auth_init_request = openapi_client.PatientAuthInitRequest() # PatientAuthInitRequest | 

    try:
        # Initialize authentication from HIP
        api_instance.v05_users_auth_init_post_0(authorization, x_cm_id, patient_auth_init_request)
    except Exception as e:
        print("Exception when calling HipFacingApi->v05_users_auth_init_post_0: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Access token which was issued after successful login with gateway auth server. | 
 **x_cm_id** | **str**| Suffix of the consent manager to which the request was intended. | 
 **patient_auth_init_request** | [**PatientAuthInitRequest**](PatientAuthInitRequest.md)|  | 

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
**400** | **Causes:**   * patient id is not provided  |  -  |
**401** | **Causes:**   * Unauthorized request  |  -  |
**500** | **Causes:**   * Downstream system(s) is down.   * Unhandled exceptions.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v05_users_auth_on_notify_post_0**
> v05_users_auth_on_notify_post_0(authorization, x_cm_id, patient_auth_notification_acknowledgement)

callback API by HIU/HIPs as acknowledgement of auth notification

This API is called by HIU/HIPs to confirm acknowledgement for receipt of auth notification is case of DIRECT authentication.  

### Example


```python
import openapi_client
from openapi_client.models.patient_auth_notification_acknowledgement import PatientAuthNotificationAcknowledgement
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
    api_instance = openapi_client.HipFacingApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_cm_id = 'x_cm_id_example' # str | Suffix of the consent manager to which the request was intended.
    patient_auth_notification_acknowledgement = openapi_client.PatientAuthNotificationAcknowledgement() # PatientAuthNotificationAcknowledgement | 

    try:
        # callback API by HIU/HIPs as acknowledgement of auth notification
        api_instance.v05_users_auth_on_notify_post_0(authorization, x_cm_id, patient_auth_notification_acknowledgement)
    except Exception as e:
        print("Exception when calling HipFacingApi->v05_users_auth_on_notify_post_0: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Access token which was issued after successful login with gateway auth server. | 
 **x_cm_id** | **str**| Suffix of the consent manager to which the request was intended. | 
 **patient_auth_notification_acknowledgement** | [**PatientAuthNotificationAcknowledgement**](PatientAuthNotificationAcknowledgement.md)|  | 

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
**400** | **Causes:**   * required details not provided   * neither auth nor error specified   |  -  |
**401** | **Causes:**   * Unauthorized request  |  -  |
**500** | **Causes:**   * Downstream system(s) is down.   * Unhandled exceptions.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

