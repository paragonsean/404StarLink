# openapi_client.ProfileApi

All URIs are relative to *https://dev.ndhm.gov.in/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v05_patients_profile_on_share_post**](ProfileApi.md#v05_patients_profile_on_share_post) | **POST** /v0.5/patients/profile/on-share | Response to patient&#39;s share profile request
[**v05_patients_profile_share_post**](ProfileApi.md#v05_patients_profile_share_post) | **POST** /v0.5/patients/profile/share | Share patient profile details


# **v05_patients_profile_on_share_post**
> v05_patients_profile_on_share_post(authorization, x_cm_id, share_profile_result)

Response to patient's share profile request

Result of patient share profile request at HIP end. 

### Example


```python
import openapi_client
from openapi_client.models.share_profile_result import ShareProfileResult
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
    api_instance = openapi_client.ProfileApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_cm_id = 'x_cm_id_example' # str | Suffix of the consent manager to which the request was intended.
    share_profile_result = openapi_client.ShareProfileResult() # ShareProfileResult | 

    try:
        # Response to patient's share profile request
        api_instance.v05_patients_profile_on_share_post(authorization, x_cm_id, share_profile_result)
    except Exception as e:
        print("Exception when calling ProfileApi->v05_patients_profile_on_share_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Access token which was issued after successful login with gateway auth server. | 
 **x_cm_id** | **str**| Suffix of the consent manager to which the request was intended. | 
 **share_profile_result** | [**ShareProfileResult**](ShareProfileResult.md)|  | 

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

# **v05_patients_profile_share_post**
> v05_patients_profile_share_post(authorization, x_hip_id, share_profile_request)

Share patient profile details

Request for sharing patient's profile details to HIP 

### Example


```python
import openapi_client
from openapi_client.models.share_profile_request import ShareProfileRequest
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
    api_instance = openapi_client.ProfileApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    x_hip_id = 'x_hip_id_example' # str | Identifier of the health information provider to which the request was intended.
    share_profile_request = openapi_client.ShareProfileRequest() # ShareProfileRequest | 

    try:
        # Share patient profile details
        api_instance.v05_patients_profile_share_post(authorization, x_hip_id, share_profile_request)
    except Exception as e:
        print("Exception when calling ProfileApi->v05_patients_profile_share_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Access token which was issued after successful login with gateway auth server. | 
 **x_hip_id** | **str**| Identifier of the health information provider to which the request was intended. | 
 **share_profile_request** | [**ShareProfileRequest**](ShareProfileRequest.md)|  | 

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
**400** | **Causes:**   * Invalid Request  |  -  |
**401** | **Causes:**   * Unauthorized request  |  -  |
**500** | **Causes:**   * Downstream system(s) is down.   * Unhandled exceptions.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

