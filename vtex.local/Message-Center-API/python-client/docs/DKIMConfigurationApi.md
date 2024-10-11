# openapi_client.DKIMConfigurationApi

All URIs are relative to *https://vtex.local*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_dkim**](DKIMConfigurationApi.md#create_dkim) | **POST** /api/mail-service/pvt/providers/{EmailProvider}/dkim | Generate DKIM keys


# **create_dkim**
> Model200OK create_dkim(email_provider)

Generate DKIM keys

Create DKIM keys for sender that was setup in VTEX mail servers

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.models.model200_ok import Model200OK
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://vtex.local
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://vtex.local"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: appToken
configuration.api_key['appToken'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appToken'] = 'Bearer'

# Configure API key authorization: appKey
configuration.api_key['appKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DKIMConfigurationApi(api_client)
    email_provider = 'help@valdie.co' # str | E-mail address for sender that was setup in VTEX mail servers (default to 'help@valdie.co')

    try:
        # Generate DKIM keys
        api_response = api_instance.create_dkim(email_provider)
        print("The response of DKIMConfigurationApi->create_dkim:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DKIMConfigurationApi->create_dkim: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email_provider** | **str**| E-mail address for sender that was setup in VTEX mail servers | [default to &#39;help@valdie.co&#39;]

### Return type

[**Model200OK**](Model200OK.md)

### Authorization

[appToken](../README.md#appToken), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

