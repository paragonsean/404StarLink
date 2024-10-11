# openapi_client.IntegrationsApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_integrations_token**](IntegrationsApi.md#get_integrations_token) | **GET** /integrations/token | Generate a new access token for MotaWord&#39;s integrations service


# **get_integrations_token**
> IntegrationsToken get_integrations_token()

Generate a new access token for MotaWord's integrations service

Generate a new access token for MotaWord's integrations service

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.integrations_token import IntegrationsToken
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

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.IntegrationsApi(api_client)

    try:
        # Generate a new access token for MotaWord's integrations service
        api_response = api_instance.get_integrations_token()
        print("The response of IntegrationsApi->get_integrations_token:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IntegrationsApi->get_integrations_token: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**IntegrationsToken**](IntegrationsToken.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Token |  -  |
**403** | IntegrationsNotEnabled |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

