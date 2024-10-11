# openapi_client.ServicesApi

All URIs are relative to *https://dev.ndhm.gov.in/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v05_hi_services_service_id_get**](ServicesApi.md#v05_hi_services_service_id_get) | **GET** /v0.5/hi-services/{service-id} | Get bridge service details/profile by the serviceId provided.


# **v05_hi_services_service_id_get**
> ServiceProfileResponse v05_hi_services_service_id_get(authorization, service_id)

Get bridge service details/profile by the serviceId provided.

This API is meant for displaying the bridge service details by the serviceId provided . 

### Example


```python
import openapi_client
from openapi_client.models.service_profile_response import ServiceProfileResponse
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
    api_instance = openapi_client.ServicesApi(api_client)
    authorization = 'authorization_example' # str | Access token which was issued after successful login with gateway auth server.
    service_id = 'service_id_example' # str | 

    try:
        # Get bridge service details/profile by the serviceId provided.
        api_response = api_instance.v05_hi_services_service_id_get(authorization, service_id)
        print("The response of ServicesApi->v05_hi_services_service_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ServicesApi->v05_hi_services_service_id_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Access token which was issued after successful login with gateway auth server. | 
 **service_id** | **str**|  | 

### Return type

[**ServiceProfileResponse**](ServiceProfileResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | service details fetched successfully |  -  |
**401** | **Causes:**   * Unauthorized request  |  -  |
**404** | Service doesn&#39;t exist. |  -  |
**500** | **Causes:**   * Downstream system(s) is down.   * Unhandled exceptions.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

