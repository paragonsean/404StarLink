# openapi_client.VoiceApi

All URIs are relative to *https://gateway.sms77.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**voice**](VoiceApi.md#voice) | **POST** /voice | 


# **voice**
> str voice(to, text, xml=xml, var_from=var_from)



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
    api_instance = openapi_client.VoiceApi(api_client)
    to = 'to_example' # str | Determines the receiver. Must be a valid phone number or contact from the address book.
    text = 'text_example' # str | The text to convert to a voice message. Accepts valid XML too.
    xml = 3.4 # float | Decides whether the parameter \"text\" is plain text or XML. The default value is 0. (optional)
    var_from = 'var_from_example' # str | Sets the sender. Must be a verified sender. Use an inbound number of yours or one of ours. (optional)

    try:
        api_response = api_instance.voice(to, text, xml=xml, var_from=var_from)
        print("The response of VoiceApi->voice:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling VoiceApi->voice: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **str**| Determines the receiver. Must be a valid phone number or contact from the address book. | 
 **text** | **str**| The text to convert to a voice message. Accepts valid XML too. | 
 **xml** | **float**| Decides whether the parameter \&quot;text\&quot; is plain text or XML. The default value is 0. | [optional] 
 **var_from** | **str**| Sets the sender. Must be a verified sender. Use an inbound number of yours or one of ours. | [optional] 

### Return type

**str**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

