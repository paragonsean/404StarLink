# openapi_client.SmsApi

All URIs are relative to *https://gateway.sms77.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sms**](SmsApi.md#sms) | **POST** /sms | 


# **sms**
> Sms200Response sms(text, to, var_from=var_from, foreign_id=foreign_id, label=label, udh=udh, delay=delay, debug=debug, no_reload=no_reload, unicode=unicode, flash=flash, utf8=utf8, details=details, return_msg_id=return_msg_id, var_json=var_json, performance_tracking=performance_tracking)



### Example

* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.sms200_response import Sms200Response
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
    api_instance = openapi_client.SmsApi(api_client)
    text = 'text_example' # str | The actual text message to send.
    to = 'to_example' # str | The recipient number or group name.
    var_from = 'var_from_example' # str | Set a custom sender name. (optional)
    foreign_id = 'foreign_id_example' # str | Identifier to return in callbacks. (optional)
    label = 'label_example' # str | A custom label. (optional)
    udh = 'udh_example' # str | A custom User Data Header. (optional)
    delay = 'delay_example' # str | Date/Time for delayed dispatch. (optional)
    debug = 0 # float | Disable message sending. (optional) (default to 0)
    no_reload = 0 # float | Enable sending of duplicated messages within 180 seconds. (optional) (default to 0)
    unicode = 0 # float | Force unicode encoding. Reduces sms length to 70 chars. (optional) (default to 0)
    flash = 0 # float | Send as flash. (optional) (default to 0)
    utf8 = 0 # float | Force UTF8 encoding. (optional) (default to 0)
    details = 0 # float | Attach message details to response. (optional) (default to 0)
    return_msg_id = 0 # float | Attach message ID to second row in a text response. (optional) (default to 0)
    var_json = 0 # float | Return a detailed JSON response. (optional) (default to 0)
    performance_tracking = 0 # float | Enable performance tracking for found URLs. (optional) (default to 0)

    try:
        api_response = api_instance.sms(text, to, var_from=var_from, foreign_id=foreign_id, label=label, udh=udh, delay=delay, debug=debug, no_reload=no_reload, unicode=unicode, flash=flash, utf8=utf8, details=details, return_msg_id=return_msg_id, var_json=var_json, performance_tracking=performance_tracking)
        print("The response of SmsApi->sms:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SmsApi->sms: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **str**| The actual text message to send. | 
 **to** | **str**| The recipient number or group name. | 
 **var_from** | **str**| Set a custom sender name. | [optional] 
 **foreign_id** | **str**| Identifier to return in callbacks. | [optional] 
 **label** | **str**| A custom label. | [optional] 
 **udh** | **str**| A custom User Data Header. | [optional] 
 **delay** | **str**| Date/Time for delayed dispatch. | [optional] 
 **debug** | **float**| Disable message sending. | [optional] [default to 0]
 **no_reload** | **float**| Enable sending of duplicated messages within 180 seconds. | [optional] [default to 0]
 **unicode** | **float**| Force unicode encoding. Reduces sms length to 70 chars. | [optional] [default to 0]
 **flash** | **float**| Send as flash. | [optional] [default to 0]
 **utf8** | **float**| Force UTF8 encoding. | [optional] [default to 0]
 **details** | **float**| Attach message details to response. | [optional] [default to 0]
 **return_msg_id** | **float**| Attach message ID to second row in a text response. | [optional] [default to 0]
 **var_json** | **float**| Return a detailed JSON response. | [optional] [default to 0]
 **performance_tracking** | **float**| Enable performance tracking for found URLs. | [optional] [default to 0]

### Return type

[**Sms200Response**](Sms200Response.md)

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

