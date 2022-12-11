# openapi_client.AuthApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_access_token**](AuthApi.md#get_access_token) | **POST** /token | Retrieve an access token


# **get_access_token**
> Token get_access_token(token_request=token_request)

Retrieve an access token

MotaWord API is using OAuth2 procedures when authenticating or authorizing your API call. 

### Example

* Basic Authentication (basicAuth):

```python
import openapi_client
from openapi_client.models.token import Token
from openapi_client.models.token_request import TokenRequest
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

# Configure HTTP basic authorization: basicAuth
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    token_request = openapi_client.TokenRequest() # TokenRequest |  (optional)

    try:
        # Retrieve an access token
        api_response = api_instance.get_access_token(token_request=token_request)
        print("The response of AuthApi->get_access_token:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->get_access_token: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_request** | [**TokenRequest**](TokenRequest.md)|  | [optional] 

### Return type

[**Token**](Token.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Authentication response |  -  |
**0** | Authentication error - for vendor auth, it will also fail if their account is not approved yet. In that case, the error response will include \&quot;account_status\&quot; key. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

