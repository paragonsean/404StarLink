# openapi_client.DefaultApi

All URIs are relative to *https://api.color.pizza/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lists_get**](DefaultApi.md#lists_get) | **GET** /lists/ | Get all colors of the default color name list
[**names_get**](DefaultApi.md#names_get) | **GET** /names/ | Get all colors of the default color name list
[**root_get**](DefaultApi.md#root_get) | **GET** / | Get all colors of the default color name list
[**swatch_get**](DefaultApi.md#swatch_get) | **GET** /swatch/ | Generate a color swatch for any color


# **lists_get**
> ListsGet200Response lists_get()

Get all colors of the default color name list

### Example


```python
import openapi_client
from openapi_client.models.lists_get200_response import ListsGet200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.color.pizza/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.color.pizza/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)

    try:
        # Get all colors of the default color name list
        api_response = api_instance.lists_get()
        print("The response of DefaultApi->lists_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->lists_get: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**ListsGet200Response**](ListsGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | NOT FOUND |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **names_get**
> Get200Response names_get(name, list=list)

Get all colors of the default color name list

### Example


```python
import openapi_client
from openapi_client.models.get200_response import Get200Response
from openapi_client.models.possible_lists import PossibleLists
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.color.pizza/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.color.pizza/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    name = 'name_example' # str | The name of the color to retrieve (min 3 characters)
    list = openapi_client.PossibleLists() # PossibleLists | The name of the color name list to use (optional)

    try:
        # Get all colors of the default color name list
        api_response = api_instance.names_get(name, list=list)
        print("The response of DefaultApi->names_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->names_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The name of the color to retrieve (min 3 characters) | 
 **list** | [**PossibleLists**](.md)| The name of the color name list to use | [optional] 

### Return type

[**Get200Response**](Get200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | NOT FOUND |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **root_get**
> Get200Response root_get(list=list, values=values, noduplicates=noduplicates)

Get all colors of the default color name list

### Example


```python
import openapi_client
from openapi_client.models.get200_response import Get200Response
from openapi_client.models.possible_lists import PossibleLists
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.color.pizza/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.color.pizza/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    list = openapi_client.PossibleLists() # PossibleLists | The name of the color name list to use (optional)
    values = 'values_example' # str | The hex values of the colors to retrieve without '#' (optional)
    noduplicates = True # bool | Allow duplicate names or not (optional)

    try:
        # Get all colors of the default color name list
        api_response = api_instance.root_get(list=list, values=values, noduplicates=noduplicates)
        print("The response of DefaultApi->root_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->root_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **list** | [**PossibleLists**](.md)| The name of the color name list to use | [optional] 
 **values** | **str**| The hex values of the colors to retrieve without &#39;#&#39; | [optional] 
 **noduplicates** | **bool**| Allow duplicate names or not | [optional] 

### Return type

[**Get200Response**](Get200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | NOT FOUND |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **swatch_get**
> str swatch_get(color, name=name)

Generate a color swatch for any color

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.color.pizza/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.color.pizza/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    color = 'color_example' # str | The hex value of the color to retrieve without '#'
    name = 'name_example' # str | The name of the color (optional)

    try:
        # Generate a color swatch for any color
        api_response = api_instance.swatch_get(color, name=name)
        print("The response of DefaultApi->swatch_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->swatch_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **color** | **str**| The hex value of the color to retrieve without &#39;#&#39; | 
 **name** | **str**| The name of the color | [optional] 

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/svg+xml, application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | NOT FOUND |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

