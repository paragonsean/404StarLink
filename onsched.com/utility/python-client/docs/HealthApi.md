# openapi_client.HealthApi

All URIs are relative to *https://sandbox-api.onsched.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**utility_v1_health_heartbeat_get**](HealthApi.md#utility_v1_health_heartbeat_get) | **GET** /utility/v1/health/heartbeat | 
[**utility_v1_health_threadinfo_get**](HealthApi.md#utility_v1_health_threadinfo_get) | **GET** /utility/v1/health/threadinfo | 


# **utility_v1_health_heartbeat_get**
> str utility_v1_health_heartbeat_get()



### Example

* OAuth Authentication (oauth2):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://sandbox-api.onsched.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://sandbox-api.onsched.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.HealthApi(api_client)

    try:
        api_response = api_instance.utility_v1_health_heartbeat_get()
        print("The response of HealthApi->utility_v1_health_heartbeat_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling HealthApi->utility_v1_health_heartbeat_get: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

**str**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **utility_v1_health_threadinfo_get**
> ThreadPoolInfo utility_v1_health_threadinfo_get()



### Example

* OAuth Authentication (oauth2):

```python
import openapi_client
from openapi_client.models.thread_pool_info import ThreadPoolInfo
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://sandbox-api.onsched.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://sandbox-api.onsched.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.HealthApi(api_client)

    try:
        api_response = api_instance.utility_v1_health_threadinfo_get()
        print("The response of HealthApi->utility_v1_health_threadinfo_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling HealthApi->utility_v1_health_threadinfo_get: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**ThreadPoolInfo**](ThreadPoolInfo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

