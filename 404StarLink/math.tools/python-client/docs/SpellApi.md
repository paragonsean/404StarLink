# openapi_client.SpellApi

All URIs are relative to *https://api.math.tools*

Method | HTTP request | Description
------------- | ------------- | -------------
[**numbers_cardinal_get**](SpellApi.md#numbers_cardinal_get) | **GET** /numbers/cardinal | 
[**numbers_currency_get**](SpellApi.md#numbers_currency_get) | **GET** /numbers/currency | 
[**numbers_ordinal_get**](SpellApi.md#numbers_ordinal_get) | **GET** /numbers/ordinal | 


# **numbers_cardinal_get**
> numbers_cardinal_get(number=number, language=language)



Get the cardinal of the given number

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
    api_instance = openapi_client.SpellApi(api_client)
    number = 56 # int | Number value (optional)
    language = 'language_example' # str | Language to use (optional)

    try:
        api_instance.numbers_cardinal_get(number=number, language=language)
    except Exception as e:
        print("Exception when calling SpellApi->numbers_cardinal_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **int**| Number value | [optional] 
 **language** | **str**| Language to use | [optional] 

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

# **numbers_currency_get**
> numbers_currency_get(number=number, language=language)



Spells out the number as a currency

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
    api_instance = openapi_client.SpellApi(api_client)
    number = 56 # int | Number to spell (optional)
    language = 'language_example' # str | Language to use (optional)

    try:
        api_instance.numbers_currency_get(number=number, language=language)
    except Exception as e:
        print("Exception when calling SpellApi->numbers_currency_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **int**| Number to spell | [optional] 
 **language** | **str**| Language to use | [optional] 

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

# **numbers_ordinal_get**
> numbers_ordinal_get(number=number)



Get the ordinal of the given number

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
    api_instance = openapi_client.SpellApi(api_client)
    number = 56 # int | Number value (optional)

    try:
        api_instance.numbers_ordinal_get(number=number)
    except Exception as e:
        print("Exception when calling SpellApi->numbers_ordinal_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **int**| Number value | [optional] 

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

