# openapi_client.NumberSystemsConversionApi

All URIs are relative to *https://api.math.tools*

Method | HTTP request | Description
------------- | ------------- | -------------
[**numbers_numeral_chinese_get**](NumberSystemsConversionApi.md#numbers_numeral_chinese_get) | **GET** /numbers/numeral/chinese | 
[**numbers_numeral_egyptian_get**](NumberSystemsConversionApi.md#numbers_numeral_egyptian_get) | **GET** /numbers/numeral/egyptian | 
[**numbers_numeral_roman_get**](NumberSystemsConversionApi.md#numbers_numeral_roman_get) | **GET** /numbers/numeral/roman | 


# **numbers_numeral_chinese_get**
> numbers_numeral_chinese_get(number=number)



Convert base 10 representation of a given number to chinese numeral.

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
    api_instance = openapi_client.NumberSystemsConversionApi(api_client)
    number = 56 # int | Number to convert (optional)

    try:
        api_instance.numbers_numeral_chinese_get(number=number)
    except Exception as e:
        print("Exception when calling NumberSystemsConversionApi->numbers_numeral_chinese_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **int**| Number to convert | [optional] 

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

# **numbers_numeral_egyptian_get**
> numbers_numeral_egyptian_get(number=number)



Convert base 10 representation of a given number to egyptian numeral.

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
    api_instance = openapi_client.NumberSystemsConversionApi(api_client)
    number = 56 # int | Number to convert (optional)

    try:
        api_instance.numbers_numeral_egyptian_get(number=number)
    except Exception as e:
        print("Exception when calling NumberSystemsConversionApi->numbers_numeral_egyptian_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **int**| Number to convert | [optional] 

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

# **numbers_numeral_roman_get**
> numbers_numeral_roman_get(number=number)



Convert base 10 representation of a given number to roman numeral.

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
    api_instance = openapi_client.NumberSystemsConversionApi(api_client)
    number = 56 # int | Number to convert (optional)

    try:
        api_instance.numbers_numeral_roman_get(number=number)
    except Exception as e:
        print("Exception when calling NumberSystemsConversionApi->numbers_numeral_roman_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **int**| Number to convert | [optional] 

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

