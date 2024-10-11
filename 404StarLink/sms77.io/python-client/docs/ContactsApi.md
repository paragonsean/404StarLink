# openapi_client.ContactsApi

All URIs are relative to *https://gateway.sms77.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contacts_get**](ContactsApi.md#contacts_get) | **GET** /contacts | 
[**contacts_post**](ContactsApi.md#contacts_post) | **POST** /contacts | 


# **contacts_get**
> str contacts_get(action, var_json=var_json)



### Example

* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
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
    api_instance = openapi_client.ContactsApi(api_client)
    action = 'action_example' # str | Determines the action to execute.
    var_json = 0 # float | Defines whether to return the response as JSON or CSV separated by semicolon. (optional) (default to 0)

    try:
        api_response = api_instance.contacts_get(action, var_json=var_json)
        print("The response of ContactsApi->contacts_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContactsApi->contacts_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **str**| Determines the action to execute. | 
 **var_json** | **float**| Defines whether to return the response as JSON or CSV separated by semicolon. | [optional] [default to 0]

### Return type

**str**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK (CSV) |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contacts_post**
> str contacts_post(action, var_json=var_json, id=id, nick=nick, empfaenger=empfaenger, email=email)



### Example

* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
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
    api_instance = openapi_client.ContactsApi(api_client)
    action = 'action_example' # str | Determines the action to execute.
    var_json = 0 # float | Defines whether to return the response as JSON or CSV separated by semicolon. (optional) (default to 0)
    id = 'id_example' # str | The contact ID for editing/deletion. (optional)
    nick = 'nick_example' # str | The contacts name. (optional)
    empfaenger = 'empfaenger_example' # str | The contacts phone number. (optional)
    email = 'email_example' # str | The contacts email address. (optional)

    try:
        api_response = api_instance.contacts_post(action, var_json=var_json, id=id, nick=nick, empfaenger=empfaenger, email=email)
        print("The response of ContactsApi->contacts_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContactsApi->contacts_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **str**| Determines the action to execute. | 
 **var_json** | **float**| Defines whether to return the response as JSON or CSV separated by semicolon. | [optional] [default to 0]
 **id** | **str**| The contact ID for editing/deletion. | [optional] 
 **nick** | **str**| The contacts name. | [optional] 
 **empfaenger** | **str**| The contacts phone number. | [optional] 
 **email** | **str**| The contacts email address. | [optional] 

### Return type

**str**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

