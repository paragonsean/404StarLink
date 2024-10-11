# openapi_client.EmojisApi

All URIs are relative to *https://github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emojis_get**](EmojisApi.md#emojis_get) | **GET** /emojis | Get emojis


# **emojis_get**
> Dict[str, str] emojis_get()

Get emojis

Lists all the emojis available to use on GitHub Enterprise Server.

### Example


```python
import openapi_client
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
    api_instance = openapi_client.EmojisApi(api_client)

    try:
        # Get emojis
        api_response = api_instance.emojis_get()
        print("The response of EmojisApi->emojis_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EmojisApi->emojis_get: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

**Dict[str, str]**

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

