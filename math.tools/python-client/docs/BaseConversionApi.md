# openapi_client.BaseConversionApi

All URIs are relative to *https://api.math.tools*

Method | HTTP request | Description
------------- | ------------- | -------------
[**numbers_base_binary_get**](BaseConversionApi.md#numbers_base_binary_get) | **GET** /numbers/base/binary | 
[**numbers_base_get**](BaseConversionApi.md#numbers_base_get) | **GET** /numbers/base | 
[**numbers_base_hex_get**](BaseConversionApi.md#numbers_base_hex_get) | **GET** /numbers/base/hex | 
[**numbers_base_octal_get**](BaseConversionApi.md#numbers_base_octal_get) | **GET** /numbers/base/octal | 


# **numbers_base_binary_get**
> numbers_base_binary_get(number, var_from=var_from)



Convert a given number to binary

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
    api_instance = openapi_client.BaseConversionApi(api_client)
    number = 56 # int | Number to convert to binary
    var_from = 56 # int | Base of the supplied number (Optional base 10 assumed by default) (optional)

    try:
        api_instance.numbers_base_binary_get(number, var_from=var_from)
    except Exception as e:
        print("Exception when calling BaseConversionApi->numbers_base_binary_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **int**| Number to convert to binary | 
 **var_from** | **int**| Base of the supplied number (Optional base 10 assumed by default) | [optional] 

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
**200** | 200 success response |  -  |
**401** | 401 Unauthorized response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **numbers_base_get**
> numbers_base_get(number, to, var_from=var_from)



Convert a given number from one base to another base

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
    api_instance = openapi_client.BaseConversionApi(api_client)
    number = 56 # int | Number to convert to the target base
    to = 56 # int | Target base to convert to
    var_from = 56 # int | Base of the supplied number (Optional base 10 assumed by default) (optional)

    try:
        api_instance.numbers_base_get(number, to, var_from=var_from)
    except Exception as e:
        print("Exception when calling BaseConversionApi->numbers_base_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **int**| Number to convert to the target base | 
 **to** | **int**| Target base to convert to | 
 **var_from** | **int**| Base of the supplied number (Optional base 10 assumed by default) | [optional] 

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
**200** | 200 success response |  -  |
**401** | 401 Unauthorized response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **numbers_base_hex_get**
> numbers_base_hex_get(number, var_from=var_from)



Convert a given number to hexadecimal

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
    api_instance = openapi_client.BaseConversionApi(api_client)
    number = 56 # int | Number to convert to hex
    var_from = 56 # int | Base of the supplied number (Optional base 10 assumed by default) (optional)

    try:
        api_instance.numbers_base_hex_get(number, var_from=var_from)
    except Exception as e:
        print("Exception when calling BaseConversionApi->numbers_base_hex_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **int**| Number to convert to hex | 
 **var_from** | **int**| Base of the supplied number (Optional base 10 assumed by default) | [optional] 

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
**200** | 200 success response |  -  |
**401** | 401 Unauthorized response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **numbers_base_octal_get**
> numbers_base_octal_get(number, var_from=var_from)



Convert a given number to octal

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
    api_instance = openapi_client.BaseConversionApi(api_client)
    number = 56 # int | Number to convert to octal
    var_from = 56 # int | Base of the supplied number (Optional base 10 assumed by default) (optional)

    try:
        api_instance.numbers_base_octal_get(number, var_from=var_from)
    except Exception as e:
        print("Exception when calling BaseConversionApi->numbers_base_octal_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **int**| Number to convert to octal | 
 **var_from** | **int**| Base of the supplied number (Optional base 10 assumed by default) | [optional] 

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
**200** | 200 success response |  -  |
**401** | 401 Unauthorized response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

