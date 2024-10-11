# openapi_client.CodesOfConductApi

All URIs are relative to *https://github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**codes_of_conduct_get_all_codes_of_conduct**](CodesOfConductApi.md#codes_of_conduct_get_all_codes_of_conduct) | **GET** /codes_of_conduct | Get all codes of conduct
[**codes_of_conduct_get_conduct_code**](CodesOfConductApi.md#codes_of_conduct_get_conduct_code) | **GET** /codes_of_conduct/{key} | Get a code of conduct


# **codes_of_conduct_get_all_codes_of_conduct**
> List[CodeOfConduct] codes_of_conduct_get_all_codes_of_conduct()

Get all codes of conduct



### Example


```python
import openapi_client
from openapi_client.models.code_of_conduct import CodeOfConduct
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
    api_instance = openapi_client.CodesOfConductApi(api_client)

    try:
        # Get all codes of conduct
        api_response = api_instance.codes_of_conduct_get_all_codes_of_conduct()
        print("The response of CodesOfConductApi->codes_of_conduct_get_all_codes_of_conduct:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CodesOfConductApi->codes_of_conduct_get_all_codes_of_conduct: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[CodeOfConduct]**](CodeOfConduct.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**304** | Not modified |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **codes_of_conduct_get_conduct_code**
> CodeOfConduct codes_of_conduct_get_conduct_code(key)

Get a code of conduct



### Example


```python
import openapi_client
from openapi_client.models.code_of_conduct import CodeOfConduct
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
    api_instance = openapi_client.CodesOfConductApi(api_client)
    key = 'key_example' # str | 

    try:
        # Get a code of conduct
        api_response = api_instance.codes_of_conduct_get_conduct_code(key)
        print("The response of CodesOfConductApi->codes_of_conduct_get_conduct_code:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CodesOfConductApi->codes_of_conduct_get_conduct_code: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **str**|  | 

### Return type

[**CodeOfConduct**](CodeOfConduct.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**304** | Not modified |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

