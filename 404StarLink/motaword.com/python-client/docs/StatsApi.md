# openapi_client.StatsApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_commission_stats**](StatsApi.md#get_commission_stats) | **GET** /stats/commissions | Returns the total commissions stats.
[**get_commission_stats_by_filter**](StatsApi.md#get_commission_stats_by_filter) | **POST** /stats/commissions | Returns the total commissions stats by report filter.
[**get_popular_pairs**](StatsApi.md#get_popular_pairs) | **GET** /stats/popular-pairs | View your popular language pairs
[**get_project_stats**](StatsApi.md#get_project_stats) | **GET** /stats/projects | View your project statistics
[**get_string_stats**](StatsApi.md#get_string_stats) | **GET** /stats/strings | View your translation statistics


# **get_commission_stats**
> CommissionStats get_commission_stats()

Returns the total commissions stats.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.commission_stats import CommissionStats
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
    api_instance = openapi_client.StatsApi(api_client)

    try:
        # Returns the total commissions stats.
        api_response = api_instance.get_commission_stats()
        print("The response of StatsApi->get_commission_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StatsApi->get_commission_stats: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**CommissionStats**](CommissionStats.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User&#39;s commission stats |  -  |
**401** | UnauthorizedUser |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_commission_stats_by_filter**
> CommissionStats get_commission_stats_by_filter(report_filter=report_filter)

Returns the total commissions stats by report filter.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.commission_stats import CommissionStats
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
    api_instance = openapi_client.StatsApi(api_client)
    report_filter = openapi_client.ReportFilter() # ReportFilter |  (optional)

    try:
        # Returns the total commissions stats by report filter.
        api_response = api_instance.get_commission_stats_by_filter(report_filter=report_filter)
        print("The response of StatsApi->get_commission_stats_by_filter:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StatsApi->get_commission_stats_by_filter: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_filter** | [**ReportFilter**](ReportFilter.md)|  | [optional] 

### Return type

[**CommissionStats**](CommissionStats.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User&#39;s commission stats |  -  |
**401** | UnauthorizedUser |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_popular_pairs**
> PopularLanguagePairs get_popular_pairs()

View your popular language pairs

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.popular_language_pairs import PopularLanguagePairs
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
    api_instance = openapi_client.StatsApi(api_client)

    try:
        # View your popular language pairs
        api_response = api_instance.get_popular_pairs()
        print("The response of StatsApi->get_popular_pairs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StatsApi->get_popular_pairs: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**PopularLanguagePairs**](PopularLanguagePairs.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Your most ordered language pairs |  -  |
**404** | UserNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_project_stats**
> ClientProjectStats get_project_stats()

View your project statistics

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.client_project_stats import ClientProjectStats
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
    api_instance = openapi_client.StatsApi(api_client)

    try:
        # View your project statistics
        api_response = api_instance.get_project_stats()
        print("The response of StatsApi->get_project_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StatsApi->get_project_stats: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**ClientProjectStats**](ClientProjectStats.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project statistics for your account |  -  |
**404** | UserNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_string_stats**
> ClientStringStats get_string_stats()

View your translation statistics

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.client_string_stats import ClientStringStats
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
    api_instance = openapi_client.StatsApi(api_client)

    try:
        # View your translation statistics
        api_response = api_instance.get_string_stats()
        print("The response of StatsApi->get_string_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StatsApi->get_string_stats: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**ClientStringStats**](ClientStringStats.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Translation statistics for your account |  -  |
**404** | UserNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

