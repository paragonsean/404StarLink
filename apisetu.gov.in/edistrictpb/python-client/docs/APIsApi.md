# openapi_client.APIsApi

All URIs are relative to *https://apisetu.gov.in/edistrictpb/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**btcer**](APIsApi.md#btcer) | **POST** /btcer/certificate | Birth Certificate
[**dtcer**](APIsApi.md#dtcer) | **POST** /dtcer/certificate | Death Certificate
[**ewcer**](APIsApi.md#ewcer) | **POST** /ewcer/certificate | Economically Weaker Section Certificate
[**obcer**](APIsApi.md#obcer) | **POST** /obcer/certificate | OBC Certificate
[**racer**](APIsApi.md#racer) | **POST** /racer/certificate | Rural Area Certificate
[**rscer**](APIsApi.md#rscer) | **POST** /rscer/certificate | Residence Certificate
[**shcer**](APIsApi.md#shcer) | **POST** /shcer/certificate | SC/ST  Certificate


# **btcer**
> btcer(btcer_request=btcer_request)

Birth Certificate

API to verify Birth Certificate.

### Example

* Api Key Authentication (clientId):
* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.btcer_request import BtcerRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://apisetu.gov.in/edistrictpb/v3
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://apisetu.gov.in/edistrictpb/v3"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: clientId
configuration.api_key['clientId'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['clientId'] = 'Bearer'

# Configure API key authorization: apiKey
configuration.api_key['apiKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.APIsApi(api_client)
    btcer_request = openapi_client.BtcerRequest() # BtcerRequest | Request format (optional)

    try:
        # Birth Certificate
        api_instance.btcer(btcer_request=btcer_request)
    except Exception as e:
        print("Exception when calling APIsApi->btcer: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btcer_request** | [**BtcerRequest**](BtcerRequest.md)| Request format | [optional] 

### Return type

void (empty response body)

### Authorization

[clientId](../README.md#clientId), [apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/pdf, application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The certificate data in response body in PDF, XML or JSON format as requested in format parameter. |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized access |  -  |
**404** | No record found |  -  |
**500** | Internal server error |  -  |
**502** | Bad gateway |  -  |
**503** | Service unavailable |  -  |
**504** | Gateway timeout |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dtcer**
> dtcer(btcer_request=btcer_request)

Death Certificate

API to verify Death Certificate.

### Example

* Api Key Authentication (clientId):
* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.btcer_request import BtcerRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://apisetu.gov.in/edistrictpb/v3
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://apisetu.gov.in/edistrictpb/v3"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: clientId
configuration.api_key['clientId'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['clientId'] = 'Bearer'

# Configure API key authorization: apiKey
configuration.api_key['apiKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.APIsApi(api_client)
    btcer_request = openapi_client.BtcerRequest() # BtcerRequest | Request format (optional)

    try:
        # Death Certificate
        api_instance.dtcer(btcer_request=btcer_request)
    except Exception as e:
        print("Exception when calling APIsApi->dtcer: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **btcer_request** | [**BtcerRequest**](BtcerRequest.md)| Request format | [optional] 

### Return type

void (empty response body)

### Authorization

[clientId](../README.md#clientId), [apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/pdf, application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The certificate data in response body in PDF, XML or JSON format as requested in format parameter. |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized access |  -  |
**404** | No record found |  -  |
**500** | Internal server error |  -  |
**502** | Bad gateway |  -  |
**503** | Service unavailable |  -  |
**504** | Gateway timeout |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ewcer**
> ewcer(ewcer_request=ewcer_request)

Economically Weaker Section Certificate

API to verify Economically Weaker Section Certificate.

### Example

* Api Key Authentication (clientId):
* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.ewcer_request import EwcerRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://apisetu.gov.in/edistrictpb/v3
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://apisetu.gov.in/edistrictpb/v3"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: clientId
configuration.api_key['clientId'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['clientId'] = 'Bearer'

# Configure API key authorization: apiKey
configuration.api_key['apiKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.APIsApi(api_client)
    ewcer_request = openapi_client.EwcerRequest() # EwcerRequest | Request format (optional)

    try:
        # Economically Weaker Section Certificate
        api_instance.ewcer(ewcer_request=ewcer_request)
    except Exception as e:
        print("Exception when calling APIsApi->ewcer: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ewcer_request** | [**EwcerRequest**](EwcerRequest.md)| Request format | [optional] 

### Return type

void (empty response body)

### Authorization

[clientId](../README.md#clientId), [apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/pdf, application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The certificate data in response body in PDF, XML or JSON format as requested in format parameter. |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized access |  -  |
**404** | No record found |  -  |
**500** | Internal server error |  -  |
**502** | Bad gateway |  -  |
**503** | Service unavailable |  -  |
**504** | Gateway timeout |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **obcer**
> obcer(obcer_request=obcer_request)

OBC Certificate

API to verify OBC Certificate.

### Example

* Api Key Authentication (clientId):
* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.obcer_request import ObcerRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://apisetu.gov.in/edistrictpb/v3
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://apisetu.gov.in/edistrictpb/v3"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: clientId
configuration.api_key['clientId'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['clientId'] = 'Bearer'

# Configure API key authorization: apiKey
configuration.api_key['apiKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.APIsApi(api_client)
    obcer_request = openapi_client.ObcerRequest() # ObcerRequest | Request format (optional)

    try:
        # OBC Certificate
        api_instance.obcer(obcer_request=obcer_request)
    except Exception as e:
        print("Exception when calling APIsApi->obcer: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **obcer_request** | [**ObcerRequest**](ObcerRequest.md)| Request format | [optional] 

### Return type

void (empty response body)

### Authorization

[clientId](../README.md#clientId), [apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/pdf, application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The certificate data in response body in PDF, XML or JSON format as requested in format parameter. |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized access |  -  |
**404** | No record found |  -  |
**500** | Internal server error |  -  |
**502** | Bad gateway |  -  |
**503** | Service unavailable |  -  |
**504** | Gateway timeout |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **racer**
> racer(ewcer_request=ewcer_request)

Rural Area Certificate

API to verify Rural Area Certificate.

### Example

* Api Key Authentication (clientId):
* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.ewcer_request import EwcerRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://apisetu.gov.in/edistrictpb/v3
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://apisetu.gov.in/edistrictpb/v3"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: clientId
configuration.api_key['clientId'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['clientId'] = 'Bearer'

# Configure API key authorization: apiKey
configuration.api_key['apiKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.APIsApi(api_client)
    ewcer_request = openapi_client.EwcerRequest() # EwcerRequest | Request format (optional)

    try:
        # Rural Area Certificate
        api_instance.racer(ewcer_request=ewcer_request)
    except Exception as e:
        print("Exception when calling APIsApi->racer: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ewcer_request** | [**EwcerRequest**](EwcerRequest.md)| Request format | [optional] 

### Return type

void (empty response body)

### Authorization

[clientId](../README.md#clientId), [apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/pdf, application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The certificate data in response body in PDF, XML or JSON format as requested in format parameter. |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized access |  -  |
**404** | No record found |  -  |
**500** | Internal server error |  -  |
**502** | Bad gateway |  -  |
**503** | Service unavailable |  -  |
**504** | Gateway timeout |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **rscer**
> rscer(rscer_request=rscer_request)

Residence Certificate

API to verify Residence Certificate.

### Example

* Api Key Authentication (clientId):
* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.rscer_request import RscerRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://apisetu.gov.in/edistrictpb/v3
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://apisetu.gov.in/edistrictpb/v3"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: clientId
configuration.api_key['clientId'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['clientId'] = 'Bearer'

# Configure API key authorization: apiKey
configuration.api_key['apiKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.APIsApi(api_client)
    rscer_request = openapi_client.RscerRequest() # RscerRequest | Request format (optional)

    try:
        # Residence Certificate
        api_instance.rscer(rscer_request=rscer_request)
    except Exception as e:
        print("Exception when calling APIsApi->rscer: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rscer_request** | [**RscerRequest**](RscerRequest.md)| Request format | [optional] 

### Return type

void (empty response body)

### Authorization

[clientId](../README.md#clientId), [apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/pdf, application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The certificate data in response body in PDF, XML or JSON format as requested in format parameter. |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized access |  -  |
**404** | No record found |  -  |
**500** | Internal server error |  -  |
**502** | Bad gateway |  -  |
**503** | Service unavailable |  -  |
**504** | Gateway timeout |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **shcer**
> shcer(shcer_request=shcer_request)

SC/ST  Certificate

API to verify SC/ST  Certificate.

### Example

* Api Key Authentication (clientId):
* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.shcer_request import ShcerRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://apisetu.gov.in/edistrictpb/v3
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://apisetu.gov.in/edistrictpb/v3"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: clientId
configuration.api_key['clientId'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['clientId'] = 'Bearer'

# Configure API key authorization: apiKey
configuration.api_key['apiKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.APIsApi(api_client)
    shcer_request = openapi_client.ShcerRequest() # ShcerRequest | Request format (optional)

    try:
        # SC/ST  Certificate
        api_instance.shcer(shcer_request=shcer_request)
    except Exception as e:
        print("Exception when calling APIsApi->shcer: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shcer_request** | [**ShcerRequest**](ShcerRequest.md)| Request format | [optional] 

### Return type

void (empty response body)

### Authorization

[clientId](../README.md#clientId), [apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/pdf, application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The certificate data in response body in PDF, XML or JSON format as requested in format parameter. |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized access |  -  |
**404** | No record found |  -  |
**500** | Internal server error |  -  |
**502** | Bad gateway |  -  |
**503** | Service unavailable |  -  |
**504** | Gateway timeout |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

