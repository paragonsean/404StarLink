# openapi_client.PrimeApi

All URIs are relative to *https://api.math.tools*

Method | HTTP request | Description
------------- | ------------- | -------------
[**numbers_prime_factors_get**](PrimeApi.md#numbers_prime_factors_get) | **GET** /numbers/prime/factors | 
[**numbers_prime_is_fermat_prime_get**](PrimeApi.md#numbers_prime_is_fermat_prime_get) | **GET** /numbers/prime/is-fermat-prime | 
[**numbers_prime_is_fibonacci_prime_get**](PrimeApi.md#numbers_prime_is_fibonacci_prime_get) | **GET** /numbers/prime/is-fibonacci-prime | 
[**numbers_prime_is_mersenne_prime_get**](PrimeApi.md#numbers_prime_is_mersenne_prime_get) | **GET** /numbers/prime/is-mersenne-prime | 
[**numbers_prime_is_partition_prime_get**](PrimeApi.md#numbers_prime_is_partition_prime_get) | **GET** /numbers/prime/is-partition-prime | 
[**numbers_prime_is_pell_prime_get**](PrimeApi.md#numbers_prime_is_pell_prime_get) | **GET** /numbers/prime/is-pell-prime | 
[**numbers_prime_is_perfect_get**](PrimeApi.md#numbers_prime_is_perfect_get) | **GET** /numbers/prime/is-perfect | 
[**numbers_prime_is_prime_get**](PrimeApi.md#numbers_prime_is_prime_get) | **GET** /numbers/prime/is-prime | 


# **numbers_prime_factors_get**
> numbers_prime_factors_get(number=number)



Get the prime factors of a given number.

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
    api_instance = openapi_client.PrimeApi(api_client)
    number = 56 # int | Number to get the factors (optional)

    try:
        api_instance.numbers_prime_factors_get(number=number)
    except Exception as e:
        print("Exception when calling PrimeApi->numbers_prime_factors_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **int**| Number to get the factors | [optional] 

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

# **numbers_prime_is_fermat_prime_get**
> numbers_prime_is_fermat_prime_get(number=number)



Checks whether a given number is a known fermat prime number or not.

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
    api_instance = openapi_client.PrimeApi(api_client)
    number = 56 # int | Number to check (optional)

    try:
        api_instance.numbers_prime_is_fermat_prime_get(number=number)
    except Exception as e:
        print("Exception when calling PrimeApi->numbers_prime_is_fermat_prime_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **int**| Number to check | [optional] 

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

# **numbers_prime_is_fibonacci_prime_get**
> numbers_prime_is_fibonacci_prime_get(number=number)



Checks whether a given number is a known fibonacci prime number or not.

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
    api_instance = openapi_client.PrimeApi(api_client)
    number = 56 # int | Number to check (optional)

    try:
        api_instance.numbers_prime_is_fibonacci_prime_get(number=number)
    except Exception as e:
        print("Exception when calling PrimeApi->numbers_prime_is_fibonacci_prime_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **int**| Number to check | [optional] 

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

# **numbers_prime_is_mersenne_prime_get**
> numbers_prime_is_mersenne_prime_get(number=number)



Checks whether a given number is a known mersenne prime number or not.

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
    api_instance = openapi_client.PrimeApi(api_client)
    number = 56 # int | Number to check (optional)

    try:
        api_instance.numbers_prime_is_mersenne_prime_get(number=number)
    except Exception as e:
        print("Exception when calling PrimeApi->numbers_prime_is_mersenne_prime_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **int**| Number to check | [optional] 

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

# **numbers_prime_is_partition_prime_get**
> numbers_prime_is_partition_prime_get(number=number)



Checks whether a given number is a known partition prime number or not.

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
    api_instance = openapi_client.PrimeApi(api_client)
    number = 56 # int | Number to check (optional)

    try:
        api_instance.numbers_prime_is_partition_prime_get(number=number)
    except Exception as e:
        print("Exception when calling PrimeApi->numbers_prime_is_partition_prime_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **int**| Number to check | [optional] 

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

# **numbers_prime_is_pell_prime_get**
> numbers_prime_is_pell_prime_get(number=number)



Checks whether a given number is a known pell prime number or not.

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
    api_instance = openapi_client.PrimeApi(api_client)
    number = 56 # int | Number to check (optional)

    try:
        api_instance.numbers_prime_is_pell_prime_get(number=number)
    except Exception as e:
        print("Exception when calling PrimeApi->numbers_prime_is_pell_prime_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **int**| Number to check | [optional] 

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

# **numbers_prime_is_perfect_get**
> numbers_prime_is_perfect_get(number=number)



Checks whether a given number is a perfect number or not.

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
    api_instance = openapi_client.PrimeApi(api_client)
    number = 56 # int | Number to check (optional)

    try:
        api_instance.numbers_prime_is_perfect_get(number=number)
    except Exception as e:
        print("Exception when calling PrimeApi->numbers_prime_is_perfect_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **int**| Number to check | [optional] 

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

# **numbers_prime_is_prime_get**
> numbers_prime_is_prime_get(number=number)



Checks whether a given number is a known prime number or not.

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
    api_instance = openapi_client.PrimeApi(api_client)
    number = 56 # int | Number to check (optional)

    try:
        api_instance.numbers_prime_is_prime_get(number=number)
    except Exception as e:
        print("Exception when calling PrimeApi->numbers_prime_is_prime_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **int**| Number to check | [optional] 

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

