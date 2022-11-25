# openapi_client.HooksApi

All URIs are relative to *https://gateway.sms77.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hooks_get**](HooksApi.md#hooks_get) | **GET** /hooks | 
[**hooks_post**](HooksApi.md#hooks_post) | **POST** /hooks | 


# **hooks_get**
> HooksGet200Response hooks_get(action)



### Example

* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.hooks_get200_response import HooksGet200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://gateway.sms77.io/api
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://gateway.sms77.io/api"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.HooksApi(api_client)
    action = 'action_example' # str | Determines the action to execute.

    try:
        api_response = api_instance.hooks_get(action)
        print("The response of HooksApi->hooks_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling HooksApi->hooks_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **str**| Determines the action to execute. | 

### Return type

[**HooksGet200Response**](HooksGet200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **hooks_post**
> HooksPOST200Response hooks_post(action, id=id, target_url=target_url, event_type=event_type, request_method=request_method)



### Example

* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.hooks_post200_response import HooksPOST200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://gateway.sms77.io/api
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://gateway.sms77.io/api"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.HooksApi(api_client)
    action = 'action_example' # str | Determines the action to execute.
    id = 56 # int | The Webhook ID you wish to unsubscribe. (optional)
    target_url = 'target_url_example' # str | Target URL of your Webhook. (optional)
    event_type = 'event_type_example' # str | Type of event for which you would like to receive a webhook. (optional)
    request_method = POST # str | Request method in which you want to receive the webhook. (optional) (default to POST)

    try:
        api_response = api_instance.hooks_post(action, id=id, target_url=target_url, event_type=event_type, request_method=request_method)
        print("The response of HooksApi->hooks_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling HooksApi->hooks_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **str**| Determines the action to execute. | 
 **id** | **int**| The Webhook ID you wish to unsubscribe. | [optional] 
 **target_url** | **str**| Target URL of your Webhook. | [optional] 
 **event_type** | **str**| Type of event for which you would like to receive a webhook. | [optional] 
 **request_method** | **str**| Request method in which you want to receive the webhook. | [optional] [default to POST]

### Return type

[**HooksPOST200Response**](HooksPOST200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Hook subscribed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

