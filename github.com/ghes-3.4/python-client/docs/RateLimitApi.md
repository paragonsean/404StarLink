# openapi_client.RateLimitApi

All URIs are relative to *https://github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rate_limit_get**](RateLimitApi.md#rate_limit_get) | **GET** /rate_limit | Get rate limit status for the authenticated user


# **rate_limit_get**
> RateLimitOverview rate_limit_get()

Get rate limit status for the authenticated user

**Note:** Accessing this endpoint does not count against your REST API rate limit.  **Note:** The `rate` object is deprecated. If you're writing new API client code or updating existing code, you should use the `core` object instead of the `rate` object. The `core` object contains the same information that is present in the `rate` object.

### Example


```python
import openapi_client
from openapi_client.models.rate_limit_overview import RateLimitOverview
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.RateLimitApi(api_client)

    try:
        # Get rate limit status for the authenticated user
        api_response = api_instance.rate_limit_get()
        print("The response of RateLimitApi->rate_limit_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RateLimitApi->rate_limit_get: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**RateLimitOverview**](RateLimitOverview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**304** | Not modified |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

