# openapi_client.ReportApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generate_qa_report**](ReportApi.md#generate_qa_report) | **POST** /reports/qa | Generate a QA report for given filter
[**get_filter_contents**](ReportApi.md#get_filter_contents) | **POST** /reports/filter | Returns available options for selected timeframe.
[**get_language_pairs_report**](ReportApi.md#get_language_pairs_report) | **POST** /reports/language-pairs | Language pairs report
[**get_projects_report**](ReportApi.md#get_projects_report) | **POST** /reports/projects | Projects report
[**get_users_report**](ReportApi.md#get_users_report) | **POST** /reports/users | Company users report


# **generate_qa_report**
> QaWarnings generate_qa_report(qa_filter=qa_filter)

Generate a QA report for given filter

Generate a QA report for given filter

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.qa_filter import QaFilter
from openapi_client.models.qa_warnings import QaWarnings
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
    api_instance = openapi_client.ReportApi(api_client)
    qa_filter = openapi_client.QaFilter() # QaFilter |  (optional)

    try:
        # Generate a QA report for given filter
        api_response = api_instance.generate_qa_report(qa_filter=qa_filter)
        print("The response of ReportApi->generate_qa_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportApi->generate_qa_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qa_filter** | [**QaFilter**](QaFilter.md)|  | [optional] 

### Return type

[**QaWarnings**](QaWarnings.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of QA entries |  -  |
**400** | MissingParameter |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_filter_contents**
> FilterContents get_filter_contents(filter_dates=filter_dates)

Returns available options for selected timeframe.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.filter_contents import FilterContents
from openapi_client.models.filter_dates import FilterDates
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
    api_instance = openapi_client.ReportApi(api_client)
    filter_dates = openapi_client.FilterDates() # FilterDates |  (optional)

    try:
        # Returns available options for selected timeframe.
        api_response = api_instance.get_filter_contents(filter_dates=filter_dates)
        print("The response of ReportApi->get_filter_contents:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportApi->get_filter_contents: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter_dates** | [**FilterDates**](FilterDates.md)|  | [optional] 

### Return type

[**FilterContents**](FilterContents.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Filter contents |  -  |
**404** | UserNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_language_pairs_report**
> LanguagePairsReport get_language_pairs_report(report_filter=report_filter)

Language pairs report

View translation reports for each language pair with translations under your account. You can view company-wide language pairs if you have the user permission.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.language_pairs_report import LanguagePairsReport
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
    api_instance = openapi_client.ReportApi(api_client)
    report_filter = openapi_client.ReportFilter() # ReportFilter |  (optional)

    try:
        # Language pairs report
        api_response = api_instance.get_language_pairs_report(report_filter=report_filter)
        print("The response of ReportApi->get_language_pairs_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportApi->get_language_pairs_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_filter** | [**ReportFilter**](ReportFilter.md)|  | [optional] 

### Return type

[**LanguagePairsReport**](LanguagePairsReport.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Language pairs stats for client and vendors |  -  |
**404** | UserNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_projects_report**
> ProjectList get_projects_report(report_filter=report_filter)

Projects report

View projects under your account, with advanced filtering. You can view company-wide projects if you have the user permission.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.project_list import ProjectList
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
    api_instance = openapi_client.ReportApi(api_client)
    report_filter = openapi_client.ReportFilter() # ReportFilter |  (optional)

    try:
        # Projects report
        api_response = api_instance.get_projects_report(report_filter=report_filter)
        print("The response of ReportApi->get_projects_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportApi->get_projects_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_filter** | [**ReportFilter**](ReportFilter.md)|  | [optional] 

### Return type

[**ProjectList**](ProjectList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User stats for client and vendors |  -  |
**404** | UserNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_users_report**
> UsersReport get_users_report(report_filter=report_filter)

Company users report

View translation reports for each user under your company account. You need the permission to view users in your company.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.report_filter import ReportFilter
from openapi_client.models.users_report import UsersReport
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
    api_instance = openapi_client.ReportApi(api_client)
    report_filter = openapi_client.ReportFilter() # ReportFilter |  (optional)

    try:
        # Company users report
        api_response = api_instance.get_users_report(report_filter=report_filter)
        print("The response of ReportApi->get_users_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportApi->get_users_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_filter** | [**ReportFilter**](ReportFilter.md)|  | [optional] 

### Return type

[**UsersReport**](UsersReport.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User stats for client and vendors |  -  |
**404** | UserNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

