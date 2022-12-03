# openapi_client.PIApi

All URIs are relative to *https://api.math.tools*

Method | HTTP request | Description
------------- | ------------- | -------------
[**numbers_pi_get**](PIApi.md#numbers_pi_get) | **GET** /numbers/pi | 


# **numbers_pi_get**
> numbers_pi_get(var_from=var_from, to=to)



Get digits of pi (Ï€)

### Example

* Api Key Authentication (X-Mathtools-Api-Secret):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.math.tools
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.math.tools"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: X-Mathtools-Api-Secret
configuration.api_key['X-Mathtools-Api-Secret'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Mathtools-Api-Secret'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.PIApi(api_client)
    var_from = 56 # int | Optional start position (optional)
    to = 56 # int | Optional start position (optional)

    try:
        api_instance.numbers_pi_get(var_from=var_from, to=to)
    except Exception as e:
        print("Exception when calling PIApi->numbers_pi_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **var_from** | **int**| Optional start position | [optional] 
 **to** | **int**| Optional start position | [optional] 

### Return type

void (empty response body)

### Authorization

[X-Mathtools-Api-Secret](../README.md#X-Mathtools-Api-Secret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 200 Success response |  -  |
**401** | 401 Unauthorized response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

