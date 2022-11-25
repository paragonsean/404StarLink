# openapi_client.ValidateForVoiceApi

All URIs are relative to *https://gateway.sms77.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**validate_for_voice**](ValidateForVoiceApi.md#validate_for_voice) | **POST** /validate_for_voice | 


# **validate_for_voice**
> ValidateForVoice200Response validate_for_voice(number, param_callback=param_callback)



### Example

* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.validate_for_voice200_response import ValidateForVoice200Response
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
    api_instance = openapi_client.ValidateForVoiceApi(api_client)
    number = 'number_example' # str | Determines the recipient. Can only be a number, not a contact from your address book.
    param_callback = 'param_callback_example' # str | The callback URL which gets queried right after validation. (optional)

    try:
        api_response = api_instance.validate_for_voice(number, param_callback=param_callback)
        print("The response of ValidateForVoiceApi->validate_for_voice:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ValidateForVoiceApi->validate_for_voice: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **str**| Determines the recipient. Can only be a number, not a contact from your address book. | 
 **param_callback** | **str**| The callback URL which gets queried right after validation. | [optional] 

### Return type

[**ValidateForVoice200Response**](ValidateForVoice200Response.md)

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

