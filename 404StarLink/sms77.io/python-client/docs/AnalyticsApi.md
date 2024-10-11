# openapi_client.AnalyticsApi

All URIs are relative to *https://gateway.sms77.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analytics**](AnalyticsApi.md#analytics) | **GET** /analytics | 


# **analytics**
> Analytics200Response analytics(start=start, end=end, label=label, subaccounts=subaccounts, group_by=group_by)



### Example

* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.analytics200_response import Analytics200Response
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
    api_instance = openapi_client.AnalyticsApi(api_client)
    start = 'start_example' # str | Start date of the statistics in the format YYYY-MM-DD. By default, the date of 30 days ago is set. (optional)
    end = 'end_example' # str | End date of the statistics in the format YYYY-MM-DD. By default, the current day. (optional)
    label = 'label_example' # str | Shows only data of a specific label. (optional)
    subaccounts = 'subaccounts_example' # str | Receive the data only for the main account, all your (sub-)accounts or only for specific subaccounts. (optional)
    group_by = 'group_by_example' # str | Defines the grouping of the data. (optional)

    try:
        api_response = api_instance.analytics(start=start, end=end, label=label, subaccounts=subaccounts, group_by=group_by)
        print("The response of AnalyticsApi->analytics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AnalyticsApi->analytics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **str**| Start date of the statistics in the format YYYY-MM-DD. By default, the date of 30 days ago is set. | [optional] 
 **end** | **str**| End date of the statistics in the format YYYY-MM-DD. By default, the current day. | [optional] 
 **label** | **str**| Shows only data of a specific label. | [optional] 
 **subaccounts** | **str**| Receive the data only for the main account, all your (sub-)accounts or only for specific subaccounts. | [optional] 
 **group_by** | **str**| Defines the grouping of the data. | [optional] 

### Return type

[**Analytics200Response**](Analytics200Response.md)

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

