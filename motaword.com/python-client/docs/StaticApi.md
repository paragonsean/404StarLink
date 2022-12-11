# openapi_client.StaticApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_endpoints**](StaticApi.md#get_endpoints) | **GET** / | Available endpoints
[**get_formats**](StaticApi.md#get_formats) | **GET** /formats | List of supported file formats
[**get_languages**](StaticApi.md#get_languages) | **GET** /languages | List of supported languages
[**get_swagger_yaml**](StaticApi.md#get_swagger_yaml) | **GET** /swagger | OpenAPI YAML representation of our API


# **get_endpoints**
> object get_endpoints()

Available endpoints

The root endpoint will provide you with an OpenAPI definition of MotaWord API. 

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.StaticApi(api_client)

    try:
        # Available endpoints
        api_response = api_instance.get_endpoints()
        print("The response of StaticApi->get_endpoints:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StaticApi->get_endpoints: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | YAML representation of our OpenAPI definition. |  -  |
**0** | Authentication error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_formats**
> List[Formats] get_formats()

List of supported file formats

Get a list of supported formats for documents, style guides and extensions. 

### Example


```python
import openapi_client
from openapi_client.models.formats import Formats
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.StaticApi(api_client)

    try:
        # List of supported file formats
        api_response = api_instance.get_formats()
        print("The response of StaticApi->get_formats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StaticApi->get_formats: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[Formats]**](Formats.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of supported formats |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_languages**
> List[Language] get_languages()

List of supported languages

Get a list of supported languages

### Example


```python
import openapi_client
from openapi_client.models.language import Language
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.StaticApi(api_client)

    try:
        # List of supported languages
        api_response = api_instance.get_languages()
        print("The response of StaticApi->get_languages:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StaticApi->get_languages: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[Language]**](Language.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of supported languages |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_swagger_yaml**
> str get_swagger_yaml()

OpenAPI YAML representation of our API

Get Swagger YAML

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.StaticApi(api_client)

    try:
        # OpenAPI YAML representation of our API
        api_response = api_instance.get_swagger_yaml()
        print("The response of StaticApi->get_swagger_yaml:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StaticApi->get_swagger_yaml: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

**str**

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/yaml

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Swagger YAML |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

