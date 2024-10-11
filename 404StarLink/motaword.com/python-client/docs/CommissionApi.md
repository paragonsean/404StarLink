# openapi_client.CommissionApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_commissions**](CommissionApi.md#get_commissions) | **GET** /commissions | Returns a commission list of current client.
[**get_commissions_by_filter**](CommissionApi.md#get_commissions_by_filter) | **POST** /commissions | Returns a commission list of current client.


# **get_commissions**
> CommissionList get_commissions()

Returns a commission list of current client.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.commission_list import CommissionList
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
    api_instance = openapi_client.CommissionApi(api_client)

    try:
        # Returns a commission list of current client.
        api_response = api_instance.get_commissions()
        print("The response of CommissionApi->get_commissions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CommissionApi->get_commissions: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**CommissionList**](CommissionList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Commissions for client. |  -  |
**401** | UnauthorizedUser |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_commissions_by_filter**
> CommissionList get_commissions_by_filter(report_filter=report_filter)

Returns a commission list of current client.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.commission_list import CommissionList
from openapi_client.models.report_filter import ReportFilter
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
    api_instance = openapi_client.CommissionApi(api_client)
    report_filter = openapi_client.ReportFilter() # ReportFilter |  (optional)

    try:
        # Returns a commission list of current client.
        api_response = api_instance.get_commissions_by_filter(report_filter=report_filter)
        print("The response of CommissionApi->get_commissions_by_filter:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CommissionApi->get_commissions_by_filter: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_filter** | [**ReportFilter**](ReportFilter.md)|  | [optional] 

### Return type

[**CommissionList**](CommissionList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Commissions for client. |  -  |
**401** | UnauthorizedUser |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

