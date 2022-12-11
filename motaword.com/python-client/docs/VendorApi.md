# openapi_client.VendorApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_available_vendors**](VendorApi.md#get_available_vendors) | **POST** /users/available-vendors | Get a list of vendors available for the criteria given


# **get_available_vendors**
> UserList get_available_vendors(var_with=var_with, available_vendors_filter=available_vendors_filter)

Get a list of vendors available for the criteria given

Get a list of vendors available for the criteria given

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.available_vendors_filter import AvailableVendorsFilter
from openapi_client.models.user_list import UserList
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
    api_instance = openapi_client.VendorApi(api_client)
    var_with = ['var_with_example'] # List[str] | Include detailed information. Possible values 'user'. Requesting user info enrichment takes much longer. (optional)
    available_vendors_filter = openapi_client.AvailableVendorsFilter() # AvailableVendorsFilter |  (optional)

    try:
        # Get a list of vendors available for the criteria given
        api_response = api_instance.get_available_vendors(var_with=var_with, available_vendors_filter=available_vendors_filter)
        print("The response of VendorApi->get_available_vendors:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling VendorApi->get_available_vendors: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **var_with** | [**List[str]**](str.md)| Include detailed information. Possible values &#39;user&#39;. Requesting user info enrichment takes much longer. | [optional] 
 **available_vendors_filter** | [**AvailableVendorsFilter**](AvailableVendorsFilter.md)|  | [optional] 

### Return type

[**UserList**](UserList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User list |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

